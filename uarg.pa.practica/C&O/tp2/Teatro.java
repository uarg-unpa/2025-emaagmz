class Obra {
    // Atributos privados
    private String nombre;
    private double precio;
    
    // Constructor
    public Obra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("ERROR: El precio no puede ser negativo.");
        }
    }
    
    // Método toString para mostrar información
    @Override
    public String toString() {
        return nombre + " - $" + String.format("%.2f", precio);
    }
}

// Clase Teatro
public class Teatro {
    // Atributos privados
    private String nombre;
    private String direccion;
    private Obra[] obras;
    private static final int CANTIDAD_OBRAS = 3;
    
    // Constructor
    public Teatro(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.obras = new Obra[CANTIDAD_OBRAS];
        // Inicializar con obras vacías
        for (int i = 0; i < CANTIDAD_OBRAS; i++) {
            obras[i] = new Obra("Sin programar", 0.0);
        }
    }
    
    // Constructor completo con obras
    public Teatro(String nombre, String direccion, Obra obra1, Obra obra2, Obra obra3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.obras = new Obra[CANTIDAD_OBRAS];
        obras[0] = obra1;
        obras[1] = obra2;
        obras[2] = obra3;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Método para cambiar una obra específica
    public void cambiarObra(int indice, Obra nuevaObra) {
        if (indice >= 0 && indice < CANTIDAD_OBRAS) {
            obras[indice] = nuevaObra;
            System.out.println("Obra " + (indice + 1) + " actualizada correctamente.");
        } else {
            System.out.println("ERROR: Índice de obra inválido. Debe ser entre 0 y " + (CANTIDAD_OBRAS - 1));
        }
    }
    
    // Método para cambiar el nombre de una obra específica
    public void cambiarNombreObra(int indice, String nuevoNombre) {
        if (indice >= 0 && indice < CANTIDAD_OBRAS) {
            obras[indice].setNombre(nuevoNombre);
            System.out.println("Nombre de obra " + (indice + 1) + " actualizado.");
        } else {
            System.out.println("ERROR: Índice de obra inválido.");
        }
    }
    
    // Método para cambiar el precio de una obra específica
    public void cambiarPrecioObra(int indice, double nuevoPrecio) {
        if (indice >= 0 && indice < CANTIDAD_OBRAS) {
            obras[indice].setPrecio(nuevoPrecio);
            System.out.println("Precio de obra " + (indice + 1) + " actualizado.");
        } else {
            System.out.println("ERROR: Índice de obra inválido.");
        }
    }
    
    // Método para obtener una obra específica
    public Obra getObra(int indice) {
        if (indice >= 0 && indice < CANTIDAD_OBRAS) {
            return obras[indice];
        }
        return null;
    }
    
    // Método para mostrar la cartelera completa del teatro
    public void mostrarCartelera() {
        System.out.println("\n|------------------------------------------|");
        System.out.println("|      " + nombre);
        System.out.println("|      " + direccion);
        System.out.println("|------------------------------------------|");
        System.out.println("|         CARTELERA DEL DÍA                |");
        System.out.println("|------------------------------------------|");
        for (int i = 0; i < CANTIDAD_OBRAS; i++) {
            System.out.println("║ Obra " + (i + 1) + ": " + obras[i]);
        }
        System.out.println("|------------------------------------------|\n");
    }
    
    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teatro: ").append(nombre).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("Obras:\n");
        for (int i = 0; i < CANTIDAD_OBRAS; i++) {
            sb.append("  ").append(i + 1).append(". ").append(obras[i]).append("\n");
        }
        return sb.toString();
    }
}

// Clase de prueba
class TestTeatro {
    public static void main(String[] args) {
        System.out.println("--- TEST TEATRO ---\n");
        
        // Crear obras
        Obra obra1 = new Obra("Romeo y Julieta", 1500.00);
        Obra obra2 = new Obra("Hamlet", 1800.00);
        Obra obra3 = new Obra("El Avaro", 1200.00);
        
        // Crear teatro con obras
        Teatro teatro = new Teatro("Teatro Colón", "Av. Libertador 1234", obra1, obra2, obra3);
        
        // Mostrar cartelera inicial
        teatro.mostrarCartelera();
        
        // Cambiar nombre del teatro
        System.out.println("--- Cambiando nombre del teatro ---");
        teatro.setNombre("Teatro Nacional Cervantes");
        System.out.println();
        
        // Cambiar nombre de una obra
        System.out.println("--- Cambiando nombre de obra 1 ---");
        teatro.cambiarNombreObra(0, "Macbeth");
        System.out.println();
        
        // Cambiar precio de una obra
        System.out.println("--- Cambiando precio de obra 2 ---");
        teatro.cambiarPrecioObra(1, 2000.00);
        System.out.println();
        
        // Cambiar obra completa
        System.out.println("--- Cambiando obra 3 completa ---");
        Obra nuevaObra = new Obra("La Tempestad", 1600.00);
        teatro.cambiarObra(2, nuevaObra);
        System.out.println();
        
        // Mostrar cartelera actualizada
        teatro.mostrarCartelera();
    }
}