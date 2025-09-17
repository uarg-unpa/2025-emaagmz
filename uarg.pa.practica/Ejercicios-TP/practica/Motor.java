public class Motor {
    private double cilindrada; 
    private String tipo;       

    // Constructor
    public Motor(double cilindrada, String tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    // Getters y Setters
    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // toString
    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
