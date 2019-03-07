package bd_final;

class Iglesia {
    
    private int numero;
    private int id;
    private String calle;
    private String region;

    public Iglesia(int aInt, String string, String string0, int aInt0) 
    {
        id=aInt;
        region=string;
        calle=string0;
        numero=aInt0;
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
    
}
