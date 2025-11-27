import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaNombres cola = new ColaNombres(10); 
        
        System.out.println("/// SISTEMA DE FILA DE ATENCIÓN DE ESTUDIANTES ///");
        System.out.println("Capacidad máxima: 10 estudiantes");
        
        // Encolar 8 nombres
        System.out.println("--- PASO 1: Encolando 8 estudiantes ---");
        String[] nombresIniciales = {
            "Ana Maria", 
            "Juan Pérez", 
            "María López", 
            "Jorge Ruiz",
            "Laura Martínez", 
            "Diego Torres", 
            "Sofía Ramírez", 
            "Martin Santos"
        };
        
        for (String nombre : nombresIniciales) {
            if (cola.encolar(nombre)) {
                System.out.println("✓ Estudiante '" + nombre + "' agregado a la fila");
            }
        }
        System.out.println();
        cola.mostrarCola();
        System.out.println("Estado: " + (cola.estaVacia() ? "Vacía" : "Con estudiantes") + 
                           " | " + (cola.estaLlena() ? "Llena" : "Con espacio disponible"));
        System.out.println("Estudiantes en fila: " + cola.getTamanio() + "/" + cola.getCapacidad());
        System.out.println();
        cola.mostrarEstructuraInterna();
        System.out.println();
        
        // Desencolar 3 nombres
        System.out.println("--- PASO 2: Atendiendo a 3 estudiantes (desencolando) ---");
        for (int i = 0; i < 3; i++) {
            if (!cola.estaVacia()) {
                String nombreAtendido = cola.desencolar();
                System.out.println("✓ Estudiante '" + nombreAtendido + "' fue atendido");
            }
        }
        System.out.println();
        cola.mostrarCola();
        System.out.println("Estado: " + (cola.estaVacia() ? "Vacía" : "Con estudiantes") + 
                           " | " + (cola.estaLlena() ? "Llena" : "Con espacio disponible"));
        System.out.println("Estudiantes en fila: " + cola.getTamanio() + "/" + cola.getCapacidad());
        System.out.println();
        cola.mostrarEstructuraInterna();
        System.out.println();
        
        // Mostrar el frente usando peek
        System.out.println("--- PASO 3: Consultando el siguiente estudiante ---");
        if (!cola.estaVacia()) {
            String siguienteEstudiante = cola.peek();
            System.out.println("Siguiente estudiante a atender: '" + siguienteEstudiante + "'");
            System.out.println("(El estudiante sigue en la fila)");
            cola.mostrarCola();
        }
        System.out.println();
        
        // Agregar más estudiantes para ver el comportamiento circular 
        System.out.println("--- PASO 4: Agregando más estudiantes (movimiento circular) ---");
        String[] nombresAdicionales = {
            "Valentina Cruz",
            "Andrés Flores",
            "Camila Morales",
            "Fernando Díaz",
            "Isabella Rojas"
        };
        
        for (String nombre : nombresAdicionales) {
            if (cola.encolar(nombre)) {
                System.out.println("✓ Estudiante '" + nombre + "' agregado a la fila");
            } else {
                System.out.println("✗ No se puede agregar a '" + nombre + "' - Fila llena");
            }
        }
        System.out.println();
        cola.mostrarCola();
        System.out.println("Estado: " + (cola.estaVacia() ? "Vacía" : "Con estudiantes") + 
                           " | " + (cola.estaLlena() ? "LLENA" : "Con espacio disponible"));
        System.out.println("Estudiantes en fila: " + cola.getTamanio() + "/" + cola.getCapacidad());
        System.out.println();
        cola.mostrarEstructuraInterna();
        System.out.println("*** Observe cómo los índices frente y fin se mueven circularmente ***");
        System.out.println("*** El array se reutiliza, demostrando el comportamiento circular ***");
        
        // Menú interactivo
        System.out.println("\n/// MENÚ INTERACTIVO ///");
        int opcion;
        
        do {
            System.out.println("1. Agregar estudiante a la fila (encolar)");
            System.out.println("2. Atender estudiante (desencolar)");
            System.out.println("3. Ver siguiente estudiante (peek)");
            System.out.println("4. Mostrar estado de la fila");
            System.out.println("5. Mostrar fila completa");
            System.out.println("6. Mostrar estructura interna (educativo)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    if (cola.estaLlena()) {
                        System.out.println("X Error: La fila está llena");
                    } else {
                        System.out.print("Ingrese el nombre del estudiante: ");
                        String nuevoNombre = scanner.nextLine();
                        cola.encolar(nuevoNombre);
                        System.out.println("✓ Estudiante '" + nuevoNombre + "' agregado a la fila");
                    }
                    break;
                    
                case 2:
                    if (cola.estaVacia()) {
                        System.out.println("X Error: La fila está vacía");
                    } else {
                        String nombreAtendido = cola.desencolar();
                        System.out.println("✓ Estudiante '" + nombreAtendido + "' fue atendido");
                    }
                    break;
                    
                case 3:
                    if (cola.estaVacia()) {
                        System.out.println("X La fila está vacía");
                    } else {
                        String siguiente = cola.peek();
                        System.out.println("Siguiente estudiante: '" + siguiente + "'");
                    }
                    break;
                    
                case 4:
                    System.out.println("Estado de la fila:");
                    System.out.println("  - " + (cola.estaVacia() ? "Vacía" : "Con estudiantes"));
                    System.out.println("  - " + (cola.estaLlena() ? "LLENA" : "Con espacio disponible"));
                    System.out.println("  - Estudiantes: " + cola.getTamanio() + "/" + cola.getCapacidad());
                    break;
                    
                case 5:
                    cola.mostrarCola();
                    break;
                    
                case 6:
                    cola.mostrarEstructuraInterna();
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