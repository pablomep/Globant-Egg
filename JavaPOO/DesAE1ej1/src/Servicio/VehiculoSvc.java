package Servicio;
// @author Pablo
import Entidad.Vehiculo;
import java.util.Scanner;
public class VehiculoSvc {

    Scanner rd = new Scanner(System.in);
    Vehiculo item = new Vehiculo();

    public Vehiculo CrearVehiculo() {
//        Vehiculo item = new Vehiculo();
        System.out.print("Ingresa la marca: ");
        item.marca = rd.nextLine();
        System.out.print("Ingresa el modelo: ");
        item.modelo = rd.nextLine();
        System.out.print("Ingresa el año: ");
        item.yr = rd.nextInt();
        do {
            System.out.print("Ingresa el tipo: ");
            item.tipo = rd.next();
        } while (!(item.tipo.equalsIgnoreCase("auto")) && !(item.tipo.equalsIgnoreCase("moto")) && !(item.tipo.equalsIgnoreCase("bici")));
        return item;
    }

    public int mueveVehiculo(int tiempo) {
        
        String type = item.tipo.toLowerCase();
        int dist=0;
        switch (type) {
            case "bici":
                dist=tiempo;
                //System.out.println("La bicicleta se mueve "+dist+" metros");
                break;

            case "moto":
                dist=tiempo*2;
                //System.out.println("La moto se mueve "+dist+" metros");
                break;
            case "auto":
                dist=tiempo*3;
                //System.out.println("El auto se mueve "+dist+" metros");
                break;
            default:
                //System.out.println("Vehículo no reconocido.");
        }
        return dist;
    }

    public int frenaVehiculo(int tiempo) {
        String type = item.tipo.toLowerCase();
        int dfrenado;
        switch (type) {
            case "bici":
                dfrenado = 0;
                break;
            case "moto":
                dfrenado = 2;
                break;
            case "auto":
                dfrenado = 2;
                break;
            default:
                dfrenado = 0;
                System.out.println("Vehículo no reconocido.");
        }
        return mueveVehiculo(tiempo) + dfrenado;
    }
}
