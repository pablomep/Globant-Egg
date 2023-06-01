package ej01;
// @author Pablo
import java.util.Scanner;
public class ej18 {

    public static void main(String[] args) {
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
        obtiene cambiando sus filas por columnas (o viceversa).
        */
        Scanner rd = new Scanner(System.in);
        int[][] matriz= new int[4][4];
        //System.out.print("Ingresa el número de filas de la matriz: ");
        //matriz = new int[rd.nextInt()];
        //System.out.println("Se creó un vector de tamaño : " + vect.length);
        llenaMatriz(matriz);
        creaTraspuesta(matriz);

    }

    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. Rellena el vector
    public static void llenaMatriz(int[][] mtx) {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mtx[i][j] = (int) Math.floor(Math.random() * 100);
                //System.out.println(i+","+ j+" "+mtx[i][j]);
            }
            
            //System.out.println(i+" "+vector[i]);
        }
        System.out.println("La matriz ha sido llenada con enteros aleatorios.");
        System.out.println("\nLos valores guardados en la matriz son:");
        muestraMatriz(mtx);
    }

    //PROCEDIMIENTO 2. Imprime Vector
    public static void muestraMatriz(int[][] mtx) {
        
        //Scanner ent = new Scanner(System.in);
        
        //float trunc;
        //String sp;
        //System.out.println(Math.floor(vector.length / 10));  //Para saber la alineación de los valores del vector
        for (int[] fil:mtx){
            for (int col:fil){
                System.out.print("[" + col + "] ");
            }
            System.out.println();
        }
    }
    //PROCEDIMIENTO 3. Crea matriz traspuesta
    public static void creaTraspuesta(int[][] mtx) {
        int[][] trasp= new int[4][4];
        //Scanner ent = new Scanner(System.in);
        //System.out.println("\nLos valores guardados en la matriz son:");
        //float trunc;
        //String sp;
        int i, j=0;
        //System.out.println(Math.floor(vector.length / 10));  //Para saber la alineación de los valores del vector
        for (int[] fil:mtx){
            i=0;
            for (int col:fil){
                trasp[i][j]=col;
                i++;
            }
            j++;
        }
        System.out.println("\nLos valores guardados en la matriz traspuesta son:");
        muestraMatriz(trasp);
        //System.out.println("\nPresiona ENTRAR para continuar...");
        //String enter = ent.nextLine();
        
    }
    
    
}
