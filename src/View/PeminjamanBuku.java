package View;

import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.JTextField;
//import javax.swing.JButton;

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
        btnKembali = new javax.swing.JButton();
        labelKodeAnggota1 = new javax.swing.JLabel();
        txtKdPinjam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPeminjaman = new javax.swing.JTable();

        labelPeminjamanBuku.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelPeminjamanBuku.setText("Peminjaman Buku");

        labelKodeAnggota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelKodeAnggota.setText("Kode Anggota :");

        labelKodeBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelKodeBuku.setText("Kode Buku :");

        btnSimpanPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSimpanPeminjaman.setText("Simpan");

        labelDataPeminjaman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDataPeminjaman.setText("Data Peminjaman");

        btnKembali.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnKembali.setText("Kembali");

        labelKodeAnggota1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelKodeAnggota1.setText("Kode Peminjaman :");

        tabelPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelPeminjaman);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelPeminjamanBuku)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelKodeAnggota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelKodeAnggota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(labelKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKdPinjam)
                                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(btnSimpanPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtKdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelPeminjamanBuku)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeAnggota1)
                    .addComponent(txtKdPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeAnggota)
                    .addComponent(txtKdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpanPeminjaman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeBuku)
                    .addComponent(txtKdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(labelDataPeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKembali)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpanPeminjaman;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDataPeminjaman;
    private javax.swing.JLabel labelKodeAnggota;
    private javax.swing.JLabel labelKodeAnggota1;
    private javax.swing.JLabel labelKodeBuku;
    private javax.swing.JLabel labelPeminjamanBuku;
    private javax.swing.JTable tabelPeminjaman;
    private javax.swing.JTextField txtKdAnggota;
    private javax.swing.JTextField txtKdBuku;
    private javax.swing.JTextField txtKdPinjam;
    // End of variables declaration//GEN-END:variables

    public String getTxtKodeAnggota(){
        return txtKdAnggota.getText(); }

    public String getTxtKodeBuku(){
        return txtKdBuku.getText();    }

    public void setTxtKdPinjam(String KdPinjam) {
        this.txtKdPinjam.setText(KdPinjam);    }    

    public void setTabelPeminjaman(JTable tabelPeminjaman) {
        this.tabelPeminjaman = tabelPeminjaman;    }
    
    public Object getBtnTambah(){
        return btnSimpanPeminjaman;    }

    public Object getBtnKembali() {
        return btnKembali;    }
    
    @Override
    public void addListener(ActionListener e){
        btnSimpanPeminjaman.addActionListener(e);
        btnKembali.addActionListener(e);    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
