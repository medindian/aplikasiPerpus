package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PencarianBuku extends javax.swing.JPanel implements View{

    public PencarianBuku() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPencarianBuku = new javax.swing.JLabel();
        labelPencarianMenurut = new javax.swing.JLabel();
        txtPencarian = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        labelDataBuku = new javax.swing.JLabel();
        boxHasilPencarian = new javax.swing.JScrollPane();
        TAreaDataBuku = new javax.swing.JTextArea();
        ComboBoxPencarianMenurut = new javax.swing.JComboBox();
        btnKembali = new javax.swing.JButton();

        labelPencarianBuku.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPencarianBuku.setText("Pencarian Buku");

        labelPencarianMenurut.setText("Pencarian Menurut :");

        btnCari.setText("Cari");

        labelDataBuku.setText("Data Buku :");

        TAreaDataBuku.setColumns(20);
        TAreaDataBuku.setRows(5);
        boxHasilPencarian.setViewportView(TAreaDataBuku);

        ComboBoxPencarianMenurut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Judul", "Penulis" }));

        btnKembali.setText("Kembali");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCari)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelPencarianBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(labelPencarianMenurut)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboBoxPencarianMenurut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali)
                    .addComponent(boxHasilPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPencarianBuku)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPencarianMenurut)
                    .addComponent(ComboBoxPencarianMenurut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDataBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxHasilPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKembali)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxPencarianMenurut;
    private javax.swing.JTextArea TAreaDataBuku;
    private javax.swing.JScrollPane boxHasilPencarian;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel labelDataBuku;
    private javax.swing.JLabel labelPencarianBuku;
    private javax.swing.JLabel labelPencarianMenurut;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getComboBoxPencarian(){
        return ComboBoxPencarianMenurut.getItemCount();
    }

    public void setTAreaDataBuku(String TAreaDataBuku) {
        this.TAreaDataBuku.setText(TAreaDataBuku);
    }
    
    public String getTxtPencarian(){
        return txtPencarian.getText();    }
    
    public Object getBtnCari(){
        return btnCari;    }

    public Object getBtnKembali() {
        return btnKembali;    }
    
    @Override
    public void addListener(ActionListener e){
        btnKembali.addActionListener(e);
        btnCari.addActionListener(e);    }
    
}
