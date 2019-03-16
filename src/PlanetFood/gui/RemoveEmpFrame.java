/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.gui;

import PlanetFood.Dao.EmployeesDao;
import PlanetFood.Pojo.Employees;
import PlanetFood.Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class RemoveEmpFrame extends javax.swing.JFrame {

   ArrayList<Employees>empList;
   private Employees e;
    public RemoveEmpFrame() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtaddnewemployee = new javax.swing.JLabel();
        txtempno = new javax.swing.JLabel();
        txtEmpNo = new javax.swing.JTextField();
        btnaddemp = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtViewEmp = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtaddnewemployee.setBackground(new java.awt.Color(0, 0, 0));
        txtaddnewemployee.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txtaddnewemployee.setForeground(new java.awt.Color(255, 255, 255));
        txtaddnewemployee.setText("REMOVE EMPLOYEE PANEL");
        jPanel3.add(txtaddnewemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 0, 550, -1));

        txtempno.setBackground(new java.awt.Color(0, 0, 0));
        txtempno.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtempno.setForeground(new java.awt.Color(255, 255, 255));
        txtempno.setText("EmpId");
        txtempno.setToolTipText("");
        jPanel3.add(txtempno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 150, 32));

        txtEmpNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtEmpNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNoActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmpNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 210, 40));

        btnaddemp.setBackground(new java.awt.Color(0, 102, 102));
        btnaddemp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnaddemp.setForeground(new java.awt.Color(255, 255, 255));
        btnaddemp.setText("RemoveEmp");
        btnaddemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddempActionPerformed(evt);
            }
        });
        jPanel3.add(btnaddemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 547, 220, 40));

        btnback.setBackground(new java.awt.Color(0, 102, 102));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel3.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 547, 190, 40));

        lblLogout.setBackground(new java.awt.Color(0, 102, 102));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });
        jPanel3.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 80, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\asus\\Wallpaper\\administrator-male.png")); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 340));

        lblusername.setBackground(new java.awt.Color(0, 102, 102));
        lblusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        jtViewEmp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtViewEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpId", "EmpName", "Job", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtViewEmp.setGridColor(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(jtViewEmp);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 680, 300));

        btnsearch.setBackground(new java.awt.Color(0, 153, 153));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 150, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNoActionPerformed

    private void btnaddempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddempActionPerformed
       
         try
       {
           Employees e=new Employees();
           String empId=(txtEmpNo.getText());
           e.setEmpno(empId);
           if(EmployeesDao.deleteEmployee(e))
            JOptionPane.showMessageDialog(null, "Record delete SuccessFully","Success!!",JOptionPane.INFORMATION_MESSAGE);
           else
               JOptionPane.showMessageDialog(null, "Could not delete","Error Deletion",JOptionPane.ERROR_MESSAGE);
       }
       catch(SQLException ex)
       {
           JOptionPane.showConfirmDialog(null, "Error in SQl"+ex,"Input Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
       }
       catch(NumberFormatException ex)
       {
           JOptionPane.showConfirmDialog(null, "Please input numeric for Employee No. and Salary"+ex,"Input Error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
       }
       for(int i=jtViewEmp.getRowCount()-1;i>=0;i--)
       {
         ((DefaultTableModel)jtViewEmp.getModel()).removeRow(i);
       }
       txtEmpNo.setText("");

    }//GEN-LAST:event_btnaddempActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        RemoveEmpFrame.this.dispose();
         AdminOptionsFrame aof=new AdminOptionsFrame();
         aof.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
         if (validateInput()==false)
       {
           JOptionPane.showMessageDialog(null,"Enter Employees Id");
           return;
       }
         
         try
         {
             ArrayList<Employees>empList=new ArrayList<>();
             String str=txtEmpNo.getText();
             empList=EmployeesDao.searchEmployee(str);
              boolean found=false;
              for (Employees e : empList)
             {
             if(str.equals(e.getEmpno()))
             {
             Object[]rows=new Object[4];
             DefaultTableModel model=( DefaultTableModel)jtViewEmp.getModel();
                rows[0]=e.getEmpno();
                rows[1]=e.getEname();
                rows[2]=e.getJob();
                rows[3]=e.getSal();
                model.addRow(rows);
                found=true;
                break;
                
             }
        }
             if(found==false) 
             {
              JOptionPane.showMessageDialog(null,"Does Not Exit This Employees Id");      
             }
          }
         catch(Throwable th)
         {
             th.printStackTrace();
         }
         
         
    }//GEN-LAST:event_btnsearchActionPerformed
private boolean validateInput()
    {
        if(txtEmpNo.getText().isEmpty())
            return false;
        else 
            return true;
    }
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
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RemoveEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddemp;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable jtViewEmp;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JLabel txtaddnewemployee;
    private javax.swing.JLabel txtempno;
    // End of variables declaration//GEN-END:variables
}
