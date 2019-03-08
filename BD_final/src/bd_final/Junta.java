package bd_final;

import java.util.Date;

public class Junta {
    
    private Date fecha;
    private String Reunion;
    private int iglesia;
    
    public Junta(Date fecha, String Reunion, int iglesia) {
        this.fecha = fecha;
        this.Reunion = Reunion;
        this.iglesia = iglesia;
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setReunion(String Reunion) {
        this.Reunion = Reunion;
    }

    public void setIglesia(int iglesia) {
        this.iglesia = iglesia;
    }

    @Override
    public String toString() {
        return "Reunion= " + Reunion +"Fecha= "+fecha;
    }
    
}
