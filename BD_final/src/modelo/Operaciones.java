package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Operaciones 
{
    
    Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String bd = "postgres";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String user = "postgres";
    private String pass = "";
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * Constructor , conecta a la base de datos de manera inmediata al llamarlo
     */
    public Operaciones()
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * metodo para insertar persona 
     * @param persona objeto persona a retornar
     * @return retorna un true si la operacion se ejecuto sin problemas
     */
    public boolean insertarPersona(Servidor persona)
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
            pstmt.setDate(6,new java.sql.Date(persona.getFechaNacimiento().getTimeInMillis()));
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * @param rut PK de la persona que se desea buscar
     * @return  retorna el objeto persona con sus datos
     */
    public Servidor buscarPersona(String rut)
    {
        Servidor persona=null;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT rut,nombre,apellido1,genero,especialidad,fechaNacimiento,iglesia FROM persona WHERE rut=?");   
            pstmt.setString(1, rut);
            rs=pstmt.executeQuery();
            Calendar fecha=Calendar.getInstance();
            fecha.setTime(rs.getDate("fechaNacimiento"));
            persona=new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido"),rs.getInt("genero"),fecha,rs.getString("especialidad"),rs.getInt("iglesia"));
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     *  
     * @return lista de las iglesias reggistradas en la BD
     */
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * 
     * @param desde
     * @param hasta
     * @return 
     */
    public ArrayList<Servidor> servidoresSemanales(java.util.Date desde,java.util.Date hasta)
    {
        ArrayList<Servidor> resultado=new ArrayList<>();
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
                p.setRut(rs.getString("rut"));
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
     * @param anio
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
        ArrayList<Servidor> resultado=new ArrayList<>();
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
                p.setRut(rs.getString("rut"));
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
     * @param id
     * @return 
     */
    public ArrayList<Servidor> ServidoresIglesia(String id)
    {
        ArrayList<Servidor> resultado=new ArrayList<Servidor>();
        Servidor p;
        try
        {
            PreparedStatement pstmt = cn.prepareStatement("SELECT  Rut , Nombre , Apellido1  FROM persona  WHERE iglesia = ?");
            pstmt.setString(1, id);
            rs=pstmt.executeQuery();
            pstmt.close();
            while(rs.next())
            {
                p=new Servidor();
                p.setApellido(rs.getString("apellido1"));
                p.setNombre(rs.getString("nombre"));
                p.setRut(rs.getString("rut"));
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
     * Sin terminar*********
     * @param desde
     * @param hasta
     * @param idIglesia
     * @return 
     */
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
    
    /**
     * @return 
     */
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    /**
     * @param idIglesia
     * @return 
     */
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
                Calendar fecha=Calendar.getInstance();
                fecha.setTime(rs.getDate("fechaNacimiento"));
                p=new Servidor(rs.getString("rut"),rs.getString("nombre"),rs.getString("apellido1"),rs.getInt("genero"),fecha,rs.getString("especialidad"),rs.getInt("iglesia"));
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
    
    public boolean insertarIglesia(int id , String region , String comuna , String calle , int numero)
    {
        boolean resultado=true;
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO iglesia (id,calle,region,numero,comuna) VALUES(?,?,?,?,?)");
            pstmt.setInt(1, id);
            pstmt.setString(2, calle);
            pstmt.setString(3, region);
            pstmt.setInt(4, numero);
            pstmt.setString(5, comuna);
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
            resultado=false;
        }
        
        return resultado;
        
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Sector> agregarSector(Sector s,int idIglesia)
    {
        ArrayList<Sector> resultado=new ArrayList<>();
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
            resultado=null;
        }
        
        return resultado;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    /*
    public ArrayList<Sector> obtenerSectores(int id)
    {
        ArrayList<Sector> resultado=new ArrayList<>();
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("SELECT nombre FROM tipo_actividad");
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
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public ArrayList<Sector> agregarSector(Sector s,int idIglesia)
    {
        ArrayList<Sector> resultado=new ArrayList<>();
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
            resultado=null;
        }
        
        return resultado;
    }
    
    */
    
    //NECESITO UN METODO QUE DEVUELVE UN ARRAY DE TIPOSACTIVIDADES 
    
    //NECESITO UN METODO QUE ME PERMITA AGREGAR UN TIPOACTIVIDAD puedo gerardo 
    
    //NECESITO UN METODO QUE ME PERMITA AGREGAR UN TIPOREUNION puedo gerardo ya esta hecha
    
    //AGREGAR UN PASTOR A UNA DETERMINADA IGLESIA puedo gerardo
    //ingresarPastor(id idIglesia)



    /** consulta para ver ¿Qué personas trabajan esta semana en la iglesia ‘Y’?  */
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
    
    /**  consulta para insertar tipo de reunion */
    public void insertar_tipo_reunion(String nombre ,int genero, int edadmin, int edadmax)
    {
        
        try{
            
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO tiporeunion (nombre,genero,edad_min,edad_max) VALUES(?,?,?,?)");
            pstmt.setString(1, nombre);
            pstmt.setInt(2, genero);
            pstmt.setInt(3, edadmin);
            pstmt.setInt(4, edadmax);
            
            pstmt.execute();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
            
        }
        
       
    }
    
}

