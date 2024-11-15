/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;  // Para mostrar mensajes de alerta o éxito
import modelo.Conexion;  // Para la conexión con la base de datos
import Vistas.Login;  // Para acceder a los componentes de la vista Login
import Vistas.registrovyc;  // Para abrir la vista del administrador
import Vistas.empleado;  
import modelo.usuario;


public class UsuarioController {
    private final usuario modeloUsuario;
    private final Login vistaLogin;
    private empleado vistaEmpleado;
    private registrovyc vistaAdmin;

    public UsuarioController(usuario modeloUsuario, Login vistaLogin) {
        this.modeloUsuario = modeloUsuario;
        this.vistaLogin = vistaLogin;
        // Asegúrate de que el listener solo se agrega una vez
        this.vistaLogin.getBtnIniciar().addActionListener(e -> iniciarSesion());
    }

    public void iniciarSesion() {
       
    String usuario = vistaLogin.getTxtusuario().getText();
    String contraseña = String.valueOf(vistaLogin.getTxtContraseña().getPassword());
    String rolSeleccionado = (String) vistaLogin.getCboRol().getSelectedItem();

    try {
        PreparedStatement st;
        ResultSet rs;

        // Define la consulta según el rol seleccionado
        String query = "";
        if ("Administrador".equals(rolSeleccionado)) {
            query = "SELECT nombreUsuario FROM administrador WHERE nombreUsuario = ? AND contrasena = ?";
        } else { // Caso "Empleado"
            query = "SELECT nombreUsuario FROM empleado WHERE nombreUsuario = ? AND contrasena = ?";
        }

        st = Conexion.getConnection().prepareStatement(query);

        // Asigna los parámetros a la consulta
        st.setString(1, usuario);
        st.setString(2, contraseña);

        // Ejecuta la consulta
        rs = st.executeQuery();

        if (rs.next()) {
            // Mostrar mensaje solo una vez
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!");

            // Abre la vista correspondiente según el rol, asegurando que no esté ya abierta
            if ("Administrador".equals(rolSeleccionado)) {
                if (vistaEmpleado == null || !vistaEmpleado.isVisible()) {
                    vistaEmpleado = new empleado();
                    vistaEmpleado.setVisible(true);
                    vistaEmpleado.setLocationRelativeTo(null);
                }
            } else {
                if (vistaAdmin == null || !vistaAdmin.isVisible()) {
                    vistaAdmin = new registrovyc();
                    vistaAdmin.setVisible(true);
                    vistaAdmin.setLocationRelativeTo(null);
                }
            }

            // Cierra la ventana de login solo una vez
            vistaLogin.dispose();
        } else {
            // Mostrar mensaje de error solo una vez
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña inválido", "Error en el inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
  }
}
