package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PengembalianBuku extends javax.swing.JPanel implements View {

    public PengembalianBuku() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelKodeAnggota = new javax.swing.JLabel();
        labelKodeBuku = new javax.swing.JLabel();
        txtKdAnggota = new javax.swing.JTextField();
        txtKdPeminjaman = new javax.swing.JTextField();
        btnSimpanPengembalian = new javax.swing.JButton();
        labelDataPeminjaman = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHasilSimpan = new javax.swing.JTextArea();
        labelPengembalian = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();

        labelKodeAnggota.setText("Kode Anggota :");

        labelKodeBuku.setText("Kode Peminjaman :");

        btnSimpanPengembalian.setText("Simpan");

        labelDataPeminjaman.setText("Hasil :");

        txtHasilSimpan.setColumns(20);
        txtHasilSimpan.setRows(5);
        jScrollPane1.setViewportView(txtHasilSimpan);

        labelPengembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPengembalian.setText("Pengembalian Buku");

        btnKembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSimpanPengembalian)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelKodeBuku)
                                        .addComponent(txtKdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(labelDataPeminjaman)
                            .addComponent(btnKembali))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(labelPengembalian)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPengembalian)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeAnggota)
                    .addComponent(labelKodeBuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSimpanPengembalian)
                .addGap(1, 1, 1)
                .addComponent(labelDataPeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKembali)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpanPengembalian;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDataPeminjaman;
    private javax.swing.JLabel labelKodeAnggota;
    private javax.swing.JLabel labelKodeBuku;
    private javax.swing.JLabel labelPengembalian;
    private javax.swing.JTextArea txtHasilSimpan;
    private javax.swing.JTextField txtKdAnggota;
    private javax.swing.JTextField txtKdPeminjaman;
    // End of variables declaration//GEN-END:variables

    public Object getBtnKembali() {
        return btnKembali;    }

    public Object getBtnSimpanPengembalian() {
        return btnSimpanPengembalian;    }

    public String getTxtKdAnggota() {
        return txtKdAnggota.getText();    }

    public String getTxtKdPeminjaman() {
        return txtKdPeminjaman.getText();    }

    public void setTxtHasilSimpan(String tulisan) {
        this.txtHasilSimpan.setText(tulisan);    }

    @Override
    public void addListener(ActionListener e){
        btnSimpanPengembalian.addActionListener(e);    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
