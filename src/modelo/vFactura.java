package modelo;

public class vFactura {
    private int idFactura;
    private String placa;
    private String nombreUsuario;
    private int cantHora;
    private double valorHora;
    private double total;

    // Getters y Setters
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCantHora() {
        return cantHora;
    }

    public void setCantHora(int cantHora) {
        this.cantHora = cantHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal() {
        this.total = this.cantHora * this.valorHora;
    }
}