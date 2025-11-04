public class EstacionServicio {
    // Atributos
    private double capacidadActual; 
    private static final double CAPACIDAD_MAXIMA = 10000; 
    private static final double NIVEL_CRITICO = 10; 
    
    // Constructor
    public EstacionServicio() {
        this.capacidadActual = CAPACIDAD_MAXIMA; // Inicia con la estación llena
    }
    
    // Constructor con capacidad inicial personalizada
    public EstacionServicio(double capacidadInicial) {
        if (capacidadInicial >= 0 && capacidadInicial <= CAPACIDAD_MAXIMA) {
            this.capacidadActual = capacidadInicial;
        } else {
            this.capacidadActual = CAPACIDAD_MAXIMA;
        }
        verificarNivelCritico();
    }
    
    // Método para cargar combustible a un vehículo
    public boolean cargarCombustible(double litros) {
        if (litros <= 0) {
            System.out.println("ERROR: La cantidad debe ser positiva.");
            return false;
        }
        
        if (litros > capacidadActual) {
            System.out.println("ERROR: No hay suficiente combustible en la estación.");
            System.out.println("Disponible: " + capacidadActual + " litros");
            return false;
        }
        
        capacidadActual -= litros;
        System.out.println("Se cargaron " + litros + " litros.");
        System.out.println("Capacidad restante: " + capacidadActual + " litros");
        
        verificarNivelCritico();
        return true;
    }
    
    // Método para reponer combustible en la estación
    public boolean reponerCombustible(double litros) {
        if (litros <= 0) {
            System.out.println("ERROR: La cantidad debe ser positiva.");
            return false;
        }
        
        if (capacidadActual + litros > CAPACIDAD_MAXIMA) {
            double litrosReales = CAPACIDAD_MAXIMA - capacidadActual;
            capacidadActual = CAPACIDAD_MAXIMA;
            System.out.println("AVISO: Se repondrán solo " + litrosReales + " litros (capacidad máxima alcanzada).");
        } else {
            capacidadActual += litros;
            System.out.println("Se reponieron " + litros + " litros.");
        }
        
        System.out.println("Capacidad actual: " + capacidadActual + " litros");
        return true;
    }
    
    // Método privado para verificar si el nivel es crítico
    private void verificarNivelCritico() {
        if (capacidadActual < NIVEL_CRITICO) {
            System.out.println("¡ALERTA! Nivel de combustible crítico: " + capacidadActual + " litros");
            System.out.println("Se requiere reposición urgente.");
        }
    }
    
    // Método para consultar la capacidad actual
    public double getCapacidadActual() {
        return capacidadActual;
    }
    
    // Método para mostrar información de la estación
    public void mostrarEstado() {
        System.out.println("\n--- Estado de la Estación ---");
        System.out.println("Capacidad actual: " + capacidadActual + " litros");
        System.out.println("Capacidad máxima: " + CAPACIDAD_MAXIMA + " litros");
        System.out.println("Porcentaje: " + String.format("%.2f", (capacidadActual / CAPACIDAD_MAXIMA) * 100) + "%");
    }
}

