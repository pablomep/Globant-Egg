package Usuario;
// @author Pablo

import Servicio.CuentaSRV;
import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {
            
        menuCajero();
        System.out.println("¡Vuelve pronto!");

    }
    
    public static void menuCajero(){
        Scanner rd=new Scanner(System.in);
        int opt;
        String salida;
        CuentaSRV operacion =new CuentaSRV();
        
        
        do {
            System.out.println("\n****************");
            System.out.print("MENÚ\n1. Generar cuenta\n2. Depositar\n3. Retirar\n"
                    + "4. Extracción rápida\n5. Consultar saldo\n6. Consultar datos\n"
                    + "7. Salir\n");
            System.out.println("****************");
            System.out.print("Elige una opción: ");
            opt = rd.nextInt();
            switch (opt) {
                case 1:
                    operacion.crearCuenta();
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    operacion.Ingresar(rd.nextDouble());
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    operacion.Retirar(rd.nextDouble());
                    break;
                case 4:
                    operacion.extraccionRapida();
                    break;
                case 5:
                    operacion.consultarSaldo();
                    break;
                case 6:
                    operacion.consultarDatos();
                    break;
                case 7:
                    System.out.print("¿Está seguro que desea terminar su sesión (S/N)? ");
                    do{
                        salida = rd.next();
                    }while(!salida.equalsIgnoreCase("S") && !salida.equalsIgnoreCase("N"));
                    if (salida.equalsIgnoreCase("N")){
                        opt=0;
                    }
                    System.out.print("");
                    break;
                default:
                    System.out.println("\nError. Ingresa opciones 1-8!");
            }
        } while (opt != 7);
        
    }
    
}
