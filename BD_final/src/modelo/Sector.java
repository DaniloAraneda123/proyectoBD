
package modelo;

public class Sector {

    private String tipo;
    private int capacidad;
    private int id;
    private int idIglesia;
    
    public Sector (int id , String tipo , int capacidad,int idIglesia) {
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.idIglesia = idIglesia;
    }

    public int getIdIglesia() {
        return idIglesia;
    }

    public void setIdIglesia(int idIglesia) {
        this.idIglesia = idIglesia;
    }
    
    public int getId () {
       return id;
    }
    
    public int getCapacidad () {
      return capacidad;
    }
    
    public String getTipo () {
       return tipo;
    }
    
    public void setId (int id) {
     this.id = id;
    }
    
    public void setCapacidad (int capacidad) {
      this.capacidad = capacidad;
    }
    
    public void setTipo (String tipo) {
       this.tipo = tipo;
    }
    
    
    @Override
    public String toString() {
      return "Tipo= " + tipo + " Capacidad= " + capacidad  ;
    }
}
