package modelo;
import java.util.Date;


public abstract class  Persona {
    //Atributos    
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected int genero;
    protected Date fechaNacimiento;

    //Constructores
    public Persona(String rut, String nombre, String apellido, int genero, Date fechaNacimiento) 
    {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona()
    {
        
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
 
}
