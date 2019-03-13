package llenarbd;

import java.sql.Date;


public class datosJunta 
{
    
    public String hora;
    public Date fecha;
    public int id;

    datosJunta(Date date, String string, int aInt) 
    {
        this.hora=string;
        this.fecha=date;
        this.id=aInt;
    }
    
}
