package bd_final;
import java.util.ArrayList;
import java.util.Calendar;


public class Persona {
    //Atributos    
    protected int rut;
    protected String nombre;
    protected String apellido;
    protected int genero;
    protected Calendar fechaNacimiento;
    protected ArrayList<String> telefonos;
    protected ArrayList<String> mails;

    //Constructores
    public Persona(int rut, String nombre, String apellido, int genero, Calendar fechaNacimiento, ArrayList<String> telefonos, ArrayList<String> mails) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.telefonos = telefonos;
        this.mails = mails;
    }


    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<String> getMails() {
        return mails;
    }

    public void setMails(ArrayList<String> mails) {
        this.mails = mails;
    }
    
    
 
}
