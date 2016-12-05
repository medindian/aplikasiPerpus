package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class CariBuku extends javax.swing.JPanel {

    public CariBuku() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCari = new javax.swing.JButton();
        labelDataBuku = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDtBuku = new javax.swing.JTextArea();
        dasarPencarian = new javax.swing.JComboBox();
        judul = new javax.swing.JLabel();
        labelAsasPecarian = new javax.swing.JLabel();
        txtPencarian = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        btnCari.setText("Cari");

        labelDataBuku.setText("Data Buku :");

        txtDtBuku.setColumns(20);
        txtDtBuku.setRows(5);
        jScrollPane1.setViewportView(txtDtBuku);

        dasarPencarian.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis" }));

        judul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        judul.setText("Pencarian Buku");

        labelAsasPecarian.setText("Pencarian Menurut :");

        btnKembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKembali)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAsasPecarian)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dasarPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAsasPecarian)
                    .addComponent(dasarPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDataBuku)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKembali)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKembali;
    private javax.swing.JComboBox dasarPencarian;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelAsasPecarian;
    private javax.swing.JLabel labelDataBuku;
    private javax.swing.JTextArea txtDtBuku;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables

    public String getTxtPencarian(){
        return txtPencarian.getText();    }
    
    public Object getBtnCari(){
        return btnCari;    }

    public Object getBtnKembali() {
        return btnKembali;  }

    public int getDasarPencarian() {
        return dasarPencarian.getSelectedIndex();   }

    public void setTxtDtBuku(String dataBuku) {
        this.txtDtBuku.setText(dataBuku);    }
    
//    public void setListBuku(String list[]){
//        this.listBuku.setListData(list);    }
    
    public void addListener(ActionListener e){
        btnCari.addActionListener(e);
        btnKembali.addActionListener(e);
    }

}
