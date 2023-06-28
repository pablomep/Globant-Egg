package Usuario;
// @author Pablo
import Entidad.Rectangulo;
import java.util.Scanner;
public class CreadorRTG {
    

    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        Rectangulo rtg=new Rectangulo();
        System.out.print("Ingresa la longitud de la base: ");
        rtg.setBase(rd.nextInt());
        System.out.print("Ingresa la longitud de la altura: ");
        rtg.setAltura(rd.nextInt());
        
        rtg.calculaArea();
        rtg.calculaPerimetro();
        rtg.imprimeRectangulo();
        
    }


}
