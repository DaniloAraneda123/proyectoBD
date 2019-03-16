
package vista;
import control.Fechas;
import java.util.ArrayList;
import java.util.Date;
import modelo.Iglesia;
import modelo.Operaciones;
import modelo.Junta;



public class MenuReuniones extends javax.swing.JDialog {

    public MenuReuniones(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia igle) {
        super(parent, modal);
        initComponents();
        setOperacionesBD (ope);
        setIglesia(igle);
        iniciar_ArrayReuniones();
        actualizar_ListaReuniones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaHoraIni = new javax.swing.JLabel();
        etiquetaTipoReu = new javax.swing.JLabel();
        campoHoraIni = new javax.swing.JTextField();
        campoTipoReu = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaReunion = new javax.swing.JList();
        campoFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setText("Lista de reuniones");

        etiquetaFecha.setText("Fecha : ");

        etiquetaHoraIni.setText("Hora inicio :");

        etiquetaTipoReu.setText("Tipo Reunión :");

        campoTipoReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoReuActionPerformed(evt);
            }
        });

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(etiquetaHoraIni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaFecha)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(etiquetaTipoReu)
                                .addGap(18, 18, 18)
                                .addComponent(campoTipoReu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194)
                                .addComponent(botonEliminar)
                                .addGap(11, 11, 11)))))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(etiquetaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(etiquetaTipoReu)
                            .addComponent(campoTipoReu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHoraIni)
                            .addComponent(campoHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //COMPROBAR CAMPOS
        Junta junta = new Junta(getFecha() , getTipoReu() , getHoraIni(), iglesia.getId() );
        actualizar_ArrayReuniones(junta);
        actualizar_ListaReuniones();
        actualizarBD(junta);
        //ACTUALIZAR EL PLANIFICAREUNION
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void campoTipoReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoReuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoReuActionPerformed

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
         return campoHoraIni.getText();
      }
    
      public boolean comprobarTipoReu() {
         //DEFINIR
         return true;   
      }

      public String getTipoReu() {
        return campoTipoReu.getText();
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
         fechaActual.setYear( 1900 + fechaActual.getYear());
         Fechas fecha = new Fechas(fechaActual);
         Date fechaInicio = fecha.calcula_FechaInicio();
         Date fechaTermino = fecha.calcula_FechaTermino(); 
         arrayReuniones = operacionesBD.juntasSemanales(fechaInicio , fechaTermino , iglesia.getId()); 
      }
      
      public void actualizar_ArrayReuniones (Junta junta) {
            arrayReuniones.add(junta); 
      }  

      public void actualizar_ListaReuniones() {
       listaReunion.setListData(arrayReuniones.toArray()); 
      }
      
      public void actualizarBD(Junta junta) {
            //AGREGARMOS A LA BD UNA JUNTA.
          operacionesBD.insertarJuntaSemanal(junta);
      }
      
    //Atributos
    private ArrayList<Junta> arrayReuniones;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JTextField campoHoraIni;
    private javax.swing.JTextField campoTipoReu;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaHoraIni;
    private javax.swing.JLabel etiquetaTipoReu;
    private javax.swing.JLabel etiquetaTitulo;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaReunion;
    // End of variables declaration//GEN-END:variables
}
