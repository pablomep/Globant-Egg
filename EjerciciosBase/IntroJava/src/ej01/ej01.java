package ej01;
// @author Pablo
import java.util.Scanner;
public class ej01 {

    public static void main(String[] args) {
    /*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
        */
        Scanner rd = new Scanner(System.in);

        System.out.println("Escribe dos números");
        int num1 = rd.nextInt(), num2 = rd.nextInt();
        System.out.println("La suma de los números ingresados es = " + (num1 + num2));
    }

    //Funciones o procedimientos ->>

}
