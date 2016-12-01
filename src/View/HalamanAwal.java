package View;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class HalamanAwal extends javax.swing.JPanel implements View{

    public HalamanAwal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCariBuku = new javax.swing.JButton();
        btnAksesAdmin = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Aplikasi Perpustakaan");

        btnCariBuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCariBuku.setText("Cari Buku");
        btnCariBuku.setActionCommand("masuk");

        btnAksesAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAksesAdmin.setText("Akses Admin");
        btnAksesAdmin.setActionCommand("masuk");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAksesAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnCariBuku)
                .addGap(28, 28, 28)
                .addComponent(btnAksesAdmin)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAksesAdmin;
    private javax.swing.JButton btnCariBuku;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAksesAdmin() {
        return btnAksesAdmin;    }

    public Object getBtnCariBuku() {
        return btnCariBuku;    }

    @Override
    public void addListener(ActionListener e) {
        btnCariBuku.addActionListener(e);
        btnAksesAdmin.addActionListener(e);    }

    @Override
    public void viewErrorMsg(String errorMsg) {
        JOptionPane.showMessageDialog(this, errorMsg);    }
    
}
