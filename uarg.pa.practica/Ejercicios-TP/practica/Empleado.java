public class Empleado {
    // Atributos
    private int legajo;
    private double sueldo;
    private Departamento departamento;
    private boolean jefe; 

    // Constructor 
    public Empleado(int legajo, double sueldo, Departamento departamento, boolean jefe) {
        this.legajo = legajo;
        this.sueldo = sueldo;
        this.departamento = departamento;
        this.jefe = jefe;
    }

    // Getters y Setters
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isJefe() {
        return jefe;
    }
    public void setJefe(boolean jefe) {
        this.jefe = jefe;
    }

    // Metodos
    public boolean esJefe() {
        return jefe;
    }

    // Método: aumentarSueldo
    public void aumentarSueldo(double porcentaje) {
        sueldo += sueldo * (porcentaje / 100);
    }

    // Método: calcularBono
    public double calcularBono() {
        // Ejemplo: los jefes reciben 20% de su sueldo como bono, otros el 10%
        return jefe ? sueldo * 0.20 : sueldo * 0.10;
    }

    @Override
    public String toString() {
        return "Empleado [Legajo: " + legajo +
                ", Sueldo: $" + sueldo +
                ", " + departamento.toString() +
                ", Es Jefe: " + (jefe ? "Sí" : "No") + "]";
    }
}
