/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Niapi
 */
public class Insertar 
{
    
    Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String bd = "postgres";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String user = "postgres";
    private String pass = "";
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Insertar()
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
    /**
     * metodo para insertar persona 
     * @param persona objeto persona a retornar
     * @return retorna un true si la operacion se ejecuto sin problemas
     */
    public boolean insertarServidor(Servidor persona)
    {
        boolean resultado=true;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("INSERT INTO persona (rut,nombre,apellido1,genero,especialidad,fechaNacimiento,iglesia) VALUES(?,?,?,?,?,?,?);");   
            pstmt.setString(1, persona.getRut());
            pstmt.setString(2, persona.getNombre());
            pstmt.setString(3, persona.getApellido());
            pstmt.setString(4,String.valueOf(persona.getGenero()));
            pstmt.setString(5,persona.getEspecialidad());
            pstmt.setDate(6,new java.sql.Date(persona.getFechaNacimiento().getTime()));
            pstmt.setInt(7,persona.getIglesia());
            pstmt.execute();
            pstmt.close(); 
            pstmt = cn.prepareStatement("INSERT INTO telefono (RutPersona,numero) VALUES(?,?);");
            for(int i=0;i<persona.getTelefonos().size();i++)
            {
                pstmt.setString(1, persona.getRut());
                pstmt.setString(2, persona.getTelefonos().get(i));
                pstmt.execute();
            }
            pstmt.close();
            pstmt = cn.prepareStatement("INSERT INTO correo (RutPersona,Email) VALUES(?,?);");
            for(int i=0;i<persona.getMails().size();i++)
            {
                pstmt.setString(1, persona.getRut());
                pstmt.setString(2, persona.getTelefonos().get(i));
                pstmt.execute();
            }
            pstmt.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+e);
            resultado=false;
        }
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean insertarPastor(Pastor pastor)
    {
        boolean resultado=true;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("INSERT INTO persona (rut,nombre,apellido,genero,fecha_nacimiento,jerarquia) VALUES(?,?,?,?,?,?);");   
            pstmt.setString(1, pastor.getRut());
            pstmt.setString(2, pastor.getNombre());
            pstmt.setString(3, pastor.getApellido());
            pstmt.setString(4,String.valueOf(pastor.getGenero()));
            pstmt.setDate(5,new java.sql.Date(pastor.getFechaNacimiento().getTime()));
            pstmt.setInt(6,pastor.getJerarquia());
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
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean insertarIglesia(Iglesia ig)
    {
        boolean resultado=true;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO iglesia (id,calle,region,numero,comuna) VALUES(?,?,?,?,?)");
            pstmt.setInt(1, ig.getId());
            pstmt.setString(2, ig.getCalle());
            pstmt.setString(3, ig.getRegion());
            pstmt.setInt(4, ig.getId());
            pstmt.setString(5, ig.getComuna());
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
            resultado=false;
        }
        
        return resultado;
     
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean agregarSector(Sector s,int idIglesia)
    {
        boolean resultado=true;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO sector (id_iglesia,id_sector,capacidad,nombre) VALUES (?,?,?,?)");
            pstmt.setInt(1, idIglesia);
            pstmt.setInt(2, s.getId());
            pstmt.setInt(3, s.getCapacidad());
            pstmt.setString(4, s.getTipo());
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
            resultado=false;
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean insertarTipoReunion(TipoReunion tp)
    {
        boolean resultado=true;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO tiporeunion (nombre,genero,edad_min,edad_max) VALUES(?,?,?,?)");
            pstmt.setString(1, tp.getNombre());
            pstmt.setInt(2, tp.getGenero());
            pstmt.setInt(3, tp.getEdadMin());
            pstmt.setInt(4, tp.getEdadMax());
            
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");   
            resultado=false;
        }
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean insertarJunta(Junta jt,int idIglesia)
    {
        boolean resultado=true;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO junta (fecha,id_iglesia,nombre_reunion,hora,descripcion) VALUES(?,?,?,?,?)");
            pstmt.setDate(1, new java.sql.Date(jt.getFecha().getTime()));
            pstmt.setInt(2,idIglesia);
            pstmt.setString(3, jt.getReunion());
            pstmt.setString(4, jt.getHoraInicio());
            pstmt.setString(5, jt.getDescripcion());
            
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");   
            resultado=false;
        }
        return resultado;
        
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean insertarParticipa(Junta jt,int idIglesia)
    {
        boolean resultado=true;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO junta (fecha,id_iglesia,nombre_reunion,hora,descripcion) VALUES(?,?,?,?,?)");
            pstmt.setDate(1, new java.sql.Date(jt.getFecha().getTime()));
            pstmt.setInt(2,idIglesia);
            pstmt.setString(3, jt.getReunion());
            pstmt.setString(4, jt.getHoraInicio());
            pstmt.setString(5, jt.getDescripcion());
            
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");   
            resultado=false;
        }
        return resultado;
        
    }
}
