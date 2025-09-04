public class Main {
    public static void main(String[] args) {
        EstacionDeServicio estacion = new EstacionDeServicio(5000);
        estacion.cargar(3000); 
        estacion.cargar(1990); 
        estacion.cargar(20); 
        estacion.reponer(8000); 
        estacion.reponer(5000); 
    }
}