package bd_final;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Operaciones 
{
    
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String bd = "";
    private String url = "";
    private String user = "";
    private String pass = "";
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     */
    public Operaciones()
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            cn=DriverManager.getConnection(this.url+this.bd, this.user, this.pass);
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @param s
     * @return 
     */
    public boolean insertarPersona(Servidor s)
    {
        boolean resultado=true;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("INSERT INTO persona (rut,nombre,apellido1,genero,especialidad,fechaNacimiento,iglesia) VALUES(?,?,?,?,?,?,?);");   
            pstmt.setInt(1, s.getRut());
            pstmt.setString(2, s.getNombre());
            pstmt.setString(3, s.getApellido());
            pstmt.setString(4,String.valueOf(s.getGenero()));
            pstmt.setString(5,s.getEspecialidad());
            pstmt.setDate(6,new java.sql.Date(s.getFechaNacimiento().getTimeInMillis()));
            pstmt.setInt(7,s.getIglesia());
            pstmt.execute();
            pstmt.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
            resultado=false;
        }
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @param rut
     * @return 
     */
    public Servidor buscarPersona(int rut)
    {
        Servidor persona=null;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido1,genero,especialidad,fechaNacimiento,iglesia FROM persona WHERE rut=?");   
            pstmt.setInt(1, rut);
            rs=pstmt.executeQuery();
            pstmt.close();
            Calendar fecha=Calendar.getInstance();
            fecha.setTime(rs.getDate("fechaNacimiento"));
            persona=new Servidor(rs.getInt("rut"),rs.getString("nombre"),rs.getString("apellido1"),rs.getInt("genero"),fecha,rs.getString("especialidad"),rs.getInt("iglesia"));
            rs.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
            persona=null;
        }
        return persona;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @return 
     */
    public ArrayList<Iglesia> obtenerIglesias()
    {
        ArrayList<Iglesia> resultado=new ArrayList<Iglesia>();
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT * FROM iglesia"); 
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                resultado.add(new Iglesia(rs.getInt("id"),rs.getString("region"),rs.getString("calle"),rs.getInt("numero")));
            }
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @return 
     */
    public ArrayList<Servidor> servidoresSemanales(java.util.Date desde,java.util.Date hasta)
    {
        ArrayList<Servidor> resultado=new ArrayList<Servidor>();
        Servidor p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT DISTINCT Rut , Nombre , Apellido1 FROM persona,participa "
                    + "WHERE  rut = rutPersona and fecha >= ? and fecha <= ? and Id = ?"); 
            java.sql.Date date1 = new java.sql.Date(desde.getTime());
            java.sql.Date date2 = new java.sql.Date(hasta.getTime());
            pstmt.setDate(1, date1);
            pstmt.setDate(2, date2);
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                p=new Servidor();
                p.setApellido(rs.getString("apellido1"));
                p.setNombre(rs.getString("nombre"));
                p.setRut(rs.getInt("rut"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @return 
     */
    public ResultSet cantidadReuniones(int anio)
    {
        try
        {
            PreparedStatement pstmt = cn.prepareStatement(" SELECT Nombre_reunion , count (*) , extract (Month from Fecha) as MES FROM junta WHERE EXTRACT ( YEAR FROM fecha ) = ? "
                    + "Group by Nombre_reunion , Mes");
            pstmt.setInt(1,anio);
            rs=pstmt.executeQuery();
            pstmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return rs;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @return 
     */
    public ArrayList<Servidor> participacionServidores()
    {
        ArrayList<Servidor> resultado=new ArrayList<Servidor>();
        Servidor p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT distinct Rut , Nombre , Apellido1 , NombreActividad FROM Persona , Participa WHERE Persona.Rut = Participa.RutPersona "
                    + "Order by NombreActividad");
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                p=new Servidor();
                p.setApellido(rs.getString("apellido1"));
                p.setNombre(rs.getString("nombre"));
                p.setRut(rs.getInt("rut"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @return 
     */
    public ArrayList<Servidor> ServidoresIglesia(int id)
    {
        ArrayList<Servidor> resultado=new ArrayList<Servidor>();
        Servidor p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT  Rut , Nombre , Apellido1  FROM persona  WHERE iglesia = ?");
            pstmt.setInt(1, id);
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                p=new Servidor();
                p.setApellido(rs.getString("apellido1"));
                p.setNombre(rs.getString("nombre"));
                p.setRut(rs.getInt("rut"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
}
