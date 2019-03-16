/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.gui;

import PlanetFood.Pojo.UserProfile;
import PlanetFood.dbutil.DBConnection;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Devendra singh Yadav
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     */
    public AdminOptionsFrame() {
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
        jCalendar1 = new com.toedter.calendar.JCalendar();
        AdminOption = new javax.swing.JPanel();
        AdminPlanetFood = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Empoptoin = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrEditEmp = new javax.swing.JRadioButton();
        jrRemoveEmp = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Categeryoption = new javax.swing.JLabel();
        CategeryOptions = new javax.swing.JPanel();
        jrAddCategery = new javax.swing.JRadioButton();
        jrEditCategory = new javax.swing.JRadioButton();
        jrRemove = new javax.swing.JRadioButton();
        jrViewCategory = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        Cashieroption = new javax.swing.JPanel();
        jrRegisterCashier = new javax.swing.JRadioButton();
        jrRemoveCashier = new javax.swing.JRadioButton();
        CashierOption = new javax.swing.JLabel();
        productoption = new javax.swing.JPanel();
        jrAddProduct = new javax.swing.JRadioButton();
        jrViewProduct = new javax.swing.JRadioButton();
        jrEditProduct = new javax.swing.JRadioButton();
        jrRemoveProduct = new javax.swing.JRadioButton();
        ProductOptions = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        reportoption = new javax.swing.JPanel();
        jrViewOrders = new javax.swing.JRadioButton();
        jrViewDateWise = new javax.swing.JRadioButton();
        ReportOption = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE PLANET FOOD APP");
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(0, 0, 102));

        AdminOption.setBackground(new java.awt.Color(0, 102, 102));
        AdminOption.setForeground(new java.awt.Color(0, 102, 102));
        AdminOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminPlanetFood.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        AdminPlanetFood.setForeground(new java.awt.Color(255, 255, 255));
        AdminPlanetFood.setText("PLANET  FOOD ADMIN  PANEL");
        AdminOption.add(AdminPlanetFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Make A choice");
        AdminOption.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 300, -1));

        Empoptoin.setBackground(new java.awt.Color(0, 102, 102));
        Empoptoin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Empoptoin.setForeground(new java.awt.Color(102, 102, 102));

        jrAddEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrAddEmp);
        jrAddEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Emp");
        jrAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddEmpActionPerformed(evt);
            }
        });

        jrViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewEmp);
        jrViewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Emp");
        jrViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewEmpActionPerformed(evt);
            }
        });

        jrEditEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrEditEmp);
        jrEditEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrEditEmp.setText("Edit Emp");
        jrEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditEmpActionPerformed(evt);
            }
        });

        jrRemoveEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemoveEmp);
        jrRemoveEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrRemoveEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveEmp.setText("Remove Emp");
        jrRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemoveEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmpoptoinLayout = new javax.swing.GroupLayout(Empoptoin);
        Empoptoin.setLayout(EmpoptoinLayout);
        EmpoptoinLayout.setHorizontalGroup(
            EmpoptoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpoptoinLayout.createSequentialGroup()
                .addGroup(EmpoptoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddEmp)
                    .addComponent(jrViewEmp)
                    .addComponent(jrEditEmp)
                    .addComponent(jrRemoveEmp))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EmpoptoinLayout.setVerticalGroup(
            EmpoptoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmpoptoinLayout.createSequentialGroup()
                .addComponent(jrAddEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveEmp)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        AdminOption.add(Empoptoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Emp Options");
        AdminOption.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 30));

        Categeryoption.setBackground(new java.awt.Color(102, 102, 102));
        Categeryoption.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Categeryoption.setForeground(new java.awt.Color(255, 255, 255));
        Categeryoption.setText("Categery Options");
        AdminOption.add(Categeryoption, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 240, -1));

        CategeryOptions.setBackground(new java.awt.Color(0, 102, 102));
        CategeryOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        CategeryOptions.setForeground(new java.awt.Color(153, 153, 153));

        jrAddCategery.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrAddCategery);
        jrAddCategery.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrAddCategery.setForeground(new java.awt.Color(255, 255, 255));
        jrAddCategery.setText("Add Categery");
        jrAddCategery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAddCategeryActionPerformed(evt);
            }
        });

        jrEditCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrEditCategory);
        jrEditCategory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrEditCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrEditCategory.setText("Edit Categery");
        jrEditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditCategoryActionPerformed(evt);
            }
        });

        jrRemove.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemove);
        jrRemove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrRemove.setForeground(new java.awt.Color(255, 255, 255));
        jrRemove.setText("Remove Categery");
        jrRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemoveActionPerformed(evt);
            }
        });

        jrViewCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewCategory);
        jrViewCategory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrViewCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrViewCategory.setText("View Categery");
        jrViewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CategeryOptionsLayout = new javax.swing.GroupLayout(CategeryOptions);
        CategeryOptions.setLayout(CategeryOptionsLayout);
        CategeryOptionsLayout.setHorizontalGroup(
            CategeryOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategeryOptionsLayout.createSequentialGroup()
                .addGroup(CategeryOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddCategery)
                    .addComponent(jrEditCategory)
                    .addComponent(jrViewCategory)
                    .addComponent(jrRemove))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        CategeryOptionsLayout.setVerticalGroup(
            CategeryOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CategeryOptionsLayout.createSequentialGroup()
                .addComponent(jrAddCategery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jrRemove))
        );

        AdminOption.add(CategeryOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 260, 170));

        btnDoTask.setBackground(new java.awt.Color(0, 102, 102));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });
        AdminOption.add(btnDoTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 725, 212, -1));

        Cashieroption.setBackground(new java.awt.Color(0, 102, 102));
        Cashieroption.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Cashieroption.setForeground(new java.awt.Color(102, 102, 102));

        jrRegisterCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRegisterCashier);
        jrRegisterCashier.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrRegisterCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrRegisterCashier.setText("Register Cashier");
        jrRegisterCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRegisterCashierActionPerformed(evt);
            }
        });

        jrRemoveCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemoveCashier);
        jrRemoveCashier.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrRemoveCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveCashier.setText("Remove Cashier ");
        jrRemoveCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemoveCashierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CashieroptionLayout = new javax.swing.GroupLayout(Cashieroption);
        Cashieroption.setLayout(CashieroptionLayout);
        CashieroptionLayout.setHorizontalGroup(
            CashieroptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashieroptionLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(CashieroptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRemoveCashier)
                    .addComponent(jrRegisterCashier))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        CashieroptionLayout.setVerticalGroup(
            CashieroptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashieroptionLayout.createSequentialGroup()
                .addComponent(jrRegisterCashier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveCashier)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        AdminOption.add(Cashieroption, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 270, 180));

        CashierOption.setBackground(new java.awt.Color(102, 102, 102));
        CashierOption.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CashierOption.setForeground(new java.awt.Color(255, 255, 255));
        CashierOption.setText("Cashier Options");
        AdminOption.add(CashierOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 250, -1));

        productoption.setBackground(new java.awt.Color(0, 102, 102));
        productoption.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        productoption.setForeground(new java.awt.Color(102, 102, 102));

        jrAddProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrAddProduct);
        jrAddProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrAddProduct.setText("Add Product");

        jrViewProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewProduct);
        jrViewProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrViewProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrViewProduct.setText("View Product");

        jrEditProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrEditProduct);
        jrEditProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrEditProduct.setText("Edit Product");

        jrRemoveProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrRemoveProduct);
        jrRemoveProduct.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrRemoveProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveProduct.setText("Remove Product");
        jrRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemoveProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productoptionLayout = new javax.swing.GroupLayout(productoption);
        productoption.setLayout(productoptionLayout);
        productoptionLayout.setHorizontalGroup(
            productoptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoptionLayout.createSequentialGroup()
                .addGroup(productoptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddProduct)
                    .addComponent(jrViewProduct)
                    .addComponent(jrEditProduct)
                    .addComponent(jrRemoveProduct))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        productoptionLayout.setVerticalGroup(
            productoptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productoptionLayout.createSequentialGroup()
                .addComponent(jrAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
        );

        AdminOption.add(productoption, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 260, 180));

        ProductOptions.setBackground(new java.awt.Color(102, 102, 102));
        ProductOptions.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ProductOptions.setForeground(new java.awt.Color(255, 255, 255));
        ProductOptions.setText("Product Options");
        AdminOption.add(ProductOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        btnQuit.setBackground(new java.awt.Color(0, 102, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        AdminOption.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 725, 198, -1));

        reportoption.setBackground(new java.awt.Color(0, 102, 102));
        reportoption.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        reportoption.setForeground(new java.awt.Color(102, 102, 102));

        jrViewOrders.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewOrders);
        jrViewOrders.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrViewOrders.setForeground(new java.awt.Color(255, 255, 255));
        jrViewOrders.setText("View Orders");
        jrViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewOrdersActionPerformed(evt);
            }
        });

        jrViewDateWise.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup5.add(jrViewDateWise);
        jrViewDateWise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jrViewDateWise.setForeground(new java.awt.Color(255, 255, 255));
        jrViewDateWise.setText("View DateWise");
        jrViewDateWise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrViewDateWiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportoptionLayout = new javax.swing.GroupLayout(reportoption);
        reportoption.setLayout(reportoptionLayout);
        reportoptionLayout.setHorizontalGroup(
            reportoptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportoptionLayout.createSequentialGroup()
                .addGroup(reportoptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewOrders)
                    .addComponent(jrViewDateWise))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        reportoptionLayout.setVerticalGroup(
            reportoptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportoptionLayout.createSequentialGroup()
                .addComponent(jrViewOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewDateWise)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        AdminOption.add(reportoption, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, 170));

        ReportOption.setBackground(new java.awt.Color(102, 102, 102));
        ReportOption.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ReportOption.setForeground(new java.awt.Color(255, 255, 255));
        ReportOption.setText("Report Options");
        AdminOption.add(ReportOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 250, -1));

        lblusername.setBackground(new java.awt.Color(0, 102, 102));
        lblusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        AdminOption.add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 117, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\asus\\Pictures\\administrator-male.png")); // NOI18N
        AdminOption.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 164));

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
        AdminOption.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminOption, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewEmpActionPerformed

    private void jrEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditEmpActionPerformed

    private void jrRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemoveEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemoveEmpActionPerformed

    private void jrAddCategeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddCategeryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAddCategeryActionPerformed

    private void jrRemoveCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemoveCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemoveCashierActionPerformed

    private void jrAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAddEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAddEmpActionPerformed

    private void jrEditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditCategoryActionPerformed

    private void jrRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemoveActionPerformed

    private void jrRegisterCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRegisterCashierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRegisterCashierActionPerformed

    private void jrRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemoveProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemoveProductActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
       // private String getOption()
        
        if(jrAddEmp.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            AddEmpFrame ae=new AddEmpFrame();
            ae.setVisible(true);
            //return jrAddEmp.getText();
           
        }
        else if(jrViewEmp.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            ViewAllEmp ae=new ViewAllEmp();
            ae.setVisible(true);
        }
        else if(jrEditEmp.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            EditEmpFrame ae=new EditEmpFrame();
            ae.setVisible(true);
        }
        else if(jrRemoveEmp.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            RemoveEmpFrame ae=new RemoveEmpFrame();
            ae.setVisible(true);
        }
        else if(jrAddCategery.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            AddCategoryFrame ae=new AddCategoryFrame();
            ae.setVisible(true);
        }
          else if(jrEditCategory.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            EditCategoryFrame ae=new EditCategoryFrame();
            ae.setVisible(true);
        }
          
           else if(jrViewCategory.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            ViewCategoryFrame ae=new ViewCategoryFrame();
            ae.setVisible(true);
        }
            else if(jrRemove.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            RemoveCategoryFrame e=new RemoveCategoryFrame();
            e.setVisible(true);
        }
               
              else if(jrAddProduct.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            AddProductFrame ae=new AddProductFrame();
            ae.setVisible(true);
        }
                  else if(jrViewProduct.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            ViewProductFrame ae=new ViewProductFrame();
            ae.setVisible(true);
        }
            else if(jrEditProduct.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            EditProductFrame ae=new EditProductFrame();
            ae.setVisible(true);
        }
            else if(jrRemoveProduct.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            RemoveProductFrame ae=new RemoveProductFrame();
            ae.setVisible(true);
        }
            else if(jrRegisterCashier.isSelected())
        {
            AdminOptionsFrame.this.dispose();
               RegisterCashierFrame ae=new RegisterCashierFrame();
            ae.setVisible(true);
        }
            else if(jrRemoveCashier.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            RemoveCashierFrame ae=new RemoveCashierFrame();
            ae.setVisible(true);
        }
              else if(jrViewOrders.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            ViewOrdersFrame ae=new ViewOrdersFrame();
            ae.setVisible(true);
        }
                else if(jrViewDateWise.isSelected())
        {
            AdminOptionsFrame.this.dispose();
            ViewAllDateOrdersFrame ae=new ViewAllDateOrdersFrame();
            ae.setVisible(true);
        }
            
            
            
        
        
     else
            JOptionPane.showMessageDialog(null,"Make a Choice","Choice!",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure ?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            DBConnection.closeConnection();
            JOptionPane.showMessageDialog(null,"Connection close Successfully","Success!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jrViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewOrdersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewOrdersActionPerformed

    private void jrViewDateWiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewDateWiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewDateWiseActionPerformed

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

    private void jrViewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrViewCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrViewCategoryActionPerformed
        
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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminOption;
    private javax.swing.JLabel AdminPlanetFood;
    private javax.swing.JLabel CashierOption;
    private javax.swing.JPanel Cashieroption;
    private javax.swing.JPanel CategeryOptions;
    private javax.swing.JLabel Categeryoption;
    private javax.swing.JPanel Empoptoin;
    private javax.swing.JLabel ProductOptions;
    private javax.swing.JLabel ReportOption;
    private javax.swing.JButton btnDoTask;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jrAddCategery;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrAddProduct;
    private javax.swing.JRadioButton jrEditCategory;
    private javax.swing.JRadioButton jrEditEmp;
    private javax.swing.JRadioButton jrEditProduct;
    private javax.swing.JRadioButton jrRegisterCashier;
    private javax.swing.JRadioButton jrRemove;
    private javax.swing.JRadioButton jrRemoveCashier;
    private javax.swing.JRadioButton jrRemoveEmp;
    private javax.swing.JRadioButton jrRemoveProduct;
    private javax.swing.JRadioButton jrViewCategory;
    private javax.swing.JRadioButton jrViewDateWise;
    private javax.swing.JRadioButton jrViewEmp;
    private javax.swing.JRadioButton jrViewOrders;
    private javax.swing.JRadioButton jrViewProduct;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel productoption;
    private javax.swing.JPanel reportoption;
    // End of variables declaration//GEN-END:variables
}
