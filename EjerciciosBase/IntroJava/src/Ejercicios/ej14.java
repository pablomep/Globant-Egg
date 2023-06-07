package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej14 {

    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €
        */
        Scanner rd = new Scanner(System.in);
        Scanner rd2 = new Scanner(System.in);
        String moneda;
        float euros;
        
        System.out.print("Escribe la cantidad de euros a convertir: ");
        euros=rd.nextFloat();
        System.out.print("Escribe la moneda a la que quieres cambiar (\"libra\"/\"yen\"/\"usd\"): ");
        moneda=rd.next();
        cambioDivisa(euros, moneda);

    }

    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. Rellena el vector
    public static void cambioDivisa(float qty, String moneda) {
        switch (moneda) {
            case "libra":
                System.out.printf("%.2f euros equivalen a %.2f libras \n",qty,(qty*0.86));
                break;
            case "usd":
                System.out.printf("%.2f euros equivalen a %.2f dólares \n",qty,(qty*1.28611));
                break;
            case "yen":
                System.out.printf("%.2f euros equivalen a %.2f dólares \n",qty,(qty*129.852));
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.print("Saliendo...");
        
    }

}
