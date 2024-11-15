/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.usuario;
import controlador.UsuarioController;


/**
 *
 * @author Dayana
 */
public class Login extends javax.swing.JFrame {

     private UsuarioController controlador;
    
    public Login() {
        initComponents();
        this.ocultar.setVisible(false);
        this.setTitle("ADMINIPARK");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        usuario modelo = new usuario();
        controlador = new UsuarioController(modelo, this);
    }
    
     public javax.swing.JTextField getTxtusuario() {
        return txtusuario;
    }

    public javax.swing.JPasswordField getTxtContraseña() {
        return txtcontraseña;
    }

    public javax.swing.JComboBox<String> getCboRol() {
        return cborol;
    }
    
    public javax.swing.JButton getBtnIniciar() {
        return btniniciar;
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
        panelRound2 = new Vistas.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cborol = new javax.swing.JComboBox<>();
        txtusuario = new javax.swing.JTextField();
        btniniciar = new javax.swing.JButton();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        lblRegistrarse = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(250, 217, 204));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(248, 199, 180));
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo prueba.png"))); // NOI18N
        panelRound2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 190));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 188));

        jLabel2.setFont(new java.awt.Font("Nunito", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(215, 125, 91));
        jLabel2.setText("¡Bienvenido!");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 223, -1, -1));

        cborol.setBackground(new java.awt.Color(255, 255, 255));
        cborol.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        cborol.setForeground(new java.awt.Color(0, 0, 0));
        cborol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione un rol--", "Administrador", "Empleado" }));
        cborol.setBorder(null);
        cborol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cborolActionPerformed(evt);
            }
        });
        panelRound1.add(cborol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 250, 40));

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtusuario.setBorder(null);
        txtusuario.setMaximumSize(new java.awt.Dimension(42, 36));
        txtusuario.setMinimumSize(new java.awt.Dimension(42, 36));
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusuarioFocusGained(evt);
            }
        });
        panelRound1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 230, 20));

        btniniciar.setBackground(new java.awt.Color(215, 125, 91));
        btniniciar.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        btniniciar.setForeground(new java.awt.Color(255, 255, 255));
        btniniciar.setText("Iniciar sesión");
        btniniciar.setBorder(null);
        btniniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        panelRound1.add(btniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 202, 42));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });
        panelRound1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 50, 40));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        panelRound1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 50, 40));

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(0, 0, 0));
        txtcontraseña.setBorder(null);
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        panelRound1.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 230, -1));

        lblRegistrarse.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(215, 125, 91));
        lblRegistrarse.setText("¿Aún no tienes cuenta? Únete aquí");
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseExited(evt);
            }
        });
        panelRound1.add(lblRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/roles.png"))); // NOI18N
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 50, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        panelRound1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 50, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 50, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 260, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelRound1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 500, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1435, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cborolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cborolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cborolActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        ocultar.setVisible(true);
        txtcontraseña.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        ver.setVisible(true);
        ocultar.setVisible(false);
        txtcontraseña.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
         controlador.iniciarSesion();              
    }//GEN-LAST:event_btniniciarActionPerformed

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        cuentan registroFrame = new cuentan(); 
        registroFrame.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void lblRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseEntered
        
        Color customColor = Color.decode("#D77D5B");
        Color darkerColor = customColor.darker();
        Border lblBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, darkerColor);
        lblRegistrarse.setBorder(lblBorder);
        
    }//GEN-LAST:event_lblRegistrarseMouseEntered

    private void lblRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseExited
        Color customColor = Color.decode("#D77D5B");
        Border lblBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, customColor);
        lblRegistrarse.setBorder(lblBorder);
    }//GEN-LAST:event_lblRegistrarseMouseExited

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained

    }//GEN-LAST:event_txtusuarioFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JComboBox<String> cborol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel ocultar;
    private Vistas.PanelRound panelRound1;
    private Vistas.PanelRound panelRound2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables

}
