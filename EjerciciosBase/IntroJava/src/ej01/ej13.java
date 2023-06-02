package ej01;
// @author Pablo
import java.util.Scanner;
public class ej13 {

    public static void main(String[] args) {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
         */
        Scanner rd = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño del cuadrado:");
        int dim= rd.nextInt();
        for (int i = 0; i < dim; i++) {
            if (i==0 || i==dim-1){
                for (int j = 0; j < dim; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                System.out.print("* ");
                for (int j = 0; j < dim-2; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }

    }

    //Funciones o procedimientos ->>

}
