package Usuario;
// @author Pablo
import Entidad.Circunferencia;
import Servicio.CircServicio;
public class circulAPP {

    public static void main(String[] args) {
        CircServicio circ= new CircServicio();
        Circunferencia circulo=circ.crearCircunferencia();
        
        circulo.area(circulo.getRadio());
        
        circulo.perimetro(circulo.getRadio());
        

    }
}
