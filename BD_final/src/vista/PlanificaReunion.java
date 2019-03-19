package vista;

import modelo.Operaciones;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Pastor;
import modelo.Iglesia; 
import modelo.Sector;
import modelo.Servidor;
import modelo.Junta;
import modelo.Participa;
import modelo.PastorPredica;
import modelo.TipoActividad;

public class PlanificaReunion extends javax.swing.JDialog 
{

    //Atributos
    private Operaciones operacionesBD ;
    private Iglesia iglesia;
    private ArrayList<Pastor> pastoresJunta;
    private ArrayList<Servidor> servidoresJunta;
    private ArrayList<Sector> sectores;
    private ArrayList<Pastor> pastoresIglesia;
    private ArrayList<Servidor> servidoresIglesia;
    private Junta reunion;
    private ArrayList<TipoActividad> actividades;
    private Pastor ps;
 
    public PlanificaReunion(java.awt.Frame parent, boolean modal ,Operaciones ope , Iglesia iglesia , Junta junta) {
        super(parent, modal);
        initComponents();
        this.operacionesBD=ope;
        this.iglesia=iglesia;
        this.reunion=junta;
        
        consultarDatos();
        llenarComponentes();
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
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
        jLabel2 = new javax.swing.JLabel();
        campoActividades = new javax.swing.JComboBox();
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
        txtDescripcion = new javax.swing.JTextArea();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaHoraActual = new javax.swing.JLabel();
        descripcion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

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
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles Junta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(52, 152, 219));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), java.awt.Color.darkGray, java.awt.Color.darkGray));

        etiquetaServidores.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaServidores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaServidores.setText("Servidores");

        etiquetaServidor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaServidor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaServidor.setText("Servidor :");

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
        botonElimiinarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElimiinarSerActionPerformed(evt);
            }
        });

        listaServidores.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(listaServidores);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Actividad:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(etiquetaServidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregarSer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonElimiinarSer))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaServidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaAccion)
                            .addComponent(etiquetaSector)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoSectorSer, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoServidor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoAccionServidor)
                            .addComponent(campoActividades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAccion)
                    .addComponent(campoAccionServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSector)
                    .addComponent(campoSectorSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregarSer, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonElimiinarSer, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(52, 152, 219));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, new java.awt.Color(51, 51, 51), java.awt.Color.darkGray, java.awt.Color.darkGray));

        etiquetaPastores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaPastores.setText("Pastores");

        etiquetaPastor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaPastor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPastor.setText("Pastor :");

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
        botonEliminarPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPasActionPerformed(evt);
            }
        });

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

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        etiquetaDescripcion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDescripcion.setText("Descripción");

        etiquetaHoraActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaHoraActual.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaHoraActual.setText(" (hora)");

        descripcion.setText("Editar Descripcion");
        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(etiquetaDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descripcion)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaDescripcion)
                        .addComponent(etiquetaHoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descripcion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu2.setText("Opciones");

        jMenuItem3.setText("Ver Perfil Servidor");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Ver Perfil Pastor");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    }//GEN-LAST:event_formWindowClosed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void botonAgregarPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPasActionPerformed
        ps=pastoresIglesia.remove(campoPastor.getSelectedIndex());//pastor Escojido
        
        pastoresJunta.add(ps);
        
        campoPastor.setModel( new DefaultComboBoxModel<>( pastoresIglesia.toArray()) );
        
        listaPastores.setListData(pastoresJunta.toArray());
        
        operacionesBD.insertar.insertarPastorPredica(new PastorPredica(reunion.getFecha(),reunion.getHoraInicio(),ps.getRut(),campoAccionPastor.getText(),reunion.getIglesia()));
    }//GEN-LAST:event_botonAgregarPasActionPerformed

    private void botonAgregarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSerActionPerformed
        se=servidoresIglesia.remove(campoServidor.getSelectedIndex());//servidor Escojido
        
        servidoresJunta.add(se);
        
        campoServidor.setModel( new DefaultComboBoxModel<>( servidoresIglesia.toArray()) );
        
        listaServidores.setListData(servidoresJunta.toArray());
        
        operacionesBD.insertar.insertarParticipa(new Participa(se.getRut(),reunion.getHoraInicio(),reunion.getFecha(),iglesia.getId(),
                actividades.get(campoActividades.getSelectedIndex()).getTipo(),sectores.get(campoSectorSer.getSelectedIndex()).getId(),campoAccionServidor.getText()));
        
        
    }//GEN-LAST:event_botonAgregarSerActionPerformed
        
    private void botonElimiinarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElimiinarSerActionPerformed
        se=servidoresJunta.remove(listaServidores.getSelectedIndex());//servidor Escojido
        
        servidoresIglesia.add(se);
        
        campoServidor.setModel( new DefaultComboBoxModel<>( servidoresIglesia.toArray()) );
        
        listaServidores.setListData(servidoresJunta.toArray());
        
        operacionesBD.eliminar.eliminarParticipa(new Participa(se.getRut(),reunion.getHoraInicio(),reunion.getFecha(),iglesia.getId(),
                actividades.get(campoActividades.getSelectedIndex()).getTipo(),sectores.get(campoSectorSer.getSelectedIndex()).getId(),campoAccionServidor.getText()));
    }//GEN-LAST:event_botonElimiinarSerActionPerformed

    private void botonEliminarPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPasActionPerformed
        ps=pastoresJunta.remove(listaPastores.getSelectedIndex());//pastor Escojido
        
        pastoresIglesia.add(ps);
        
        campoPastor.setModel( new DefaultComboBoxModel<>( pastoresIglesia.toArray()) );
        
        listaPastores.setListData(pastoresJunta.toArray());
        
        operacionesBD.eliminar.eliminarPastorPredica(new PastorPredica(reunion.getFecha(),reunion.getHoraInicio(),ps.getRut(),campoAccionPastor.getText(),reunion.getIglesia()));
    }//GEN-LAST:event_botonEliminarPasActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        operacionesBD.actualizar.actualizarDescripcion(txtDescripcion.getText(), reunion);
    }//GEN-LAST:event_descripcionActionPerformed

    private void consultarDatos() 
    {
        pastoresJunta=operacionesBD.consultar.pastoresJunta(reunion);
        
        servidoresJunta=operacionesBD.consultar.participantesJunta(reunion);
        
        servidoresIglesia=operacionesBD.consultar.servidoresIglesia(iglesia.getId());
        
        pastoresIglesia=operacionesBD.consultar.obtenerPastores(iglesia.getId());
        
        sectores=operacionesBD.consultar.obtenerSectores(iglesia.getId());
        
        actividades=operacionesBD.consultar.tipoActividad();
    }
    
    private void llenarComponentes() 
    {
        
        campoActividades.setModel( new DefaultComboBoxModel<>(actividades.toArray()));
         
        etiquetaHoraActual.setText(reunion.getHoraInicio());
        
        campoSectorSer.setModel(new DefaultComboBoxModel<>(sectores.toArray()));
        
        campoServidor.setModel( new DefaultComboBoxModel<>( servidoresIglesia.toArray()) );
        
        campoPastor.setModel( new DefaultComboBoxModel<>(pastoresIglesia.toArray()));
        
        listaServidores.setListData(servidoresJunta.toArray()); 
        
        listaPastores.setListData(pastoresJunta.toArray());
        
        if(reunion.getDescripcion()!=null)
        {
            txtDescripcion.setText(reunion.getDescripcion());
        }
    }
    
    
    private Servidor se;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPas;
    private javax.swing.JButton botonAgregarSer;
    private javax.swing.JButton botonElimiinarSer;
    private javax.swing.JButton botonEliminarPas;
    private javax.swing.JTextField campoAccionPastor;
    private javax.swing.JTextField campoAccionServidor;
    private javax.swing.JComboBox campoActividades;
    private javax.swing.JComboBox campoPastor;
    private javax.swing.JComboBox campoSectorSer;
    private javax.swing.JComboBox campoServidor;
    private javax.swing.JButton descripcion;
    private javax.swing.JLabel etiquetaAccion;
    private javax.swing.JLabel etiquetaAccionPas;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaHoraActual;
    private javax.swing.JLabel etiquetaPastor;
    private javax.swing.JLabel etiquetaPastores;
    private javax.swing.JLabel etiquetaSector;
    private javax.swing.JLabel etiquetaServidor;
    private javax.swing.JLabel etiquetaServidores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaPastores;
    private javax.swing.JList listaServidores;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

}
