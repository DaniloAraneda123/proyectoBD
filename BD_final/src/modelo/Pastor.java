package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Pastor extends Persona
{
    private int jerarquia;

    public Pastor (String rut, String nombre, String apellido, int genero, Date fechaNacimiento, int jerarquia) 
    {
        super(rut,nombre,apellido,genero,fechaNacimiento);
        this.jerarquia = jerarquia;
    }

    public Pastor() {
    }

    public Pastor(String rut, String nombre, String apellido) 
    {
        this.rut=rut;
        this.nombre=nombre;
        this.apellido=apellido;
    }
 
    public int getJerarquia() {
        return jerarquia;
    }
    
    @Override
    public String toString() {
        return  "rut:" + rut + ";" + nombre + " " + apellido ;
    }
    
}
