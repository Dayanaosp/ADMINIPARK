
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.vPropietario;

public class fPropietario {

    private Connection cn; // Conexión a la base de datos
    private String sSQL = "";
    public Integer totalRegistros;

    public fPropietario() {
        cn = Conexion.getConnection(); // Obtención de la conexión a la base de datos
    }

    // Mostrar los datos de los propietarios
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID Propietario", "Nombre Completo", "Número Celular", "Correo Electrónico"};
        String[] registro = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        // Consulta SQL para obtener los datos de los propietarios
        sSQL = "SELECT idPropietario, nombreCompleto, numeroCelular, correoElectronico FROM propietario "
             + "WHERE nombreCompleto LIKE ? ORDER BY nombreCompleto DESC";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idPropietario");
                registro[1] = rs.getString("nombreCompleto");
                registro[2] = rs.getString("numeroCelular");
                registro[3] = rs.getString("correoElectronico");

                totalRegistros++;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage());
            return null;
        }
    }

    // Insertar nuevo propietario con los campos especificados
    public boolean insertar(vPropietario dts) {
        sSQL = "INSERT INTO propietario (nombreCompleto, numeroCelular, correoElectronico) VALUES (?, ?, ?)";
        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, dts.getNombreCompleto());
            pst.setString(2, dts.getNumeroCelular());
            pst.setString(3, dts.getCorreoElectronico());

            int n = pst.executeUpdate();
            return n != 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos: " + e.getMessage());
            return false;
        }
    }

    // Editar un propietario existente con los campos especificados
    public boolean editar(vPropietario dts) {
        sSQL = "UPDATE propietario SET nombreCompleto=?, numeroCelular=?, correoElectronico=? WHERE idPropietario=?";
        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, dts.getNombreCompleto());
            pst.setString(2, dts.getNumeroCelular());
            pst.setString(3, dts.getCorreoElectronico());
            pst.setInt(4, dts.getIdPropietario()); // Usar el ID del propietario para identificar el registro

            int n = pst.executeUpdate();
            return n != 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos: " + e.getMessage());
            return false;
        }
    }
}