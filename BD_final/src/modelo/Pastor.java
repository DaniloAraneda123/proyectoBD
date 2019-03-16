package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Pastor extends Persona
{
    private int jerarquia;

     public Pastor (String rut, String nombre, String apellido, int genero, Date fechaNacimiento, ArrayList<String> telefonos, ArrayList<String> mails , int jerarquia) {
     super(rut,nombre,apellido,genero,fechaNacimiento,telefonos,mails);
     this.jerarquia = jerarquia;
    }

    public Pastor() {
    }
 
    public int getJerarquia() {
        return jerarquia;
    }
    
    @Override
    public String toString() {
        return  "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido ;
    }
    
}
