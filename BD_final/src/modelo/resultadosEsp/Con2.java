/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.resultadosEsp;

/**
 *
 * @author Niapi
 */
public class Con2 {
    
    private String rut;
    private String nombre;
    private String apellido;
    private String nombreActividad;
    

    public Con2(String rut, String nombre, String apellido, String nombreActividad) {
          this.rut=rut;
          this.nombre=nombre;
          this.apellido=apellido;
          this.nombreActividad=nombreActividad;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }
    
}
