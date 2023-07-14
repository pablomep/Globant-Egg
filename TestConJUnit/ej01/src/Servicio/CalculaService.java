package Servicio;
// @author Pablo
import Entidad.Descuentos;

public class CalculaService {
    Descuentos desc = new Descuentos();
    public double calculaDescuento(double precio, int descuento){
        desc.precio = precio;
        desc.descuento = descuento;
        if (desc.descuento>50) {
            System.out.println("El descuento ingresado es muy alto, el descuento maximo es 50%");
            desc.descuento=50;
        }
        double precioDescontado = (desc.precio - (desc.precio * desc.descuento)/100);
        return precioDescontado;
    }

}
