package vista;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import modelo.Operaciones;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Iglesia;
import javax.swing.ListSelectionModel;
import java.util.regex.Matcher;

public class VistaInicio extends javax.swing.JFrame 
{
    
    
    ///// FRAME TERMINADO
    
    public VistaInicio() 
    {
        initComponents();
        try {
            operacionesBD = new Operaciones();
            arrayIglesias=operacionesBD.consultar.obtenerIglesias();
            iniciar_Componentes();
            actualizar_ListasIglesia();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);
            setVisible(true);
        } 
        catch (SQLException|ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(this,ex.toString(), "Error en la Conexion",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } 
    }
    
   
    public ArrayList<Iglesia> getArrayIglesias () {
         return arrayIglesias;
    }
    
    public void setArrayIglesias ( ArrayList<Iglesia> arrayI ) {
         arrayIglesias = arrayI;
    }
    ////////////////////////////////////////////////////////////////////////////
        
     public void iniciar_Componentes() {
        listaIglesiasSelec.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaIglesiasSelec.setVisibleRowCount(7);
    }    
     
    public void actualizar_ListasIglesia() {
       listaIglesiasSelec.setListData(arrayIglesias.toArray()); 
       listaIglesiasAgre.setListData(arrayIglesias.toArray()); 
    }

    ////////////////////////////////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seleccionar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        deslizadorSelec = new javax.swing.JScrollPane();
        listaIglesiasSelec = new javax.swing.JList();
        etiquetaTitulo1 = new javax.swing.JLabel();
        botonSeleccionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaRegion = new javax.swing.JLabel();
        etiquetaNum = new javax.swing.JLabel();
        etiquetaCalle = new javax.swing.JLabel();
        campoRegion = new javax.swing.JTextField();
        campoNum = new javax.swing.JTextField();
        campoCalle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaIglesiasAgre = new javax.swing.JList();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        etiquetaComuna = new javax.swing.JLabel();
        campoComuna = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cristo tu unica esperanza");
        setIconImage(new ImageIcon(getClass().getResource("/vista/imgs/icon.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        listaIglesiasSelec.setBackground(new java.awt.Color(204, 204, 204));
        listaIglesiasSelec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listaIglesiasSelec.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        deslizadorSelec.setViewportView(listaIglesiasSelec);

        etiquetaTitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo1.setText("Seleccione una iglesia");

        botonSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/entrar.png"))); // NOI18N
        botonSeleccionar.setBorder(null);
        botonSeleccionar.setBorderPainted(false);
        botonSeleccionar.setContentAreaFilled(false);
        botonSeleccionar.setFocusPainted(false);
        botonSeleccionar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/entrar_1.png"))); // NOI18N
        botonSeleccionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/entrar_1.png"))); // NOI18N
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(196, 196, 196))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(botonSeleccionar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(deslizadorSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(etiquetaTitulo1)
                .addGap(44, 44, 44)
                .addComponent(deslizadorSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(botonSeleccionar)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        Seleccionar.addTab("Seleccionar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Agregar/Eliminar una iglesia");

        etiquetaRegion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaRegion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaRegion.setText("Región :");

        etiquetaNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaNum.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaNum.setText("Número :");

        etiquetaCalle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaCalle.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCalle.setText("Calle :");

        campoRegion.setBackground(new java.awt.Color(52, 152, 219));
        campoRegion.setBorder(null);

        campoNum.setBackground(new java.awt.Color(52, 152, 219));
        campoNum.setBorder(null);

        campoCalle.setBackground(new java.awt.Color(52, 152, 219));
        campoCalle.setBorder(null);

        listaIglesiasAgre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaIglesiasAgre.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaIglesiasAgre);

        botonAgregar.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregar.setBorder(null);
        botonAgregar.setBorderPainted(false);
        botonAgregar.setFocusPainted(false);
        botonAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminar.setBorder(null);
        botonEliminar.setBorderPainted(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        etiquetaComuna.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaComuna.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaComuna.setText("Comuna :");

        campoComuna.setBackground(new java.awt.Color(52, 152, 219));
        campoComuna.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaRegion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addComponent(campoRegion)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaComuna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(campoComuna, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(etiquetaNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(campoNum, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonEliminar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(etiquetaCalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(campoCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGap(102, 102, 102)
                                .addComponent(botonAgregar)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(etiquetaTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(campoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaCalle)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaRegion)
                                .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etiquetaComuna)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(etiquetaNum)
                                        .addComponent(campoNum))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(campoComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregar)
                        .addGap(31, 31, 31)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Seleccionar.addTab("agregar/eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Seleccionar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Seleccionar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Seleccionar.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
       int indice = listaIglesiasSelec.getSelectedIndex();
       if (indice >= 0)
       {
           Iglesia iglesiaSeleccionada = arrayIglesias.get(indice);
           setVisible(false);
           VistaPlanSemanal vista= new VistaPlanSemanal( operacionesBD , iglesiaSeleccionada);
       }
      
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //comprobar que todos lo campos esten correctos
        Iglesia nuevaIglesia = new Iglesia ( obtener_UltimoId(), getRegion() , getComuna() ,getCalle() , Integer.parseInt(getNumero()) ) ;
        arrayIglesias.add(nuevaIglesia);
        operacionesBD.insertar.insertarIglesia(nuevaIglesia);
        actualizar_ListasIglesia();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int indice = listaIglesiasAgre.getSelectedIndex();
        if (indice >= 0)
        {
            Iglesia iglesiaSeleccionada = arrayIglesias.remove(indice);;
            operacionesBD.eliminar.eliminarIglesia(iglesiaSeleccionada.getId());
            actualizar_ListasIglesia();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    public static void main(String args[]) 
    {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() 
            {
                VistaInicio vista = new VistaInicio();
            }
        });
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////
                              //PESTAÑA AGREGAR/ELIMINAR.//
    
     public boolean comprobarRegion() {
        return getRegion().matches("[^0-9]*");
     } 
     
     public boolean comprobarComuna() {
        return getComuna().matches("[^0-9]*");
     }
     
     public boolean comprobarNumero () {
         return getNumero().matches("[0-9]+");
     }
     
     public boolean comprobarCalle () {
        return getCalle().matches("[^0-9]*");
     } 
     //GETTEXT MANDA EXCEPCION OJO XD.
     public String getRegion () {
        String texto = campoRegion.getText();
        return texto;
     }
     
     public String getComuna() {
         String texto = campoComuna.getText();
         return texto;
     }
      
     public String getNumero ()  {
         String texto = campoNum.getText();
         return texto; 
     }

     public String getCalle () {
         String texto = campoCalle.getText();
         return texto;
     }
     
     public int obtener_UltimoId () {
         int id = arrayIglesias.size() - 1;
         Iglesia ultima = arrayIglesias.get(id); 
         int ultimoId = ultima.getId() + 1 ;
         return ultimoId;
     }

    
    
    
    //ATRIBUTOS
    private Operaciones operacionesBD;
    private ArrayList<Iglesia> arrayIglesias;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Seleccionar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JTextField campoCalle;
    private javax.swing.JTextField campoComuna;
    private javax.swing.JTextField campoNum;
    private javax.swing.JTextField campoRegion;
    private javax.swing.JScrollPane deslizadorSelec;
    private javax.swing.JLabel etiquetaCalle;
    private javax.swing.JLabel etiquetaComuna;
    private javax.swing.JLabel etiquetaNum;
    private javax.swing.JLabel etiquetaRegion;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JList listaIglesiasAgre;
    private javax.swing.JList listaIglesiasSelec;
    // End of variables declaration//GEN-END:variables
}
