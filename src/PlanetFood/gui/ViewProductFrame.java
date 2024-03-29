/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.gui;

import PlanetFood.Pojo.UserProfile;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Devendra singh Yadav
 */
public class ViewProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     */
    public ViewProductFrame() {
        initComponents();
        super.setLocationRelativeTo(this);
        lblusername.setText("Hello"+UserProfile.getUsername());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        AdminOption = new javax.swing.JPanel();
        AdminPlanetFood = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Empoptoin = new javax.swing.JPanel();
        jrViewSingleProducts = new javax.swing.JRadioButton();
        jrViewAllProducts = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        lblusername = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(102, 102, 102));

        AdminOption.setBackground(new java.awt.Color(0, 102, 102));
        AdminOption.setForeground(new java.awt.Color(0, 102, 102));

        AdminPlanetFood.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        AdminPlanetFood.setForeground(new java.awt.Color(255, 255, 255));
        AdminPlanetFood.setText("VIEW PRODUCTS PANEL");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Make A choice");

        Empoptoin.setBackground(new java.awt.Color(0, 102, 102));
        Empoptoin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Empoptoin.setForeground(new java.awt.Color(102, 102, 102));

        jrViewSingleProducts.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewSingleProducts);
        jrViewSingleProducts.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jrViewSingleProducts.setForeground(new java.awt.Color(255, 255, 255));
        jrViewSingleProducts.setText("View Single Products");
        jrViewSingleProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewSingleProductsActionPerformed(evt);
            }
        });

        jrViewAllProducts.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewAllProducts);
        jrViewAllProducts.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jrViewAllProducts.setForeground(new java.awt.Color(255, 255, 255));
        jrViewAllProducts.setText("View All Products");
        jrViewAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewAllProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmpoptoinLayout = new javax.swing.GroupLayout(Empoptoin);
        Empoptoin.setLayout(EmpoptoinLayout);
        EmpoptoinLayout.setHorizontalGroup(
            EmpoptoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpoptoinLayout.createSequentialGroup()
                .addGroup(EmpoptoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewSingleProducts)
                    .addComponent(jrViewAllProducts))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EmpoptoinLayout.setVerticalGroup(
            EmpoptoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpoptoinLayout.createSequentialGroup()
                .addComponent(jrViewSingleProducts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jrViewAllProducts)
                .addGap(40, 40, 40))
        );

        btnDoTask.setBackground(new java.awt.Color(0, 102, 102));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(0, 102, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Back");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        lblusername.setBackground(new java.awt.Color(0, 102, 102));
        lblusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\asus\\Wallpaper\\mc.png")); // NOI18N

        lblLogout.setBackground(new java.awt.Color(0, 102, 102));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AdminOptionLayout = new javax.swing.GroupLayout(AdminOption);
        AdminOption.setLayout(AdminOptionLayout);
        AdminOptionLayout.setHorizontalGroup(
            AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminOptionLayout.createSequentialGroup()
                .addGroup(AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminOptionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdminPlanetFood)
                        .addGap(95, 95, 95)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminOptionLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addGroup(AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminOptionLayout.createSequentialGroup()
                                .addComponent(Empoptoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 252, Short.MAX_VALUE))
                            .addGroup(AdminOptionLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminOptionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)))
                .addContainerGap())
        );
        AdminOptionLayout.setVerticalGroup(
            AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminOptionLayout.createSequentialGroup()
                .addGroup(AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminOptionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblusername)
                            .addComponent(lblLogout)))
                    .addComponent(AdminPlanetFood, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdminOptionLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(Empoptoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addGroup(AdminOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuit)
                            .addComponent(btnDoTask))))
                .addGap(85, 150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
        if(jrViewSingleProducts.isSelected())
        {
            ViewProductFrame.this.dispose();
            ViewSingleProductFrame vsp=new ViewSingleProductFrame();
            vsp.setVisible(true);
            
        }
        else if(jrViewAllProducts.isSelected())
        {
            ViewProductFrame.this.dispose();
            ViewAllProductFrame vsp=new ViewAllProductFrame();
            vsp.setVisible(true);
            
        }
        else
            JOptionPane.showConfirmDialog(null,"Make a Choice","Choice!",JOptionPane.INFORMATION_MESSAGE);
       
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        ViewProductFrame.this.dispose();
        AdminOptionsFrame a=new AdminOptionsFrame();
        a.setVisible(true);
        
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jrViewAllProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewAllProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewAllProductsActionPerformed

    private void jrViewSingleProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewSingleProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewSingleProductsActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are u sure ?","Logout!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            this.dispose();
            LoginFrame lf= new LoginFrame();
            lf.setVisible(true);
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminOption;
    private javax.swing.JLabel AdminPlanetFood;
    private javax.swing.JPanel Empoptoin;
    private javax.swing.JButton btnDoTask;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jrViewAllProducts;
    private javax.swing.JRadioButton jrViewSingleProducts;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblusername;
    // End of variables declaration//GEN-END:variables
}
