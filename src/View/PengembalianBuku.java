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
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(613, 483));

        labelKodeAnggota.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelKodeAnggota.setText("Kode Anggota :");

        labelKodeBuku.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelKodeBuku.setText("Kode Peminjaman :");

        txtKdAnggota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtKdPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSimpanPengembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSimpanPengembalian.setText("Simpan");

        labelDataPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelDataPeminjaman.setText("Hasil Pencarian :");

        labelPengembalian.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPengembalian.setText("Pengembalian Buku");

        btnKembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKembali.setText("Kembali");

        txtDendaDibayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDendaDibayar.setText("Rp ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Bayar Denda :");

        btnBayarDenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBayarDenda.setText("Denda Diterima");

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Cari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelKodeAnggota)
                                .addGap(99, 99, 99)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKodeBuku)
                            .addComponent(txtKdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpanPengembalian)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKembali)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDendaDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBayarDenda)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataPeminjaman)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(labelPengembalian)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelPengembalian)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeBuku)
                    .addComponent(labelKodeAnggota)
                    .addComponent(jButton1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpanPengembalian))
                .addGap(28, 28, 28)
                .addComponent(labelDataPeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDendaDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBayarDenda))
                .addGap(34, 34, 34)
                .addComponent(btnKembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayarDenda;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpanPengembalian;
    private javax.swing.JButton jButton1;
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
