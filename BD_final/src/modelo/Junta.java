package modelo;

import java.util.Date;

public class Junta {
    
    private Date fecha;
    private String nombreReunion;
    private String horaInicio;
    private String horaTermino;    
    private String descripcion;
    private int iglesia;
    
    public Junta(Date fecha, String reunion,String horaInicio , String horaTermino , String descripcion , int iglesia) {
        this.fecha = fecha;
        this.nombreReunion = reunion;
        this.iglesia = iglesia;
        this.horaInicio = horaInicio;
        this.descripcion = descripcion;
        this.horaTermino = horaTermino;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getReunion() {
        return nombreReunion;
    }

    public int getIglesia() {
        return iglesia;
    }
    
    public String getHoraInicio() {
       return horaInicio;
    }

    public String getHoraTermino() {
       return horaTermino;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setReunion(String Reunion) {
        this.nombreReunion = Reunion;
    }

    public void setIglesia(int iglesia) {
        this.iglesia = iglesia;
    }
    
    public void setHoraInicio ( String horaInicio ) {
        this.horaInicio = horaInicio;
    }
    
   
    public void setHoraTermino (String horaTermino) {
       this.horaTermino = horaTermino;
    }

    
    public String getDescripcion () {
       return descripcion;
    }
    
    public void setDescripcion (String descripcion) {
       this.descripcion = descripcion;
    }
    
    
    @Override
    public String toString() {
        return "Reunion= " + nombreReunion +" Fecha= "+fecha + " " + horaInicio + " : " + horaTermino;
    }
    
}
