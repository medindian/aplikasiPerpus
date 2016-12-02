
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JPanel implements View{


    public MainMenu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnPengadaan = new javax.swing.JButton();
        btnTambahAnggota = new javax.swing.JButton();
        btnPeminjaman = new javax.swing.JButton();
        btnPengembalian = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu Utama");

        btnPengadaan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPengadaan.setText("Pengadaan Buku");
        btnPengadaan.setActionCommand("daftarBuku");

        btnTambahAnggota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTambahAnggota.setText("Pendaftaran Anggota");
        btnTambahAnggota.setActionCommand("daftarAnggota");

        btnPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPeminjaman.setText("Peminjaman Buku");
        btnPeminjaman.setActionCommand("peminjaman");

        btnPengembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPengembalian.setText("Pengembalian Buku");
        btnPengembalian.setActionCommand("pengembalian");

        btnKembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPengadaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTambahAnggota)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnKembali)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPengadaan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTambahAnggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPengembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnKembali)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPeminjaman;
    private javax.swing.JButton btnPengadaan;
    private javax.swing.JButton btnPengembalian;
    private javax.swing.JButton btnTambahAnggota;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addListener(ActionListener e) {
        btnKembali.addActionListener(e);
        btnPengadaan.addActionListener(e);
        btnTambahAnggota.addActionListener(e);
        btnPeminjaman.addActionListener(e);
        btnPengembalian.addActionListener(e);   }

    public Object getBtnKembali() {
        return btnKembali;    }
    
    public Object getBtnPeminjaman() {
        return btnPeminjaman;   }

    public Object getBtnPengadaan() {
        return btnPengadaan;    }

    public Object getBtnPengembalian() {
        return btnPengembalian; }

    public Object getBtnTambahAnggota() {
        return btnTambahAnggota;    }
    
    @Override
    public void viewErrorMsg(String errorMsg) {
        JOptionPane.showMessageDialog(this, errorMsg);
    }

}
