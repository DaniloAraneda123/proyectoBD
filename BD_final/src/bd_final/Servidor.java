package bd_final;
import java.util.Calendar;
import java.util.ArrayList;

public class Servidor extends Persona
{
    private String especialidad;
    private int iglesia;
    
    public Servidor (int rut, String nombre, String apellido, int genero, Calendar fechaNacimiento, ArrayList<String> telefonos, ArrayList<String> mails , int idIglesia , String especialidad) {
     super(rut,nombre,apellido,genero,fechaNacimiento,telefonos,mails);
     this.iglesia = idIglesia;
     this.especialidad = especialidad;
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
