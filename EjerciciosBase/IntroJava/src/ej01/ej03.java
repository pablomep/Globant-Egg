package ej01;
// @author Pablo
import java.util.Scanner;
public class ej03 {

    public static void main(String[] args) {
        /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
         */
        Scanner rd = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = rd.nextLine();
        System.out.println("\nLa frase en mayúsculas: " + frase.toUpperCase() + "\n");
        System.out.println("La frase en minúsculas: " + frase.toLowerCase() + "\n\nHasta pronto");

    }

    //Funciones o procedimientos ->>

}
