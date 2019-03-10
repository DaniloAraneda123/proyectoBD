package bd_final;

import java.util.Calendar;
import java.util.ArrayList;
public class Pastor 
{
    
    private int rut;
    private String nombre;
    private String apellido;
    private int genero;
    private Calendar fechaNacimiento;
    private String especialidad;
    private int jerarquia;
    private ArrayList<String> telefonos;
    private ArrayList<String> mails;

    public void setRut(int rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getGenero() {
        return genero;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    @Override
    public String toString() {
        return  "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido ;
    }
    
}
