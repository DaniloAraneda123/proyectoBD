
package bd_final;

public class Sectores {

    String tipo;
    int capacidad;
    int id;
    
    public Sectores (int id , String tipo , int capacidad) {
        this.id = id;
        this.tipo = tipo;
        this.capacidad = capacidad;
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
