package View;

import java.awt.event.ActionListener;

public class PengembalianBuku extends javax.swing.JPanel implements View {

    public PengembalianBuku() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelKodeAnggota = new javax.swing.JLabel();
        labelKodeBuku = new javax.swing.JLabel();
        TFieldKodeAnggota = new javax.swing.JTextField();
        TFieldKodeBuku = new javax.swing.JTextField();
        buttonCari = new javax.swing.JButton();
        labelDataPeminjaman = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAreaDataPeminjaman = new javax.swing.JTextArea();
        labelPengembalian = new javax.swing.JLabel();

        labelKodeAnggota.setText("Kode Anggota :");

        labelKodeBuku.setText("Kode Buku :");

        TFieldKodeAnggota.setText("kodeAnggota");

        TFieldKodeBuku.setText("kodeBuku");

        buttonCari.setText("Cari");

        labelDataPeminjaman.setText("Data Peminjaman :");

        TAreaDataPeminjaman.setColumns(20);
        TAreaDataPeminjaman.setRows(5);
        jScrollPane1.setViewportView(TAreaDataPeminjaman);

        labelPengembalian.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPengembalian.setText("Pengembalian Buku");

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
                            .addComponent(labelKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFieldKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 97, Short.MAX_VALUE))
                            .addComponent(TFieldKodeBuku)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCari))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDataPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPengembalian)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeAnggota)
                    .addComponent(labelKodeBuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFieldKodeAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFieldKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataPeminjaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TAreaDataPeminjaman;
    private javax.swing.JTextField TFieldKodeAnggota;
    private javax.swing.JTextField TFieldKodeBuku;
    private javax.swing.JButton buttonCari;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDataPeminjaman;
    private javax.swing.JLabel labelKodeAnggota;
    private javax.swing.JLabel labelKodeBuku;
    private javax.swing.JLabel labelPengembalian;
    // End of variables declaration//GEN-END:variables

    public String getTFieldKodeAnggota(){
        return TFieldKodeAnggota.getText();    }

    public String getTFieldKodeBuku(){
        return TFieldKodeBuku.getText();    }
    
    public Object getButtonCari(){
        return buttonCari;    }
    
    @Override
    public void addListener(ActionListener e){
        buttonCari.addActionListener(e);    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
