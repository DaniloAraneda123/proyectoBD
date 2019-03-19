

package vista;
import modelo.Operaciones;
import java.util.ArrayList;
import modelo.Pastor;
import modelo.Iglesia; 
import modelo.Sector;
import modelo.Servidor;
import modelo.Junta;
import modelo.Participa;
import modelo.PastorPredica;
import modelo.Trabaja_para;
import javax.swing.DefaultComboBoxModel;

public class PlanificaReunion extends javax.swing.JDialog {

 
    public PlanificaReunion(java.awt.Frame parent, boolean modal ,Operaciones ope , Iglesia iglesia , Junta junta) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        setIglesia(iglesia);
        setReunion(junta);
        iniciar_Componentes(junta);
        iniciar_ArrayServidores();
        iniciar_ArraySectores();
        iniciar_ArrayPastores();
        actualizar_CampoSectores();
        actualizar_CampoPastor();
        actualizar_CampoServidor();
        pack();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoSectorSer = new javax.swing.JComboBox();
        botonElimiinarSer = new javax.swing.JButton();
        campoPastor = new javax.swing.JComboBox();
        etiquetaDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaServidores = new javax.swing.JList();
        campoAccionServidor = new javax.swing.JTextField();
        etiquetaServidores = new javax.swing.JLabel();
        campoAccionPastor = new javax.swing.JTextField();
        etiquetaPastores = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPastores = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JTextArea();
        etiquetaPastor = new javax.swing.JLabel();
        etiquetaAccionPas = new javax.swing.JLabel();
        etiquetaServidor = new javax.swing.JLabel();
        etiquetaAccion = new javax.swing.JLabel();
        etiquetaSector = new javax.swing.JLabel();
        campoServidor = new javax.swing.JComboBox();
        botonAgregarSer = new javax.swing.JButton();
        botonAgregarPas = new javax.swing.JButton();
        botonEliminarPas = new javax.swing.JButton();
        etiquetaHora = new javax.swing.JLabel();
        etiquetaHoraActual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        botonElimiinarSer.setBackground(new java.awt.Color(52, 152, 219));
        botonElimiinarSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonElimiinarSer.setBorder(null);
        botonElimiinarSer.setBorderPainted(false);
        botonElimiinarSer.setFocusPainted(false);
        botonElimiinarSer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        campoPastor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaDescripcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDescripcion.setText("Descripción");

        jScrollPane1.setViewportView(listaServidores);

        etiquetaServidores.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaServidores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaServidores.setText("Servidores");

        etiquetaPastores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaPastores.setText("Pastores");

        jScrollPane3.setViewportView(listaPastores);

        listaActividades.setColumns(20);
        listaActividades.setRows(5);
        jScrollPane2.setViewportView(listaActividades);

        etiquetaPastor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaPastor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPastor.setText("Pastor :");

        etiquetaAccionPas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaAccionPas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAccionPas.setText("Acción :");

        etiquetaServidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaServidor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaServidor.setText("Servidor :");

        etiquetaAccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaAccion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAccion.setText("Acción :");

        etiquetaSector.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaSector.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSector.setText("Sector :");

        campoServidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonAgregarSer.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarSer.setBorder(null);
        botonAgregarSer.setBorderPainted(false);
        botonAgregarSer.setFocusPainted(false);
        botonAgregarSer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarSerActionPerformed(evt);
            }
        });

        botonAgregarPas.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarPas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarPas.setBorder(null);
        botonAgregarPas.setBorderPainted(false);
        botonAgregarPas.setFocusPainted(false);
        botonAgregarPas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPasActionPerformed(evt);
            }
        });

        botonEliminarPas.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarPas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarPas.setBorder(null);
        botonEliminarPas.setBorderPainted(false);
        botonEliminarPas.setFocusPainted(false);
        botonEliminarPas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        etiquetaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHora.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaHora.setText("Hora");

        etiquetaHoraActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHoraActual.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaHoraActual.setText(" (hora)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaServidores, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonAgregarSer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonElimiinarSer))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaServidor)
                                            .addComponent(etiquetaAccion)
                                            .addComponent(etiquetaSector))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoAccionServidor)
                                            .addComponent(campoServidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoSectorSer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPastores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonAgregarPas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonEliminarPas))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaPastor)
                                            .addComponent(etiquetaAccionPas))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoAccionPastor)
                                            .addComponent(campoPastor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaDescripcion)
                                .addGap(52, 52, 52)
                                .addComponent(etiquetaHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaServidores)
                    .addComponent(etiquetaPastores))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaServidor)
                    .addComponent(campoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPastor)
                    .addComponent(campoPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAccion)
                    .addComponent(campoAccionServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAccionPas)
                    .addComponent(campoAccionPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSector)
                    .addComponent(campoSectorSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonElimiinarSer)
                    .addComponent(botonAgregarSer)
                    .addComponent(botonAgregarPas)
                    .addComponent(botonEliminarPas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDescripcion)
                    .addComponent(etiquetaHora)
                    .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        reunion.setDescripcion(obtenerListaActividades());
        operacionesBD.actualizar.actualizarDescripcion(reunion.getDescripcion(), reunion);
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       iniciar_ArrayPastores();
       iniciar_ArrayServidores();
       iniciar_ArraySectores();
       actualizar_CampoPastor();
       actualizar_CampoServidor();
       actualizar_CampoSectores();
    }//GEN-LAST:event_formWindowGainedFocus

    private void botonAgregarPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPasActionPerformed
        Pastor pastor = obtenerCampoPastor();
        PastorPredica pastorPredica = new PastorPredica(reunion.getFecha(), reunion.getHoraInicio(), pastor.getRut(), obtenerCampoAccionPastor() , iglesia.getId());
        Trabaja_para trabajaPara = new Trabaja_para( iglesia.getId() , pastor.getRut());
        actualizar_ArrayListaPastores(pastor);
        actualizarBD_PastorPredica(pastorPredica);
        actualizarBD_TrabajaPara(trabajaPara);
        actualizar_ListaPastor();
    }//GEN-LAST:event_botonAgregarPasActionPerformed

    private void botonAgregarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSerActionPerformed
        Servidor servidor = obtenerCampoServidor();
        Sector sector = obtenerCampoSectorSer();
        String accion = obtenerCampoAccionServidor();
        Participa servidorParticipa = new Participa(servidor.getRut() , reunion.getHoraInicio(), reunion.getFecha() , iglesia.getId() , servidor.getEspecialidad(), sector.getId() , accion);
        actualizar_ArrayListaServidores(servidor);
        actualizarBD_PersonaParticipa(servidorParticipa);
        actualizar_ListaServidor();
    }//GEN-LAST:event_botonAgregarSerActionPerformed

  ///////////////////////////////////////////////////////////////////  
   public String obtenerCampoAccionServidor () {
       return campoAccionServidor.getText();
   }

   public String obtenerCampoAccionPastor () {
       return campoAccionPastor.getText();
   }

   public Pastor obtenerCampoPastor () {
       Pastor pastor = (Pastor) campoPastor.getSelectedItem();
       return pastor;
   }

   public Sector obtenerCampoSectorSer () {
       Sector sector = (Sector) campoSectorSer.getSelectedItem();
       return sector;
   }

   public Servidor obtenerCampoServidor () {
       Servidor servidor = (Servidor) campoServidor.getSelectedItem();
       return servidor;
   }
   
   public String obtenerListaActividades () {
      return listaActividades.getText();
   }
  ///////////////////////////////////////////////////////////////////  
   public void iniciar_Componentes (Junta reunion) {
       etiquetaHoraActual.setText(reunion.getHoraInicio());
       listaPastores.setVisibleRowCount(7);
       listaServidores.setVisibleRowCount(7);
   }
   
   public void iniciar_ArrayServidores () {
       arrayServidores = operacionesBD.consultar.servidoresIglesia(iglesia.getId());
   }
   
   public void iniciar_ArrayPastores () {
     arrayPastores = operacionesBD.consultar.obtenerPastores(iglesia.getId());
   } 

   public void iniciar_ArraySectores () {
     arraySectores = operacionesBD.consultar.obtenerSectores(iglesia.getId());
   }
  
   public void iniciar_ListaServidores () {
    arrayListaServidores  = operacionesBD.consultar.participantesJunta(reunion);
   }

   public void iniciar_ListaPastores () {
    arrayListaPastores = operacionesBD.consultar.pastoresJunta(reunion);
   }
   /////////////////////////////////////////////////////////////////////////////
   public void setIglesia (Iglesia igle) {
      iglesia = igle;
   }
  
   public Iglesia getIglesia () {
      return iglesia;
   }

   public void setOperacionesBD (Operaciones ope)  {
       operacionesBD = ope;
   }

   public Operaciones getOperacionesBD () {
       return operacionesBD;
   }
   
   public void setReunion ( Junta junta) {
        reunion = junta;
   }
   /////////////////////////////////////////////////////////////////////////////
     public void actualizar_CampoServidor() {
        campoServidor.setModel( new DefaultComboBoxModel<>( arrayServidores.toArray()) );
     } 
 
     public void actualizar_CampoPastor() {
        campoPastor.setModel( new DefaultComboBoxModel<>(arrayPastores.toArray()));
     }
     
     public void actualizar_CampoSectores () {
         campoSectorSer.setModel(new DefaultComboBoxModel<>(arraySectores.toArray()));
     }
  
     public void actualizar_ListaServidor () {
        listaServidores.setListData(arrayServidores.toArray()); 
     }  

     public void actualizar_ListaPastor () {
        listaPastores.setListData(arrayPastores.toArray());
     }  
   ///////////////////////////////////////////////////////////////////////////// 
   public void actualizar_ArraySectores(Sector sector) {
       arraySectores.add(sector);
   }

   public void actualizar_ArrayServidores(Servidor servidor) {
       arrayServidores.add(servidor);
   }

   public void actualizar_ArrayPastores(Pastor pastor) {
       arrayPastores.add(pastor);
   }
   
   public void actualizar_ArrayListaServidores (Servidor servidor ) {
        arrayListaServidores.add(servidor);
   }

   public void actualizar_ArrayListaPastores (Pastor pastor) {
        arrayListaPastores.add(pastor);
   }
   /////////////////////////////////////////////////////////////////////////////
   public void actualizarBD_PersonaParticipa (Participa personaParticipa) {
           operacionesBD.insertar.insertarParticipa(personaParticipa);
   }

   public void actualizarBD_PastorPredica (PastorPredica pastorPredica) {
           operacionesBD.insertar.insertarPastorPredica (pastorPredica);
   }

   public void actualizarBD_TrabajaPara (Trabaja_para pastorTrabaja) {
           operacionesBD.insertar.insertarTrabajaPara(pastorTrabaja);
   }
   /////////////////////////////////////////////////////////////////////////////

    //Atributos
    private Operaciones operacionesBD ;
    private Iglesia iglesia;
    private ArrayList<Pastor> arrayPastores;
    private ArrayList<Servidor> arrayServidores;
    private ArrayList<Sector> arraySectores;
    private ArrayList<Pastor> arrayListaPastores;
    private ArrayList<Servidor> arrayListaServidores;
    private Junta reunion;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPas;
    private javax.swing.JButton botonAgregarSer;
    private javax.swing.JButton botonElimiinarSer;
    private javax.swing.JButton botonEliminarPas;
    private javax.swing.JTextField campoAccionPastor;
    private javax.swing.JTextField campoAccionServidor;
    private javax.swing.JComboBox campoPastor;
    private javax.swing.JComboBox campoSectorSer;
    private javax.swing.JComboBox campoServidor;
    private javax.swing.JLabel etiquetaAccion;
    private javax.swing.JLabel etiquetaAccionPas;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaHoraActual;
    private javax.swing.JLabel etiquetaPastor;
    private javax.swing.JLabel etiquetaPastores;
    private javax.swing.JLabel etiquetaSector;
    private javax.swing.JLabel etiquetaServidor;
    private javax.swing.JLabel etiquetaServidores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea listaActividades;
    private javax.swing.JList listaPastores;
    private javax.swing.JList listaServidores;
    // End of variables declaration//GEN-END:variables
}
