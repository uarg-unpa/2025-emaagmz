public class ColaNombres {
    private String[] elementos;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamanio; 
    
    /* Constructor */
    public ColaNombres(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new String[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanio = 0;
    }
    
    /* Verifica si la cola está vacía  */
    public boolean estaVacia() {
        return tamanio == 0;
    }
    
    /* Verifica si la cola está llena */
    public boolean estaLlena() {
        return tamanio == capacidad;
    }
    
    /* Encola un nuevo nombre al final de la cola circular */
    public boolean encolar(String nombre) {
        if (estaLlena()) {
            return false;
        }
        
        // Mueve fin circularmente
        fin = (fin + 1) % capacidad;
        elementos[fin] = nombre;
        tamanio++;
        
        return true;
    }
    
    /*Desencola el nombre del frente de la cola y mueve frente circularmente respetando FIFO */
    public String desencolar() {
        if (estaVacia()) {
            return null;
        }
        
        // Guarda el nombre del frente
        String nombreDesencolado = elementos[frente];
        
        // Limpia la posición
        elementos[frente] = null;
        
        // Mueve frente circularmente
        frente = (frente + 1) % capacidad;
        tamanio--;
        
        return nombreDesencolado;
    }
    
    /* Método peek mejorado: Retorna el elemento del frente sin desencolarlo - Simula el manejo de la cola circular de forma segura */
    public String peek() {
        if (estaVacia()) {
            return null;
        }

        return elementos[frente];
    }
    
    /* Muestra el contenido actual de la cola en orden FIFO */
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("Cola vacía: []");
            return;
        }
        
        System.out.print("Cola: [");
        int posicion = frente;
        
        for (int i = 0; i < tamanio; i++) {
            System.out.print(elementos[posicion]);
            if (i < tamanio - 1) {
                System.out.print(", ");
            }
            posicion = (posicion + 1) % capacidad;
        }
        
        System.out.println("]");
    }
    
    /* Muestra la estructura interna del array */
    public void mostrarEstructuraInterna() {
        System.out.print("Array interno: [");
        for (int i = 0; i < capacidad; i++) {
            if (elementos[i] != null) {
                System.out.print(elementos[i]);
            } else {
                System.out.print("null");
            }
            if (i < capacidad - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Frente: " + frente + " | Fin: " + fin + " | Tamaño: " + tamanio);
    }
    
    /* Retorna el tamaño actual de la cola */
    public int getTamanio() {
        return tamanio;
    }
    
    /* Retorna la capacidad máxima de la cola */
    public int getCapacidad() {
        return capacidad;
    }
}