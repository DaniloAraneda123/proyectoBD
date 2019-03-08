package bd_final;

public class Iglesia {
    
    private int numero;
    private int id;
    private String calle;
    private String region;

    public Iglesia( String string, String string0, int aInt0) 
    {
        region=string;
        calle=string0;
        numero=aInt0;
    }
    
    public Iglesia(int aint, String string, String string0, int aInt0) 
    {
        region=string;
        calle=string0;
        numero=aInt0;
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
    
    @Override
    public String toString()
    {
        return id+" "+region+" "+calle+"  N "+numero;
    }
}
