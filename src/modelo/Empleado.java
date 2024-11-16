/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Empleado {
    
    // Método para cargar empleados desde la base de datos
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT nombreUsuario, rol, estado FROM empleado";

        try (PreparedStatement ps = Conexion.getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Empleado empleado = new Empleado(
                    rs.getString("nombreUsuario"),
                    rs.getString("rol"),
                    rs.getString("estado")
                );
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar empleados: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return empleados;
    }

    // Método para registrar un nuevo Empleado en la base de datos
    public boolean registrarEmpleado(Empleado empleado) {
        String query = "INSERT INTO `empleado`(`nombreUsuario`, `contrasena`, `rol`, `estado`) VALUES (?,?,?,?)";
        try (PreparedStatement ps = Conexion.getConnection().prepareStatement(query)) {
            ps.setString(1, empleado.getnombreUsuario());
            ps.setString(2, empleado.getcontrasena());
            ps.setString(3, empleado.getrol());
            ps.setString(4, empleado.getestado());

            return ps.executeUpdate() != 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Método para verificar si un usuario ya existe
    public boolean verificarNombreUsuario(String usuario) {
        String query = "SELECT * FROM `empleado` WHERE `nombreUsuario` = ?";
        try (PreparedStatement st = Conexion.getConnection().prepareStatement(query)) {
            st.setString(1, usuario);
            ResultSet rs = st.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar nombre de usuario: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
