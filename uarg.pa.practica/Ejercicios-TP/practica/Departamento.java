public class Departamento {
    private String nombre;
    private int piso;

    // Constructor
    public Departamento(String nombre, int piso) {
        this.nombre = nombre;
        this.piso = piso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre + " (Piso " + piso + ")";
    }
}