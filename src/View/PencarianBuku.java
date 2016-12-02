package View;

import java.awt.event.ActionListener;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        TAreaDataBuku = new javax.swing.JTextArea();
        ComboBoxPencarianMenurut = new javax.swing.JComboBox();

        labelPencarianBuku.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPencarianBuku.setText("Pencarian Buku");

        labelPencarianMenurut.setText("Pencarian Menurut :");

        btnCari.setText("Cari");

        labelDataBuku.setText("Data Buku :");

        TAreaDataBuku.setColumns(20);
        TAreaDataBuku.setRows(5);
        jScrollPane1.setViewportView(TAreaDataBuku);

        ComboBoxPencarianMenurut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxPencarianMenurut;
    private javax.swing.JTextArea TAreaDataBuku;
    private javax.swing.JButton btnCari;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDataBuku;
    private javax.swing.JLabel labelPencarianBuku;
    private javax.swing.JLabel labelPencarianMenurut;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables

    @Override
    public void viewErrorMsg(String errorMsg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getTxtPencarian(){
        return txtPencarian.getText();    }
    
    public Object getBtnCari(){
        return btnCari;    }
    
    @Override
    public void addListener(ActionListener e){
        btnCari.addActionListener(e);    }
    
}
