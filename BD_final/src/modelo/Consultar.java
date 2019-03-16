package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Consultar {
    
    Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String bd = "postgres";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String user = "postgres";
    private String pass = "";
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Consultar()
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            cn=DriverManager.getConnection(this.url+this.bd+"?currentSchema=bd_prueba", this.user, this.pass);
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void cerrarConexion() 
    {
        try {
            cn.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex+" Error al cerrar Conexion");
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Servidor buscarPersona(String rut)
    {
        Servidor persona=null;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido1,genero,especialidad,fechaNacimiento,iglesia FROM persona WHERE rut=?");   
            pstmt.setString(1, rut);
            rs=pstmt.executeQuery();
            persona=new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),rs.getInt("genero"),rs.getDate("fechaNacimiento"),rs.getString("especialidad"),rs.getInt("iglesia"));
            rs.close();
            pstmt.close();
            
            pstmt = cn.prepareStatement("SELECT email FROM correo WHERE rut=?");  
            pstmt.setString(1, rut);
            rs=pstmt.executeQuery();
            ArrayList<String> mails=new ArrayList();
            while(rs.next())
            {
                mails.add(rs.getString("email"));
            }
            persona.setMails(mails);
            rs.close();
            pstmt.close();
            
            pstmt = cn.prepareStatement("SELECT numero FROM telefono WHERE rut=?");  
            pstmt.setString(1, rut);
            rs=pstmt.executeQuery();
            ArrayList<String> telefonos=new ArrayList();
            while(rs.next())
            {
                telefonos.add(rs.getString("email"));
            }
            persona.setTelefonos(telefonos);
            rs.close();
            pstmt.close();
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
            persona=null;
        }
        return persona;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Iglesia> obtenerIglesias()
    {
        ArrayList<Iglesia> resultado=new ArrayList<>();
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT * FROM iglesia"); 
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                resultado.add(new Iglesia(rs.getInt("id"),rs.getString("region"),rs.getString("comuna"),rs.getString("calle"),rs.getInt("numero")));
            }
            rs.close();
            pstmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Junta> juntasSemanales(java.util.Date desde,java.util.Date hasta,int idIglesia)
    {
        ArrayList<Junta> resultado=new ArrayList<>();
        Junta p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT fecha ,horaInicio, horaTermino, nombreReunion FROM Junta "
                    + "WHERE Fecha >= ? and Fecha <= ? and Id_iglesia = ?"); 
            java.sql.Date date1 = new java.sql.Date(desde.getTime());
            java.sql.Date date2 = new java.sql.Date(hasta.getTime());
            pstmt.setDate(1, date1);
            pstmt.setDate(2, date2);
            pstmt.setInt(3, idIglesia);
            rs=pstmt.executeQuery();
            pstmt.close();
            Date dt;
            while(rs.next()) 
            {
                dt=new Date(rs.getDate("fecha").getTime());
                p=new Junta(dt,rs.getString("Nombre_Reunion"), rs.getString("horaInicio"),rs.getString("descripcion"),idIglesia);
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Servidor> servidoresIglesia(String idIglesia)
    {
        ArrayList<Servidor> resultado=new ArrayList<>();
        Servidor p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido1,genero,especialidad,fechaNacimiento,iglesia FROM persona WHERE iglesia=?");
            pstmt.setString(1, idIglesia);
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                p=new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido1"),rs.getInt("genero"),rs.getDate("fechaNacimiento"),rs.getString("especialidad"),rs.getInt("iglesia"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Sector> obtenerSectores(int id)
    {
        ArrayList<Sector> resultado=new ArrayList<>();
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("SELECT id_iglesia,id_sector,nombre,capacidad FROM sector WHERE id_iglesia=?");
            pstmt.setInt(1, id);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                resultado.add(new Sector(rs.getInt("id_sector"),rs.getString("nombre"),rs.getInt("capacidad")));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
            resultado=null;
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<TipoReunion> tipoReuniones()
    {
        ArrayList<TipoReunion> resultado=new ArrayList<>();
        TipoReunion p;
        char c;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT Nombre ,EdadMin ,EdadMax,Genero FROM Tipo_Reunion"); 
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                if(rs.getInt("Genero")==1)
                {
                    c='M';
                }
                else
                {
                    c='F';
                }
                p=new TipoReunion(c,rs.getInt("EdadMax"),rs.getInt("EdadMin"),rs.getString("Nombre"));
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
