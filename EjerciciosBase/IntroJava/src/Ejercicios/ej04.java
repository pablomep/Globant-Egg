package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej04 {

    public static void main(String[] args) {
        /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */
        Scanner rd = new Scanner(System.in);
        System.out.print("Escribe una temperatura en ºC para convertirla a ºF: ");
        int temp = rd.nextInt();
        System.out.println("\nLa temperatura en grados Fahrenheit es de " + (32 + (temp * 9 / 5)) + "\n\nSaludos");
    }

    //Funciones o procedimientos ->>

}
