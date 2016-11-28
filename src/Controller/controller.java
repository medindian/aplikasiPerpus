package Controller;
import java.awt.event.*;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.*;
import View.*;

public class controller extends MouseAdapter implements ActionListener{

    private Aplikasi model;
    private View view;
    private Buku buku;
    private Pendaftaran pendaftaran;
    private int i;
    
    public controller(Aplikasi model) {
        this.model = model;
        HalamanAwal m = new HalamanAwal();
        m.setVisible(true);
        m.addListener((ActionListener) this);
        view = m;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (view instanceof HalamanAwal) {
            HalamanAwal m = (HalamanAwal) view;
            if (source.equals(m.getBtnMasuk())) {
                MainMenu e = new MainMenu();
                e.setVisible(true);
                e.addListener(this);
                m.dispose();
                view = e;
            }
        }
    }
}