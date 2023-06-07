package Servicio;
// @author Pablo
import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    Scanner rd=new Scanner(System.in);
    
    public Persona crearPersona() {
        
        Persona personaCompleta = new Persona();
        System.out.print("Ingrese el nombre de la persona: ");
        personaCompleta.setNombre(rd.next());
        return personaCompleta;
    }
   
}
