package bd_final;

import java.util.Calendar;

public class Servidor
{
    
    private int rut;
    private String nombre;
    private String apellido;
    private int genero;
    private Calendar fechaNacimiento;
    private String especialidad;
    private int iglesia;
    
    public Servidor()
    {
        
    }

    public Servidor(int rut, String nombre, String apellido, int genero, Calendar fechaNacimiento, String especialidad, int iglesia) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
        this.iglesia = iglesia;
    }

    public void setRut(int rut) {
        this.rut = rut;
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

    public int getIglesia() {
        return iglesia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
