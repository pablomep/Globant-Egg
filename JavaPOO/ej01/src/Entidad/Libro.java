package Entidad;
// @author Pablo
public class Libro {

    public String ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro(String ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
    }
}
