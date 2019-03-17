package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Operaciones 
{
    //////Datos de Conexion
    private String bd = "Prueba";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String user = "postgres";
    private String pass = "113012";
    private String schema = "proyecto";
    private Connection cn;
    //////////////////////////////////////////////
    public Consultar consultar;
    public ConsultasEsp consultasEsp;
    public Insertar insertar;
    public Eliminar eliminar;
    
    public Operaciones() throws SQLException, ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver");
        Connection cn = DriverManager.getConnection(this.url+this.bd+"?currentSchema="+schema, this.user, this.pass);
        consultar=new Consultar(cn);
        consultasEsp=new ConsultasEsp(cn);
        insertar=new Insertar(cn);
        eliminar=new Eliminar(cn);
    }
    
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
    
}
