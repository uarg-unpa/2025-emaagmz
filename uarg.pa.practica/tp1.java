import java.util.Scanner;
public class tp1 {
    public static void main(String[] args) {
        // ---- punto 1 ----
        /*
        int A, B, R1;
        double C, D, R2;

        A = 5;
        B = 3;
        C = 2.5;
        D = 2.0; 

        R1 = A / B;
        System.out.println("R1 = A / B: " + R1);

        R2 = A / C;
        System.out.println("R2 = A / C: " + R2);

        R2 = A * D;
        System.out.println("R2 = A * D: " + R2);

        R1 = A * (int) D;
        System.out.println("R1 = A * (int) D: " + R1);

        R1 = (int) (C * D);
        System.out.println("R1 = (int) (C * D): " + R1);

        R1 = A * (int) D;
        System.out.println("R1 = A * (int) D (repetido): " + R1);

        A++;
        System.out.println("A++: " + A);

        B = A++;
        System.out.println("B = A++: " + B + " , A = " + A);
        */
        
        
        // ---- punto 3 ----
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Valores iniciales: ");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int aux = c;
        b = a;
        c = a;

        a = aux;

        System.out.println("Valores finales: ");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);


        // ---- punto 4 ----
        Scanner scanner = new Scanner(System.in);
        /*
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el primer numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el primer numero: ");
        int num3 = scanner.nextInt();

        int mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor es: " + mayor);
        scanner.close();
        */


        // ---- punto 5 ----
        /*
        System.out.print("Ingrese el dia de la semana (L, M, I, J, V, S, D): ");
        char dia = scanner.next().toUpperCase().charAt(0);

        switch (dia) {
            case 'L':
            case 'J':
                System.out.println("HOY TENGO RESOLUCION");
                break;
            case 'M':
                System.out.println("Martes");
                break;
            case 'I':
                System.out.println("Miercoles");            
                break;
            case 'V':
                System.out.println("Viernes");
                break;
            case 'S':
                System.out.println("Sabado");
                break;
            case 'D':
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
        scanner.close(); */


        // ---- punto 6 ----
        System.out.print("Ingrese NUM1: ");
        int NUM1 = scanner.nextInt();

        System.out.print("Ingrese NUM2: ");
        int NUM2 = scanner.nextInt();

        System.out.print("Ingrese NUM3: ");
        int NUM3 = scanner.nextInt();

        int suma = NUM1 + NUM2 + NUM3;
        int producto = NUM1 * NUM2 * NUM3;

        System.out.println("/// Resultados con 3 variables ///");
        System.out.println("Suma - " + suma);
        System.out.println("Producto - " + producto);

        System.out.println("Ahora con una sola variable (NUM)");

        int NUM;
        int suma2 = 0;
        int producto2 = 1;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese numero " + i + ": ");
            NUM = scanner.nextInt();
            suma2 += NUM;
            producto2 *= NUM;
        }

        System.out.println("/// Resultados con 1 variable ///");
        System.out.println("Suma = " + suma2);
        System.out.println("Producto = " + producto2);

        scanner.close();
    }
}


