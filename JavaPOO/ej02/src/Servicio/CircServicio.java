package Servicio;

// @author Pablo
import Entidad.Circunferencia;
import java.util.Scanner;

public class CircServicio {

    Scanner rd = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {

        Circunferencia rad = new Circunferencia();

        System.out.print("Captura el radio del círculo: ");
        rad.setRadio(rd.nextDouble());
        return rad;
    }

}
