package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Niapi
 */
public class ConsultasEsp {
    
    Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String bd = "postgres";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String user = "postgres";
    private String pass = "";
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public ConsultasEsp()
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
    
    public void consulta1(Date fecha1,Date fecha2, int id_iglesia){

        try{

            PreparedStatement pstmt=cn.prepareStatement("Select disctinct rut,nombre,apellido1  FROM persona , participa " +
                    " WHERE persona.rut = participa.rutpersona and\n" +
                    "                 participa.fecha >=  ? \n" +
                    "                 participa.fecha <= ? \n" +
                    "                 iglesia.id = ? ;");

            pstmt.setDate(1,new java.sql.Date(fecha1.getTime()));
            pstmt.setDate(2,new java.sql.Date(fecha1.getTime()) );
            pstmt.setInt(3,id_iglesia );
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }

    }
     /** consulta para ver ¿Qué personas han trabajado en qué tipo de actividad ordenado por tipo de actividad? */

 
    public void consulta2 () throws SQLException{
    try{
    PreparedStatement pstmt=cn.prepareStatement("Select distinct rut , nombre , apellido1 , nombreActividad\n" +
        "from persona , participa\n" +
    "Where persona.rut = participa.rutPersona\n" +
    "Order by nombre_actividad ;");

            
            pstmt.execute();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }


    
    /** consulta para ver ¿Cuántas reuniones se han realizado cada mes por tipo el año ‘X’ ?  */
    public void consulta3(Date ano){


        try{

            PreparedStatement pstmt=cn.prepareStatement("Select nombre_reunion , count (*) , extract (month from fecha) as MES\n" +
"              From junta  \n" +
"              Where extract ( year from fecha ) = ?\n" +
"              Group by nombre_reunion , Mes ;");

            pstmt.setDate(1,new java.sql.Date(ano.getTime()));
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    /** ¿Qué pastores predicaron en ‘X’ reunión en un rango de fecha?  */
    public void consulta4(Date fecha1,Date fecha2, String reunion){

        try{

            PreparedStatement pstmt=cn.prepareStatement("Select nombre, apellido1 \n" +
        "From pastor, pastorpredica, junta \n" +
        "Where pastor.rut = pastorpredica.rut and \n" +
        " pastorpredica.fecha_junta = junta.fecha and  \n" +
        " pastorpredica.hora_junta = junta.hora and \n" +
        " junta.nombre_reunion = ? and \n" +
        " junta.fecha=> ?  and \n" +
        " junta.fecha <= ? ;");

            pstmt.setString(1, reunion);
            pstmt.setDate(2,new java.sql.Date(fecha1.getTime()));
            pstmt.setDate(3,new java.sql.Date(fecha2.getTime()) );
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    
    /** ¿Qué sectores se utilizan más entre un rango de fechas?  */
    public void consulta5(Date fecha1,Date fecha2){

        try{

            PreparedStatement pstmt=cn.prepareStatement("Select  tipo, Count(*)\n" +
        "From sector, participa \n" +
        "Where participa.idsector = sector.idsector and\n" +
        "participa.fecha>= ?\n" +
        "participa.fecha<= ? ;");

           
            pstmt.setDate(1,new java.sql.Date(fecha1.getTime()));
            pstmt.setDate(2,new java.sql.Date(fecha2.getTime()) );
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    
    /** ¿ Cuántas reuniones se hacen de cada tipo en un rango de fechas  ?   */
    public void consulta6(Date fecha1,Date fecha2){

        try{

            PreparedStatement pstmt=cn.prepareStatement("Select Count(*) tipo_actividad \n" +
            "From junta\n" +
            "Where junta.fecha >= ? and\n" +
            "junta.fecha <= ? ;");

            pstmt.setDate(1,new java.sql.Date(fecha1.getTime()));
            pstmt.setDate(2,new java.sql.Date(fecha2.getTime()) );
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    /**   ¿ Cuántas personas especializadas de cada tipo hay en total ? */
    public void consulta7(Date fecha1,Date fecha2){

        try{
            PreparedStatement pstmt=cn.prepareStatement("Select Count(*)\n" +
            " From   persona \n" +
            "Group by  persona.especialidad;");

            pstmt.setDate(1,new java.sql.Date(fecha1.getTime()));
            pstmt.setDate(2,new java.sql.Date(fecha2.getTime()) );
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
   
    
     /**   ¿ Qué trabajadores pertenecen a qué iglesia ? */
    public void consulta8(){

        try{
            PreparedStatement pstmt=cn.prepareStatement("Select rut , nombre, apellido , id\n" +
        "From  participa , servidor\n" +
        "Where rut.servidor = rut_persona\n" +
        "Group by id_iglesia ;");

           
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    
   
     /**    Obtener datos de todos los pastores */
    public void consulta9(int id_iglesia){

        try{
            PreparedStatement pstmt=cn.prepareStatement("Select* FROM pastor, trabaja_para"
                    + "WHERE rut_pastor = rut.pastor "
                    + "and id_iglesia = ?  ;");
            
            pstmt.setInt(1,id_iglesia );
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    /**  ¿Qué personas nunca han participado en una actividad?*/
    public void consulta10(int id_iglesia){

        try{
            PreparedStatement pstmt=cn.prepareStatement("Select Rut , nombre , apellido\n" +
            "From servidor \n" +
            "Where rut not in ( Select distinct rut.servidor From participa );");
            
           // falta agregarle iglesia 
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
}
