package llenarbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion 
{
    Connection cn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String bd = "Prueba";
    private String url = "jdbc:postgresql://localhost:5432/";
    private String user = "postgres";
    private String pass = "113012";
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public conexion()
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
            cn=DriverManager.getConnection(this.url+this.bd+"?currentSchema=proyecto", this.user, this.pass);
        } 
        catch (ClassNotFoundException | SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex+"\n Error al Conectar");
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public void rutServidores() 
    {
        String rut;
        ArrayList<String> l;
        try {
            PreparedStatement pstmt=cn.prepareStatement("UPDATE servidor SET rut = ? WHERE id = ?");
            l=new ArrayList<>(10000);
            for(int i=1;i<=10000;i++)
            {
                rut=GeneradorDatos.generadorRut();
                while(l.contains(rut))
                {
                    rut=GeneradorDatos.generadorRut();
                }
                l.add(rut);
                pstmt.setString(1, rut);
                pstmt.setInt(2, i);
                pstmt.execute();
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public void rutPastores() 
    {
        String rut;
        ArrayList<String> l;
        try {
            PreparedStatement pstmt=cn.prepareStatement("UPDATE pastor SET rut = ? WHERE id = ?");
            l=new ArrayList<>(10000);
            for(int i=1;i<=100;i++)
            {
                rut=GeneradorDatos.generadorRut();
                while(l.contains(rut))
                {
                    rut=GeneradorDatos.generadorRut();
                }
                l.add(rut);
                pstmt.setString(1, rut);
                pstmt.setInt(2, i);
                pstmt.execute();
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////

    public void trabajaPara() 
    {
        int numero;
        try 
        {
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO trabaja_para (rut_pastor,id_iglesia) VALUES (?,?)");
            PreparedStatement pstm=cn.prepareStatement("SELECT rut FROM pastor");
            rs=pstm.executeQuery();
            while(rs.next())
            {
                pstmt.setString(1, rs.getString("rut"));
                numero= (int) (Math.random()*2)+ 1;
                for(int j=1;j<=numero;j++)
                {
                    pstmt.setInt(2,j);
                    pstmt.execute();
                }
            }
            rs.close();
            pstmt.close();
            pstm.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////

    public void sectores() 
    {
        int numero;
        try 
        {
            GeneradorDatos g=new GeneradorDatos();
            ArrayList<Sector> l;
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO sector (id_iglesia,id_sector,nombre,capacidad) VALUES (?,?,?,?)");
            for(int i=1;i<=3;i++)
            {
                l=g.generarSectores();
                for(int j=0;j<7;j++)
                {
                    pstmt.setInt(1, l.get(j).getId());
                    pstmt.setInt(2, i);
                    pstmt.setString(3, l.get(j).getTipo());
                    pstmt.setInt(4, l.get(j).getCapacidad());
                    pstmt.execute();
                }
            }
            pstmt.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public void telefono() 
    {
        int numero;
        try 
        {
            PreparedStatement pstmt=cn.prepareStatement("INSERT INTO telefono (rut,telefono) VALUES (?,?)");
            PreparedStatement pstm=cn.prepareStatement("SELECT rut FROM servidor");
            rs=pstm.executeQuery();
            while(rs.next())
            {
                numero= (int) (Math.random()*29999999)+70000000;
                pstmt.setString(1, rs.getString("rut"));
                pstmt.setString(2,String.valueOf(numero));
                pstmt.execute();
            }
            rs.close();
            pstmt.close();
            pstm.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
}
