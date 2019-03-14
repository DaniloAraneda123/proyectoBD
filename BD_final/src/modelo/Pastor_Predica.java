package modelo;



Public class Pastor_Predica {


    private Date fecha;
    private String hora;
    private String Rut_pastor;
    private String Rol;

    public Pastor_Predica(Date fecha, String hora, String rut_pastor, String rol) {
        this.fecha = fecha;
        this.hora = hora;
        Rut_pastor = rut_pastor;
        Rol = rol;
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
        return Rut_pastor;
    }

    public void setRut_pastor(String rut_pastor) {
        Rut_pastor = rut_pastor;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
}