package ej01;
// @author Pablo
import java.util.Scanner;
public class ej10 {

    public static void main(String[] args) {
        /*
        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        solicite números al usuario hasta que la suma de los números introducidos supere el
        límite inicial.
        */
        Scanner rd = new Scanner(System.in);
        int suma=0, num;
        System.out.print("Escribe un valor límite positivo: ");
        int lim=rd.nextInt();
        
        do {
            System.out.print("Escribe un número a sumar: ");
            num=rd.nextInt();
            suma+=+num;
        }while (suma<=lim);
        System.out.println("La suma de los números introducidos superó al valor límite.\n\nAdios.");
    }

    //Funciones o procedimientos ->>

}
