package Calcula;
// @author Pablo
import java.util.Scanner;
import Servicio.CalculaService;
public class AppDescuento {

    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        
        System.out.print("Ingresa el precio base: ");
        double pb = rd.nextDouble();
        System.out.print("Ingresa el descuento que quieres aplicar: ");
        int ds = rd.nextInt();
        CalculaService cs = new CalculaService();
        double pf = cs.calculaDescuento(pb, ds);
        System.out.println("El precio con descuento es: "+pf);

    }

}
