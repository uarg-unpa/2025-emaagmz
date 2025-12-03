public class SumaDigitos {
    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumaDigitos(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("Suma de dígitos de 1234: " + sumaDigitos(1234));
    }
}
