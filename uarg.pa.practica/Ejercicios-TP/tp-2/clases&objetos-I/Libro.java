// Punto 2 - TP Clases & Objetos I
public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private String editorial;
    private int publicacion;

    public Libro(String titulo, String autor, int numeroDePaginas, String editorial, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.editorial = editorial;
        this.publicacion = publicacion;
    }

    public void abrir() {
        System.out.println("Abriendo el libro: " + titulo);
    }

    public void cerrar() {
        System.out.println("Cerrando el libro: " + titulo);
    }

    public void pasarPagina() {
        System.out.println("Pasando página en el libro: " + titulo);
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año de Publicacion: " + publicacion + ", Paginas: " + numeroDePaginas + " , Editorial: " + editorial);
    }
}
