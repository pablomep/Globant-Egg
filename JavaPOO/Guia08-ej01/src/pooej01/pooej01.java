package pooej01;
// @author Pablo
import Servicio.PersonaService;
import Entidad.Persona;
public class pooej01 {

    public static void main(String[] args) {
        PersonaService persServ = new PersonaService();
        //Persona p1=new Persona();
        Persona p1= persServ.crearPersona();
        
        System.out.print("El nombre escrito es: ");
        System.out.println(p1.getNombre());
        

    }

    //Funciones o procedimientos ->>

}
