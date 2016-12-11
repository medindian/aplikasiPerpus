package Controller;
import java.awt.event.*;
import java.util.*;
import Model.*;
import View.*;
import javax.swing.*;

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
//    private static int n = 0;
    
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
        mainPanel.add(pa, "3"); //PendaftaranAnggota
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
//            readDataAnggota();
//            readDataPendaftaran();
//            readDataBuku();
//            readDataPeminjaman();
//            readDataPengembalian();
//            readDataDenda();
            System.exit(0);
        }
        if (currentView.equals("0")) {
            //HalamanAwal ha 0
            System.out.println("welcome to halaman awal");
            if (source.equals(ha.getBtnCariBuku())){
                currentView = "2";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("Masuk menu cari buku");
            } else if (source.equals(ha.getBtnAksesAdmin())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("masuk menu utama admin");
            }
        } else if (currentView.equals("1")) {
            //MainMenu mm 1
            System.out.println("welcome to main menu");
            if (source.equals(mm.getBtnTambahAnggota())){
                currentView = "3";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("masuk menu tambah anggota baru");
            } else if (source.equals(mm.getBtnPeminjaman())){
                currentView = "4";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("masuk menu peminjaman");
            } else if (source.equals(mm.getBtnPengembalian())){
                currentView = "5";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("masuk menu pengembalian");
            } else if (source.equals(mm.getBtnPengadaan())){
                currentView = "6";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("masuk menu pengadaan buku");
            } else if (source.equals(mm.getBtnKembali())){
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("kembali ke halaman awal aplikasi");
            }
        } else if (currentView.equals("2")) {
            //CariBuku cr 2
            System.out.println("welcome to cari buku");
            if (source.equals(cr.getBtnKembali())){
                currentView = "0";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("kembali ke halaman awal aplikasi");
            } else if (source.equals(cr.getBtnCari())){
//                model.setListBuku(model.getDB().readDataBuku());
//                ArrayList<Buku> readDataBuku;
//                readDataBuku = model.getDB().readDataBuku();
                String txtCari = cr.getTxtPencarian();
                int dsrCariBuku = cr.getDasarPencarian();
//                int list = model.cariBuku(txtCari, dsrCariBuku).size();
//                cr.setTxtDtBuku(model.viewSemuaListBuku());
                System.out.println("mencari buku");
            }
        } else if (currentView.equals("3")) {
            //PendaftaranAnggota pa 3
            System.out.println("welcome to pendaftaran anggota");
            if (source.equals(pa.getBtnBack())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("kembali ke halaman awal aplikasi");
            }else if (source.equals(pa.getBtnTambah())){
//                model.setListAnggota(model.getDB().readDataAnggota());
//                model.getDB().readPendaftaran();
                String nama = pa.getTxtNama();
                String alamat = pa.getTxtAlamat();
                String noTelp = pa.getTxtNoTelp();
                String email = pa.getTxtEmail();
                
//                pa.setTxtStatus(model.tambahAnggota(nama, alamat, noTelp, email));
//                int arAg = model.cariAnggota(nama, alamat, noTelp, email);
//                pa.setTxtNoAnggota(model.getListAnggota().get(arAg).getKodeAnggota());
                
//                int arP = model.cariAnggotaDiPendaftaran(nama, alamat, noTelp, email);
//                Pendaftaran pp = model.getListPendaftaran().get(arP);
                System.out.println("tambah anggota baru");
            }
        } else if (currentView.equals("4")) {
            //PeminjamanBuku pj 4
            System.out.println("welcome to peminjaman");
            if (source.equals(pj.getBtnKembali())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("kembali ke halaman awal aplikasi");
            } else if(source.equals(pj.getBtnTambah())){
//                model.getDB().readDataPeminjaman();
                String kdAnggota = pj.getTxtKodeAnggota();
                String kdBuku = pj.getTxtKodeBuku();
                Date dt = new Date();
//                model.PeminjamanBuku(kdAnggota, kdBuku, kdPeminjaman);
//                int ar = model.cariArrayAnggotaByKode(kdAnggota);
//                int dtPinjam = model.getListAnggota().get(ar).cariPeminjaman(kdPeminjaman);
//                Peminjaman p = (Peminjaman) model.getListAnggota().get(ar).getListPeminjaman().get(dtPinjam);
//                model.getDB().savePeminjaman(p);
                System.out.println("tambah peminjaman buku");
            }
        } else if (currentView.equals("5")) {
            //PengembalianBuku pg 5
            Denda d = null;
            Anggota peminjam = null;
            Peminjaman dt = null;
            System.out.println("welcome to pengembalian buku");
            if(source.equals(pg.getBtnKembali())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("kembali ke halaman awal aplikasi");
            } else if (source.equals(pg.getBtnSimpanPengembalian())){
//                model.getDB().readDataPengembalian();
                String kdAnggota = pg.getTxtKdAnggota();
                String kdPinjam = pg.getTxtKdPeminjaman();
                System.out.println(model.PengembalianBuku(kdAnggota, kdPinjam));
                peminjam = model.getListAnggota().get(model.cariArrayAnggotaByKode(kdAnggota));
                dt = (Peminjaman) peminjam.getListPeminjaman().get(peminjam.cariPeminjaman(kdPinjam));
                d = dt.getPengembalian().getDenda();
//                model.getDB().savePengembalian();
                System.out.println("simpan data pengembalian");
            } else if (source.equals(pg.getBtnBayarDenda())){
                long dendaTerbayar = Long.valueOf(pg.getTxtDendaDibayar());
                String kdAnggota = pg.getTxtKdAnggota();
                String kdPinjam = pg.getTxtKdPeminjaman();
                peminjam.bayarDenda(kdPinjam, dendaTerbayar);
//                model.getDB().saveDenda();
                System.out.println("bayar denda cuy");
            }
        } else if (currentView.equals("6")) {
            //PengadaanBuku pbk 6
            System.out.println("welcome to oengadaan buku");
            if (source.equals(pbk.getBtnBack())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
                System.out.println("kembali ke halaman awal aplikasi");
            } else if (source.equals(pbk.getBtnTambah())){
//                model.setListBuku(model.getDB().readDataBuku());
                String kdBuku = pbk.getTxtKdBuku();
                String judul = pbk.getTxtJudul();
                String pengarang = pbk.getTxtPengarang();
                String penerbit = pbk.getTxtPenerbit();
//                int thnTerbit = Integer.parseInt(pbk.getTxtThnTerbit());
//                String sinopsis = pbk.getTxtSinopsis();
                int jmlBuku = pbk.getTxtJmlBuku();
//                model.tambahBuku(judul, pengarang, penerbit, kdBuku, sinopsis, thnTerbit, jmlBuku);
//                pbk.setTxtSinopsis(model.tambahBuku(judul, pengarang, penerbit, kdBuku, "", thnTerbit, jmlBuku));
//                int ar = model.cariArrayBukuByKode(kdBuku);
//                Buku bk = model.getListBuku().get(ar);
//                model.getDB().saveBuku(bk);
                pbk.setEmpty();
                System.out.println("tambah buku");
            }
        }
    }
    
}