package controlador;

import modelo.vFactura;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class fFactura {
    private Connection conexion;

    public fFactura() {
        // Establecer conexión a la base de datos
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_base_de_datos", "usuario", "contraseña");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean insertar(vFactura factura) {
        String sql = "INSERT INTO Factura (placa, nombreUsuario, CantHora, valorHora, total) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pst = conexion.prepareStatement(sql)) {
            pst.setString(1, factura.getPlaca());
            pst.setString(2, factura.getNombreUsuario());
            pst.setInt(3, factura.getCantHora());
            pst.setDouble(4, factura.getValorHora());
            factura.calcularTotal();
            pst.setDouble(5, factura.getTotal());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("idFactura");
        modelo.addColumn("Placa");
        modelo.addColumn("Nombre Usuario");
        modelo.addColumn("Cant. Hora");
        modelo.addColumn("Valor Hora");
        modelo.addColumn("Total");

        String sql = "SELECT * FROM Factura WHERE placa LIKE ? ORDER BY idFactura";
        try (PreparedStatement pst = conexion.prepareStatement(sql)) {
            pst.setString(1, "%" + buscar + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("idFactura");
                fila[1] = rs.getString("placa");
                fila[2] = rs.getString("nombreUsuario");
                fila[3] = rs.getInt("CantHora");
                fila[4] = rs.getDouble("valorHora");
                fila[5] = rs.getDouble("total");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return modelo;
    }
}