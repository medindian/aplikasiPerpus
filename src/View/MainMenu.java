
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

        setPreferredSize(new java.awt.Dimension(600, 434));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu Utama");

        btnPengadaan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPengadaan.setText("Pengadaan Buku");
        btnPengadaan.setActionCommand("daftarBuku");

        btnTambahAnggota.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTambahAnggota.setText("Pendaftaran Anggota");
        btnTambahAnggota.setActionCommand("daftarAnggota");

        btnPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPeminjaman.setText("Peminjaman Buku");
        btnPeminjaman.setActionCommand("peminjaman");

        btnPengembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPengembalian.setText("Pengembalian Buku");
        btnPengembalian.setActionCommand("pengembalian");

        btnKembali.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPengadaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTambahAnggota, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(btnPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnPengadaan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTambahAnggota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnPengembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
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
