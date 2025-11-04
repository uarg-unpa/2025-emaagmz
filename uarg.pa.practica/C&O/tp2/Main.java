import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// ESTACIÓN DE SERVICIO ///");
        
        // Crear estación con capacidad inicial
        EstacionServicio estacion = new EstacionServicio(100);
        estacion.mostrarEstado();
        
        // Cargar combustible a vehículos
        System.out.println("--- Cargando combustible ---");
        estacion.cargarCombustible(50);
        System.out.println();
        
        estacion.cargarCombustible(45); 
        System.out.println();
        
        // Intentar cargar más de lo disponible
        System.out.println("--- Intentando cargar más de lo disponible ---");
        estacion.cargarCombustible(100);
        System.out.println();
        
        // Reponer combustible
        System.out.println("--- Reponiendo combustible ---");
        estacion.reponerCombustible(5000);
        estacion.mostrarEstado();
        
        // Intentar reponer más de la capacidad máxima
        System.out.println("--- Intentando reponer más de la capacidad ---");
        estacion.reponerCombustible(6000);
        estacion.mostrarEstado();

    }    
}
