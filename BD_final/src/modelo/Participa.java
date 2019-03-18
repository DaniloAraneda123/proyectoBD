package modelo;

import java.util.Date;

public class Participa {
     private String rutPersona;
     private String Hora;
     private Date Fecha;
     private int idIglesia;
     private String tipoTarea;
     private int idSector;
     private String rol;

    public Participa(String rutPersona, String Hora, Date Fecha, int idIglesia, String tipoTarea, int idSector, String rol) {
        this.rutPersona = rutPersona;
        this.Hora = Hora;
        this.Fecha = Fecha;
        this.idIglesia = idIglesia;
        this.tipoTarea = tipoTarea;
        this.idSector = idSector;
        this.rol = rol;
    }
     
    public String getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdIglesia() {
        return idIglesia;
    }

    public void setIdIglesia(int idIglesia) {
        this.idIglesia = idIglesia;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public int getIdSector() {
        return idSector;
    }

    public void setIdSector(int idSector) {
        this.idSector = idSector;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
     
      
              
}
