/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Empleado;
import modelo.empleadoDAO;
import Vistas.empleado;
import Vistas.registroem;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EmpleadoController {
     private EmpleadoDAO empleadoDAO;
    private empleado vistaEmpleado;
    private registroem vistaRegistroEm;

    public EmpleadoController(empleado vistaEmpleado, registroem vistaRegistroEm) {
        this.empleadoDAO = new EmpleadoDAO();
        this.vistaEmpleado = vistaEmpleado;
        this.vistaRegistroEm = vistaRegistroEm;
        cargarEmpleados();
        agregarEventos();
    }

    // Cargar empleados en la tabla de la vista
    public void cargarEmpleados() {
        List<Empleado> empleados = empleadoDAO.obtenerEmpleados();
        DefaultTableModel model = vistaEmpleado.getTableModel();
        model.setRowCount(0); // Limpiar la tabla

        for (Empleado emp : empleados) {
            model.addRow(new Object[]{emp.getNombreUsuario(), emp.getRol(), emp.getEstado()});
        }
    }

    // Registrar un nuevo empleado
    public void registrarEmpleado() {
        String usuario = vistaRegistroEm.getUsuario();
        String contraseña = vistaRegistroEm.getContraseña();
        String rol = vistaRegistroEm.getRol();

        if (usuario.isEmpty() || contraseña.isEmpty() || rol.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (empleadoDAO.verificarNombreUsuario(usuario)) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Empleado nuevoEmpleado = new Empleado(usuario, contraseña, rol, "activa");
        if (empleadoDAO.registrarEmpleado(nuevoEmpleado)) {
            JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente");
            cargarEmpleados();
            vistaRegistroEm.dispose();
            vistaEmpleado.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar empleado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarEventos() {
        vistaEmpleado.btnagregar.addActionListener(e -> {
            vistaRegistroEm.setVisible(true);
            vistaEmpleado.dispose();
        });

        vistaRegistroEm.btnregistrar.addActionListener(e -> registrarEmpleado());

        vistaEmpleado.btnactualizar.addActionListener(e -> cargarEmpleados());
    }
}
