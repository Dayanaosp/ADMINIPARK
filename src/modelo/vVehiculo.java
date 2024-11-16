package modelo;

public class vVehiculo {
    
    private int idVehiculo;
    private String Placa;  // Cambiado de char a String
    private String Marca;
    private String Modelo;
    private String Color;

  
    public vVehiculo(int idVehiculo, String Placa, String Marca, String Modelo, String Color) {
        this.idVehiculo = idVehiculo;
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
    }

    public vVehiculo() {
        
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {  // Cambiado de char a String
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "vVehiculo{" + "idVehiculo=" + idVehiculo + ", Placa=" + Placa + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + '}';
    }
}