/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author Dayana
 */
public class facturas extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public facturas() {
        initComponents();
        pempleado.setVisible(false);
        pvehiculo.setVisible(false);
        pcliente.setVisible(false);
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
        panelRound1 = new Vistas.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnsalir = new Vistas.PanelRound();
        btnsalir = new javax.swing.JButton();
        pcliente = new Vistas.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        pvehiculo = new Vistas.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        pempleado = new Vistas.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pfactura = new Vistas.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        panelRound2 = new Vistas.PanelRound();
        btncliente1 = new javax.swing.JButton();
        panelRound5 = new Vistas.PanelRound();
        btnempleado1 = new javax.swing.JButton();
        panelRound3 = new Vistas.PanelRound();
        btnvehiculo = new javax.swing.JButton();
        panelRound4 = new Vistas.PanelRound();
        btnfactura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(250, 217, 204));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(215, 125, 91));
        jLabel4.setText("¿Aún no tienes cuenta? Únete aquí");

        jLabel2.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(215, 125, 91));
        jLabel2.setText("Empleados registrados");

        btnnuevo.setBackground(new java.awt.Color(215, 125, 91));
        btnnuevo.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo empleado");
        btnnuevo.setBorder(null);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(236, 193, 177));
        jTextField2.setText("Buscar");
        jTextField2.setBorder(null);

        btnbuscar.setBackground(new java.awt.Color(215, 125, 91));
        btnbuscar.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(null);

        jTable1.setBackground(new java.awt.Color(250, 217, 204));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Usuario", "Contraseña", "Rol", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(295, 295, 295)
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(54, 54, 54)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 1010, 480));

        jLabel5.setFont(new java.awt.Font("Nunito", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(215, 125, 91));
        jLabel5.setText("Empleados");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo vistas.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 440, 120));

        pnsalir.setBackground(new java.awt.Color(215, 125, 91));
        pnsalir.setForeground(new java.awt.Color(0, 0, 0));
        pnsalir.setRoundBottomLeft(30);
        pnsalir.setRoundBottomRight(30);
        pnsalir.setRoundTopLeft(30);
        pnsalir.setRoundTopRight(30);

        btnsalir.setBackground(new java.awt.Color(215, 125, 91));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono5.png"))); // NOI18N
        btnsalir.setBorder(null);
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnsalirLayout = new javax.swing.GroupLayout(pnsalir);
        pnsalir.setLayout(pnsalirLayout);
        pnsalirLayout.setHorizontalGroup(
            pnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnsalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(14, 14, 14))
        );
        pnsalirLayout.setVerticalGroup(
            pnsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnsalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addContainerGap())
        );

        jPanel1.add(pnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 70, 50));

        pcliente.setBackground(new java.awt.Color(215, 125, 91));
        pcliente.setRoundBottomRight(30);
        pcliente.setRoundTopRight(30);
        pcliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clientes");
        pcliente.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(pcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 130, 60));

        pvehiculo.setBackground(new java.awt.Color(215, 125, 91));
        pvehiculo.setRoundBottomRight(30);
        pvehiculo.setRoundTopRight(30);

        jLabel10.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vehículos");

        javax.swing.GroupLayout pvehiculoLayout = new javax.swing.GroupLayout(pvehiculo);
        pvehiculo.setLayout(pvehiculoLayout);
        pvehiculoLayout.setHorizontalGroup(
            pvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pvehiculoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(22, 22, 22))
        );
        pvehiculoLayout.setVerticalGroup(
            pvehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pvehiculoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pvehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 130, 60));

        pempleado.setBackground(new java.awt.Color(215, 125, 91));
        pempleado.setRoundBottomRight(30);
        pempleado.setRoundTopRight(30);
        pempleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gestión de");
        pempleado.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("empleados");
        pempleado.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPanel1.add(pempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 130, 60));

        pfactura.setBackground(new java.awt.Color(215, 125, 91));
        pfactura.setRoundBottomRight(30);
        pfactura.setRoundTopRight(30);

        jLabel11.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Facturas");

        javax.swing.GroupLayout pfacturaLayout = new javax.swing.GroupLayout(pfactura);
        pfactura.setLayout(pfacturaLayout);
        pfacturaLayout.setHorizontalGroup(
            pfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfacturaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pfacturaLayout.setVerticalGroup(
            pfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfacturaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(pfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 130, 60));

        panelRound2.setBackground(new java.awt.Color(215, 125, 91));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        btncliente1.setBackground(new java.awt.Color(215, 125, 91));
        btncliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono2.png"))); // NOI18N
        btncliente1.setBorder(null);
        btncliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncliente1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncliente1MouseExited(evt);
            }
        });
        btncliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btncliente1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btncliente1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        panelRound5.setBackground(new java.awt.Color(215, 125, 91));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        btnempleado1.setBackground(new java.awt.Color(215, 125, 91));
        btnempleado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono1.png"))); // NOI18N
        btnempleado1.setBorder(null);
        btnempleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnempleado1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnempleado1MouseExited(evt);
            }
        });
        btnempleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnempleado1)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnempleado1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 60));

        panelRound3.setBackground(new java.awt.Color(215, 125, 91));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);

        btnvehiculo.setBackground(new java.awt.Color(215, 125, 91));
        btnvehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono3.png"))); // NOI18N
        btnvehiculo.setBorder(null);
        btnvehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnvehiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnvehiculoMouseExited(evt);
            }
        });
        btnvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnvehiculo)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnvehiculo)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        panelRound4.setBackground(new java.awt.Color(215, 125, 91));
        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);

        btnfactura.setBackground(new java.awt.Color(215, 125, 91));
        btnfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4.png"))); // NOI18N
        btnfactura.setBorder(null);
        btnfactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnfacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfacturaMouseExited(evt);
            }
        });
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnfactura)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(btnfactura)
                .addContainerGap())
        );

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        registroem registroemFrame = new registroem(); 
        registroemFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnvehiculoActionPerformed

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfacturaActionPerformed

    private void btncliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncliente1ActionPerformed

    private void btncliente1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncliente1MouseEntered
         pcliente.setVisible(true); 
    }//GEN-LAST:event_btncliente1MouseEntered

    private void btncliente1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncliente1MouseExited
        pcliente.setVisible(false); 
    }//GEN-LAST:event_btncliente1MouseExited

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        Login loginFrame = new Login(); 
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnvehiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvehiculoMouseEntered
        pvehiculo.setVisible(true); 
    }//GEN-LAST:event_btnvehiculoMouseEntered

    private void btnvehiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvehiculoMouseExited
        pvehiculo.setVisible(false); 
    }//GEN-LAST:event_btnvehiculoMouseExited

    private void btnfacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfacturaMouseEntered
        
    }//GEN-LAST:event_btnfacturaMouseEntered

    private void btnfacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfacturaMouseExited
       
    }//GEN-LAST:event_btnfacturaMouseExited

    private void btnempleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnempleado1ActionPerformed

    private void btnempleado1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnempleado1MouseEntered
        pempleado.setVisible(true); 
    }//GEN-LAST:event_btnempleado1MouseEntered

    private void btnempleado1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnempleado1MouseExited
        pempleado.setVisible(false); 
    }//GEN-LAST:event_btnempleado1MouseExited

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
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncliente1;
    private javax.swing.JButton btnempleado1;
    private javax.swing.JButton btnfactura;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnvehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private Vistas.PanelRound panelRound1;
    private Vistas.PanelRound panelRound2;
    private Vistas.PanelRound panelRound3;
    private Vistas.PanelRound panelRound4;
    private Vistas.PanelRound panelRound5;
    private Vistas.PanelRound pcliente;
    private Vistas.PanelRound pempleado;
    private Vistas.PanelRound pfactura;
    private Vistas.PanelRound pnsalir;
    private Vistas.PanelRound pvehiculo;
    // End of variables declaration//GEN-END:variables
}
