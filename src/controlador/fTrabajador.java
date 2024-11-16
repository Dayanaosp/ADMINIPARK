
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.vTrabajador;

public class fTrabajador {

    private Connection cn; // Cambia a variable de instancia
    private String sSQL = "";
    public Integer totalRegistros;

    public fTrabajador() {
        cn = Conexion.getConnection(); // Obtén la conexión aquí
    }

    // Mostrar los datos de idEmpleado, nombreUsuario, rol, estado
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID Empleado", "Nombre Usuario", "Contraseña" , "Rol", "Estado"};
        String[] registro = new String[5];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        // Construcción de la consulta SQL para mostrar los datos
        sSQL = "SELECT idEmpleado, nombreUsuario, contrasena, rol, estado FROM empleado "
         + "WHERE nombreUsuario LIKE ? ORDER BY nombreUsuario DESC";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idEmpleado");
                registro[1] = rs.getString("nombreUsuario");
                registro[2] = rs.getString("contrasena");
                registro[3] = rs.getString("rol").toUpperCase(); // Convertir a cadena y pasar a mayúsculas
                registro[4] = rs.getString("estado");

                totalRegistros++;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage());
            return null;
        }
    }

    // Insertar nuevo empleado con los campos especificados
    public boolean insertar(vTrabajador dts) {
    sSQL = "INSERT INTO empleado (nombreUsuario, contrasena, rol, estado) VALUES (?, ?, ?, ?)";
    try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
        pst.setString(1, dts.getNombreUsuario());
        pst.setString(2, dts.getContrasena());
        pst.setString(3, dts.getRol().name()); // Convertir a String
        pst.setString(4, dts.getEstado().name()); // Convertir a String

        int n = pst.executeUpdate();
        return n != 0;

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al insertar datos: " + e.getMessage());
        return false;
    }
}

    // Editar empleado existente con los campos especificados
    public boolean editar(vTrabajador dts) {
    String sSQL = "UPDATE empleado SET nombreUsuario=?, contrasena=?, rol=?, estado=? WHERE idEmpleado=?";
     try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
         pst.setString(1, dts.getNombreUsuario());
         pst.setString(2, dts.getContrasena());
         pst.setString(3, dts.getRol().name()); // Convertir a String
         pst.setString(4, dts.getEstado().name()); // Convertir a String
         pst.setInt(5, dts.getIdEmpleado()); // Usar el ID para identificar el registro

         int n = pst.executeUpdate();
         return n != 0;

     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error al editar datos: " + e.getMessage());
         return false;
     }
   }
 }