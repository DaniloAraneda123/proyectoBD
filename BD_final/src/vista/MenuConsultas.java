
package vista;
import modelo.Operaciones;
import modelo.Iglesia;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.resultadosEsp.Con7;
import modelo.resultadosEsp.Con6;
import modelo.resultadosEsp.Con2;
import modelo.resultadosEsp.Con3;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.Junta;
import modelo.Pastor;
import modelo.Sector;
import modelo.Servidor;
import modelo.TipoReunion;
import modelo.resultadosEsp.Con5;


public class MenuConsultas extends javax.swing.JDialog {

    public MenuConsultas(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia igle) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        setIglesia(igle);
        iniciar_Componentes();
        iniciar_ListaConsultas();
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConsultas = new javax.swing.JList();
        campoFechaTer = new com.toedter.calendar.JDateChooser();
        campoTipoReunion = new javax.swing.JComboBox();
        etiquetaTipoReunion = new javax.swing.JLabel();
        botonConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        etiquetaAño = new javax.swing.JLabel();
        etiquetaFechaIni = new javax.swing.JLabel();
        etiquetaFechaTer = new javax.swing.JLabel();
        campoAño = new com.toedter.calendar.JYearChooser();
        campoFechaIni = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(52, 152, 219));

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaTitulo.setText("Lista de consultas");

        jScrollPane1.setBackground(new java.awt.Color(52, 152, 219));

        listaConsultas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaConsultas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaConsultasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaConsultas);

        campoTipoReunion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaTipoReunion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTipoReunion.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaTipoReunion.setText("Tipo reunion: ");

        botonConsultar.setBackground(new java.awt.Color(0, 0, 0));
        botonConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonConsultar.setText("CONSULTAR");
        botonConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonConsultar.setBorderPainted(false);
        botonConsultar.setFocusable(false);
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(52, 152, 219));

        tablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaResultado);

        etiquetaAño.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaAño.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaAño.setText("Año :");

        etiquetaFechaIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaFechaIni.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaFechaIni.setText("Fecha inicio :");

        etiquetaFechaTer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaFechaTer.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaFechaTer.setText("Fecha final :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etiquetaTitulo)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(etiquetaAño)))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etiquetaFechaIni)
                                            .addComponent(campoFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etiquetaFechaTer)
                                            .addComponent(campoFechaTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaTipoReunion)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(campoTipoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(98, 98, 98)
                                        .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaTipoReunion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaFechaTer))
                                .addComponent(etiquetaAño, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoFechaTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoTipoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(etiquetaFechaIni)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        int indice = listaConsultas.getSelectedIndex();
        if (indice >= 0) 
        {
            comprobarPregunta(indice + 1);
        }
    }//GEN-LAST:event_botonConsultarActionPerformed
 
    private void listaConsultasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaConsultasValueChanged
       int indice = listaConsultas.getSelectedIndex();
       if (indice >= 0)
       {
          if (indice == 2) {
                campoAño.setVisible(true);
                etiquetaAño.setVisible(true);
          }
          else if (indice == 4 || indice == 5) {
                etiquetaFechaTer.setVisible(true);
                etiquetaFechaIni.setVisible(true); 
                campoFechaIni.setVisible(true);
                campoFechaTer.setVisible(true);
          }
          else if (indice == 3) {
                etiquetaFechaTer.setVisible(true);
                etiquetaFechaIni.setVisible(true);
                etiquetaTipoReunion.setVisible(true);
                campoFechaIni.setVisible(true);
                campoFechaTer.setVisible(true);
                campoTipoReunion.setVisible(true);
          }
          else  {
                etiquetaFechaTer.setVisible(false);
                etiquetaFechaIni.setVisible(false);
                etiquetaTipoReunion.setVisible(false); 
                campoFechaIni.setVisible(false);
                campoFechaTer.setVisible(false);
                campoTipoReunion.setVisible(false);
          }
       }
     
    }//GEN-LAST:event_listaConsultasValueChanged
   
    
    public void setOperacionesBD (Operaciones ope) {
       operacionesBD = ope;
    }
  
    public Operaciones getOperacionesBD() {
       return operacionesBD;
    }
  
    public void setIglesia (Iglesia igle) {
        iglesia = igle;
    }
    
    public Iglesia getIglesia () {
       return iglesia;
    }
    
    public int obtenerAño () {
        return campoAño.getYear();
    }
    
    public Date obtenerFechaIni () {
       return   campoFechaIni.getDate();
    }
            
    public Date obtenerFechaTer () {
       return  campoFechaTer.getDate();
    }
    
    public void actualizar_ArrayTipoReunion () {
        arrayTipoReunion = operacionesBD.consultar.tipoReuniones();
    }
    
    public void actualizar_CampoTipoReunion () {
        campoTipoReunion.setModel( new DefaultComboBoxModel<>( arrayTipoReunion.toArray()) );
    }
    
    public String obtenerCampoTipoReunion () {
         TipoReunion tipoReunion = (TipoReunion) campoTipoReunion.getSelectedItem();
         return tipoReunion.getNombre();
    }
    
    public void iniciar_ListaConsultas () {
         arrayConsultas = new ArrayList<>( Arrays.asList(
                 "Qué Personas trabajan esta semana en la Iglesia." , 
                 "Qué Personas han trabajado en que Tipo de actividad" , 
                 "Cuántas Reuniones se han realizado cada mes por tipo, el año X" ,           
                 "Qué Pastores predicaron en X Reunión desde la fecha  Y - Z" , 
                 "Qué Sectores se utilizan más desde la fecha Y - Z" , 
                 "Cuántas Reuniones se hacen de cada Tipo desde la fecha Y - Z" , 
                 "Cuántas personas especializadas hay de cada Tipo en total" ,
                 "Obtener datos de todos los pastores" , 
                 "Qué servidor nunca ha participado en un actividad"
                 ));
         listaConsultas.setListData(arrayConsultas.toArray()); 
    }
    
    public void comprobarPregunta (int opcion) {
      
          if (opcion == 3) {
              if (obtenerAño() >= 0) { 
                  obtener_Respuesta(opcion);
              }
          }
          else if (opcion >= 5 && opcion <= 6) {
                if (obtenerAño() >= 0 && obtenerFechaIni() != null && obtenerFechaTer() != null) {
                    obtener_Respuesta(opcion);
                }
          }
          else  {
                obtener_Respuesta(opcion);
          }
    } 
 
    public void iniciar_Componentes() {
        listaConsultas.setVisibleRowCount(7);
        tablaResultado.setVisible(false);
        etiquetaAño.setVisible(false);
        etiquetaFechaIni.setVisible(false);
        etiquetaFechaTer.setVisible(false);
        etiquetaTipoReunion.setVisible(false);
        campoAño.setVisible(false);
        campoFechaIni.setVisible(false);
        campoFechaTer.setVisible(false);
        campoTipoReunion.setVisible(false);
    }

    
    
    public void  obtener_Respuesta(int opcion) {
        switch (opcion) 
        {
            case 1 : { consulta1 = operacionesBD.consultasEsp.consulta1( obtenerFechaIni() , obtenerFechaTer() , iglesia.getId());  mostrarTabla(1);   break; }
            case 2 : { consulta2 = operacionesBD.consultasEsp.consulta2();  mostrarTabla(2); break; } 
            case 3 : { consulta3 = operacionesBD.consultasEsp.consulta3(obtenerAño()); mostrarTabla(3); break;}
            case 4 : { consulta4 = operacionesBD.consultasEsp.consulta4(obtenerFechaIni() , obtenerFechaTer() , obtenerCampoTipoReunion()); mostrarTabla(4); break; }
            case 5 : { consulta5 = operacionesBD.consultasEsp.consulta5(obtenerFechaIni() , obtenerFechaTer() , iglesia.getId());  mostrarTabla(5); break; } 
            case 6 : { consulta6 = operacionesBD.consultasEsp.consulta6(obtenerFechaIni() , obtenerFechaTer()); mostrarTabla(6); break; }
            case 7 : { consulta7 = operacionesBD.consultasEsp.consulta7(); mostrarTabla(7); break; }
            case 8 : { consulta8 = operacionesBD.consultasEsp.consulta9(iglesia.getId()); mostrarTabla(8); break; }
            case 9 : { consulta9 = operacionesBD.consultasEsp.consulta10(iglesia.getId()); mostrarTabla(9);  break; } 
        }  
     
    }

    //SEGUN LA OPCION SE MOSTRARA EL CONTENIDO DE ESTA TABla.
    public void mostrarTabla (int opcion ) { 
        
        String matriz[][];
        if (opcion == 1)
        {
             matriz = new String[consulta1.size()][3];
             for (int i=0 ; i< consulta1.size() ; i++) {
               matriz[i][0] = consulta1.get(i).getRut();
               matriz[i][1] = consulta1.get(i).getNombre();
               matriz[i][2] = consulta1.get(i).getApellido();
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Rut " , " Nombre " , " Apellido "}));
        }
        else if (opcion == 2) 
        {
            matriz = new String[consulta2.size()][4];
            for(int i=0 ; i < consulta2.size() ; i++) {
               matriz[i][0] = consulta2.get(i).getRut();
               matriz[i][1] = consulta2.get(i).getNombre();
               matriz[i][2] = consulta2.get(i).getApellido();
               matriz[i][3] = consulta2.get(i).getNombreActividad();        
            }
            tablaResultado.setModel( new DefaultTableModel (matriz , new String[] {" Rut " , " Nombre " , " Apellido " , " Nombre Actividad "}));
        }
        else if (opcion == 3) 
        {
            matriz = new String[consulta3.size()][3];
            for (int i=0 ; i< consulta3.size() ; i++) {
               matriz[i][0] = consulta3.get(i).getNombreReunion();
               matriz[i][1] = Integer.toString (consulta3.get(i).getContador());
               matriz[i][2] = Integer.toString (consulta3.get(i).getMes());
            }
            tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Nombre Reunion " , " Contador " , " Mes "}));
        }
        else if (opcion == 4) 
        {
             matriz = new String[consulta4.size()][3];
             for (int i=0 ; i< consulta4.size() ; i++) {
               matriz[i][0] = consulta4.get(i).getRut();
               matriz[i][1] = consulta4.get(i).getNombre();
               matriz[i][2] = consulta4.get(i).getApellido();
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Rut " , " Nombre " , " Apellido "}));
        }
        else if (opcion == 5) 
        {
             matriz = new String[consulta5.size()][2];
             for (int i=0 ; i< consulta5.size() ; i++) {
               matriz[i][0] = Integer.toString (consulta5.get(i).getContador());
               matriz[i][1] = consulta5.get(i).getNombreSector();
   
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Contador " , " Nombre "}));
        }
        else if (opcion == 6) 
        {
             matriz = new String[consulta6.size()][2];
             for (int i=0 ; i< consulta6.size() ; i++) {
               matriz[i][0] = Integer.toString (consulta6.get(i).getContador());
               matriz[i][1] = consulta6.get(i).getNombreReunion();
   
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Contador " , " Nombre Reunion "}));
        }
        else if (opcion == 7) 
        {
             matriz = new String[consulta7.size()][2];
             for (int i=0 ; i< consulta7.size() ; i++) {
               matriz[i][0] = Integer.toString (consulta7.get(i).getCantidad());
               matriz[i][1] = consulta7.get(i).getEspecialidad();
   
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Cantidad " , " Especialidad "}));
        }
        else if (opcion == 8) 
        {
             matriz = new String[consulta8.size()][3];
             for (int i=0 ; i< consulta8.size() ; i++) {
               matriz[i][0] = consulta8.get(i).getRut();
               matriz[i][1] = consulta8.get(i).getNombre();
               matriz[i][2] = consulta8.get(i).getApellido();
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Rut " , " Nombre " , " Apellido "}));
        }
        else if (opcion == 9) 
        {
             matriz = new String[consulta9.size()][3];
             for (int i=0 ; i< consulta9.size() ; i++) {
               matriz[i][0] = consulta9.get(i).getRut();
               matriz[i][1] = consulta9.get(i).getNombre();
               matriz[i][2] = consulta9.get(i).getApellido();
             }
             tablaResultado.setModel( new DefaultTableModel (matriz , new String [] {" Rut " , " Nombre " , " Apellido "}));
        }
  
       tablaResultado.setVisible(true);
    }
    
    //Atributos
    private ArrayList<TipoReunion> arrayTipoReunion;
    //////////////////////////////////////////////
    private ArrayList<Servidor> consulta1;
    private ArrayList<Con2> consulta2;
    private ArrayList<Con3> consulta3; 
    private ArrayList<Pastor> consulta4;
    private ArrayList<Con5> consulta5;
    //////////////////////////////////////////////
    private ArrayList<Con6> consulta6;
    private ArrayList<Con7> consulta7;
    private ArrayList<Pastor> consulta8;
    private ArrayList<Servidor> consulta9;
    private ArrayList<String> arrayConsultas;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultar;
    private com.toedter.calendar.JYearChooser campoAño;
    private com.toedter.calendar.JDateChooser campoFechaIni;
    private com.toedter.calendar.JDateChooser campoFechaTer;
    private javax.swing.JComboBox campoTipoReunion;
    private javax.swing.JLabel etiquetaAño;
    private javax.swing.JLabel etiquetaFechaIni;
    private javax.swing.JLabel etiquetaFechaTer;
    private javax.swing.JLabel etiquetaTipoReunion;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaConsultas;
    private javax.swing.JTable tablaResultado;
    // End of variables declaration//GEN-END:variables
}
