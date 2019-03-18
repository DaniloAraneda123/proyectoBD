
package vista;
import modelo.Operaciones;
import modelo.Iglesia;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.resultadosEsp.Con7;
import modelo.resultadosEsp.Con6;
import modelo.resultadosEsp.Con2;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import modelo.Junta;
import modelo.Pastor;
import modelo.Sector;
import modelo.Servidor;
import modelo.TipoReunion;


public class MenuConsultas extends javax.swing.JDialog {

    public MenuConsultas(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia igle) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        setIglesia(igle);
        iniciar_Componentes();
        iniciar_ListaConsultas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaConsultas = new javax.swing.JList();
        botonConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        etiquetaAño = new javax.swing.JLabel();
        etiquetaFechaIni = new javax.swing.JLabel();
        etiquetaFechaTer = new javax.swing.JLabel();
        campoAño = new com.toedter.calendar.JYearChooser();
        campoFechaIni = new com.toedter.calendar.JDateChooser();
        campoFechaTer = new com.toedter.calendar.JDateChooser();
        campoTipoReunion = new javax.swing.JComboBox();
        etiquetaTipoReunion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        botonConsultar.setText("CONSULTAR");
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

        etiquetaAño.setText("Año :");

        etiquetaFechaIni.setText("Fecha inicio :");

        etiquetaFechaTer.setText("Fecha final :");

        campoTipoReunion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaTipoReunion.setText("Tipo reunion: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoAño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(etiquetaFechaIni))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(campoFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(campoFechaTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(etiquetaFechaTer)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTipoReunion)
                            .addComponent(campoTipoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(194, 194, 194)
                        .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaAño)
                                .addComponent(etiquetaFechaIni)
                                .addComponent(etiquetaFechaTer)
                                .addComponent(etiquetaTipoReunion))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoFechaTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoTipoReunion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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
            case 3 : {}
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
       tablaResultado.setVisible(true);
    }
    
    //Atributos
    private ArrayList<TipoReunion> arrayTipoReunion;
    //////////////////////////////////////////////
    private ArrayList<Servidor> consulta1;
    private ArrayList<Con2> consulta2;
    private ArrayList<Junta> consulta3; //FALTA
    private ArrayList<Pastor> consulta4;
    private ArrayList<Sector> consulta5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaConsultas;
    private javax.swing.JTable tablaResultado;
    // End of variables declaration//GEN-END:variables
}
