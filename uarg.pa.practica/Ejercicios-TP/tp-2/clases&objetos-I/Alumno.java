// Punto 2 - TP Clases & Objetos I
public class Alumno {
    private String nombre;
    private int edad;
    private String numDeMatricula;
    private String carrera;
    private double promedio;  

    public Alumno(String nombre, int edad, String numDeMatricula, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.numDeMatricula = numDeMatricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public void asistirClase() {
        System.out.println(nombre + " está asistiendo a clase.");
    }

    public void presentarExamen() {
        System.out.println(nombre + " está presentando un examen.");
    }

    public double obtenerPromedio() {
        return promedio;
    }
}
