package Servicio;
// @author Pablo
import Entidad.Cuenta;
import java.util.Scanner;
public class CuentaSRV {
    
    Cuenta ct=new Cuenta();
    Scanner rd=new Scanner(System.in);

    public void crearCuenta(){
        int a = 10000000;                               //Dimensiona los valores aleatorios
        ct.setNumeroCuenta((int) Math.floor(Math.random() * a));
        System.out.println("No. de cuenta: "+ct.getNumeroCuenta());
        System.out.print("Ingresa el número de tu DNI: ");
        ct.setDNI(rd.nextLong());
        System.out.println("¡Cuenta creada!");
    }
    
    public void Ingresar(double ingreso){
        //Cuenta ct=new Cuenta();
        
        ct.setSaldoActual(ct.getSaldoActual()+ingreso);
        
        System.out.println("El saldo actualizado es de "+ct.getSaldoActual());
    }
    public void Retirar(double retiro){
        
        double saldo = ct.getSaldoActual();
        if (retiro > saldo) {
            System.out.println("No puedes retirar una cantidad mayor a tu saldo.");
        } else {
            ct.setSaldoActual(saldo - retiro);
            System.out.println("El saldo actualizado es de " + ct.getSaldoActual());
        }
    }
    public void extraccionRapida() {
        double saldo = ct.getSaldoActual();

        System.out.println("Solo puedes retirar hasta el 20% del saldo.");
        System.out.println("Digita la cantidad a retirar");
        double retiro = rd.nextDouble();
        while (retiro > (saldo * 0.2)) {
            System.out.println("Cantidad ingresada excede la permitida. Ingresa un monto menor");
            retiro = rd.nextDouble();
        }
        ct.setSaldoActual(saldo - retiro);
        System.out.println("El saldo actualizado es de " + ct.getSaldoActual());

    }
    public void consultarSaldo(){
        System.out.println("El saldo actual de tu cuenta es de " + ct.getSaldoActual());
    }
    public void consultarDatos(){        
        System.out.println("Datos de la cuenta: "+ct);
    }

}
