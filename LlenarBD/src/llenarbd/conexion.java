package llenarbd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
                    pstmt.setInt(1, i);
                    pstmt.setInt(2, l.get(j).getId());
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
    
    //////////////////////////////////////////////////////////////////////////////////////

    public void llenarJunta() 
    {
        ArrayList<String> listaReunion=new ArrayList<>();
        int numero,n;
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rsReunion=st.executeQuery("SELECT nombre FROM tipo_reunion;");
            while(rsReunion.next())
            {
                listaReunion.add(rsReunion.getString("nombre"));
            }
            numero=listaReunion.size();
            String[] horas = {"9:30","11:30", "13:00", "14:30", "16:00","17:30"};
            PreparedStatement ps=cn.prepareStatement("INSERT INTO junta (fecha,hora,id_iglesia,nombre_reunion) VALUES(?,?,?,?);");
            java.sql.Date date1;
            Date dt;
            for(int j=1;j<=31;j++)
            {
                for(int id=1;id<=3;id++)
                {
                    for(int i=0;i<6;i++)
                    {
                        dt=new Date(119,2,j);
                        date1=new java.sql.Date(dt.getTime());
                        ps.setDate(1, date1);
                        ps.setString(2, horas[i]);
                        ps.setInt(3, id);
                        n=(int) (Math.random()*numero-1);
                        ps.setString(4, listaReunion.get(n));
                        ps.execute();
                    }
                }
            }
            
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
                
    }
    
    //////////////////////////////////////////////////////////////////////////////////////

    public void llenarPredica() 
    {
        ArrayList<datosJunta> dj=new ArrayList<>();
        ArrayList<String> rutPastor=new ArrayList<>();
        int numero,n;
        try 
        {
            Statement st=cn.createStatement();
            rs=st.executeQuery("SELECT fecha,hora,id_iglesia FROM junta;");
            while(rs.next())
            {
                dj.add(new datosJunta(rs.getDate("fecha"),rs.getString("hora"),rs.getInt("id_iglesia")));
            }
            rs=st.executeQuery("SELECT rut FROM pastor;");
            while(rs.next())
            {
                rutPastor.add(rs.getString("rut"));
            }
            numero=rutPastor.size();
            PreparedStatement ps=cn.prepareStatement
            ("INSERT INTO pastor_predica (rut_pastor,fecha_junta,id_iglesia,rol,hora_junta) VALUES(?,?,?,?,?);");
            for(int j=0;j<dj.size();j++)
            {
                n=(int) (Math.random()*numero-1);
                ps.setString(1,rutPastor.get(n));
                ps.setDate(2, new java.sql.Date(dj.get(j).fecha.getTime()));
                ps.setInt(3, dj.get(j).id);
                ps.setString(4, "predica");
                ps.setString(5, dj.get(j).hora);
                ps.execute();
            }
            
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////
    
    public void llenarParticipa()
    {
        ArrayList<String> rutServidores=new ArrayList<>();
        ArrayList<datosJunta> juntas=new ArrayList<>();
        ArrayList<Integer> inte=new ArrayList<>();
        ArrayList<String> act=new ArrayList<>();
        int n;
        try 
        {
            Statement st=cn.createStatement();
            rs=st.executeQuery("SELECT fecha,hora,id_iglesia FROM junta;");
            while(rs.next())
            {
                juntas.add(new datosJunta(rs.getDate("fecha"),rs.getString("hora"),rs.getInt("id_iglesia")));
            }
            
            rs=st.executeQuery("SELECT nombre_actividad FROM tipo_actividad;");
            while(rs.next())
            {
                act.add(rs.getString("nombre_actividad"));
            }
            
            PreparedStatement ps=cn.prepareStatement("INSERT INTO participa (hora,fecha,id_iglesia,id_sector,rol,tipo_tarea,rut_servidor) VALUES(?,?,?,?,?,?,?);");
            
            /////////////////FOR DE JUNTAS/////////////////////////////
            for(int i=0;i<juntas.size();i++)
            {
                inte.clear();;
                rutServidores.clear();
                rs=st.executeQuery("SELECT rut FROM servidor WHERE iglesia_id="+juntas.get(i).id+";");
                while(rs.next())
                {
                    rutServidores.add(rs.getString("rut"));
                }
                rs=st.executeQuery("SELECT id_sector FROM sector WHERE id_iglesia="+juntas.get(i).id+";");
                while(rs.next())
                {
                    inte.add(rs.getInt("id_sector"));
                }
                
                //////////////////////////////////////////FOR PARA ASIGNAR TAREAS EN CADA JUNTA
                for(int j=0;j<5;j++)
                {
                    ps.setString(1, juntas.get(i).hora);
                    ps.setDate(2, new java.sql.Date(juntas.get(i).fecha.getTime()));
                    ps.setInt(3, juntas.get(i).id);
                    ps.setInt(4, inte.get(j));
                    ps.setString(5,"encargado");
                    ps.setString(6,act.get((int) (Math.random()*4)));
                    n=(int) (Math.random() * rutServidores.size());
                    ps.setString(7,rutServidores.get(n));
                    rutServidores.remove(n);
                    ps.execute();
                    
                }
            }
            
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Rip Consulta"+ex);
        }
    }
}
