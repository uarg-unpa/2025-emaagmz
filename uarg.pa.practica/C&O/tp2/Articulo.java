public class Articulo {
    // Atributos 
    private String descripcion;
    private double precio;
    private String codigo;
    private int stock; 
    
    // Constructor por defecto
    public Articulo() {
        this.descripcion = "";
        this.precio = 0.0;
        this.codigo = "";
        this.stock = 0;
    }
    
    // Constructor con parámetros
    public Articulo(String descripcion, double precio, String codigo, int stock) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigo = codigo;
        this.stock = stock >= 0 ? stock : 0; 
    }
    
    // Método para decrementar el stock
    public boolean decrementarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser positiva.");
            return false;
        }
        
        if (cantidad > stock) {
            System.out.println("ERROR: Stock insuficiente.");
            System.out.println("Stock disponible: " + stock + " unidades");
            System.out.println("Cantidad solicitada: " + cantidad + " unidades");
            return false;
        }
        
        stock -= cantidad;
        System.out.println("Stock decrementado en " + cantidad + " unidades.");
        System.out.println("Stock actual: " + stock + " unidades");
        return true;
    }
    
    // Método para incrementar el stock
    public void incrementarStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("ERROR: La cantidad debe ser positiva.");
            return;
        }
        
        stock += cantidad;
        System.out.println("Stock incrementado en " + cantidad + " unidades.");
        System.out.println("Stock actual: " + stock + " unidades");
    }
    
    // Método para verificar disponibilidad de stock
    public boolean hayStock(int cantidad) {
        return stock >= cantidad;
    }
    
    // Método para consultar el stock actual
    public int getStock() {
        return stock;
    }
    
    // Método para directamente establecer el stock 
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("ERROR: El stock no puede ser negativo.");
        }
    }
    
    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    // Método para mostrar toda la información del artículo
    public void mostrarInfo() {
        System.out.println("\n--- Información del Artículo ---");
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: $" + String.format("%.2f", precio));
        System.out.println("Stock: " + stock + " unidades");
        System.out.println("Estado: " + (stock > 0 ? "Disponible" : "Sin stock"));
        System.out.println("-------------------------------\n");
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=$" + String.format("%.2f", precio) +
                ", stock=" + stock +
                '}';
    }
}

// Clase de prueba
class TestArticulo {
    public static void main(String[] args) {
        System.out.println("--- TEST ARTÍCULO ---\n");
        
        // Crear un artículo
        Articulo articulo = new Articulo("Notebook Lenovo IdeaPad 3", 450000.00, "NB-001", 15);
        articulo.mostrarInfo();
        
        // Incrementar stock (compra de mercadería)
        System.out.println("--- Incrementando stock (compra) ---");
        articulo.incrementarStock(10);
        System.out.println();
        
        // Verificar stock disponible
        System.out.println("--- Verificando disponibilidad ---");
        int cantidadRequerida = 20;
        if (articulo.hayStock(cantidadRequerida)) {
            System.out.println("Hay stock suficiente para " + cantidadRequerida + " unidades");
        } else {
            System.out.println("NO hay stock suficiente para " + cantidadRequerida + " unidades");
        }
        System.out.println();
        
        // Decrementar stock (venta)
        System.out.println("--- Decrementando stock (venta) ---");
        articulo.decrementarStock(20);
        System.out.println();
        
        // Intentar decrementar más stock del disponible
        System.out.println("--- Intentando vender más del stock disponible ---");
        articulo.decrementarStock(10);
        System.out.println();
        
        // Mostrar información final
        articulo.mostrarInfo();
        
        // Prueba con valores inválidos
        System.out.println("--- Pruebas con valores inválidos ---");
        articulo.incrementarStock(-5);
        articulo.decrementarStock(-3);
        System.out.println();
        
        // Crear artículo sin stock
        System.out.println("--- Artículo sin stock ---");
        Articulo articulo2 = new Articulo("Mouse Logitech M185", 8500.00, "MS-002", 0);
        articulo2.mostrarInfo();
    }
}