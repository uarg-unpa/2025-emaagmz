import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Primer empleado
        System.out.print("Ingrese legajo del empleado 1: ");
        int legajo1 = scanner.nextInt();
        System.out.print("Ingrese sueldo del empleado 1: ");
        double sueldo1 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Ingrese nombre del departamento del empleado 1: ");
        String dep1 = scanner.nextLine();
        System.out.print("Ingrese piso del departamento: ");
        int piso1 = scanner.nextInt();
        System.out.print("¿Es jefe? (true/false): ");
        boolean jefe1 = scanner.nextBoolean();

        Departamento d1 = new Departamento(dep1, piso1);
        Empleado e1 = new Empleado(legajo1, sueldo1, d1, jefe1);

        // Segundo empleado
        System.out.print("Ingrese legajo del empleado 2: ");
        int legajo2 = scanner.nextInt();
        System.out.print("Ingrese sueldo del empleado 2: ");
        double sueldo2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese nombre del departamento del empleado 2: ");
        String dep2 = scanner.nextLine();
        System.out.print("Ingrese piso del departamento: ");
        int piso2 = scanner.nextInt();
        System.out.print("¿Es jefe? (true/false): ");
        boolean jefe2 = scanner.nextBoolean();

        Departamento d2 = new Departamento(dep2, piso2);
        Empleado e2 = new Empleado(legajo2, sueldo2, d2, jefe2);

        // Información inicial
        System.out.println("=== Información de empleados ===");
        System.out.println(e1);
        System.out.println(e2);

        // Verificar si son jefes
        System.out.println("¿Empleado 1 es jefe? " + e1.esJefe());
        System.out.println("¿Empleado 2 es jefe? " + e2.esJefe());

        // Aumentar sueldo
        e1.aumentarSueldo(15); // +15% al empleado 1
        e2.aumentarSueldo(10); // +10% al empleado 2

        System.out.println("Bono empleado 1: $" + e1.calcularBono());
        System.out.println("Bono empleado 2: $" + e2.calcularBono());

        // Informacion final
        System.out.println("=== Información final de empleados ===");
        System.out.println(e1);
        System.out.println(e2);

        scanner.close();

        /*
        System.out.print("Ingrese marca del vehículo: ");
        String marca = sc.nextLine();

        System.out.print("Ingrese modelo del vehículo: ");
        String modelo = sc.nextLine();

        System.out.print("Ingrese cilindrada del motor (ej: 1.6): ");
        double cilindrada = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese tipo de motor (Nafta, Diesel, Eléctrico): ");
        String tipo = sc.nextLine();

        // Crear motor y vehículo con datos ingresados
        Motor motor1 = new Motor(cilindrada, tipo);
        Vehiculo vehiculo1 = new Vehiculo(marca, modelo, motor1);

        // Crear otro vehículo fijo
        Motor motor2 = new Motor(3.0, "Diesel");
        Vehiculo vehiculo2 = new Vehiculo("Toyota", "Hilux", motor2);

        // Probar métodos
        System.out.println("\n=== Vehículo 1 ===");
        System.out.println(vehiculo1);
        System.out.println("¿Es potente? " + vehiculo1.esPotente());
        System.out.println("Consumo estimado: " + vehiculo1.calcularConsumo() + " L/100km");

        vehiculo1.actualizarTipoMotor("Eléctrico");
        System.out.println("Tipo de motor actualizado: " + vehiculo1);

        System.out.println("\n=== Vehículo 2 ===");
        System.out.println(vehiculo2);
        System.out.println("¿Es potente? " + vehiculo2.esPotente());
        System.out.println("Consumo estimado: " + vehiculo2.calcularConsumo() + " L/100km");

        sc.close();
        */
    }
}
