package Entidad;
// @author Pablo
public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldoActual, interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, long DNI, float interes) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.DNI = DNI;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual + ", DNI=" + DNI + ", interes=" + interes + '}';
    }
    
    

}
