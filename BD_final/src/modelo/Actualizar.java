
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Actualizar 
{
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public Actualizar(Connection cn) 
    {
        this.cn=cn;
    }
   
    
    
    public boolean actualizarDescripcion(String descripcion, Junta junta)
    {
        try{

            PreparedStatement pstmt=cn.prepareStatement("UPDATE junta SET descripcion=? WHERE fecha=? AND id_iglesia=? AND hora=?" );
            pstmt.setString(1,junta.getDescripcion());
            pstmt.setDate(2,new java.sql.Date(junta.getFecha().getTime()));
            pstmt.setInt(3,junta.getIglesia());
            pstmt.setString(4,junta.getHoraInicio() );
            int i=pstmt.executeUpdate();
            if(i==0)
            {
                return false;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error en la Consulta");
            return false;
        }
        return true;
    }
}
