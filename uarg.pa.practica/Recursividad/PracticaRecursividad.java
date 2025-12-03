public class PracticaRecursividad {
    // Suma de los primeros n números pares
    public static int sumaPares(int n) {
        // Caso base
        if (n <= 0) {
            return 0;
        }
        // Caso recursivo
        return (2 * n) + sumaPares(n - 1);
    }
    
    // Suma de los primeros n múltiplos de 3
    public static int sumaMultiplosDe3(int n) {
        // Caso base
        if (n <= 0) {
            return 0;
        }
        // Caso recursivo
        return (3 * n) + sumaMultiplosDe3(n - 1);
    }
    
    
    // Producto de los elementos del array
    public static int productoArray(int[] array, int indice) {
        // Caso base
        if (indice >= array.length) {
            return 1; // Elemento neutro de la multiplicación
        }
        // Caso recursivo
        return array[indice] * productoArray(array, indice + 1);
    }


    // Calcular x elevado a la n (x^n)
    public static double potencia(double base, int exponente) {
        // Caso base
        if (exponente == 0) {
            return 1;
        }
        
        // Caso recursivo
        if (exponente > 0) {
            return base * potencia(base, exponente - 1);
        } else {
            return 1 / potencia(base, -exponente);
        }
    }
}