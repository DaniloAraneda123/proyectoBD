

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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaHora = new javax.swing.JLabel();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaServidores = new javax.swing.JLabel();
        etiquetaPastores = new javax.swing.JLabel();
        etiquetaHoraActual = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JTextArea();
        etiquetaServidor = new javax.swing.JLabel();
        etiquetaAccion = new javax.swing.JLabel();
        etiquetaSector = new javax.swing.JLabel();
        botonAgregarSer = new javax.swing.JButton();
        botonElimiinarSer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaServidores = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPastores = new javax.swing.JList();
        etiquetaPastor = new javax.swing.JLabel();
        etiquetaAccionPas = new javax.swing.JLabel();
        botonAgregarPas = new javax.swing.JButton();
        botonEliminarPas = new javax.swing.JButton();
        campoServidor = new javax.swing.JComboBox();
        campoSectorSer = new javax.swing.JComboBox();
        campoPastor = new javax.swing.JComboBox();
        campoAccionServidor = new javax.swing.JTextField();
        campoAccionPastor = new javax.swing.JTextField();

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

        etiquetaHora.setText("Hora");

        etiquetaDescripcion.setText("Descripción");

        etiquetaServidores.setText("Servidores");

        etiquetaPastores.setText("Pastores");

        etiquetaHoraActual.setText(" (hora)");

        listaActividades.setColumns(20);
        listaActividades.setRows(5);
        jScrollPane2.setViewportView(listaActividades);

        etiquetaServidor.setText("Servidor :");

        etiquetaAccion.setText("Acción :");

        etiquetaSector.setText("Sector :");

        botonAgregarSer.setText("AGREGAR");
        botonAgregarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarSerActionPerformed(evt);
            }
        });

        botonElimiinarSer.setText("ELIMINAR");

        listaServidores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaServidores);

        listaPastores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaPastores);

        etiquetaPastor.setText("Pastor :");

        etiquetaAccionPas.setText("Acción :");

        botonAgregarPas.setText("AGREGAR");
        botonAgregarPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPasActionPerformed(evt);
            }
        });

        botonEliminarPas.setText("ELIMINAR");

        campoServidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        campoSectorSer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        campoPastor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(etiquetaHora)
                        .addGap(165, 165, 165)
                        .addComponent(etiquetaDescripcion)
                        .addGap(223, 223, 223)
                        .addComponent(etiquetaServidores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(etiquetaAccion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(campoAccionServidor))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(etiquetaSector)
                                            .addGap(18, 18, 18)
                                            .addComponent(campoSectorSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(botonElimiinarSer, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(botonAgregarSer, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etiquetaServidor)
                                    .addGap(18, 18, 18)
                                    .addComponent(campoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(etiquetaAccionPas)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoAccionPastor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(56, 56, 56))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(etiquetaPastores)
                            .addGap(129, 129, 129)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiquetaPastor)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonEliminarPas, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(botonAgregarPas, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPastores)
                    .addComponent(etiquetaServidores)
                    .addComponent(etiquetaDescripcion)
                    .addComponent(etiquetaHora))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaServidor)
                                    .addComponent(campoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaAccion)
                                    .addComponent(campoAccionServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(etiquetaSector)
                                    .addComponent(campoSectorSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonAgregarSer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonElimiinarSer)
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaPastor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoAccionPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaAccionPas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonAgregarPas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarPas)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void botonAgregarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSerActionPerformed
        Servidor servidor = obtenerCampoServidor();
        Sector sector = obtenerCampoSectorSer();
        String accion = obtenerCampoAccionServidor();
        Participa servidorParticipa = new Participa(servidor.getRut() , reunion.getHoraInicio(), reunion.getFecha() , iglesia.getId() , servidor.getEspecialidad(), sector.getId() , accion);
        actualizar_ArrayListaServidores(servidor);
        actualizarBD_PersonaParticipa(servidorParticipa);
        actualizar_ListaServidor();  
    }//GEN-LAST:event_botonAgregarSerActionPerformed

    private void botonAgregarPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPasActionPerformed
        Pastor pastor = obtenerCampoPastor();
        PastorPredica pastorPredica = new PastorPredica(reunion.getFecha(), reunion.getHoraInicio(), pastor.getRut(), obtenerCampoAccionPastor() , iglesia.getId());
        Trabaja_para trabajaPara = new Trabaja_para( iglesia.getId() , pastor.getRut());
        actualizar_ArrayListaPastores(pastor);
        actualizarBD_PastorPredica(pastorPredica);
        actualizarBD_TrabajaPara(trabajaPara);
        actualizar_ListaPastor();
    }//GEN-LAST:event_botonAgregarPasActionPerformed

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
       arrayServidores = operacionesBD.consultar.servidoresIglesia(Integer.toString(iglesia.getId()));
     //arrayServidores = operacionesBD.consultar.servidoresIglesia(iglesia.getId());
   }
   
   public void iniciar_ArrayPastores () {
     arrayPastores = operacionesBD.consultar.obtenerPastores(Integer.toString(iglesia.getId()));
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea listaActividades;
    private javax.swing.JList listaPastores;
    private javax.swing.JList listaServidores;
    // End of variables declaration//GEN-END:variables
}
