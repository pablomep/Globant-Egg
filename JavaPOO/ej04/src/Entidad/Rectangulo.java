package Entidad;
// @author Pablo
public class Rectangulo {
    private int base, altura;
    

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void calculaArea() {
        System.out.println("\nEl área del rectángulo es: "+getBase()*getAltura()+" unidades cuadradas.");
    }
    
    public void calculaPerimetro() {
        System.out.println("\nEl perímetro del rectángulo es: "+(getBase()+getAltura())*2+" unidades lineales.");
    }
    
    public void imprimeRectangulo() {
        System.out.println();
        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getBase(); j++) {
                if (i==0 || i==getAltura()-1) {
                    System.out.print(" *");
                }else{
                    if (j==0 || j==getBase()-1) {
                        System.out.print(" *");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
