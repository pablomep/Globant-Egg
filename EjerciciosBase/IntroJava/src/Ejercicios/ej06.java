package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej06 {

    public static void main(String[] args) {
        /*
        Crear un programa que dado un numero determine si es par o impar.
        */
        Scanner rd = new Scanner(System.in);
        System.out.print("Escribe el número para saber si es par o impar: ");
        int num = rd.nextInt();
        if (num%2==0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }

    //Funciones o procedimientos ->>

}
