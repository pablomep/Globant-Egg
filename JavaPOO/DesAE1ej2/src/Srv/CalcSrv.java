package Srv;
// @author Pablo
import Ent.Dimension;
import java.util.Scanner;
import java.lang.Math;

public class CalcSrv {

    Scanner rd = new Scanner(System.in);

    public void crearCuadrado() {
        Dimension lado = new Dimension();
        System.out.println("Para calcular el área y perimetro de un cuadrado, "
                + "se requiere la longitud de uno de sus lados.");
        System.out.print("Ingresa la longitud de un lado del cuadrado: ");
        lado.setLong1(rd.nextDouble());
        System.out.println("\nEl perímetro del cuadrado es de "
                + (lado.getLong1() * 4) + " u.");
        System.out.println("\nEl área del cuadrado es de "
                + (Math.pow(lado.getLong1(), 2))
                + " u2.\n");
    }

    public void crearRectangulo() {
        Dimension lados = new Dimension();
        System.out.println("Para calcular el área y perimetro de un rectángulo, "
                + "se requiere las longitudes de la base y la altura.");
        System.out.print("Ingresa la base del rectángulo: ");
        lados.setLong1(rd.nextDouble());
        System.out.print("Ingresa la altura del rectángulo: ");
        lados.setLong2(rd.nextDouble());
        System.out.println("\nEl perímetro del rectángulo es de "
                + ((lados.getLong1() + lados.getLong2()) * 2)
                + " u.");
        System.out.println("\nEl área del rectángulo es de "
                + (lados.getLong1() * lados.getLong2())
                + " u2.\n");
    }

    public void crearTriangulo() {
        Dimension lados = new Dimension();
        System.out.println("Para calcular el área y perímetro de un triángulo, "
                + "se requiere las longitudes de cada uno de sus lados.");
        System.out.print("Ingresa la longitud del primer lado: ");
        lados.setLong1(rd.nextDouble());
        System.out.print("Ingresa la longitud del segundo lado: ");
        lados.setLong2(rd.nextDouble());
        System.out.print("Ingresa la longitud del tercer lado: ");
        lados.setLong3(rd.nextDouble());
        System.out.println("\nEl perímetro del triángulo es de "
                + ((lados.getLong1() + lados.getLong2() + lados.getLong3()))
                + " u.");
        double semiP = (lados.getLong1() + lados.getLong2() + lados.getLong3()) / 2;
        System.out.printf("\nEl área del triángulo es de %.2f  u2.\n",
                (Math.sqrt(semiP
                        * (semiP - lados.getLong1())
                        * (semiP - lados.getLong2())
                        * (semiP - lados.getLong3()))));
    }

    public void crearCirculo() {
        Dimension radio = new Dimension();
        System.out.println("Para calcular el área y perímetro de un círculo, "
                + "se requiere la longitud de su radio.");
        System.out.print("Ingresa la longitud del radio: ");
        radio.setLong1(rd.nextDouble());
        System.out.println("\nEl perímetro del círculo es de "
                + (Math.PI * 2 * radio.getLong1()) + " u.");
        System.out.println("\nEl área del circulo es de "
                + (Math.PI * Math.pow(radio.getLong1(), 2))
                + " u2.\n");
    }

    public void crearHexagono() {
        Dimension dim = new Dimension();
        System.out.println("Para calcular el área y perímetro de un hexágono, "
                + "se requiere la longitud de uno de sus lados.");
        System.out.print("Ingresa la longitud de un lado: ");
        dim.setLong1(rd.nextDouble());
        double perimetroHx = dim.getLong1() * 6;
        double apotemaHx = (dim.getLong1()) / (2 * Math.tan(Math.toRadians(30)));

        //60 grados
        System.out.println("\nEl perímetro del hexágono es de "
                + (perimetroHx)
                + " u.");
        System.out.printf("\nEl área del hexágono es de %.2f  u2.\n",
                (perimetroHx * apotemaHx / 2));
    }

    public void crearPentagono() {
        Dimension dim = new Dimension();
        System.out.println("Para calcular el área y perímetro de un pentágono, "
                + "se requiere la longitud de uno de sus lados.");
        System.out.print("Ingresa la longitud de un lado: ");
        dim.setLong1(rd.nextDouble());
        double perimetroPt = dim.getLong1() * 5;
        double apotemaPt = dim.getLong1() / (2 * Math.tan(Math.toRadians(36)));

        //72 grados
        System.out.println("\nEl perímetro del pentágono es de "
                + (perimetroPt)
                + " u.");
        System.out.printf("\nEl área del pentágono es de %.2f  u2.\n",
                (perimetroPt * apotemaPt / 2));
    }

    public void crearRombo() {
        Dimension diagonales = new Dimension();
        System.out.println("Para calcular el área y perimetro de un rombo, "
                + "se requiere las longitudes del diámetro mayor \ny "
                + "el diámetro menor.");
        System.out.print("Ingresa el diámetro mayor: ");
        diagonales.setLong1(rd.nextDouble());
        System.out.print("Ingresa el diámetro menor: ");
        diagonales.setLong2(rd.nextDouble());
        System.out.printf("\nEl perímetro del rombo es de %.2f  u.\n",
                (2 * Math.sqrt(Math.pow(diagonales.getLong1(), 2)
                        + Math.pow(diagonales.getLong2(), 2))));
        System.out.printf("\nEl área del rombo es de %.2f  u2.\n",
                (diagonales.getLong1() * diagonales.getLong2() / 2));
    }

}
