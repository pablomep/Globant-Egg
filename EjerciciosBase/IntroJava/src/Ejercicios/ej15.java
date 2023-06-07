package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej15 {

    public static void main(String[] args) {
        /*
    Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
         */
        Scanner rd = new Scanner(System.in);
        int[] vect = new int[100];
        System.out.print("Este programa rellena un vector con los primeros 100 números naturales\nPresiona ENTRAR para iniciar...");
        String enter = rd.nextLine();
        llenaVector(vect, rd);
    }

    //PROCEDIMIENTO 1. Rellena el vector
    public static void llenaVector(int[] vector, Scanner rd) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
            //System.out.println(i+" "+vector[i]);
        }
        System.out.print("El vector ha sido llenado. Presiona ENTRAR para continuar...");
        String enter = rd.nextLine();
        muestraVector(vector);
    }

    //PROCEDIMIENTO 2. Imprime Vector
    public static void muestraVector(int[] vector) {
        System.out.println("\nLos valores guardados en el vector son:");
        float trunc;
        String sp;
        for (int i = vector.length - 1; i >= 0; i--) {
            sp = "  ";
            if (Math.floor(vector[i] / 100) > 0) {
                sp = "";
            } else {
                if (Math.floor(vector[i] / 10) > 0) {
                    sp = " ";
                }
            }

            System.out.print("[" + sp + vector[i] + "]");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }
        System.out.println();
    }

}
