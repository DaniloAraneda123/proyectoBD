/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
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
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Insertar(Connection cn)
    {
        this.cn=cn;
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
            PreparedStatement pstmt = cn.prepareStatement("INSERT INTO servidor (rut,nombre,apellido,genero,especialidad,fechaNacimiento,iglesia) VALUES(?,?,?,?,?,?,?);");   
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
            PreparedStatement pstmt = cn.prepareStatement("INSERT INTO pastor (rut,nombre,apellido,genero,fecha_nacimiento,jerarquia) VALUES(?,?,?,?,?,?);");   
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
    
    public boolean insertarTrabajaPara(Trabaja_para tp)
    {
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO trabaja_para (id_iglesia,rut_pastor) VALUES(?,?)");
            pstmt.setInt(1, tp.getIdIglesia());
            pstmt.setString(2,tp.getRutPastor());
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"Error en la ejecucion");   
            return false;
        }
        return true;
    }
    
    public boolean insertarPastorPredica(PastorPredica pd)
    {
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO pastor_predica(rut_pastor,fecha_junta,id_iglesia,rol,hora_junta) VALUES(?,?,?,?,?)");
            pstmt.setString(1, pd.getRut_pastor());
            pstmt.setDate(2,new java.sql.Date(pd.getFecha().getTime()));
            pstmt.setInt(3,pd.getId());
            pstmt.setString(4,pd.getRol());
            pstmt.setString(5,pd.getHora());
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"Error en la ejecucion");   
            return false;
        }
        return true;
    }
    
    public boolean insertarParticipa(Participa pd)
    {
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO participa(rut_servidor,fecha,id_iglesia,rol,hora,tipo_tarea,id_sector) VALUES(?,?,?,?,?,?,?)");
            pstmt.setString(1, pd.getRutPersona());
            pstmt.setDate(2,new java.sql.Date(pd.getFecha().getTime()));
            pstmt.setInt(3,pd.getIdIglesia());
            pstmt.setString(4,pd.getRol());
            pstmt.setString(5,pd.getHora());
            pstmt.setString(6,pd.getTipoTarea());
            pstmt.setInt(7,pd.getIdSector());
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"Error en la ejecucion");   
            return false;
        }
        return true;
    }
    
    
    public boolean insertarTipoActividad(TipoActividad ta)
    {
        String especialidad;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO tipo_actividad(nombre_actividad) VALUES(?)");
            pstmt.setString(1, ta.getTipo());
            pstmt.execute();
            pstmt=cn.prepareStatement("INSERT INTO especialidad(tipo_actividad,nombre_especialidad) VALUES(?,?)");
            pstmt.setString(1, ta.getTipo());
            Iterator<String> it=ta.getEspecialidad().iterator();
            while(it.hasNext())
            {
                especialidad = it.next();
                pstmt.setString(2, especialidad);
                pstmt.execute();
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"Error en la ejecucion");   
            return false;
        }
        return true;
    }
}
