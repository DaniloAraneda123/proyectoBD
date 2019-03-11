package llenarbd;

public class GeneradorRuts 
{
    public static String generadorRut()
    {
        int numero = (int) (Math.random()*14000000)+ 5000000 ;
        char dv=digitoVerificador(numero);
        String rut=String.valueOf(numero);
        rut.concat(String.valueOf(dv));
        return rut;
    }
            
    ///////////////////////////////////////////////////////////////////
    /**
     * @param rut
     * @return retorna el digito verificador
     */
    public static char digitoVerificador(int rut)
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
            return 'K';
        }
        if(res==11)
        {
            return '0';
        }
        return (char)res;
    }
}
