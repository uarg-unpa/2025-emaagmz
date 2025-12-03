public class ColaCaracteres {
    private char[] elementos;
    private int fin;
    private int capacidad;
    
    // Constructor
    public ColaCaracteres(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new char[capacidad];
        this.fin = -1; // -1 indica cola vacía
    }
    
    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return fin == -1;
    }
    
    // Verifica si la cola está llena
    public boolean estaLlena() {
        return fin == capacidad - 1;
    }
    
    // Encola un nuevo carácter al final de la cola
    public boolean encolar(char comando) {
        if (estaLlena()) {
            return false;
        }
        
        fin++;
        elementos[fin] = comando;
        return true;
    }
    
    /*
     Desencola el carácter del frente (índice 0)
     Desplaza todos los elementos una posición a la izquierda
    */
    public char desencolar() {
        if (estaVacia()) {
            return '\0'; 
        }
        
        // Guardamos el elemento del frente
        char comandoDesencolado = elementos[0];
        
        // Desplazamos todos los elementos una posición a la izquierda
        for (int i = 0; i < fin; i++) {
            elementos[i] = elementos[i + 1];
        }
        
        // Decrementamos el índice del final
        fin--;
        
        return comandoDesencolado;
    }
    
    /*
     Método peek mejorado: Retorna el elemento del frente sin desencolarlo
     Simula el manejo de la cola de forma segura
    */
    public char peek() {
        // Verificamos internamente el estado de la cola
        if (estaVacia()) {
            return '\0';
        }
        
        // Retornamos el elemento en el frente (posición 0), de forma segura, respetando el principio FIFO
        return elementos[0];
    }
    
    /*
     Muestra el contenido actual de la cola
    */
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("Cola vacía: []");
            return;
        }
        
        System.out.print("Cola: [");
        for (int i = 0; i <= fin; i++) {
            System.out.print(elementos[i]);
            if (i < fin) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    /*
     Retorna el tamaño actual de la cola
    */
    public int tamanio() {
        return fin + 1;
    }
}