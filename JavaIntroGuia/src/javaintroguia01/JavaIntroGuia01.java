/*
Este programa escribe el texto “Hola Mundo" en la consola utilizando
el método System.out.println()
 */
package javaintroguia01;

import java.util.Scanner;

/** @author Pablo */
public class JavaIntroGuia01 {

    /** @param args the command line arguments */
    
    public static void main(String[] args) {
     /*   //Ejercicio 1 y 2
        byte abecedario=127;
        double decimal=3.1;
        long enteroLargo=65000;
        char letra='C';
        String cadena;
        boolean binario;
    */  
     /*
        // Corrección de errores 1
        String nombre;
        boolean bandera;
        char caracter;
        
        // Corrección de errores 2
        int numero = 48;
        double decimales = 3.55;
        boolean banderas = false;
     */
     /*
        //Ejercicio 3
        long r1,r2,r3,r4,r5,r6;
        
        r1=enteroLargo+enteroLargo;
        System.out.println(r1);
        
        r2=r1-enteroLargo;
        System.out.println(r2);
        
        r3=abecedario*numero;
        System.out.println(r3);
        
        r4=r1/r2;
        System.out.println(r4);
        
        binario=banderas;
        System.out.println(binario);
     */
     /*
        //Ejercicio 4
        String miNombre="Pablo M";
        byte edad=42;
        System.out.println("Mi nombre es "+miNombre+" y mi edad es "+edad+" años.");
        
        // La línea 12 muestra el mensaje por pantalla al ejecutar el programa
        System.out.println("Caracter: " + '\u2222');
        System.out.println(" Listo");
        
        System.out.println("revisar sintaxis");
     */
     /*

        //Ejercicio 5: Define una variable de tipo boolean, double y char.
        //Guarda información en ellas a través del Scanner.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ejercicio 5:");
        System.out.println("Ingresa un valor binario:");
        boolean binario5 = entrada.nextBoolean();
        System.out.println("Ingresa un valor decimal (64b)");
        double decimal5 = entrada.nextDouble();
        System.out.println("Ingresa un valor de caracter (16b)");
        char simbolo5 = entrada.next().charAt(0);

        
        System.out.println("Valores ingresados:");
        System.out.println("boolean: "+binario5);

        System.out.println("double: "+decimal5);

        System.out.println("char: "+simbolo5);
        */
        /*
        // Corrección de errores 5
//        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingresa tu nombre");
            String nombre = leer.next();
            System.out.println("Ingresa tu edad");
            int edad = leer.nextInt();
            System.out.println("Nombre: "+nombre+", Edad: "+edad);
            */
        /*
        //Ejercicio 6: Implementar un programa que le pida dos números enteros a usuario y
        //determine si ambos o alguno de ellos es mayor a 25.

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa dos numeros para saber si alguno es mayor a 25.");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        if (num1>25 || num2>25){
            System.out.println("Uno de los números es mayor a 25.");
        }else{
            System.out.println("Ninguno de los números es mayor a 25.");
        }
        */
        /*
        //Ejercicio 7: .
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el tipo de motor.");
        int tipoMotor = entrada.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        */
        /*
        //Ejercicio 8: Escriba un programa que valide si una nota está entre 0 y 10,
        //sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa una nota");
        double nota = entrada.nextDouble();
        while (nota>10 || nota<0){
            System.out.println("Nota inválida, revísala e ingresa nuevamente la nota:");
            nota = entrada.nextDouble();
        }
        */
        /*
        //EJERCICIO 9. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        //bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
        //el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa un numero");
        float suma=0, num;
        int cont=1;
        
        do {
            System.out.println("Ingresa un numero ("+cont+")");
            num = entrada.nextFloat();
            if (num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }else {
                if (num>0){
                    suma=suma+num;
                }
            }
            cont++;
        } while (cont<=20);
        System.out.println("Se sumaron "+(cont-1)+" números");
        System.out.println("La suma de los numeros ingresados es igual a "+suma);
        */
        /*
        //EJERCICIO 10. Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
        //e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
        //Por ejemplo:
        //5 *****
        //3 ***
        //11 ***********
        //2 **
        
        Scanner rd = new Scanner(System.in);
        int num;
        System.out.println("Escribe cuatro números enteros, entre 1 y 20:");
        
        for (int i = 0; i < 4;i++) {
            num=rd.nextInt();
            System.out.print(num);
            for (int j = 0; j < num;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        */
        /*
        //EJERCICIO 11. Escribe un programa que cambie vocales por símbolos:
        // a=@; e=#; i=$; o=%; u=*
        String charset = "ISO-8859-1";
        Scanner rd = new Scanner(System.in,charset);        
        
        System.out.println("Escribe una palabra o frase:");
        String palabra=rd.nextLine();
        //System.out.println(palabra);
        System.out.println("La palabra codificada es = " + codificar(palabra));
        */
        /*
        //EJERCICIO 12. Crea un procedimiento EsMultiplo que reciba los dos números pasados
        //por el usuario, validando que el primer numero múltiplo del segundo e imprima si
        //el primer numero es múltiplo del segundo, sino informe que no lo son.
        Scanner rd=new Scanner(System.in);
        
        System.out.println("Escribre dos números enteros a comparar");
        int num1=rd.nextInt();
        int num2=rd.nextInt();
        EsMultiplo(num1,num2);
        System.out.println("Saludos");
        */
        
        //EJERCICIO 13 Y 14: Declarar un vector con suficientes espacioes para
        //rellenar con los nombres de los compañeros de equipo.
        
        String[] vct = new String[5];
        String[][] mtx = new String[5][3];
        
        //Imprime orden de las filas:
        //System.out.println(mtx.length);
        //Imprime orden de las columnas (para la fila 0, o para todas si la matriz es cuadrada):
        //System.out.println(mtx[0].length);
        llenaVector(vct);
    }
    
