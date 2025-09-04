// Punto 1 - TP Clases & Objetos II
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo; 
    private double peso;
    private double altura;

    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = SEXO_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor con nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.dni = "";
        this.sexo = SEXO_DEFECTO;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }
}