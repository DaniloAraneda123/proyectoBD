package bd_final;

import java.util.Date;

public class Junta {
    
    private Date fecha;
    private String Reunion;
    private String horaInicio;
    private String horaTermino;       
    private int iglesia;
    
    public Junta(Date fecha, String Reunion,String horainicio , String horaTermino ,int iglesia) {
        this.fecha = fecha;
//        this.Reunion = Reunion;
        this.iglesia = iglesia;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getReunion() {
        return Reunion;
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
        this.Reunion = Reunion;
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

    @Override
    public String toString() {
        return "Reunion= " + Reunion +" Fecha= "+fecha + " " + horaInicio + " : " + horaTermino;
    }
    
}
