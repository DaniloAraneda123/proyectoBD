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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    ////////// ELIMINAR servidor,pastor,sector, junta,elmina, tipo Reunion
    
}
