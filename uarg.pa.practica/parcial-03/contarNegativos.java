public class contarNegativos {
    public static int contNegativo(int[] array, int indice) {
        if (indice >= array.length) {
            return 0;
        }
        int esNegativo = (array[indice] < 0) ? 1 : 0;
        return esNegativo + contNegativo(array, indice + 1);
    }
}