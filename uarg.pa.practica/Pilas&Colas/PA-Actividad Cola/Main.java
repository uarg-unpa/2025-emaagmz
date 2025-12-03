public class Main {
    public static void main(String[] args) {
        System.out.println("SIMULACIÓN DE COLA CIRCULAR FIFO: \n");
        
        ColaCircular cola = new ColaCircular(5);
        
        // 1 - Inicial: Cola vacía
        System.out.println("1. Estado inicial (vacía):");
        cola.mostrarCola();
        
        // 2 - Encola 10
        System.out.println("2. Encolar 10:");
        cola.encolar(10);
        
        // 3 - Encola 20
        System.out.println("3. Encolar 20:");
        cola.encolar(20);
        
        // 4 - Encola 30
        System.out.println("4. Encolar 30:");
        cola.encolar(30);
        
        // 5 - Desencola (el más antiguo, 10)
        System.out.println("5. Desencolar:");
        cola.desencolar();
        
        // 6 - Encola 40
        System.out.println("6. Encolar 40:");
        cola.encolar(40);
        
        // 7 - Encola 50
        System.out.println("7. Encolar 50:");
        cola.encolar(50);
        
        // 8 - Desencola (el más antiguo, 20)
        System.out.println("8. Desencolar:");
        cola.desencolar();
        
        // 9 - Encola 60 (movimiento circular)
        System.out.println("9. Encolar 60 (observa el movimiento circular):");
        cola.encolar(60);
        
        // Explicación FIFO
        System.out.println("\n EXPLICACIÓN:");
        System.out.println("FIFO (First In, First Out): Esta cola demuestra FIFO porque");
        System.out.println("el primer elemento encolado (10) fue el primero en desencolarse,");
        System.out.println("seguido por el segundo (20), manteniendo el orden de llegada.");
        System.out.println("Movimiento Circular: Cuando 'fin' llega al final del array,");
        System.out.println("vuelve al inicio usando módulo (%), reutilizando espacios liberados.");
        System.out.println("Cola Llena: Si intentas encolar cuando tamaño==MAX, se rechaza");
        System.out.println("la operación para evitar sobrescribir datos existentes.");
        
        // Demostrar cola llena
        System.out.println("\n10. Intentar encolar en cola llena:");
        cola.encolar(70);
    }
}
