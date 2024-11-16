package modelo;

public class vTrabajador {
    // Definición de la enumeración Rol
    public enum Rol {
        ADMINISTRADOR,
        EMPLEADO
    }

    // Definición de la enumeración Estado
    public enum Estado {
        HABILITADO,
        DESHABILITADO
    }

    private int idEmpleado;
    private String nombreUsuario;
    private String contrasena;
    private Rol rol; // Cambiado a enum
    private Estado estado; // Cambiado a enum

    // Constructor por defecto
    public vTrabajador() {
        this.idEmpleado = 0;
        this.nombreUsuario = "";
        this.contrasena = "";
        this.rol = Rol.EMPLEADO; // Valor predeterminado
        this.estado = Estado.HABILITADO; // Valor predeterminado
    }

    // Constructor
    public vTrabajador(int idEmpleado, String nombreUsuario, String contrasena, Rol rol, Estado estado) {
        this.idEmpleado = idEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
    }

    // Getters and Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío");
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        if (contrasena == null || contrasena.length() < 6) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 6 caracteres");
        }
        this.contrasena = contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "vTrabajador{" +
                "idEmpleado=" + idEmpleado +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }
}