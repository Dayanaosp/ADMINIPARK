/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import modelo.Conexion; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usuario {
     private final Connection conexion;

    public usuario() {
        // Obtiene la conexión de la clase Conexion
        this.conexion = Conexion.getConnection();
    }

    // Método para validar el usuario y contraseña
    public boolean validarUsuario(String nombreUsuario, String contrasena) {
    try {
        // Verificar en la tabla administrador
        String queryAdmin = "SELECT * FROM administrador WHERE nombreUsuario = ? AND contrasena = ?";
        PreparedStatement stAdmin = conexion.prepareStatement(queryAdmin);
        stAdmin.setString(1, nombreUsuario);
        stAdmin.setString(2, contrasena);

        ResultSet rsAdmin = stAdmin.executeQuery();
        
        // Si se encuentra el usuario en administrador, lo validamos
        if (rsAdmin.next()) {
            return true;
        }

        // Verificar en la tabla empleado
        String queryEmpleado = "SELECT * FROM empleado WHERE nombreUsuario = ? AND contrasena = ?";
        PreparedStatement stEmpleado = conexion.prepareStatement(queryEmpleado);
        stEmpleado.setString(1, nombreUsuario);
        stEmpleado.setString(2, contrasena);

        ResultSet rsEmpleado = stEmpleado.executeQuery();

        // Si se encuentra el usuario en empleado, lo validamos
        return rsEmpleado.next();  // Devuelve true si el usuario existe en cualquiera de las tablas
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
   }
    // Método para obtener el rol del usuario en la base de datos
    public String obtenerRolUsuario(String nombreUsuario) {
        try {
            String queryAdmin = "SELECT 'Administrador' AS rol FROM administrador WHERE nombreUsuario = ?";
            String queryEmpleado = "SELECT 'Empleado' AS rol FROM empleado WHERE nombreUsuario = ?";

            // Primero verifica si es un administrador
            PreparedStatement stAdmin = conexion.prepareStatement(queryAdmin);
            stAdmin.setString(1, nombreUsuario);
            ResultSet rsAdmin = stAdmin.executeQuery();

            if (rsAdmin.next()) {
                return rsAdmin.getString("rol"); // Retorna "Administrador" si lo encuentra en la tabla
            }

            // Si no es administrador, verifica si es empleado
            PreparedStatement stEmpleado = conexion.prepareStatement(queryEmpleado);
            stEmpleado.setString(1, nombreUsuario);
            ResultSet rsEmpleado = stEmpleado.executeQuery();

            if (rsEmpleado.next()) {
                return rsEmpleado.getString("rol"); // Retorna "Empleado" si lo encuentra en la tabla
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Retorna null si no encuentra el usuario en ninguna tabla
    }
}
