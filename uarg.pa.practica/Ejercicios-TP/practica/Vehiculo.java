public class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor;

    // Constructor completo
    public Vehiculo(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Método esPotente()
    public boolean esPotente() {
        return motor.getCilindrada() >= 2.0; 
    }

    // Método actualizarTipoMotor()
    public void actualizarTipoMotor(String nuevoTipo) {
        motor.setTipo(nuevoTipo);
    }

    // Método calcularConsumo()
    public double calcularConsumo() {
        double base = 8.0; 
        return base * motor.getCilindrada();
    }

    // toString()
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}