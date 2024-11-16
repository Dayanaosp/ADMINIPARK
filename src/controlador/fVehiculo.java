
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.vVehiculo;

public class fVehiculo {

    private Connection cn; // Conexión a la base de datos
    private String sSQL = "";
    public Integer totalRegistros;

    public fVehiculo() {
        cn = Conexion.getConnection(); // Obtención de la conexión a la base de datos
    }

    // Mostrar los datos de los vehículos
    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID Vehículo", "Placa", "Marca", "Modelo", "Color"};
        String[] registro = new String[5];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        // Consulta SQL para obtener los datos de los vehículos
        sSQL = "SELECT idVehiculo, placa, marca, modelo, color FROM vehiculo "
             + "WHERE placa LIKE ? ORDER BY placa DESC";

        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, "%" + buscar + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idVehiculo");
                registro[1] = rs.getString("placa");
                registro[2] = rs.getString("marca");
                registro[3] = rs.getString("modelo");
                registro[4] = rs.getString("color");

                totalRegistros++;
                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage());
            return null;
        }
    }

    // Insertar nuevo vehículo con los campos especificados
    public boolean insertar(vVehiculo dts) {
        sSQL = "INSERT INTO vehiculo (placa, marca, modelo, color) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, dts.getPlaca());
            pst.setString(2, dts.getMarca());
            pst.setString(3, dts.getModelo());
            pst.setString(4, dts.getColor());

            int n = pst.executeUpdate();
            return n != 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos: " + e.getMessage());
            return false;
        }
    }

    // Editar un vehículo existente con los campos especificados
    public boolean editar(vVehiculo dts) {
        sSQL = "UPDATE vehiculo SET placa=?, marca=?, modelo=?, color=? WHERE idVehiculo=?";
        try (PreparedStatement pst = cn.prepareStatement(sSQL)) {
            pst.setString(1, dts.getPlaca());
            pst.setString(2, dts.getMarca());
            pst.setString(3, dts.getModelo());
            pst.setString(4, dts.getColor());
            pst.setInt(5, dts.getIdVehiculo()); // Usar el ID del vehículo para identificar el registro

            int n = pst.executeUpdate();
            return n != 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar datos: " + e.getMessage());
            return false;
        }
    }
}