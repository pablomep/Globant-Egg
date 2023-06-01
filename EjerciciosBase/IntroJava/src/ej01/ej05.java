package ej01;
// @author Pablo
import java.util.Scanner;
public class ej05 {

    public static void main(String[] args) {
/*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
        */
        Scanner rd=new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num = rd.nextInt();
        
        System.out.println("El número ingresado es: "+num);
        System.out.println("El doble de "+num+" es: "+num*2);
        System.out.println("El triple de "+num+" es: "+num*3);
        System.out.println("La raíz cuadrada de "+num+" es: "+Math.sqrt(num)+ "\n\nHasta pronto");
    }

    //Funciones o procedimientos ->>

}
