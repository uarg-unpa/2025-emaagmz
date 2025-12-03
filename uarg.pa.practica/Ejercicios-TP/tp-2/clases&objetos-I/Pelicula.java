// Punto 2 - TP Clases & Objetos I
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int estreno;

    public Pelicula(String titulo, String director, int duracion, String genero, int estreno) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.estreno = estreno;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }

    public void pausar() {
        System.out.println("Pausar: " + titulo);
    }

    public void detener() {
        System.out.println("Detener: " + titulo);
    }

    public void informacionGeneral() {
        System.out.println("Título: " + titulo + ", Director: " + director + ", Duracion: " + duracion + ", Genero: " + genero  + " , Estreno: " + estreno);
    }
}