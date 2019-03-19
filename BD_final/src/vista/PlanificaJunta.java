package vista;

import modelo.Operaciones;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.Pastor;
import modelo.Iglesia; 
import modelo.Sector;
import modelo.Servidor;
import modelo.Junta;
import modelo.Participa;
import modelo.PastorPredica;
import modelo.Trabaja_para;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class PlanificaJunta extends javax.swing.JDialog {

 
    public PlanificaJunta(java.awt.Frame parent, boolean modal ,Operaciones ope , Iglesia iglesia , Junta junta) {
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
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        etiquetaServidores = new javax.swing.JLabel();
        etiquetaServidor = new javax.swing.JLabel();
        campoServidor = new javax.swing.JComboBox();
        etiquetaAccion = new javax.swing.JLabel();
        campoAccionServidor = new javax.swing.JTextField();
        etiquetaSector = new javax.swing.JLabel();
        campoSectorSer = new javax.swing.JComboBox();
        botonAgregarSer = new javax.swing.JButton();
        botonElimiinarSer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaServidores = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        etiquetaPastores = new javax.swing.JLabel();
        etiquetaPastor = new javax.swing.JLabel();
        campoPastor = new javax.swing.JComboBox();
        etiquetaAccionPas = new javax.swing.JLabel();
        campoAccionPastor = new javax.swing.JTextField();
        botonAgregarPas = new javax.swing.JButton();
        botonEliminarPas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPastores = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JTextArea();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        etiquetaHoraActual = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        selectorFecha = new org.netbeans.modules.form.InvalidComponent();
        jLabel1 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm=new SpinnerDateModel(date, null, null, Calendar.MINUTE);
        selectorTiempo = new javax.swing.JSpinner(sm);

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

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agendar Junta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(52, 152, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), java.awt.Color.darkGray, java.awt.Color.darkGray));

        etiquetaServidores.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaServidores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaServidores.setText("Servidores");

        etiquetaServidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaServidor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaServidor.setText("Servidor :");

        campoServidor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaAccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaAccion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAccion.setText("Acción :");

        etiquetaSector.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaSector.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaSector.setText("Sector :");

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

        botonElimiinarSer.setBackground(new java.awt.Color(52, 152, 219));
        botonElimiinarSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonElimiinarSer.setBorder(null);
        botonElimiinarSer.setBorderPainted(false);
        botonElimiinarSer.setFocusPainted(false);
        botonElimiinarSer.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        listaServidores.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(listaServidores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(etiquetaServidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregarSer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonElimiinarSer))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaServidor)
                            .addComponent(etiquetaAccion)
                            .addComponent(etiquetaSector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSectorSer, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoServidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoAccionServidor))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaServidores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaServidor)
                    .addComponent(campoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAccion)
                    .addComponent(campoAccionServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSector)
                    .addComponent(campoSectorSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregarSer)
                    .addComponent(botonElimiinarSer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, new java.awt.Color(51, 51, 51), java.awt.Color.darkGray, java.awt.Color.darkGray));

        etiquetaPastores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaPastores.setText("Pastores");

        etiquetaPastor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaPastor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPastor.setText("Pastor :");

        campoPastor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        etiquetaAccionPas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaAccionPas.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaAccionPas.setText("Acción :");

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

        listaPastores.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(listaPastores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaPastores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaPastor)
                            .addComponent(etiquetaAccionPas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPastor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoAccionPastor)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonAgregarPas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminarPas)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPastores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPastor)
                    .addComponent(campoPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAccionPas)
                    .addComponent(campoAccionPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarPas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEliminarPas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        listaActividades.setBackground(new java.awt.Color(204, 204, 204));
        listaActividades.setColumns(20);
        listaActividades.setRows(5);
        jScrollPane2.setViewportView(listaActividades);

        etiquetaDescripcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDescripcion.setText("Descripción");

        etiquetaHora.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaHora.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaHora.setText("Hora");

        etiquetaHoraActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHoraActual.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaHoraActual.setText(" (hora)");

        jButton1.setText("Agendar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha");

        JSpinner.DateEditor de = new JSpinner.DateEditor(selectorTiempo, "HH:mm");
        selectorTiempo.setEditor(de);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(etiquetaDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(etiquetaHora))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selectorTiempo))))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDescripcion)
                    .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaHora)
                            .addComponent(selectorTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea listaActividades;
    private javax.swing.JList listaPastores;
    private javax.swing.JList listaServidores;
    private org.netbeans.modules.form.InvalidComponent selectorFecha;
    private javax.swing.JSpinner selectorTiempo;
    // End of variables declaration//GEN-END:variables

}
