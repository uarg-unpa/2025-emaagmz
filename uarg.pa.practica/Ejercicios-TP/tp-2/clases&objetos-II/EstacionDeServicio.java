public class EstacionDeServicio {
    private static final double Cap_Max = 10000.0;
    private double combustibleActual;

    public EstacionDeServicio(double combustibleInicial) {
        if (combustibleInicial > 0 && combustibleInicial <= Cap_Max) {
            this.combustibleActual = combustibleInicial;
        } else {
            this.combustibleActual = Cap_Max;
        }
    }

    public void cargar(double litros) {
        if (litros <= 0) {
            System.out.println("Cantidad inválida para cargar.");
            return;
        }
        if (litros > combustibleActual) {
            System.out.println("No hay suficiente combustible para cargar " + litros + " litros.");
            return;
        }

        combustibleActual -= litros;
        System.out.println("Se cargaron " + litros + " litros. Combustible restante: " + combustibleActual + " litros.");

        if (combustibleActual < 10) {
            System.out.println("Quedan menos de 10 litros en la estación.");
        }
    }

    public void reponer(double litros) {
        if (litros <= 0) {
            System.out.println("Cantidad inválida para recargar.");
            return;
        }
        if (combustibleActual + litros > Cap_Max) {
            System.out.println("No se puede superar la capacidad máxima de " + Cap_Max + " litros.");
            combustibleActual = Cap_Max;
        } else {
            combustibleActual += litros;
        }
        System.out.println("Combustible actual: " + combustibleActual + " litros.");
    }

    
}