package modelo;

import modelo.resultadosEsp.Con5;
import modelo.resultadosEsp.Con3;
import modelo.resultadosEsp.Con7;
import modelo.resultadosEsp.Con2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.resultadosEsp.Con6;

/**
 *
 * @author Niapi
 */
public class ConsultasEsp {
    
    private Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ConsultasEsp(Connection cn)
    {
        this.cn=cn;
    }
    
    /**Consulta 1
     * Servidores que han participado en reuniones durante un rango de tiempo en una iglesia
     */
    public ArrayList<Servidor> consulta1(Date desde,Date hasta, int id_iglesia)
    {
        ArrayList<Servidor> lista=new ArrayList<>();
        Servidor p;
        try{

            PreparedStatement pstmt=cn.prepareStatement("SELECT DISTINCT rut,nombre,apellido FROM servidor , participa " +
                    "WHERE rut = rut_servidor " +
                    "AND fecha >=  ? " +
                    "AND fecha <= ? " +
                    "AND id_iglesia = ? ;");

            pstmt.setDate(1,new java.sql.Date(desde.getTime()));
            pstmt.setDate(2,new java.sql.Date(hasta.getTime()) );
            pstmt.setInt(3,id_iglesia );
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                p=new Servidor();
                p.setApellido(rs.getString("apellido"));
                p.setRut(rs.getString("rut"));
                p.setNombre(rs.getString("nombre"));
                lista.add(p);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error en la consulta1");
        }
        return lista;

    }

