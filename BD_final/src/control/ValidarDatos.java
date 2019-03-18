package control;

public class ValidarDatos 
{
    /**
     * Comprueba si la el rut es valido ,no suprime caractere '.' '-' ' ' 
     * @param rut rut a comprobar
     * @return true si es valido
     */
   public static boolean validarRut(String rut)
   {
        boolean resultado=true;
        rut =rut.toUpperCase();
        rut =rut.replace(" ", "");
        rut =rut.replace(".", "");
        rut =rut.replace("-", "");
        char dv=rut.charAt(rut.length()-1);
        int rutAux = Integer.parseInt(rut.substring(0,rut.length()-1));
        
        
        int sum = 0, factor = 2;
        while(rutAux!=0)
        {
            sum += (rutAux%10)*factor;
            rutAux/=10;
            factor = factor==7 ? 2 : factor+1;
        }
        int res= 11-sum%11;
        return ((dv=='k'||dv=='K')&& res==10) || (dv=='0'&&res==11) || ((int)dv-48==res);
   }
   
   //////////////////////////////////////////////////////////////////////
   
   public static boolean isNumero(String numero)
   {
       boolean resultado=true;
       try{
           
       }
       catch(Exception ex)
       {
       }
       
       return resultado;
   }
   
   //////////////////////////////////////////////////////////////////////
   
   
   public static boolean validarRut()
   {
       boolean resultado=true;
       
       return resultado;
   }
}
