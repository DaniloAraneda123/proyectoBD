package bd_final;

public class TipoReunion 
{
    
    private int genero;
    private int edadMax;
    private int edadMin;
    private String nombre;

    public TipoReunion(int genero, int edadMax, int edadMin, String nombre) {
        this.genero = genero;
        this.edadMax = edadMax;
        this.edadMin = edadMin;
        this.nombre = nombre;
    }

    public int getGenero() {
        return genero;
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

    @Override
    public String toString() {
        return "Nombre= " + nombre + " Edad= " + edadMin + " - " + edadMax + " Género= " + genero;
    }
    
}
