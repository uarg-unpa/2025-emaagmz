public class Persona {
    // Atributos privados 
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = 'H'; // Sexo por defecto
        this.peso = 0.0;
        this.altura = 0.0;
    }
    
    // Constructor con nombre
    public Persona(String nombre) {
        this(); // Llama al constructor por defecto
        this.nombre = nombre;
    }
    
    // Constructor completo
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo) ? sexo : 'H'; // Valida el sexo
        this.peso = peso;
        this.altura = altura;
    }
    
    // Métodos
    
    // Verifica si la persona es mayor de edad (18 años o más)
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    // Método privado que comprueba si el sexo es válido (H o M)
    private boolean comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M');
    }
    
    // Devuelve toda la información del objeto en formato String
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                " kg, altura=" + altura +
                " m, Mayor de edad: " + (esMayorDeEdad() ? "Sí" : "No") +
                '}';
    }
    
    // Getters y Setters 
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public char getSexo() {
        return sexo;
    }
    
    public void setSexo(char sexo) {
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo no válido. Debe ser 'H' o 'M'");
        }
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}

