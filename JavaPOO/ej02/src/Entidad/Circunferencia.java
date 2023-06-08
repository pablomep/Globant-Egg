package Entidad;
// @author Pablo
import java.lang.Math;
public class Circunferencia {
    
    private double radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void area(double radio){
        
        System.out.println("El área de la circunferencia es: "+(Math.pow(radio,2)*Math.PI));
    }
    public void perimetro(double radio){
                
        System.out.println("El perímetro de la circunferencia es: "+(2*radio*Math.PI));
    }
    
}
