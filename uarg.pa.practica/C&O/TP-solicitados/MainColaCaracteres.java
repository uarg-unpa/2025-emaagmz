import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaCaracteres cola = new ColaCaracteres(10); 
        
        System.out.println("/// SISTEMA DE COLA DE COMANDOS: ///");
        System.out.println("Capacidad máxima: 10 comandos\n");
        
        // PRUEBA 1: Encolar 5 comandos
        System.out.println("--- PASO 1: Encolando 5 comandos ---");
        char[] comandosIniciales = {'a', 'b', 'c', 'd', 'e'};
        
        for (char cmd : comandosIniciales) {
            if (cola.encolar(cmd)) {
                System.out.println("✓ Comando '" + cmd + "' encolado");
            }
        }
        cola.mostrarCola();
        System.out.println("Estado: " + (cola.estaVacia() ? "Vacía" : "Con elementos") + 
                           " | " + (cola.estaLlena() ? "Llena" : "Con espacio disponible"));
        System.out.println("Tamaño actual: " + cola.tamanio() + "\n");
        
        // PRUEBA 2: Desencolar 2 comandos
        System.out.println("--- PASO 2: Desencolando 2 comandos ---");
        for (int i = 0; i < 2; i++) {
            if (!cola.estaVacia()) {
                char cmdDesencolado = cola.desencolar();
                System.out.println("✓ Comando '" + cmdDesencolado + "' desencolado");
            }
        }
        cola.mostrarCola();
        System.out.println("Estado: " + (cola.estaVacia() ? "Vacía" : "Con elementos") + 
                           " | " + (cola.estaLlena() ? "Llena" : "Con espacio disponible"));
        System.out.println("Tamaño actual: " + cola.tamanio() + "\n");
        
        // PRUEBA 3: Mostrar el frente usando peek
        System.out.println("--- PASO 3: Consultando el frente (peek) ---");
        if (!cola.estaVacia()) {
            char frenteActual = cola.peek();
            System.out.println("Comando en el frente: '" + frenteActual + "'");
            System.out.println("(El comando no fue eliminado de la cola)");
            cola.mostrarCola();
        }
        System.out.println();
        
        // PRUEBA 4: Encolar hasta llenar (7 comandos más)
        System.out.println("--- PASO 4: Encolando comandos hasta llenar la cola ---");
        char[] comandosAdicionales = {'f', 'g', 'h', 'i', 'j', 'k', 'l'};
        
        for (char cmd : comandosAdicionales) {
            if (cola.encolar(cmd)) {
                System.out.println("✓ Comando '" + cmd + "' encolado");
            } else {
                System.out.println("X No se puede encolar '" + cmd + "' - Cola llena");
            }
        }
        cola.mostrarCola();
        System.out.println("Estado: " + (cola.estaVacia() ? "Vacía" : "Con elementos") + 
                           " | " + (cola.estaLlena() ? "LLENA" : "Con espacio disponible"));
        System.out.println("Tamaño actual: " + cola.tamanio() + "\n");
        
        // Menú interactivo
        System.out.println("\n/// MENÚ INTERACTIVO ///");
        int opcion;
        
        do {
            System.out.println("\n1. Encolar comando");
            System.out.println("2. Desencolar comando");
            System.out.println("3. Ver comando en el frente (peek)");
            System.out.println("4. Mostrar estado de la cola");
            System.out.println("5. Mostrar contenido de la cola");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("X Error: La cola está llena");
                    } else {
                        System.out.print("Ingrese el comando (un carácter): ");
                        String entrada = scanner.nextLine();
                        if (entrada.length() > 0) {
                            char nuevoCmd = entrada.charAt(0);
                            cola.encolar(nuevoCmd);
                            System.out.println("✓ Comando '" + nuevoCmd + "' encolado");
                        }
                    }
                    break;
                    
                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("X Error: La cola está vacía");
                    } else {
                        char cmdDesencolado = cola.desencolar();
                        System.out.println("✓ Comando '" + cmdDesencolado + "' desencolado");
                    }
                    break;
                    
                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("X La cola está vacía");
                    } else {
                        char frente = cola.peek();
                        System.out.println("Comando en el frente: '" + frente + "'");
                    }
                    break;
                    
                case 4:
                    System.out.println("Estado de la cola:");
                    System.out.println("  - " + (cola.estaVacia() ? "Vacía" : "Con elementos"));
                    System.out.println("  - " + (cola.estaLlena() ? "LLENA" : "Con espacio disponible"));
                    System.out.println("  - Tamaño: " + cola.tamanio() + "/10");
                    break;
                    
                case 5:
                    cola.mostrarCola();
                    break;
                    
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}