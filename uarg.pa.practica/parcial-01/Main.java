import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre del producto 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese precio del producto 1: ");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese stock del producto 1: ");
        int stock1 = scanner.nextInt();
        scanner.nextLine();

        Producto P1 = new Producto(nombre1, precio1, stock1);

        System.out.print("Ingrese nombre del producto 2: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Ingrese precio del producto 2: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Ingrese stock del producto 2: ");
        int stock2 = scanner.nextInt();

        Producto P2 = new Producto(nombre2, precio2, stock2);


        // Vender cierta cantidad de P1
        System.out.println("Ingrese cantidad a vender del producto 1: ");
        int cantidadVender = scanner.nextInt();
        P1.vender(cantidadVender);

        // Aumentar stock de P2 en 10
        P2.aumentarStock(10);

        // Mostrar que producto tiene más stock
        if (P1.tieneMasStockQue(P2)) {
            System.out.println(P1.getNombre() + " tiene más stock que " + P2.getNombre());
        } else if (P2.tieneMasStockQue(P1)) {
            System.out.println(P2.getNombre() + " tiene más stock que " + P1.getNombre());
        } else {
            System.out.println("Ambos productos tienen la misma cantidad de stock.");
        }

        // Mostrar la info de ambos productos
        System.out.println("/// Información final de los productos: ///");
        P1.mostrarProducto();
        P2.mostrarProducto();

        scanner.close();
    }
}
