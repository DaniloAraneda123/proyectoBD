package modelo.resultadosEsp;

public class Con3 {

    private int mes;
    private String nombreReunion;
    private int contador;
    
    public Con3(String nombreReunion, int contador, int mes) 
    {
        this.mes=mes;
        this.contador=contador;
        this.nombreReunion=nombreReunion;
    }

    public int getMes() {
        return mes;
    }

    public String getNombreReunion() {
        return nombreReunion;
    }

    public int getContador() {
        return contador;
    }
    
}
