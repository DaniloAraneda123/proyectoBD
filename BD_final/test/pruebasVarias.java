import control.validarDatos;
import org.junit.Test;
import static org.junit.Assert.*;
public class pruebasVarias 
{
    @Test
    public void pruebaRut0() 
    {
        String rut="19.924.239-3";
        boolean resultado=validarDatos.validarRut(rut);
        System.out.println(rut);
        assertEquals(true,resultado);
    }
}
