
package vista;
import modelo.Operaciones;
import modelo.Iglesia;
import java.util.ArrayList;
import java.util.Arrays;


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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaTitulo)
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaAño)
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaFechaIni)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(etiquetaFechaTer)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAño)
                    .addComponent(etiquetaFechaIni)
                    .addComponent(etiquetaFechaTer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        int indice = listaConsultas.getSelectedIndex();
        if (indice >= 0) 
        {
            obtener_Respuesta(indice + 1);
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
          else if (indice >= 3 && indice <= 5) {
                etiquetaFechaTer.setVisible(true);
                etiquetaFechaIni.setVisible(true); 
                campoFechaIni.setVisible(true);
                campoFechaTer.setVisible(true);
          }
          else  {
                etiquetaFechaTer.setVisible(false);
                etiquetaFechaIni.setVisible(false); 
                campoFechaIni.setVisible(false);
                campoFechaTer.setVisible(false);
          }
       }
     
    }//GEN-LAST:event_listaConsultasValueChanged
   
    
    public void setOperacionesBD (Operaciones ope) {
       operacionesBD = ope;
    }
  
    public Operaciones getOperacionesBD() {
       return operacionesBD;
    }
  
    public void setIlgesia (Iglesia igle) {
        iglesia = igle;
    }
    
    public Iglesia getIglesia () {
       return iglesia;
    }
    
    public int obtenerAño () {
        return campoAño.getYear();
    }
    
    public Date obtenerFechaIni () {
       return   campoFechaIni.lastSelectedDate();
    }
            
    public Date obtenerFechaTer () {
       return  campoFechaTer.lastSelectedDate();
    }
    
    public void iniciar_ListaConsultas () {
         arrayConsultas = new ArrayList<>( Arrays.asList("Qué Personas trabajan esta semana en la Iglesia." , 
                 "Qué Personas han trabajado en que Tipo de actividad" , "Cuántas Reuniones se han realizado cada mes por tipo, el año X" ,           
                 "Qué Pastores predicaron en X Reunión desde la fecha  Y - Z" , "Qué Sectores se utilizan más desde la fecha Y - Z" , 
                 "Cuántas Reuniones se hacen de cada Tipo desde la fecha Y - Z" , "Cuántas personas especializadas hay de cada Tipo en total" ,
                 "Qué Servidores pertenecen a esta iglesia" , "Obtener datos de todos los pastores" , "Qué servidor nunca ha participado en un actividad"
                 ));
         listaConsultas.setListData(arrayConsultas.toArray()); 
    }
 
    public void iniciar_Componentes() {
        listaConsultas.setVisibleRowCount(7);
        tablaResultado.setVisible(false);
        etiquetaAño.setVisible(false);
        etiquetaFechaIni.setVisible(false);
        etiquetaFechaTer.setVisible(false);
        campoAño.setVisible(false);
        campoFechaIni.setVisible(false);
        campoFechaTer.setVisible(false);
    }

    
    
    public void  obtener_Respuesta(int opcion) {
        switch (opcion) 
        {
            case 1 : operacionesBD.
            case 2 : operacionesBD
            case 3 :   operacionesBD } 
            case 4 : operacionesBD
            case 5 : operacionesBD
            case 6 : operacionesBD
            case 7 : operacionesBD
            case 8 : operacionesBD
            case 9 : operacionesBD
            case 10 : operacionesBD
        }  
        tablaResultado.setVisible(true);
    }
     segun el numero , hace la correspondiente pregunta a la BD , para ello
     obtiene el operacionesBD y llama al metodo correspondiente mostrando finalmente 
     los resultado en la table y la hace visible.
    

    //Atributos
    
    private ArrayList<String> arrayConsultas;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel etiquetaAño;
    private javax.swing.JLabel etiquetaFechaIni;
    private javax.swing.JLabel etiquetaFechaTer;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaConsultas;
    private javax.swing.JTable tablaResultado;
    // End of variables declaration//GEN-END:variables
}
