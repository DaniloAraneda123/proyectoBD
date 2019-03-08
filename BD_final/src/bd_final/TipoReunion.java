package bd_final;

public class TipoReunion 
{
    
    private char Genero;
    private int edadMax;
    private int edadMin;
    private String nombre;

    public TipoReunion(char Genero, int edadMax, int edadMin, String nombre) {
        this.Genero = Genero;
        this.edadMax = edadMax;
        this.edadMin = edadMin;
        this.nombre = nombre;
    }

    public char getGenero() {
        return Genero;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public String getNombre() {
        return nombre;
    }
    
}
