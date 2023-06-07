package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej09 {

    public static void main(String[] args) {
        /*
        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
        que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
        investigar la función Substring y equals() de Java.
        */
        Scanner rd = new Scanner(System.in);
        String frase;
       
        System.out.print("Escribe una palabra o frase: ");
        frase = rd.nextLine();
        String primeraL=frase.substring(0, 1);
        if (primeraL.equals("A")){
            System.out.println("\nCORRECTO");
        }else{
            System.out.println("\nINCORRECTO");
        }
    }

    //Funciones o procedimientos ->>

}
