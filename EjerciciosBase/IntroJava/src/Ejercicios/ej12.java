package Ejercicios;
// @author Pablo
import java.util.Scanner;
public class ej12 {

    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
        ser X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
        distinta de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
        e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().
        */
        Scanner rd = new Scanner(System.in);
        String entrada;
        int longcad, err=0,corr=0;
        String salida;
        
        System.out.println("*EMULADOR DE DISPOSITIVO RS232*");
        do {
            System.out.print("Ingresa cadena: ");
            entrada = rd.next();
            longcad=entrada.length();
            if (longcad>5){
                System.out.println("ERROR. Longitud inválida");
                err+=+1;
                continue;
            }
            if (entrada.equals("&&&&&")){
                System.out.println("ATENCIÓN. Termina lectura");
                continue;
            }
            if (!entrada.substring(0,1).equalsIgnoreCase("X") || !entrada.substring(longcad-1,longcad).equalsIgnoreCase("O")){
                System.out.println("ERROR. Formato de cadena inválido");
                err+=+1;
                continue;
            }
            corr+=+1;
        } while (!entrada.equals("&&&&&"));
        System.out.printf("Entradas correctas: %d\n",corr);
        System.out.printf("Entradas erróneas: %d\n",err);
    }

    //Funciones o procedimientos ->>

}
