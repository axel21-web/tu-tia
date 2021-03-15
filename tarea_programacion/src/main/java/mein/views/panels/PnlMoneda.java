/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rolando
 */
public class PnlMoneda extends javax.swing.JPanel {

    /**
     * Creates new form PnlMoneda
     */
    public PnlMoneda() {
        initComponents();
    }

    public JButton getBntCambioAC() {
        return bntCambioAC;
    }

    public void setBntCambioAC(JButton bntCambioAC) {
        this.bntCambioAC = bntCambioAC;
    }

    public JButton getBntCambioAD() {
        return bntCambioAD;
    }

    public void setBntCambioAD(JButton bntCambioAD) {
        this.bntCambioAD = bntCambioAD;
    }

    public JButton getBntNew() {
        return bntNew;
    }

    public void setBntNew(JButton bntNew) {
        this.bntNew = bntNew;
    }

    public JTextField getTxtCordoba() {
        return txtCordoba;
    }

    public void setTxtCordoba(JTextField txtCordoba) {
        this.txtCordoba = txtCordoba;
    }

    public JTextField getTxtDolar() {
        return txtDolar;
    }

    public void setTxtDolar(JTextField txtDolar) {
        this.txtDolar = txtDolar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bntCambioAC = new javax.swing.JButton();
        bntCambioAD = new javax.swing.JButton();
        bntNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCordoba = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDolar = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(40, 40));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel3.setText("Su cambio:");
        jPanel1.add(jLabel3);

        bntCambioAC.setText("Dolar-Cordoba");
        bntCambioAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCambioACActionPerformed(evt);
            }
        });
        jPanel1.add(bntCambioAC);

        bntCambioAD.setText("Cordoba-Dolar");
        bntCambioAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCambioADActionPerformed(evt);
            }
        });
        jPanel1.add(bntCambioAD);

        bntNew.setText("Nuevo");
        bntNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNewActionPerformed(evt);
            }
        });
        jPanel1.add(bntNew);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Cordoba");

        txtCordoba.setToolTipText("");
        txtCordoba.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCordoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCordobaActionPerformed(evt);
            }
        });

        jLabel2.setText("Dolar $");

        txtDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDolarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDolar, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txtCordoba))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCordoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCordobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCordobaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCordobaActionPerformed

    private void txtDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDolarActionPerformed

    private void bntNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNewActionPerformed
          getTxtCordoba().setText("");
          getTxtDolar().setText("");
          getTxtCordoba().requestFocus();
    }//GEN-LAST:event_bntNewActionPerformed
public static boolean validar(String datos){
    return datos.matches("[0-9]");
}

    private void bntCambioADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCambioADActionPerformed
       if(!validar(txtCordoba.getText().trim())){
           JOptionPane.showMessageDialog(bntCambioAC,"los datos no son correctos");
       }
        double num1,total;
       DecimalFormat f = new DecimalFormat("0.00");
       num1 = Double.parseDouble(getTxtCordoba().getText().trim());//trim es para no validar espacios
       total= num1/34.9;
       getTxtDolar().setText(String.valueOf(f.format(total)));
    }//GEN-LAST:event_bntCambioADActionPerformed

    private void bntCambioACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCambioACActionPerformed
         if(!validar(txtDolar.getText().trim())){
           JOptionPane.showMessageDialog(bntCambioAC,"los datos no son correctos");
       }
        double num1,total;
         DecimalFormat f = new DecimalFormat("0.00");
       num1 = Double.parseDouble(getTxtDolar().getText().trim());
       total= num1*34.9;
       getTxtCordoba().setText(String.valueOf(f.format(total)));
    }//GEN-LAST:event_bntCambioACActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCambioAC;
    private javax.swing.JButton bntCambioAD;
    private javax.swing.JButton bntNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCordoba;
    private javax.swing.JTextField txtDolar;
    // End of variables declaration//GEN-END:variables
}
