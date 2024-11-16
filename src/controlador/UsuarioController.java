/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Conexion;
import Vistas.Login;
import Vistas.frmTrabajador;
import Vistas.frmVehiculo;  // Reemplazado registrovyc por frmVehiculo
import modelo.usuario;



public class UsuarioController {
    private final usuario modeloUsuario;
    private final Login vistaLogin;
    private frmTrabajador vistaTrabajador;
    private frmVehiculo vistaVehiculo;  // Cambio a frmVehiculo

    public UsuarioController(usuario modeloUsuario, Login vistaLogin) {
        this.modeloUsuario = modeloUsuario;
        this.vistaLogin = vistaLogin;
        this.vistaLogin.getBtnIniciar().addActionListener(e -> iniciarSesion());
    }

    public void iniciarSesion() {
        String usuario = vistaLogin.getTxtusuario().getText();
        String contraseña = String.valueOf(vistaLogin.getTxtContraseña().getPassword());
        String rolSeleccionado = (String) vistaLogin.getCboRol().getSelectedItem();

        try (PreparedStatement st = Conexion.getConnection().prepareStatement(getQueryByRol(rolSeleccionado))) {
            // Asigna los parámetros a la consulta
            st.setString(1, usuario);
            st.setString(2, contraseña);

            // Ejecuta la consulta
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!");

                    // Abre la vista correspondiente según el rol
                    abrirVistaPorRol(rolSeleccionado);

                    // Cierra la ventana de login solo una vez
                    vistaLogin.dispose();
                } else {
                    // Mostrar mensaje de error
                    JOptionPane.showMessageDialog(null, "Usuario/Contraseña inválido", "Error en el inicio de sesión", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String getQueryByRol(String rol) {
        if ("Administrador".equals(rol)) {
            return "SELECT nombreUsuario FROM administrador WHERE nombreUsuario = ? AND contrasena = ?";
        } else {
            return "SELECT nombreUsuario FROM empleado WHERE nombreUsuario = ? AND contrasena = ?";
        }
    }

    private void abrirVistaPorRol(String rolSeleccionado) {
        if ("Administrador".equals(rolSeleccionado)) {
            if (vistaTrabajador == null || !vistaTrabajador.isVisible()) {
                vistaTrabajador = new frmTrabajador();
                vistaTrabajador.setVisible(true);
                vistaTrabajador.setLocationRelativeTo(null);
            }
        } else {
            if (vistaVehiculo == null || !vistaVehiculo.isVisible()) {  // Cambio aquí
                vistaVehiculo = new frmVehiculo();  // Cambio a frmVehiculo
                vistaVehiculo.setVisible(true);
                vistaVehiculo.setLocationRelativeTo(null);
            }
        }
    }
}
