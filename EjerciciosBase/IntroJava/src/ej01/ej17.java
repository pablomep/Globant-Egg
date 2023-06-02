package ej01;
// @author Pablo
import java.util.Scanner;
public class ej17 {

    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos)
        */
        Scanner rd = new Scanner(System.in);
        int vect[];
        
        System.out.print("Escribe la dimensión del vector: ");
        vect = new int[rd.nextInt()];
        
        llenaVector(vect);
        System.out.println("\nLa contabilidad por número de dígitos es la siguiente:");
        System.out.println("(# de dígitos). [cantidad]");
        cuentaOrden(vect);
    }
    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. Rellena el vector
    public static void llenaVector(int[] vector) {
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.round(Math.random() * 100);
            //System.out.println(i+" "+vector[i]);
        }
        System.out.print("El vector ha sido llenado con enteros aleatorios");
        //rd.;
        System.out.println("\nLos valores guardados en el vector son:");
        muestraVector(vector);
        
    }
    //PROCEDIMIENTO 2. Muestra el vector
    public static void muestraVector(int[] vector) {
        
        String sp;
        //System.out.println(Math.floor(vector.length / 10));  //Para saber la alineación de los valores del vector
        for (int i = 0; i < vector.length; i++) {
            sp = " ";

            if (Math.floor(i / 9) > 0) {
                sp = "";
            }

            System.out.println((i+1) + "." + sp + "[" + vector[i] + "]");
        }
        System.out.println();
    }
    //PROCEDIMIENTO 3. Contabiliza cuantos numeros son multiplos de cada 10^N (hasta N=5)
    public static void cuentaOrden(int[] vct) {
        int cont = 0, ord;
        int orden[]={0,0,0,0,0};
        
        for (int vectN : vct) {
            //System.out.println("[" + vectN + "]");
            //System.out.println("Llega acá?");
            for (int i = 1; i < 6; i++) {
                //System.out.print(i+":");
                if (vectN/Math.pow(10,i)<1){
                    //System.out.println(Math.pow(10,i));
                    orden[i-1]+=+1;
                    //System.out.println("El orden de "+vectN+" es: "+orden[i-1]);
                    break;
                }
            }
        }
        muestraVector(orden);
    }
}
