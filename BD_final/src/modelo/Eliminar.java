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
import javax.swing.JOptionPane;

/**
 *
 * @author Niapi
 */
public class Eliminar {
    
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public Eliminar(Connection cn)
    {
        this.cn=cn;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarIglesia(int idIglesia)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM iglesia WHERE id=?");
            ps.setInt(1, idIglesia);
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarServidor(Servidor s)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM servidor WHERE rut=?");
            ps.setString(1, s.getRut());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;    
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarPastor(Pastor p)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM pastor WHERE rut=?");
            ps.setString(1, p.getRut());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarSector(Sector s)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM sector WHERE id_sector=? AND id_iglesia=?");
            ps.setInt(1, s.getId());
            ps.setInt(2,s.getIdIglesia());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarJunta(Junta j)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM junta WHERE fecha=? AND id_iglesia=? AND hora=?");
            ps.setDate(1, new java.sql.Date(j.getFecha().getTime()));
            ps.setInt(2, j.getIglesia());
            ps.setString(3, j.getHoraInicio());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarTipoReunion(TipoReunion tp)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM tipo_reunion WHERE nombre=?");
            ps.setString(1, tp.getNombre());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean eliminarParticipa(Participa p)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM participa WHERE rut_servidor=? AND fecha=? AND hora=? AND id_iglesia=? AND id_sector=? AND tipo_tarea=?");
            ps.setString(1, p.getRutPersona());
            ps.setDate(2, new java.sql.Date(p.getFecha().getTime()));
            ps.setString(3, p.getHora());
            ps.setInt(4, p.getIdIglesia());
            ps.setInt(5, p.getIdSector());
            ps.setString(6, p.getTipoTarea());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean eliminarTelefono(String rut, String telefono)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM telefono WHERE telefono=? AND rut=?");
            ps.setString(2, rut);
            ps.setString(1, telefono);
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    public boolean eliminarCorreo(String correo, String rut)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM correo WHERE rut_persona=? AND email=?");
            ps.setString(1, rut);
            ps.setString(2, correo);
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarTipoActividad(TipoActividad ta)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM tipo_actividad WHERE nombre=?");
            ps.setString(1, ta.getTipo());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarTrabajaPara(Trabaja_para tp)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM trabaja_para WHERE rut_pastor=? AND id_iglesia=?");
            ps.setString(1, tp.getRutPastor());
            ps.setInt(2, tp.getIdIglesia());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarPastorPredica(PastorPredica pp)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM pastor_predica WHERE fecha_junta=? AND id_iglesia=? AND hora_junta=? AND rut_pastor=?");
            ps.setDate(1, new java.sql.Date(pp.getFecha().getTime()));
            ps.setInt(2, pp.getId());
            ps.setString(3, pp.getHora());
            ps.setString(4, pp.getRut_pastor());
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean eliminarEspecialidad(String tipoActividad, String nombreEspecialidad)
    {
        try 
        {
            ps=cn.prepareStatement("DELETE FROM especialidad WHERE tipo_actividad=? AND nombre_especialidad=?");
            ps.setString(1, tipoActividad);
            ps.setString(2, nombreEspecialidad);
            ps.execute();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        return true;
    }
}
