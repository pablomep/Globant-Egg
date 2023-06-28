package App;
// @author Pablo
import Srv.CalcSrv;
import java.util.Scanner;
public class Calc {

    public static void main(String[] args) {
        CalcSrv figura=new CalcSrv();
        Scanner rd=new Scanner(System.in);
        int opt;
        String salida;
        System.out.println("Este programa calcula áreas y perímetros de "
                + "diferentes figuras");
        do {
            System.out.println("\n****************");
            System.out.print("MENÚ\n1. Cuadrado\n2. Rectángulo\n3. Triángulo\n"
                    + "4. Círculo\n5. Hexágono\n6. Pentágono\n7. Rombo\n"
                    + "8. Salir\n");
            System.out.println("****************");
            System.out.print("Elige una opción: ");
            opt = rd.nextInt();
            switch (opt) {
                case 1:
                    //System.out.printf("\nLa suma de %d con %d es: %d\n", num1, num2, (num1 + num2));
                    figura.crearCuadrado();
                    break;
                case 2:
//                    System.out.printf("\nLa resta de %d menos %d es: %d\n", num1, num2, (num1 - num2));
                    figura.crearRectangulo();
                    break;
                case 3:
//                    System.out.printf("\nLa multiplicación de %d por %d es: %d\n", num1, num2, (num1 * num2));
                    figura.crearTriangulo();
                    break;
                case 4:
//                    System.out.printf("\nLa división de %d entre %d es: %.2f\n", num1, num2, ( (float) num1 / num2));
                    figura.crearCirculo();
                    break;
                case 5:
//                    System.out.printf("Opción no disponible, intente más tarde");
                    figura.crearHexagono();
                    break;
                case 6:
//                    System.out.printf("Opción no disponible, intente más tarde");
                    figura.crearPentagono();
                    break;
                case 7:
//                    System.out.printf("Opción no disponible, intente más tarde");
                    figura.crearRombo();
                    break;
                case 8:
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
                    System.out.println("\nError. Ingresa opciones 1-8!");
            }
        } while (opt != 8);
        

    }
}