    /**Consulta 2
     * ¿Qué personas han trabajado en qué tipo de actividad ordenado por tipo de actividad? 
     */
    public ArrayList<Con2> consulta2 () 
    {
        ArrayList<Con2> lista=new ArrayList<>();
        Con2 e;
        try{
            PreparedStatement pstmt=cn.prepareStatement(
                "SELECT DISTINCT  rut, nombre, apellido, tipo_tarea "+
                "FROM servidor , participa " +
                "WHERE rut = rut_servidor " +
                "ORDER BY tipo_tarea ;");
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                e=new Con2(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),rs.getString("tipo_tarea"));
                lista.add(e);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta2");
        }
        return lista;
    }


    
    /**Consulta 3 
     * 
     * consulta para ver ¿Cuántas reuniones se han realizado cada mes por tipo el año ‘X’ ?  
     */
    public ArrayList<Con3> consulta3(int anio)
    {
        ArrayList<Con3> lista=new ArrayList<>();
        try{
            PreparedStatement pstmt=cn.prepareStatement(
                "SELECT nombre_reunion, count (*) AS contador, EXTRACT(month FROM fecha)AS mes " +
                "FROM junta " +
                "WHERE EXTRACT(year FROM fecha)=?" +
                "GROUP BY nombre_reunion, Mes;");

            pstmt.setInt(1,anio);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                lista.add(new Con3(rs.getString("nombre_reunion"),rs.getInt("contador"),rs.getInt("mes")));
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta3");
        }
        return lista;
    }
    
    /** Consulta 4
     * ¿Qué pastores predicaron en ‘X’ reunión en un rango de fecha?  
     */
    public ArrayList<Pastor> consulta4(Date desde,Date hasta, String tipoReunion)
    {
        ArrayList<Pastor> lista= new ArrayList<>();
        Pastor p;
        try{

            PreparedStatement pstmt=cn.prepareStatement("SELECT rut, nombre, apellido " +
                "FROM pastor, pastor_predica, junta " +
                "WHERE pastor.rut = pastor_predica.rut_pastor AND " +
                "pastor_predica.fecha_junta = junta.fecha AND " +
                "pastor_predica.hora_junta = junta.hora AND " +
                "junta.nombre_reunion = ? and " +
                "junta.fecha=> ?  AND " +
                "junta.fecha <= ? ;");

            pstmt.setString(1, tipoReunion);
            pstmt.setDate(2,new java.sql.Date(desde.getTime()));
            pstmt.setDate(3,new java.sql.Date(hasta.getTime()) );
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                p=new Pastor();
                p.setRut(rs.getString("rut"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                lista.add(p);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta4");
            return null;
        }
        return lista;
    }
    
    
    /** Consulta 5
     * ¿Qué sectores se utilizan más entre un rango de fechas?  
     */
    public ArrayList<Con5> consulta5(Date fecha1,Date fecha2, int idIglesia)
    {
        ArrayList<Con5> lista=new ArrayList<>();
        try{

            PreparedStatement pstmt=cn.prepareStatement("SELECT  nombre, COUNT(*) AS contador " +
                "FROM sector, participa " +
                "WHERE participa.id_sector = sector.id_sector AND " +
                "participa.fecha>= ? AND " +
                "participa.fecha<= ? AND " + 
                "participa.id_iglesia=? "+
                "GROUP BY nombre");
            pstmt.setDate(1,new java.sql.Date(fecha1.getTime()));
            pstmt.setDate(2,new java.sql.Date(fecha2.getTime()) );
            pstmt.setInt(3,idIglesia);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                lista.add(new Con5(rs.getString("nombre"),rs.getInt("contador")));
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta5");
        }
        return lista;
    }
    
    
    /** 
     * ¿ Cuántas reuniones se hacen de cada tipo en un rango de fechas  ?   
     */
    public ArrayList<Con6> consulta6(Date desde,Date hasta)
    {
        ArrayList<Con6> lista=new ArrayList<>();
        Con6 e;
        try{

            PreparedStatement pstmt=cn.prepareStatement(
                "SELECT nombre_reunion, COUNT(*) AS contador " +
                "FROM junta " +
                "WHERE junta.fecha >= ? AND junta.fecha <= ? "+
                "GROUP BY nombre_reunion ;");

            pstmt.setDate(1,new java.sql.Date(desde.getTime()));
            pstmt.setDate(2,new java.sql.Date(hasta.getTime()) );
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                e=new Con6(rs.getString("nombre_reunion"),rs.getInt("contador"));
                lista.add(e);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+" Error consulta6");
            return null;
        }
        return lista;
    }
    
    /**   
     * ¿ Cuántas personas especializadas de cada tipo hay en total ? 
     */
    public ArrayList<Con7> consulta7()
    {
        ArrayList<Con7> lista=new ArrayList<>();
        Con7 s;
        try{
            PreparedStatement pstmt=cn.prepareStatement(
                "SELECT especialidad, COUNT(*) AS contador " +
                "FROM servidor " +
                "GROUP BY especialidad ;");
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                s=new Con7(rs.getString("especialidad"),rs.getInt("contador"));
                lista.add(s);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta7");
            return null;
        }
        return lista;
    }
   
     /**    
      * Obtener datos de todos los pastores de una Iglesia
      */
    public ArrayList<Pastor> consulta9(int id_iglesia)
    {
        ArrayList<Pastor> lista=new ArrayList<>();
        Pastor p;
        try{
            PreparedStatement pstmt=cn.prepareStatement(
                "SELECT rut,nombre,apellido "+ 
                "FROM pastor, trabaja_para "+ 
                "WHERE rut_pastor = rut "+ 
                "AND id_iglesia= ? ;");
            pstmt.setInt(1,id_iglesia );
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                p=new Pastor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"));
                lista.add(p);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta9");
            return null;
        }
        return lista;
    }
    
    /**  
     * ¿Qué personas nunca han participado en una actividad en una iglesia?
     */
    public ArrayList<Servidor> consulta10(int id_iglesia)
    {
        ArrayList<Servidor> lista=new ArrayList<>();
        Servidor servidor;
        try{
            PreparedStatement pstmt=cn.prepareStatement(
                "SELECT rut, nombre, apellido " +
                "FROM servidor " +
                "WHERE rut NOT IN ( "
                        + "SELECT DISTINCT rut_servidor FROM participa "
                        + "WHERE id_iglesia=?);");
            pstmt.setInt(1, id_iglesia);
            rs=pstmt.executeQuery();
            while(rs.next())
            {
                servidor=new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"));
                lista.add(servidor);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error consulta10");
            return null;
        }
        return lista;
    }
    
}
