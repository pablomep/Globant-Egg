package Usuario;
// @author Pablo
//import Entidad.Vehiculo;
import Servicio.VehiculoSvc;
import java.util.Scanner;
public class VehiculoApp {

    public static void main(String[] args) {
        Scanner rd=new Scanner(System.in);
        VehiculoSvc v1=new VehiculoSvc();
        VehiculoSvc v2=new VehiculoSvc();
        VehiculoSvc v3=new VehiculoSvc();
        //Vehiculo v1=captura.CrearVehiculo();
        
        System.out.println("Ingresa los datos de tres vehículos");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nVehículo No. "+(i+1)+":");
            switch (i) {
                case 0:
                    v1.CrearVehiculo();
                    break;
                case 1:
                    v2.CrearVehiculo();
                    break;
                case 2:
                    v3.CrearVehiculo();
                    break;
                default:
            }
        }
        
        
        System.out.print("\n¿Cuánto tiempo (en segundos) quieres que avancen los vehículos?: ");
        int t1=rd.nextInt();
        int dist1 = v1.mueveVehiculo(t1);
        int dist2 = v2.mueveVehiculo(t1);
        int dist3 = v3.mueveVehiculo(t1);
               
        System.out.println("El vehículo 1 se resplazó "+dist1+" metros en "+t1+" segundos.");
        System.out.println("El vehículo 2 se resplazó "+dist2+" metros en "+t1+" segundos.");
        System.out.println("El vehículo 3 se resplazó "+dist3+" metros en "+t1+" segundos.");
        
        dist1 = v1.frenaVehiculo(300);
        dist2 = v2.frenaVehiculo(300);
        dist3 = v3.frenaVehiculo(300);
        
        
        System.out.println("\nLos vehículos se frenarán despues de 5 minutos.");
        if (dist1>dist2) {
            if (dist1>dist3){
                System.out.println("El vehiculo 1 se desplazó más lejos: "+dist1+" metros");
            } else{
                System.out.println("El vehiculo 3 se desplazó más lejos: "+dist3+" metros");
            }
        }else{
            if (dist2>dist3) {
                System.out.println("El vehiculo 2 se desplazó más lejos: "+dist2+" metros");
            }else{
                System.out.println("El vehiculo 3 se desplazó más lejos: "+dist3+" metros");
            }
            
        }
        
    }

}
