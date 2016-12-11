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
        labelPengembalian = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        txtDendaDibayar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBayarDenda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        labelKodeAnggota.setText("Kode Anggota :");

        labelKodeBuku.setText("Kode Peminjaman :");

        btnSimpanPengembalian.setText("Simpan");

        labelDataPeminjaman.setText("Hasil Pencarian :");

        labelPengembalian.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPengembalian.setText("Pengembalian Buku");

        btnKembali.setText("Kembali");

        txtDendaDibayar.setText("Rp ");

        jLabel1.setText("Bayar Denda :");

        btnBayarDenda.setText("Bayar Denda");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(labelPengembalian)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataPeminjaman)
                            .addComponent(btnKembali)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDendaDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBayarDenda))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSimpanPengembalian)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(labelKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(144, 144, 144))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(54, 54, 54)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtKdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelKodeBuku))))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelPengembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeBuku)
                    .addComponent(labelKodeAnggota))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpanPengembalian)
                        .addGap(17, 17, 17)
                        .addComponent(labelDataPeminjaman)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDendaDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBayarDenda))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayarDenda;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpanPengembalian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDataPeminjaman;
    private javax.swing.JLabel labelKodeAnggota;
    private javax.swing.JLabel labelKodeBuku;
    private javax.swing.JLabel labelPengembalian;
    private javax.swing.JTextField txtDendaDibayar;
    private javax.swing.JTextField txtKdAnggota;
    private javax.swing.JTextField txtKdPeminjaman;
    // End of variables declaration//GEN-END:variables

    public Object getBtnKembali() {
        return btnKembali;    }

    public Object getBtnSimpanPengembalian() {
        return btnSimpanPengembalian;    }

    public Object getBtnBayarDenda() {
        return btnBayarDenda;    }

    public String getTxtDendaDibayar() {
        return txtDendaDibayar.getText();    }

    public String getTxtKdAnggota() {
        return txtKdAnggota.getText();    }

    public String getTxtKdPeminjaman() {
        return txtKdPeminjaman.getText();    }

//    public void setTxtHasilSimpan(String tulisan) {
//        this.txtHasilSimpan.setText(tulisan);    }

    @Override
    public void addListener(ActionListener e){
        btnSimpanPengembalian.addActionListener(e);
        btnBayarDenda.addActionListener(e);
        btnKembali.addActionListener(e);    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
