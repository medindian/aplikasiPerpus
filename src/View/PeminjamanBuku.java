package View;

import java.awt.event.ActionListener;

public class PeminjamanBuku extends javax.swing.JPanel implements View{

    public PeminjamanBuku() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPeminjamanBuku = new javax.swing.JLabel();
        labelKodeAnggota = new javax.swing.JLabel();
        labelKodeBuku = new javax.swing.JLabel();
        txtKdAnggota = new javax.swing.JTextField();
        txtKdBuku = new javax.swing.JTextField();
        btnSimpanPeminjaman = new javax.swing.JButton();
        labelDataPeminjaman = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDtPeminjaman = new javax.swing.JTextArea();

        labelPeminjamanBuku.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPeminjamanBuku.setText("Peminjaman Buku");

        labelKodeAnggota.setText("Kode Anggota :");

        labelKodeBuku.setText("Kode Buku :");

        btnSimpanPeminjaman.setText("Tambah");

        labelDataPeminjaman.setText("Data Peminjaman");

        txtDtPeminjaman.setColumns(20);
        txtDtPeminjaman.setRows(5);
        jScrollPane1.setViewportView(txtDtPeminjaman);

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
                            .addComponent(labelKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKdBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSimpanPeminjaman))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPeminjamanBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPeminjamanBuku)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeAnggota)
                    .addComponent(labelKodeBuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpanPeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataPeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpanPeminjaman;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDataPeminjaman;
    private javax.swing.JLabel labelKodeAnggota;
    private javax.swing.JLabel labelKodeBuku;
    private javax.swing.JLabel labelPeminjamanBuku;
    private javax.swing.JTextArea txtDtPeminjaman;
    private javax.swing.JTextField txtKdAnggota;
    private javax.swing.JTextField txtKdBuku;
    // End of variables declaration//GEN-END:variables

    public String getTFieldKodeAnggota(){
        return txtKdAnggota.getText(); }

    public String getTFieldKodeBuku(){
        return txtKdBuku.getText();    }
    
    public Object getButtonTambah(){
        return btnSimpanPeminjaman;    }
    
    @Override
    public void addListener(ActionListener e){
        btnSimpanPeminjaman.addActionListener(e);    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
