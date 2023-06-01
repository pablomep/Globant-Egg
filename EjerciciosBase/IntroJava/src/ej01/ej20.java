package ej01;
// @author Pablo
import java.util.Scanner;
public class ej20 {

    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
        */
        Scanner rd = new Scanner(System.in);
        int[][] matriz = new int[3][3];                 //VALORES MATRIZ POR USUARIO
        //int[][] matriz = {{2,7,6},{9,5,1},{4,3,8}};   //VALORES MATRIZ POR CODIGO
        int dig;
        // INGRESAR MANUALMENTE, CON VALIDACIÓN
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Escribe el valor en (%d,%d): ",i,j);
                dig= rd.nextInt();
                if (validaEntrada(dig)){
                    matriz[i][j]=dig;
                }else{
                    j-=1;
                }
            }
        }
        System.out.println();
        muestraMatriz(matriz);
        if (esMagia(matriz)){
            System.out.println("\nLa matriz es mágica." );
        }else{
            System.out.println("\nLa matriz no es mágica.");
        }
    }
    //Funciones o procedimientos ->>
    //PROCEDIMIENTO 1. (FUNCION) Validador de entrada de datos
    public static boolean validaEntrada(int dig) {
        boolean valida = true;
        if (dig < 1 || dig > 9) {
            System.out.println("Número inválido. solo ingresa números del 1-9.");
            valida = false;
        }
        return valida;
    }
    //PROCEDIMIENTO 2. Muestra las matrices en consola
    public static void muestraMatriz(int[][] mtx) {
        for (int[] fil : mtx) {
            for (int col : fil) {
                System.out.print("[" + col + "] ");
            }
            System.out.println();
        }
    }
    //PROCEDIMIENTO 3 (FUNCION) Realiza la sumas por filas, columnas y diagonales y compara los valores
    //en caso de que una sola suma de fila, columna o diagonal sea diferente, retorna falso
    public static boolean esMagia(int[][] mtx) {
        int suma, compara = 0;
        boolean magia = true;
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += mtx[i][j];
                //System.out.println("suma: "+sumafil);
            }
            if (i == 0) {
                compara = suma;
                //System.out.println("compara 0="+compara);
            } else {
                if (compara == suma) {
                    magia = true;
                } else {
                    return magia = false;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += mtx[j][i];
            }
            if (compara == suma) {
                magia = true;
            } else {
                return magia = false;
            }
        }
        suma = 0;
        for (int i = 0; i < 3; i++) {
            //System.out.println("contador i: " + i);
            suma += mtx[i][i];
        }
        suma = 0;
        for (int i = 2; i > -1; i--) {
            //System.out.println("contador i: " + i);
            suma += mtx[2 - i][i];
        }
        if (compara == suma) {
            magia = true;
        } else {
            return magia = false;
        }
        return magia;
    }
}
