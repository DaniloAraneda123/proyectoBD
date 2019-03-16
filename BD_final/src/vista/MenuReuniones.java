
package vista;
import java.util.ArrayList;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listaReunion = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaHoraIni = new javax.swing.JLabel();
        campoFecha = new javax.swing.JTextField();
        campoHoraIni = new javax.swing.JTextField();
        etiquetaTipoReu = new javax.swing.JLabel();
        etiquetaHoraTer = new javax.swing.JLabel();
        campoTipoReu = new javax.swing.JTextField();
        campoHoraTer = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("lista de reuniones");
        setBackground(new java.awt.Color(52, 152, 219));

        jScrollPane1.setBackground(new java.awt.Color(52, 152, 219));

        listaReunion.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaReunion);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setText("Lista de reuniones");

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaFecha.setText("Fecha : ");

        etiquetaHoraIni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHoraIni.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaHoraIni.setText("Hora inicio :");

        etiquetaTipoReu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTipoReu.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaTipoReu.setText("Tipo Reunión :");

        etiquetaHoraTer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHoraTer.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaHoraTer.setText("Hora termino :");

        campoTipoReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoReuActionPerformed(evt);
            }
        });

        campoHoraTer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoraTerActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(etiquetaTitulo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaHoraIni)
                                .addComponent(etiquetaFecha))
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaHoraTer)
                                .addComponent(etiquetaTipoReu))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoTipoReu)
                                .addComponent(campoHoraTer)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar)
                    .addComponent(botonEliminar))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaFecha))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaHoraIni)
                            .addComponent(campoHoraIni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(etiquetaTipoReu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaHoraTer)
                                    .addComponent(campoHoraTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(campoTipoReu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(botonAgregar)
                        .addGap(37, 37, 37)
                        .addComponent(botonEliminar)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoHoraTerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoraTerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoraTerActionPerformed
      
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //COMPROBAR CAMPOS
        Junta junta = new Junta();
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

      public String getFecha () {
        return campoFecha.getText();
      }
      

      public boolean comprobarHoraIni() {
          //DEFINIR
          return true;
      }

      public String getHoraIni() {
         return campoHoraIni.getText();
      }
       
      public boolean comprobarHoraTer() {
          //DEFINIR
          return true;
      }

      public String getHoraTer () {
         return campoHoraTer.getText();
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
       arrayReuniones = operacionesBD.obtenerListaReuniones();
      }
      
      public void actualizar_ArrayReuniones (Junta junta) {
            arrayReuniones.add(junta); 
      }  

      public void actualizar_ListaReuniones() {
       arrayReuniones.setListData(arrayReuniones.toArray()); 
      }
      
      public void actualizarBD(Junta junta) {
            //AGREGARMOS A LA BD UNA JUNTA.
      }
      
    //Atributos
    private ArrayList<Junta> arrayReuniones;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoHoraIni;
    private javax.swing.JTextField campoHoraTer;
    private javax.swing.JTextField campoTipoReu;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaHoraIni;
    private javax.swing.JLabel etiquetaHoraTer;
    private javax.swing.JLabel etiquetaTipoReu;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaReunion;
    // End of variables declaration//GEN-END:variables
}
