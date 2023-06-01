package ej01;
// @author Pablo
import java.util.Scanner;
public class ej08 {

    public static void main(String[] args) {
        /*
        Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
        el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
        por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
        “INCORRECTO”. Nota: investigar la función Lenght() en Java.
        */
        Scanner rd = new Scanner(System.in);
        String wrd;
        do {
        System.out.print("Escribe una palabra de 8 letras: ");
        wrd = rd.next();
        if (wrd.length()==8){
            System.out.println("\nCORRECTO");
            break;
        }else{
            if (wrd.equals("exit")){
                System.out.println("\nSaliendo...");
            }else{
                System.out.println("\nINCORRECTO");
            }
        }
        } while(!wrd.equals("exit"));

    }

    //Funciones o procedimientos ->>

}
