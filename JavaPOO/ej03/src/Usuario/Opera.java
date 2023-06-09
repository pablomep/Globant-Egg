package Usuario;
// @author Pablo
//import Entidad.Operacion;
import Servicio.OperServicio;
public class Opera {

    public static void main(String[] args) {
        OperServicio op = new OperServicio();
        
        op.crearOperacion();
        
        System.out.println(op.sumar());
        System.out.println(op.restar());
        System.out.println(op.multiplicar());
        System.out.println(op.dividir());
        //System.out.println("Suma: "+op.sumar());
        //System.out.println("Resta: "+op.restar());
    }

}
