package Servicio;
// @author Pablo
import Entidad.Operacion;
import java.util.Scanner;
public class OperServicio {
    
    Scanner rd=new Scanner(System.in);
    Operacion nums=new Operacion();
    public Operacion crearOperacion(){
        //Operacion nums=new Operacion();
        int num1,num2;
        
        System.out.print("Ingresa un número: ");
        num1= rd.nextInt();
        System.out.print("Ingresa otro número: ");
        num2= rd.nextInt();
        nums.setNumero1(num1);
        nums.setNumero2(num2);
        
        return nums;
    }
    
    public int sumar(){
        return nums.getNumero1()+nums.getNumero2();
    }
    
    public int restar(){
        return nums.getNumero1()-nums.getNumero2();
    }
    
    public int multiplicar(){
        int n1=nums.getNumero1(),n2=nums.getNumero2();
        if (n1==0 || n2==0){
            System.out.println("Error. Al menos uno de los números es cero.");
            return 0;
        }else{
            return n1*n2;
        }
        
    }
    public double dividir(){
        int n1=nums.getNumero1(),n2=nums.getNumero2();
        
        if (n2==0){
            System.out.println("Error. No es posible la división entre cero.");
            return 0;
        }else{
            return n1/(double)n2;
        }
    }
}
