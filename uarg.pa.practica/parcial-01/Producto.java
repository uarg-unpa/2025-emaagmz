public class Producto {
    // Atributos 
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
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

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    // Metodos
    //cantidad del stock
    public void hayStock(int cantidad) {
        if (cantidad >= cantidadEnStock) {
            cantidadEnStock += cantidad;
            System.out.println("El stock es mayor a la cantidad requerida");
        }
    }

    //vender el stock
    public void vender(int cantidad) {
        if (cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
            System.out.println("Venta realizada. Stock actual: " + cantidadEnStock);
        } else {
            System.out.println("No hay sufiente stock para realizar la venta.");
        }
    }

    //aumentar el stock
    public void aumentarStock(int cantidad) {
        cantidadEnStock += cantidad;
        System.out.println("Stock aumentado. Stock actual: " + cantidadEnStock);
    }

    //mostrar información del producto
    public void mostrarProducto() {
        System.out.println("producto: " + nombre);
        System.out.println("precio: $" + precio);
        System.out.println("stock: " + cantidadEnStock);
    }

    //comparación de un producto con otro producto
    public boolean tieneMasStockQue(Producto p) {
        return this.cantidadEnStock > p.cantidadEnStock;
    }
}
