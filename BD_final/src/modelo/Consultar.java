package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Consultar {
    
    Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Consultar(Connection cn)
    {
        this.cn=cn;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Servidor buscarServidor(String rut)
    {
        Servidor persona=null;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido,genero,especialidad,fechaNacimiento,iglesia FROM servidor WHERE rut=?");   
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
                telefonos.add(rs.getString("numero"));
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
            PreparedStatement pstmt = cn.prepareStatement("SELECT fecha ,hora , descripcion, nombre_reunion FROM Junta "
                    + "WHERE fecha >= ? and fecha <= ? and id_iglesia = ?"); 
            java.sql.Date date1 = new java.sql.Date(desde.getTime());
            java.sql.Date date2 = new java.sql.Date(hasta.getTime());
            pstmt.setDate(1, date1);
            pstmt.setDate(2, date2);
            pstmt.setInt(3, idIglesia);
            rs=pstmt.executeQuery();
            Date dt;
            while(rs.next()) 
            {
                dt=new Date(rs.getDate("fecha").getTime());
                p=new Junta(dt,rs.getString("nombre_reunion"), rs.getString("hora"),rs.getString("descripcion"),idIglesia);
                resultado.add(p);
            }
            pstmt.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta juntasSemanales"+e);
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Servidor> servidoresIglesia(int idIglesia)
    {
        ArrayList<Servidor> resultado=new ArrayList<>();
        Servidor p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido,genero,especialidad,fechaNacimiento,iglesia_id FROM servidor WHERE iglesia_id=?");
            pstmt.setInt(1, idIglesia);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                resultado.add(new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),rs.getInt("genero"),
                        rs.getDate("fechanacimiento"),rs.getString("especialidad"),rs.getInt("iglesia_id")));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta servidoresIglesia"+e);
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Pastor> obtenerPastores(int idIglesia)
    {
        ArrayList<Pastor> resultado=new ArrayList<>();
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido,genero,fechanacimiento,jerarquia FROM pastor,trabaja_para "
                    + "WHERE rut=rut_pastor AND id_iglesia=?;");
            pstmt.setInt(1, idIglesia);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                resultado.add(new Pastor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),
                        rs.getInt("genero"),rs.getDate("fechaNacimiento"),rs.getInt("jerarquia")));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta obtenerPastores"+e);
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
                resultado.add(new Sector(rs.getInt("id_sector"),rs.getString("nombre"),rs.getInt("capacidad"),id));
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
            PreparedStatement pstmt = cn.prepareStatement("SELECT nombre ,edad_min ,edad_max,Genero FROM tipo_reunion"); 
            rs=pstmt.executeQuery();
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
                p=new TipoReunion(c,rs.getInt("edad_max"),rs.getInt("edad_min"),rs.getString("nombre"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
    
    public ArrayList<Pastor> pastoresJunta(Junta jt)
    {
        ArrayList<Pastor> resultado=new ArrayList<>();
        Pastor p;
        char c;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement(
                    "SELECT rut,nombre,apellido,genero,fechaNacimiento,jerarquia "+
                    "FROM pastor, pastor_predica "+
                    "WHERE rut=rut_pastor AND id_iglesia=? AND fecha_junta=? AND hora_junta=?");
            pstmt.setInt(1, jt.getIglesia());
            pstmt.setDate(2,new java.sql.Date(jt.getFecha().getTime()));
            pstmt.setString(3, jt.getHoraInicio());
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                if(rs.getInt("genero")==1)
                {
                    c='M';
                }
                else
                {
                    c='F';
                }
                p=new Pastor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),c,rs.getDate("fechanacimiento"),rs.getInt("jerarquia"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }
    
    public ArrayList<Servidor> participantesJunta(Junta jt)
    {
        ArrayList<Servidor> resultado=new ArrayList<>();
        Servidor p;
        char c;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement(
                    "SELECT rut,nombre,apellido,genero,especialidad,fechanacimiento,servidor.iglesia_id "+
                    "FROM servidor, participa "+
                    "WHERE rut=rut_servidor AND id_iglesia=? AND fecha=? AND hora=?");
            pstmt.setInt(1, jt.getIglesia());
            pstmt.setDate(2,new java.sql.Date(jt.getFecha().getTime()));
            pstmt.setString(3, jt.getHoraInicio());
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                p=new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),rs.getInt("genero"),rs.getDate("fechaNacimiento"),rs.getString("especialidad"),rs.getInt("iglesia_id"));
                resultado.add(p);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }



    public ArrayList<TipoActividad> tipoActividad()
    {
        ArrayList<TipoActividad> resultado=new ArrayList<>();
        ArrayList<String> lista;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT nombre_actividad FROM tipo_actividad");
            PreparedStatement pstmt2 = cn.prepareStatement("SELECT nombre_especialidad FROM especialidad WHERE nombre_especialidad=?");
            ResultSet rs2;
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                lista=new ArrayList<>();
                pstmt2.setString(1, rs.getString("nombre_actividad"));
                rs2=pstmt2.executeQuery();
                while(rs2.next())
                {
                    lista.add(rs2.getString("nombre_especialidad"));
                }
                resultado.add(new TipoActividad(rs.getString("nombre_actividad"),lista));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
        }
        
        return resultado;
    }    
}
