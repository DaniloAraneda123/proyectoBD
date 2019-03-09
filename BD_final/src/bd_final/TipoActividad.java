
package bd_final;


public class TipoActividad {
     
    private String tipo;
    private String especialidad;
     
    public TipoActividad (String tipo , String especialidad) {
        this.tipo = tipo;
        this.especialidad = especialidad;
    }
   
    public String getTipo() {
        return tipo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setTipo( String tipo ) {
        this.tipo = tipo;
    }

    public void setEspecialidad (String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    @Override
    public String toString() {
        return "Tipo=  " + tipo + " Especialidad= " + especialidad;
    }

}



    
