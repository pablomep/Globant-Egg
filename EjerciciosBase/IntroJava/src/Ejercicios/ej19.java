package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej19 {

    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
        una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
        de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
        */
        Scanner rd = new Scanner(System.in);
        int[][] matriz= {{0,-2,4}, {2,0,2},{-4,-2,0}};
        
        llenaMatriz(matriz);
        
        int[][] trasp= creaTraspuesta(matriz);
        muestraMatriz(trasp);
        if (esAntiSimetrica(matriz, trasp)==false){
            System.out.println("\nLa matriz traspuesta no es anti simétrica de la matriz original");
        }else{
            System.out.println("\nLa matríz traspuesta es anti simétrica de la matriz original");
        }

    }

    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. Rellena el vector
    public static void llenaMatriz(int[][] mtx) {
        
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                mtx[i][j] = (int) Math.floor(Math.random() * 100);
//            }
//        }
        System.out.println("La matriz ha sido llenada desde el código");
        System.out.println("\nLos valores guardados en la matriz son:");
        muestraMatriz(mtx);
    }

    //PROCEDIMIENTO 2. Imprime Vector
    public static void muestraMatriz(int[][] mtx) {
        for (int[] fil:mtx){
            for (int col:fil){
                System.out.print("[" + col + "] ");
            }
            System.out.println();
        }
    }
    //PROCEDIMIENTO 3. Crea matriz traspuesta
    public static int[][]  creaTraspuesta(int[][] mtx) {
        int[][] trasp= new int[3][3];
        int i, j=0;
        for (int[] fil:mtx){
            i=0;
            for (int col:fil){
                trasp[i][j]=col;
                i++;
            }
            j++;
        }
        System.out.println("\nLos valores guardados en la matriz traspuesta son:");
        
        return trasp;
    }
    //PROCEDIMIENTO 4. Crea matriz traspuesta
    public static boolean esAntiSimetrica(int[][] mtx, int[][] mtxT){
        boolean anti=true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mtx[i][j] != -(mtxT[i][j])){
                    
                    anti=false;
                    return anti;
                }
            }
        }
        return anti;
    }
}
