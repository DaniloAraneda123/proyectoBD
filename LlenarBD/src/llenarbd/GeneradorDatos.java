package llenarbd;

import java.util.ArrayList;

public class GeneradorDatos 
{
    public static String generadorRut()
    {
        int numero = (int) (Math.random()*14000000)+ 5000000 ;
        String dv=digitoVerificador(numero);
        String rut=String.valueOf(numero);
        rut=rut.concat(String.valueOf(dv));
        return rut;
    }
            
    ///////////////////////////////////////////////////////////////////
    
    public static String digitoVerificador(int rut)
    {
        int sum = 0, factor = 2;
        while(rut!=0)
        {
            sum += (rut%10)*factor;
            rut/=10;
            factor = factor==7 ? 2 : factor+1;
        }
        int res= 11-sum%11;
        if(res==10)
        {
            return String.valueOf('k');
        }
        if(res==11)
        {
            return String.valueOf('0');
        }
        return String.valueOf(res);
    }
    
    ///////////////////////////////////////////////////////////////////
    
    private String[] sectores={"Casino","Hall","Coro","Pulpito","Estacionamiento","uneteKid","multimedia"};
    public  ArrayList<Sector> generarSectores()
    {
        ArrayList<Sector> lista=new ArrayList<>();
        int j;
        for(int i=0;i<7;i++)
        {
            j=(int)(Math.random()*5) + 3;
            lista.add(new Sector(i,sectores[i], j));
        }
        return lista;
    }
}
