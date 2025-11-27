// PUNTO 11
public class ContarOcurrencias { 
    public static int contarOcurrencias(int[] arr, int num, int indice) {
        if (indice >= arr.length) {
            return 0;
        }
        
        int conteoActual = (arr[indice] == num) ? 1 : 0;
        
        return conteoActual + contarOcurrencias(arr, num, indice + 1);
    }

    public static int contarOcurrencias(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return contarOcurrencias(arr, num, 0);
    }

    public static void main(String[] args) {
        System.out.println("CONTAR OCURRENCIAS EN ARREGLO: \n");
        
        // Prueba 1: Arreglo con múltiples ocurrencias
        int[] arreglo1 = {3, 7, 3, 9, 3, 5, 3, 1};
        int buscar1 = 3;
        System.out.println("Arreglo: {3, 7, 3, 9, 3, 5, 3, 1}");
        System.out.println("Buscar: " + buscar1);
        System.out.println("Ocurrencias: " + contarOcurrencias(arreglo1, buscar1));
        System.out.println("Esperado: 4\n");

        // Prueba 2: Número que no aparece
        int[] arreglo2 = {1, 2, 3, 4, 5};
        int buscar2 = 10;
        System.out.println("Arreglo: {1, 2, 3, 4, 5}");
        System.out.println("Buscar: " + buscar2);
        System.out.println("Ocurrencias: " + contarOcurrencias(arreglo2, buscar2));
        System.out.println("Esperado: 0\n");
        
        // Prueba 3: Todos los elementos son el número buscado
        int[] arreglo3 = {5, 5, 5, 5, 5};
        int buscar3 = 5;
        System.out.println("Arreglo: {5, 5, 5, 5, 5}");
        System.out.println("Buscar: " + buscar3);
        System.out.println("Ocurrencias: " + contarOcurrencias(arreglo3, buscar3));
        System.out.println("Esperado: 5\n");
    }
}