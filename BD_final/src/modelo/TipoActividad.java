
package modelo;

import java.util.ArrayList;


public class TipoActividad {
     
    private String tipo;
    private ArrayList<String> especialidad;
     
    public TipoActividad (String tipo , ArrayList<String> especialidad) {
        this.tipo = tipo;
        this.especialidad = especialidad;
    }
    
    public TipoActividad (String tipo , String especialidad) {
        this.tipo = tipo;
        this.especialidad = new ArrayList<String>();
        this.especialidad.add(especialidad);
    }
   
    public String getTipo() {
        return tipo;
    }

    public ArrayList<String> getEspecialidad() {
        return especialidad;
    }

    public void setTipo( String tipo ) {
        this.tipo = tipo;
    }

    public void setEspecialidad (ArrayList<String> especialidad) {
        this.especialidad = especialidad;
    }
    
    
    @Override
    public String toString() {
        return "Tipo=  " + tipo + " Especialidad= " + especialidad;
    }

}



    
