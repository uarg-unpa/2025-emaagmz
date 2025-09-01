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

    Error: El h2 se declara pero no se instancia 'h2 = new Hora();' por eso cuando se llama a h2.setearHora(8) ocurre el error en tiempo de ejecucion
    Solución: Instanciar el objeto h2 antes de usarlo: h2 = new Hora();
    */


    /*
    -- PUNTO C --
    public static void main(String[] args) {
        Hora h1, h2, h3;
        char valor;
        int aux;
        h1 = new Hora();
        h2 = new Hora();
        System.out.println(h2.consultarHora());
        h1.setearHora(3);
        h1.setearMinutos(4, 5);
        h2.setearHora(11);
        h2.setearH(23);
        valor=h1.consultarMinutos();
        aux=h2.consultarHora();
        h1.imprimirHora();
        h2.imprimirHora();
        System.out.println(aux);
        h3.consultaHora();
    }

    Error: h1.setearMinutos(4, 5) espera un solo parámetro y aca se estan pasando dos. h2.setearH() no existe, ahi deberia ir h2.setearMinutos(). valor = h1.consultarMinutos() deberia devolver un int, asignar un char es un error. El h3 esta declarado pero no inicializado, además el método consultaHora() es incorrecta.
    Solución: h1.setearMinutos con un solo parámetro. Cambiar el h2.setearH() por h2.setearMinutos(). Inicializar h3 con 'h3 = new Hora();'. Corregir el método h3.consultaHora() a h3.consultarHora()
    */


    /*
    -- PUNTO D --
    public static void main(String[] args) {
        Hora h1, h2;
        h1 = new Hora();
        h2 = new Hora();
        h1.setearHora(12);
        h1.setearMinutos(0);
        h2.setearHora(17);
        h2.setearMinutos(30);
        h1.imprimirHora();
        System.out.println(h2.consultarHora()+”:”+h2.consultarMinutos());
        System.out.println(h3.consultarHora());
    }

    Error: La variable h3 no esta declarada ni instanciada. El primer System.out.println() tiene un error que son las comillas ”:”, deberian ser ":"
    Solución: Eliminar o declarar e instanciar h3 si se va a usar. Cambiar ”:” por ":" en el println
    */
}
