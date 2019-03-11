package modelo;
import java.util.Calendar;
import java.util.ArrayList;

public class Servidor extends Persona
{
    private String especialidad;
    private int iglesia;
    
    public Servidor (String rut, String nombre, String apellido, int genero, Calendar fechaNacimiento, ArrayList<String> telefonos, ArrayList<String> mails , int idIglesia , String especialidad) {
     super(rut,nombre,apellido,genero,fechaNacimiento,telefonos,mails);
     this.iglesia = idIglesia;
     this.especialidad = especialidad;
    }

    Servidor(String string, String string0, String string1, int aInt, Calendar fecha, String string2, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Servidor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public String getEspecialidad() {
        return especialidad;
    }

    public int getIglesia() {
        return iglesia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setIglesia(int iglesia) {
        this.iglesia = iglesia;
    }

    @Override
    public String toString() {
        return "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido;
    }

    
}
