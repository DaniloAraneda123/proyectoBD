
package vista;
import control.Fechas;
import java.util.ArrayList;
import java.util.Calendar;
import modelo.Iglesia;
import modelo.Operaciones;
import modelo.Junta;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import modelo.TipoReunion;



public class MenuReuniones extends javax.swing.JDialog {

    private JSpinner.DateEditor de;
    private ArrayList<TipoReunion> listaR;
    
    public MenuReuniones(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia igle) {
        super(parent, modal);
        initComponents();
        this.de = new JSpinner.DateEditor(selectorTiempo, "HH:mm");
        selectorTiempo.setEditor(de);
        setOperacionesBD (ope);
        setIglesia(igle);
        iniciar_ArrayReuniones();
        actualizar_ListaReuniones();
        listaR=operacionesBD.consultar.tipoReuniones();
        tipoReuniones.setModel(new DefaultComboBoxModel<>(listaR.toArray()));
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaReunion = new javax.swing.JList();
        campoFecha = new com.toedter.calendar.JDateChooser();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaHoraIni = new javax.swing.JLabel();
        etiquetaTipoReu = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        Date date = new Date();
        SpinnerDateModel sm=new SpinnerDateModel(date, null, null, Calendar.MINUTE);
        selectorTiempo = new javax.swing.JSpinner(sm);
        tipoReuniones = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

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

        listaReunion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaReunion);

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Lista de reuniones");

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaFecha.setText("Fecha : ");

        etiquetaHoraIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHoraIni.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaHoraIni.setText("Hora inicio :");

        etiquetaTipoReu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTipoReu.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTipoReu.setText("Tipo Reunión :");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHoraIni)
                            .addComponent(etiquetaFecha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(selectorTiempo))
                        .addGap(50, 50, 50)
                        .addComponent(etiquetaTipoReu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoReuniones, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminar)
                            .addComponent(botonAgregar))
                        .addGap(25, 25, 25)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo)
                .addGap(249, 249, 249))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(etiquetaFecha)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHoraIni)
                            .addComponent(etiquetaTipoReu)
                            .addComponent(selectorTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoReuniones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etiquetaTitulo)
                        .addGap(39, 39, 39)
                        .addComponent(botonAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //COMPROBAR CAMPOS
        Junta junta = new Junta(getFecha() , getTipoReu().getNombre() , getHoraIni(), "" ,  iglesia.getId() );
        actualizar_ArrayReuniones(junta);
        actualizar_ListaReuniones();
        actualizarBD(junta);
        //ACTUALIZAR EL PLANIFICAREUNION
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    //Métodos
      public boolean comprobarFecha() {
         //DEFINIR
         return true;
      }

      public Date getFecha () {
        return campoFecha.getDate();
      }
      

      public boolean comprobarHoraIni() {
          //DEFINIR
          return true;
      }

      public String getHoraIni() {
         return de.getFormat().format(selectorTiempo.getValue());
      }
       
      public boolean comprobarHoraTer() {
          //DEFINIR
          return true;
      }

      
      public boolean comprobarTipoReu() {
         //DEFINIR
         return true;   
      }

      public TipoReunion getTipoReu() {
        return listaR.get(tipoReuniones.getSelectedIndex());
      }
      
     /////////////////////////////////////////////////////////////////////
      
       public void setOperacionesBD (Operaciones ope) {
          operacionesBD = ope;
       }
       
       public void setIglesia (Iglesia igle) {
         iglesia = igle;
       }
   
      public Operaciones getOperacionesBD() {
         return operacionesBD;
      }
   
      public void iniciar_ArrayReuniones() {
       Date fechaActual = new Date();
       fechaActual.setYear( fechaActual.getYear());
       Fechas fecha = new Fechas(fechaActual);
       Date fechaInicio = fecha.calcula_FechaInicio();
       Date fechaTermino = fecha.calcula_FechaTermino(); 
       arrayReuniones = operacionesBD.consultar.juntasSemanales(fechaInicio , fechaTermino , iglesia.getId());
      }
      
      public void actualizar_ArrayReuniones (Junta junta) {
            arrayReuniones.add(junta); 
      }  

      public void actualizar_ListaReuniones() {
       listaReunion.setListData(arrayReuniones.toArray()); 
      }
      
      public void actualizarBD(Junta junta) {
            //AGREGARMOS A LA BD UNA JUNTA.
          operacionesBD.insertar.insertarJunta(junta,iglesia.getId());
      }
      
    //Atributos
    private ArrayList<Junta> arrayReuniones;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaHoraIni;
    private javax.swing.JLabel etiquetaTipoReu;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaReunion;
    private javax.swing.JSpinner selectorTiempo;
    private javax.swing.JComboBox tipoReuniones;
    // End of variables declaration//GEN-END:variables
}
