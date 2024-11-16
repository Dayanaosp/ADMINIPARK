package modelo;

public class vPropietario {
    
    private int idPropietario;
    private String nombreCompleto;
    private String numeroCelular;
    private String correoElectronico;

    // Constructor con los atributos del propietario
    public vPropietario(int idPropietario, String nombreCompleto, String numeroCelular, String correoElectronico) {
        this.idPropietario = idPropietario;
        this.nombreCompleto = nombreCompleto;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
    }

    // Constructor vacío
    public vPropietario() {}

    // Getters y setters para los nuevos atributos
    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    // Método toString para mostrar los datos del propietario
    @Override
    public String toString() {
        return "vPropietario{" + "idPropietario=" + idPropietario + ", nombreCompleto=" + nombreCompleto + 
               ", numeroCelular=" + numeroCelular + ", correoElectronico=" + correoElectronico + '}';
    }
}