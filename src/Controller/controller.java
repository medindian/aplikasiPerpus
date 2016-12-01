package Controller;
import java.awt.event.*;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
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
//                model.saveEmployee();
//            } catch (IOException ex) {
//                view.viewErrorMsg(ex.getMessage());
//            }
            System.exit(0);
        }
        if (source.equals("0")) {
            //HalamanAwal ha
            if (source.equals(ha.getBtnCariBuku())){
                currentView = "1";
                view.getCardLayout().show(mainPanel, currentView);
            } else if (source.equals(ha.getBtnAksesAdmin())){
                currentView = "2";
                view.getCardLayout().show(mainPanel, currentView);
            }
        } else if (source.equals("1")) {
            //MainMenu mm
            if (source.equals(mm.getBtnTambahAnggota())){
            } else if (source.equals(mm.getBtnPeminjaman())){
            } else if (source.equals(mm.getBtnPengembalian())){
            } else if (source.equals(mm.getBtnPengadaan())){
            }
        } else if (source.equals("2")) {
            //CariBuku cr
            if (source.equals(cr.getBtnCari())){
            }
        } else if (source.equals("3")) {
            //PendaftaranAnggota pa
            if (source.equals(pa.getBtnTambah())){
            } else if (source.equals(pa.getBtnBack())){
            }
        } else if (source.equals("4")) {
            //PeminjamanBuku pj
        } else if (source.equals("5")) {
            //PengembalianBuku pg
        } else if (source.equals("6")) {
            //PengadaanBuku pbk
        }
    }
    
}