package Controller;
import java.awt.event.*;
//import java.io.IOException;
//import java.util.Date;
//import javax.swing.JOptionPane;
import Model.*;
import View.*;
import javax.swing.JPanel;

public class controller extends MouseAdapter implements ActionListener{

    private Aplikasi model;
    private JendelaAplikasi view;

    private String currentView;
    private JPanel mainPanel;

    private HalamanAwal ha;
    private CariBuku cr;
    private MainMenu mm;
    private PendaftaranAnggota pa;
    private PeminjamanBuku pj;
    private PengembalianBuku pg;
    private PengadaanBuku pbk;
    
    public controller(Aplikasi model) {
        this.model = model;
        this.view = new JendelaAplikasi();

        ha = new HalamanAwal();
        mm = new MainMenu() ;
        cr = new CariBuku();
        pa = new PendaftaranAnggota();
        pj = new PeminjamanBuku();
        pg = new PengembalianBuku();
        pbk = new PengadaanBuku();

        ha.addListener(this);
        mm.addListener(this);
        cr.addListener(this);
        pa.addListener(this);
        pj.addListener(this);
        pg.addListener(this);
        pbk.addListener(this);
//        v.addAdapter(this);

        mainPanel = view.getMainPanel();
        mainPanel.add(ha, "0"); //HalamanAwal
        mainPanel.add(mm, "1"); //MainMenu
        mainPanel.add(cr, "2"); //CariBuku
        mainPanel.add(pa, "3"); //PendaftaranBuku
        mainPanel.add(pj, "4"); //PeminjamanBuku
        mainPanel.add(pg, "5"); //PengembalianBuku
        mainPanel.add(pbk, "6"); //PengadaanBuku
        currentView = "0";

        view.getCardLayout()
                .show(mainPanel, currentView);
        view.setVisible(true);
        view.addListener(this);    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnExit())) {
//            try {
//                model.savePendaftaran();
//                model.saveBuku(); 
//                model.saveAnggota(); 
//                model.savePeminjaman(); 
//                model.savePengembalian();
//                model.saveDenda();
//            } catch (IOException ex) {
//                view.viewErrorMsg(ex.getMessage());
//            }
            System.exit(0);
        }
        if (source.equals("0")) {
            //HalamanAwal ha 0
            if (source.equals(ha.getBtnCariBuku())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(ha.getBtnAksesAdmin())){
                currentView = "2";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("1")) {
            //MainMenu mm 1
            if (source.equals(mm.getBtnTambahAnggota())){
                currentView = "3";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(mm.getBtnPeminjaman())){
                currentView = "4";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(mm.getBtnPengembalian())){
                currentView = "5";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(mm.getBtnPengadaan())){
                currentView = "6";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("2")) {
            //CariBuku cr 2
            if (source.equals(cr.getBtnCari())){
//                try {
//                    model.loadBuku();
//                } catch (IOException ex) {
//                    view.viewErrorMsg(ex.getMessage());
//                }
                String txtCari = cr.getTxtPencarian();
                int dsrCariBuku = cr.getDasarPencarian();
                int list = model.cariBuku(txtCari, dsrCariBuku).size();
                int i = 0;
                while (i < list){
                    Buku bk = (Buku) model.cariBuku(txtCari, dsrCariBuku).get(i);
                    cr.setTxtDtBuku(bk.previewBuku());
                }
            } else if (source.equals(cr.getBtnKembali())){
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("3")) {
            //PendaftaranAnggota pa 3
            if (source.equals(pa.getBtnTambah())){
                String nama = pa.getTxtNama();
                String alamat = pa.getTxtAlamat();
                String noTelp = pa.getTxtNoTelp();
                String email = pa.getTxtEmail();
                model.tambahAnggota(nama, alamat, noTelp, email);
                int arAg = model.cariAnggota(nama, alamat, noTelp, email);
                pa.setTxtNoAnggota(model.getListAnggota().get(arAg).getKodeAnggota());
//                try {
//                    model.saveAnggota(); 
//                    model.savePendaftaran();
//                } catch (IOException ex) {
//                    view.viewErrorMsg(ex.getMessage());
//                }
            } else if (source.equals(pa.getBtnBack())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("4")) {
            //PeminjamanBuku pj 4
            if(source.equals(pj.getButtonTambah())){
//                try {
//                    model.savePeminjaman();
//                } catch (IOException ex) {
//                    view.viewErrorMsg(ex.getMessage());
//                }
            } else if (source.equals(pj.getBtnKembali())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("5")) {
            //PengembalianBuku pg 5
            if (source.equals(pg.getBtnSimpanPengembalian())){
//                try {
//                    model.loadPeminjaman();
//                } catch (IOException ex) {
//                    view.viewErrorMsg(ex.getMessage());
//                }
                String kdAnggota = pg.getTxtKdAnggota();
                String kdPinjam = pg.getTxtKdPeminjaman();
//                try {
//                    model.savePengembalian();
//                } catch (IOException ex) {
//                    view.viewErrorMsg(ex.getMessage());
//                }
                
            } else if(source.equals(pg.getBtnKembali())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("6")) {
            //PengadaanBuku pbk 6
            if (source.equals(pbk.getBtnBack())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(pbk.getBtnTambah())){
                String kdBuku = pbk.getTxtKdBuku();
                String judul = pbk.getTxtJudul();
                String pengarang = pbk.getTxtPengarang();
                String penerbit = pbk.getTxtPenerbit();
                int thnTerbit = Integer.parseInt(pbk.getTxtThnTerbit());
                String sinopsis = pbk.getTxtSinopsis();
                int jmlBuku = pbk.getTxtJmlBuku();
//                judul, pengarang, penerbit, kodeBuku, sinopsis, tahunTerbit, jmlBuku
                model.tambahBuku(judul, pengarang, penerbit, kdBuku, sinopsis, thnTerbit, jmlBuku);
//                try {
//                    model.saveBuku();
//                } catch (IOException ex) {
//                    view.viewErrorMsg(ex.getMessage());
//                }
            }
        }
    }
    
}