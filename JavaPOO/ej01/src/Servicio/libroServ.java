package Servicio;
// @author Pablo
import Entidad.Libro;
import java.util.Scanner;
public class libroServ {
    Scanner rd=new Scanner(System.in);

    public Libro crearLibro() {
        Libro registro=new Libro();
        //String isbn,titulo,autor;
        //int pags;
        System.out.print("Captura el ISBN: ");
        registro.ISBN=rd.nextLine();
        System.out.print("Captura el Título: ");
        registro.titulo=rd.nextLine();
        System.out.print("Captura el Autor: ");
        registro.autor=rd.nextLine();
        System.out.print("Captura el número de páginas: ");
        registro.paginas=rd.nextInt();
        //registro(isbn,titulo,autor,pags);
        return registro;

    }
}
