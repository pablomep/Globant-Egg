package ej01;
// @author Pablo
import java.util.Scanner;
public class ej16 {

    public static void main(String[] args) {
        /*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
    al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
    numero y si se encuentra repetido
         */
        Scanner rd = new Scanner(System.in);
        int[] vect;
        System.out.print("Ingresa el tamaño del vector: ");
        vect = new int[rd.nextInt()];
        //System.out.println("Se creó un vector de tamaño : " + vect.length);
        llenaVector(vect);
        localizaNum(vect, rd);
        /*        for (int i = 0; i < 20; i++) {
            System.out.println(" " + Math.round(Math.random() * 10));
        } */
    }

    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. Rellena el vector
    public static void llenaVector(int[] vector) {
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.round(Math.random() * 10);
            //System.out.println(i+" "+vector[i]);
        }
        System.out.print("El vector ha sido llenado con enteros aleatorios.\nPresiona ENTRAR para continuar...");
        //rd.;
        String enter = ent.nextLine();
        muestraVector(vector);
    }

    //PROCEDIMIENTO 2. Imprime Vector
    public static void muestraVector(int[] vector) {
        System.out.println("\nLos valores guardados en el vector son:");
        float trunc;
        String sp;
        //System.out.println(Math.floor(vector.length / 10));  //Para saber la alineación de los valores del vector
        for (int i = 0; i < vector.length; i++) {
            sp = " ";

            if (Math.floor(i / 10) > 0) {
                sp = "";
            }

            System.out.println(i + "." + sp + "[" + vector[i] + "]");
        }
        System.out.println();
    }

    //PROCEDIMIENTO 3. Localiza numero en vector (uso de FOR mejorado...)
    public static void localizaNum(int[] vector, Scanner rd) {
        int cont = 0, i = 0;
        System.out.print("Indica qué número quieres buscar (del 1 al 10): ");
        int num = rd.nextInt();
        for (int vectN : vector) {
            //System.out.println("[" + vectN + "]");
            if (num == vectN) {
                cont += +1;
                System.out.println("En número fue encontrado en la posición " + i);
            }
            i++;
        }
        if (cont > 0) {
            System.out.println("\nEl número " + num + " se halló " + cont + " veces en el vector");
        } else {
            System.out.println("Número no encontrado.");
        }

    }
    
}
