package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Servidor extends Persona
{
    private String especialidad;
    private int iglesia;
    
    public Servidor (String rut, String nombre, String apellido, int genero, Date fechaNacimiento, ArrayList<String> telefonos, ArrayList<String> mails , int idIglesia , String especialidad) {
     super(rut,nombre,apellido,genero,fechaNacimiento,telefonos,mails);
     this.iglesia = idIglesia;
     this.especialidad = especialidad;
    }

    public Servidor(String string, String string0, String string1, int aInt, Date fecha, String string2, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Servidor() {
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
