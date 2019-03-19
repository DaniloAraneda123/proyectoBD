package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Servidor extends Persona
{
    private String especialidad;
    private int iglesia;
    private ArrayList<String> telefonos;
    private ArrayList<String> mails;
    
    public Servidor (String rut, String nombre, String apellido, int genero, Date fechaNacimiento, ArrayList<String> telefonos, ArrayList<String> mails , int idIglesia , String especialidad) {
     super(rut,nombre,apellido,genero,fechaNacimiento);
     this.iglesia = idIglesia;
     this.especialidad = especialidad;
     this.mails=mails;
     this.telefonos=telefonos;
    }

    public Servidor(String rut, String nombre, String apellido, int genero, Date fechaNacimiento, String especilidad, int idIglesia) 
    {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.iglesia = idIglesia;
        this.especialidad = especialidad;
    }

    public Servidor() {} ///// Constructor Vacio

    public Servidor(String rut, String nombre, String apellido) 
    {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido=apellido;
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
        return "rut : " + this.rut + " - " +this.nombre +" "+ this.apellido;
    }
    
    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public void setMails(ArrayList<String> mails) {
        this.mails = mails;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public ArrayList<String> getMails() {
        return mails;
    } 
}
