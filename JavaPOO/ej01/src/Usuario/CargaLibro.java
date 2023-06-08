package Usuario;
// @author Pablo
import Entidad.Libro;
import Servicio.libroServ;
public class CargaLibro {

    public static void main(String[] args) {
        libroServ datosLib=new libroServ();
        Libro nuevoLib=datosLib.crearLibro();
        System.out.println("Ser registró el libro con los siguientes datos:");
        System.out.println("ISBN: "+nuevoLib.ISBN+"\nTítulo: "+nuevoLib.titulo+"\nAutor: "+nuevoLib.autor+"\nPáginas: "+nuevoLib.paginas);

    }
}
