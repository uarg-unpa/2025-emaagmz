// Punto 2 - TP Clases & Objetos I
public class Domicilio {
    private String calle;
    private int numero;
    private String ciudad;
    private String codigoPostal;
    private String pais;

    public Domicilio(String calle, int numero, String ciudad, String codigoPostal, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public void mostrarDireccionCompleta() {
        System.out.println("Calle: " + calle + " , Numero: " + numero + " , Ciudad: " + ciudad + ", Codigo Postal: " + codigoPostal + " , Pais: " + pais);
    }
}
