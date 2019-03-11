
package vista;
import bd_final.Operaciones;
import java.util.ArrayList;
import java.util.Arrays;


public class MenuConsultas extends javax.swing.JDialog {

    public MenuConsultas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setText("Lista de consultas");

        listaConsultas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaConsultas);

        botonConsultar.setText("CONSULTAR");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonConsultar)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaTitulo)
                        .addGap(199, 199, 199))))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(etiquetaTitulo)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setOperacionesBD (Operaciones ope) {
       operacionesBD = ope;
    }
  
    public Operaciones getOperacionesBD() {
       return operacionesBD;
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
    }

    public void  obtener_Respuesta(int opcion) :
     segun el numero , hace la correspondiente pregunta a la BD , para ello
     obtiene el operacionesBD y llama al metodo correspondiente mostrando finalmente 
     los resultado en la table y la hace visible.
    

    //Atributos.
    private ArrayList<String> arrayConsultas;
    private Operaciones operacionesBD;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaConsultas;
    private javax.swing.JTable tablaResultado;
    // End of variables declaration//GEN-END:variables
}
