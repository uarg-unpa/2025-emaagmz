public class ColaCircular {
    private int[] cola;
    private int frente;
    private int fin;
    private int MAX;
    private int tamano;
    
    public ColaCircular(int max) {
        this.MAX = max;
        this.cola = new int[MAX];
        this.frente = 0;
        this.fin = 0;
        this.tamano = 0;
    }
    
    public boolean estaVacia() {
        return tamano == 0;
    }
    
    public boolean estaLlena() {
        return tamano == MAX;
    }
    
    public void encolar(int valor) {
        if (estaLlena()) {
            System.out.println("Error: La cola está llena. No se puede encolar " + valor);
            return;
        }
        
        cola[fin] = valor;
        fin = (fin + 1) % MAX; 
        tamano++;
        System.out.println("Encolado: " + valor);
        mostrarCola();
    }
    
    public int desencolar() {
        if (estaVacia()) {
            System.out.println("Error: La cola está vacía");
            return -1;
        }
        
        int valor = cola[frente];
        frente = (frente + 1) % MAX; 
        tamano--;
        System.out.println("Desencolado: " + valor);
        mostrarCola();
        return valor;
    }
    
    public void mostrarCola() {
        System.out.print("Cola: [");
        for (int i = 0; i < MAX; i++) {
            if (i > 0) System.out.print(", ");
            
            // Verifica si la posición contiene un elemento válido
            boolean posicionValida = false;
            if (tamano > 0) {
                if (frente < fin) {
                    posicionValida = (i >= frente && i < fin);
                } else if (frente > fin) {
                    posicionValida = (i >= frente || i < fin);
                } else if (tamano == MAX) {
                    posicionValida = true;
                }
            }
            
            if (posicionValida) {
                System.out.print(cola[i]);
            } else {
                System.out.print("_");
            }
        }
        System.out.println("]");
        System.out.println("Frente: " + frente + " | Fin: " + fin + " | Tamaño: " + tamano);
        System.out.println("----------------------------------------");
    }
}