package ej01;
// @author Pablo
import java.util.Scanner;
public class ej21 {

    public static void main(String[] args) {
        /*
        Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
        que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
        menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
        columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
         */
        Scanner rd = new Scanner(System.in);
        int[][] matriz1 = new int[10][10];
        /*{
            {1,26,36,47,5,6,72,81,95,10},
            {11,12,13,21,41,22,67,20,10,61},
            {56,78,87,90,9,90,17,12,87,67},
            {41,87,24,56,97,74,87,42,64,35},
            {32,76,79,1,36,5,67,96,12,11},
            {99,13,54,88,89,90,75,12,41,76},
            {67,78,87,45,14,22,26,42,56,78},
            {98,45,34,23,32,56,74,16,19,18},
            {24,67,97,46,87,13,67,89,93,24},
            {21,68,78,98,90,67,12,41,65,12}
            }; */
        int[][] matriz2 = new int[3][3];
        /*{
            {36,5,67},
            {89,90,75},
            {14,22,26}
        };*/
        System.out.println("Los valores guardados en la Matriz 1 son:");
        llenaMatriz(matriz1);
        System.out.println();
        System.out.println("Los valores guardados en la Matriz 2 son:");
        llenaMatriz(matriz2);
        System.out.println();
        recorreMatriz(matriz1, matriz2);

    }

    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. Rellena la matriz
    public static void llenaMatriz(int[][] mtx) {
        int a = 100;                                        //Dimensiona los valores aleatorios
        for (int i = 0; i < mtx[0].length; i++) {
            for (int j = 0; j < mtx.length; j++) {
                mtx[i][j] = (int) Math.floor(Math.random() * a);
            }
        }
        muestraMatriz(mtx,a);
    }

    //PROCEDIMIENTO 2. Muestra las matrices en consola
    public static void muestraMatriz(int[][] mtx,int a) {
        for (int[] fil : mtx) {
            for (int col : fil) {
                System.out.print("[" + meteEspacios(a,col) + col + "] ");
            }
            System.out.println();
        }
    }
    //PROCEDIMIENTO 2.1 Agrega espacios para formatear la salida de la matriz
    public static String meteEspacios(int a,int elemento) {
        int b=9;
        String space="";
        if (elemento<=1){elemento=9; }
        while (a/elemento>b){
            space+=" ";
            b=b*11;
        }
        return space;
        
       /// NO FUNCIONA CUANDO A/ELEMENTO = 10 :((
    }

    //PROCEDIMIENTO 3.1 Hace recorrer la comparativa desde la primera coincidencia de (0,0) de mtx2 en mtx1
    public static void recorreMatriz(int[][] mtx1, int[][] mtx2) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (encuentraCoincidencia(mtx1, i, j, mtx2)) {
                    System.out.println("ATENCIÓN: Se ha encontrado coincidencia completa:");
                    System.out.println("Desde (" + i + "," + j + ") hasta (" + (i + 2) + "," + (j + 2) + ") de la Matriz 1");
                    return;
                }
            }
        }
        System.out.println("No se encontró ninguna coincidencia de la Matriz 2 dentro de Matriz 1");
    }

    //PROCEDIMIENTO 3.2 Busca coincidencias entre matrices, dada una posición
    public static boolean encuentraCoincidencia(int[][] mtx1, int indexi, int indexj, int[][] mtx2) {
        boolean incide = true;
        int k, l;
        for (int i = 0; i < 3; i++) {
            k = indexi + i;
            for (int j = 0; j < 3; j++) {
                l = indexj + j;
                //System.out.print("[ "+mtx1[k][l]+"] ");   //debug
                if (mtx1[k][l] != mtx2[i][j]) {
                    incide = false;
                    return incide;
                }
                //System.out.println();                     //debug
            }
        }
        return incide;
    }
}
