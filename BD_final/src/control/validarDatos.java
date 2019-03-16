package control;

public class validarDatos 
{
    
   public static boolean validarRut(String rut)
   {
        boolean resultado=true;
        int sum = 0, factor = 2;
        while(rut!=0)
        {
            sum += (rut%10)*factor;
            rut/=10;
            factor = factor==7 ? 2 : factor+1;
        }
        int res= 11-sum%11;
        
        return ((dv=='k'||dv=='K')&& res==10) || (dv=='0'&&res==11) || ((int)dv-48==res);
   }
   
   //////////////////////////////////////////////////////////////////////
   
   public static boolean isNumero(String numero)
   {
       boolean resultado=true;
       
       return resultado;
   }
   
   //////////////////////////////////////////////////////////////////////
   
   
   public static boolean validarRut()
   {
       boolean resultado=true;
       
       return resultado;
   }
}
