package ej01;
// @author Pablo
import java.util.Scanner;
public class ej11 {

    public static void main(String[] args) {
        /*
        Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:
            MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
            Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
        programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
        seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
        del programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner rd = new Scanner(System.in);
        int num1,num2,opt;
        String salida;
        
        System.out.println("Ingresa dos numeros:");
        num1=rd.nextInt();
        num2=rd.nextInt();
        do {
            System.out.println("\n****************");
            System.out.print("MENÚ\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n");
            System.out.println("****************");
            System.out.print("Elija una opción: ");
            opt = rd.nextInt();
            switch (opt) {
                case 1:
                    System.out.printf("\nLa suma de %d con %d es: %d\n", num1, num2, (num1 + num2));
                    break;
                case 2:
                    System.out.printf("\nLa resta de %d menos %d es: %d\n", num1, num2, (num1 - num2));
                    break;
                case 3:
                    System.out.printf("\nLa multiplicación de %d por %d es: %d\n", num1, num2, (num1 * num2));
                    break;
                case 4:
                    System.out.printf("\nLa división de %d entre %d es: %.2f\n", num1, num2, ( (float) num1 / num2));
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    do{
                        salida = rd.next();
                    }while(!salida.equalsIgnoreCase("S") && !salida.equalsIgnoreCase("N"));
                    if (salida.equalsIgnoreCase("N")){
                        opt=0;
                    }
                    System.out.print("");
                    break;
                default:
                    System.out.println("\nError. Ingresa opciones 1-5!");
            }
        } while (opt != 5);
    }
    //Funciones o procedimientos ->>
}