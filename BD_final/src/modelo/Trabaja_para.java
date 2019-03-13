
package modelo;

public class Trabaja_para {
   private int idIglesia;
   private String rutPastor;

    public Trabaja_para(int idIglesia, String rutPastor) {
        this.idIglesia = idIglesia;
        this.rutPastor = rutPastor;
    }
   
    public int getIdIglesia() {
        return idIglesia;
    }

    public void setIdIglesia(int idIglesia) {
        this.idIglesia = idIglesia;
    }

    public String getRutPastor() {
        return rutPastor;
    }

    public void setRutPastor(String rutPastor) {
        this.rutPastor = rutPastor;
    }
   
   
}
