// Punto 3 - TP Clases & Objetos I
// Identificar los errores, explicar por qué ocurren y cómo solucionarlos
public class Errores {
    /*
    -- Punto A --
    public static void main(String[] args) {
        Hora h1;
        h1 = new Hora();
        h1.setearHora();
        h1.setearMinutos(23);
        h1.imprimirHora();
    }

    Error: setearHora() requiere un parámetro, por ejemplo setearHora(int hora), si se llama sin parámetros y el método no esta definido genera errores de compilación.
    Solución: setearHora(int hora) o llamar a setearHora() con un parámetro adecuado como h1.setearHora(10)
    */

    /*
    -- Punto B --
    public static void main(String[] args) {
        Hora h1, h2;
        h1 = new Hora();
        h1.setearHora(9);
        h1.setearMinutos(“23”);
        h1.imprimirHora();
        h2.setearHora(8);
        h2.imprimirHora();
        System.out.println(h1.consultarHora());
    }

    Error: El h2 se declara pero no se instancia 
    Solución: 
    */
}
