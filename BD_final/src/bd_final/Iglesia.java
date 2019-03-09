package bd_final;

public class Iglesia {
    
    private int numero;
    private int id;
    private String calle;
    private String region;
    private String comuna;  

    public Iglesia( String string, String string0, String string1,int aInt0) 
    {
        region=string;
        calle=string0;
        numero=aInt0;
        comuna = string1;
    }
    
    public Iglesia(int aint, String string, String string1 ,String string0, int aInt0 ) 
    {
        region=string;
        calle=string0;
        numero=aInt0;
        comuna =string1;
        id=aint;   
    }

    public int getNumero() {
        return numero;
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getRegion() {
        return region;
    }
    
    public String getComuna() {
       return comuna;
    }
    
    @Override
    public String toString()
    {
        return id+" "+region+" "+calle+" " + comuna + "  # "+numero;
    }
}
