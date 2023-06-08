package Usuario;
// @author Pablo
import Entidad.Circunferencia;
import java.util.Scanner;
//import Servicio.circServ;
public class circulAPP {

    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        Circunferencia circulo=new Circunferencia();
        
        System.out.print("Captura el radio del círculo: ");
        circulo.setRadio(rd.nextDouble());
        
        circulo.area(circulo.getRadio());
        
        circulo.perimetro(circulo.getRadio());
        

    }
}