    //PROCEDIMIENTO 1 PARA EL EJERCICIO 14. Rellena el vector
    public static void llenaVector(String[] vector){
        String charset = "ISO-8859-1";
        Scanner rd = new Scanner(System.in, charset);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Escribe el nombre del compañero No. " + (i+1)+": ");
            vector[i]= rd.next();
            //System.out.println();
        }
        muestraVector(vector);
    }

    //PROCEDIMIENTO 2 PARA EL EJERCICIO 14. Imprime Vector
    public static void muestraVector (String[] vector){
        System.out.println("\nLos nombres guardados en el vector son:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" [" + vector[i] + "]");
        }
        System.out.println();
    }
    
    /*
    //PROCEDIMIENTO PARA EL EJERCICIO 12
    public static void EsMultiplo (int num1,int num2) {

        if (num1%num2!=0){
            System.out.println(num1+", NO es multiplo de "+num2+"\n");
        }else{
            System.out.println(num1+", SI es multiplo de "+num2+"\n");
        }
    }
    */
    /*
    // FUNCION PARA EJERCICIO 11
    public static String codificar (String wrd) {
        String enigma="";
        //int largowrd=wrd.length();
        String wrdLC=wrd.toLowerCase();
        
        for (int i = 0; i<wrd.length(); i++) {
            char ltr=wrdLC.charAt(i);
            //System.out.println(ltr);
            switch (ltr){
                case 'a':
                    //enigma=enigma+"@";
                    enigma=enigma.concat("@");
                    break;
                case 'e':
                    //enigma=enigma+"#";
                    enigma=enigma.concat("#");
                    break;
                case 'i':
                    //enigma=enigma+"$";
                    enigma=enigma.concat("$");
                    break;
                case 'o':
                    //enigma=enigma+"%";
                    enigma=enigma.concat("%");
                    break;
                case 'u':
                    //enigma=enigma+"*";
                    enigma=enigma.concat("*");

                    break;
                default:
                    //enigma=enigma+Character.toString(wrd.charAt(i));
                    enigma=enigma.concat(Character.toString(wrd.charAt(i)));
            }

        }

        return enigma;
    }
    */
    
}
