package modelo;
import java.util.Date;

public class PastorPredica
{
    private Date fecha;
    private String hora;
    private String rut_pastor;
    private String rol;
    private int idIglesia;

    public PastorPredica(Date fecha, String hora, String rut_pastor, String rol,int idIglesia) {
        this.fecha = fecha;
        this.hora = hora;
        this.rut_pastor = rut_pastor;
        this.rol = rol;
        this.idIglesia=idIglesia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getRut_pastor() {
        return rut_pastor;
    }

    public void setRut_pastor(String rut_pastor) {
        rut_pastor = rut_pastor;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        rol = rol;
    }

    public int getId() {
        return idIglesia;
    }
    
    public void setId(int idIglesia) {
        this.idIglesia=idIglesia;
    }
}