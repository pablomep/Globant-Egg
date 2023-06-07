package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej07 {

    public static void main(String[] args) {
        /*
        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
        investigar la función equals() en Java.
        */
        Scanner rd = new Scanner(System.in);
        
        System.out.print("Escribe una palabra: ");
        String wrd = rd.next();
        if (wrd.equals("eureka")){
            System.out.println("\nCORRECTO");
        }else{
            System.out.println("\nINCORRECTO");
        }
    }

    //Funciones o procedimientos ->>

}
