public class Main {
    public class TestPersona {
        public static void main(String[] args) {
            Domicilio dom1 = new Domicilio("Av. Rivadavia ", 1234);
            Persona p1 = new Persona("Laura", 20, "12345678", 'M', 60.5, 1.65, dom1);
            System.out.println(p1);
            Persona p2 = new Persona("Pedro");
            System.out.println(p2);
        }
    }
}
