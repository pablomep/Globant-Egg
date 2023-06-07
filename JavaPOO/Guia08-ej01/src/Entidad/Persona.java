package Entidad;
// @author Pablo

public class Persona {

    public String nombre;
    public int edad;
    public String genero;

    public Persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(int edad, String genero) {
        this.edad = edad;
        this.genero = genero;
    }

}
