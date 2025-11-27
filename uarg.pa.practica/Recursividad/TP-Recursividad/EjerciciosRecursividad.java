public class EjerciciosRecursividad {
    // PUNTO 4
    public static int sumaPunto4(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaPunto4(n - 1);
    }

    // PUNTO 5
    public static int sumaPunto5(int n) {
        if (n == 2) {
            return 2;
        }
        
        return n + sumaPunto5(n - 2);
    }

    // PUNTO 6
    public static int G(int x, int y) {
        if (x <= y) {
            return 1;
        }
        return G(x, y + 1) + 1;
    }

    // PUNTO 7
    public static int vocales(String cd) {
        if (cd.isEmpty()) {
            return 0;
        }

        // Obtiene el primer carácter
        char primerChar = Character.toLowerCase(cd.charAt(0));

        // Verifica si es vocal
        int esVocal = (primerChar == 'a' || primerChar == 'e' || 
                       primerChar == 'i' || primerChar == 'o' || 
                       primerChar == 'u') ? 1 : 0;
        
        return esVocal + vocales(cd.substring(1));
    }

    // PUNTO 8 
    public static int sumaPunto8(int n) {
        if (n == 0) {
            return 0;
        }
        
        return n + sumaPunto8(n - 1);
    }

    // PUNTO 9 
    public static boolean buscandoEnArreglo(int[] arr, int num, int indice) {
        if (indice >= arr.length) {
            return false;
        }
       
        if (arr[indice] == num) {
            return true;
        }
        
        return buscandoEnArreglo(arr, num, indice + 1);
    }

    public static boolean buscandoEnArreglo(int[] arr, int num) {
        return buscandoEnArreglo(arr, num, 0);
    }

    // PUNTO 10
    public static int minimoArreglo(int[] arr, int indice) {
        if (indice == arr.length - 1) {
            return arr[indice];
        }
        
        int minimoResto = minimoArreglo(arr, indice + 1);
        return Math.min(arr[indice], minimoResto);
    }

    public static int minimoArreglo(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío");
        }
        return minimoArreglo(arr, 0);
    }

    public static void main(String[] args) {
        System.out.println("--- PUNTO 4 ---");
        System.out.println("Suma(5) = " + sumaPunto4(5));

        System.out.println("--- PUNTO 5 ---");
        System.out.println("Suma pares(10) = " + sumaPunto5(10));

        System.out.println("--- PUNTO 6 ---");
        System.out.println("G(8, 6) = " + G(8, 6));
        System.out.println("G(100, 10) = " + G(100, 10));
        
        System.out.println("--- PUNTO 7 ---");
        System.out.println("Vocales('Hola Mundo') = " + vocales("Hola Mundo"));

        System.out.println("--- PUNTO 8 ---");
        System.out.println("Suma(5) = " + sumaPunto8(5)); // 0+1+2+3+4+5 = 15
        System.out.println("Suma(0) = " + sumaPunto8(0));

        System.out.println("--- PUNTO 9 ---");
        int[] arregloPunto9 = {3, 7, 12, 5, 9};
        System.out.println("Buscar 12 en arreglo: " + buscandoEnArreglo(arregloPunto9, 12)); // true
        System.out.println("Buscar 20 en arreglo: " + buscandoEnArreglo(arregloPunto9, 20));

        System.out.println("--- PUNTO 10 ---");
        int[] arregloPunto10 = {15, 3, 8, 1, 9, 5};
        System.out.println("Mínimo del arreglo: " + minimoArreglo(arregloPunto10));
    }
}
