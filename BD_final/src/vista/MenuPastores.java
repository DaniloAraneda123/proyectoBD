
package vista;
import java.util.ArrayList;
import modelo.Iglesia;
import modelo.Operaciones;
import modelo.Pastor;


public class MenuPastores extends javax.swing.JDialog {


    public MenuPastores(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia igle ) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        setIglesia(igle);
        iniciar_ArrayPastores();
        actualizar_ListaPastores();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        botonEliminarMail = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPastores = new javax.swing.JList();
        etiquetaJerarquia = new javax.swing.JLabel();
        campoJerarquia = new javax.swing.JTextField();
        campoRut = new javax.swing.JTextField();
        etiquetaRut = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        etiquetaFechaNac = new javax.swing.JLabel();
        etiquetaGenero = new javax.swing.JLabel();
        campoFechaNac = new com.toedter.calendar.JDateChooser();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaMail = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        campoMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTelefonos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMails = new javax.swing.JList();
        botonAgregarTele = new javax.swing.JButton();
        botonEliminarTele = new javax.swing.JButton();
        botonAgregarMail = new javax.swing.JButton();
        botonAgregarPastor = new javax.swing.JButton();
        botonEliminarPastor = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Lista de pastores");

        botonEliminarMail.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarMail.setToolTipText("eliminar mail");
        botonEliminarMail.setBorder(null);
        botonEliminarMail.setBorderPainted(false);
        botonEliminarMail.setFocusPainted(false);
        botonEliminarMail.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        listaPastores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaPastores);

        etiquetaJerarquia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaJerarquia.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaJerarquia.setText("Jerarquía :");

        etiquetaRut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaRut.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaRut.setText("Rut :");

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("Nombre :");

        etiquetaApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaApellido.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaApellido.setText("Apellido :");

        etiquetaFechaNac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaFechaNac.setText("Fecha Nac :");

        etiquetaGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaGenero.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGenero.setText("Género :");

        etiquetaTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTelefono.setText("Teléfono :");

        etiquetaMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaMail.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaMail.setText("Mail :");

        campoMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMailActionPerformed(evt);
            }
        });

        listaTelefonos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaTelefonos);

        listaMails.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaMails);

        botonAgregarTele.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarTele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarTele.setToolTipText("AGREGAR TELEFONO");
        botonAgregarTele.setBorder(null);
        botonAgregarTele.setBorderPainted(false);
        botonAgregarTele.setFocusPainted(false);
        botonAgregarTele.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTeleActionPerformed(evt);
            }
        });

        botonEliminarTele.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarTele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarTele.setToolTipText("eliminar telefoono");
        botonEliminarTele.setBorder(null);
        botonEliminarTele.setBorderPainted(false);
        botonEliminarTele.setFocusPainted(false);
        botonEliminarTele.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        botonAgregarMail.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarMail.setToolTipText("agregar mail");
        botonAgregarMail.setBorder(null);
        botonAgregarMail.setBorderPainted(false);
        botonAgregarMail.setFocusPainted(false);
        botonAgregarMail.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMailActionPerformed(evt);
            }
        });

        botonAgregarPastor.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarPastor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarPastor.setToolTipText("agregar pastor");
        botonAgregarPastor.setBorder(null);
        botonAgregarPastor.setBorderPainted(false);
        botonAgregarPastor.setFocusPainted(false);
        botonAgregarPastor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarPastor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPastorActionPerformed(evt);
            }
        });

        botonEliminarPastor.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarPastor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarPastor.setToolTipText("eliminar pastor");
        botonEliminarPastor.setBorder(null);
        botonEliminarPastor.setBorderPainted(false);
        botonEliminarPastor.setFocusPainted(false);
        botonEliminarPastor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(etiquetaApellido)
                                        .addComponent(etiquetaTitulo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaFechaNac)
                                        .addGap(88, 88, 88))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(botonEliminarTele)
                                                    .addComponent(botonAgregarTele)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(etiquetaNombre)
                                                    .addComponent(etiquetaTelefono))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                                    .addComponent(campoTelefono))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(etiquetaMail)))
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(60, 60, 60)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(botonAgregarMail)
                                                    .addComponent(botonEliminarMail)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(etiquetaJerarquia)
                                                    .addComponent(etiquetaGenero))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(campoJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(etiquetaRut)
                                        .addGap(28, 28, 28)
                                        .addComponent(campoRut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregarPastor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminarPastor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaRut)
                            .addComponent(campoRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaApellido)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaJerarquia)
                            .addComponent(campoJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaNombre)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaFechaNac))
                            .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaGenero)
                            .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMail)
                    .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonAgregarPastor)
                        .addGap(26, 26, 26)
                        .addComponent(botonEliminarPastor)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(botonAgregarTele)
                                    .addGap(14, 14, 14)
                                    .addComponent(botonEliminarTele)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(botonAgregarMail)
                                    .addGap(18, 18, 18)
                                    .addComponent(botonEliminarMail))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMailActionPerformed

    private void botonAgregarPastorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPastorActionPerformed
        //COMPROBAR CAMPOS
     Pastor pastor = new Pastor();
     actualizar_ArrayPastores(pastor);
     actualizar_ListaPastores();
     actualizarBD(pastor); 
    }//GEN-LAST:event_botonAgregarPastorActionPerformed

    private void botonAgregarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarMailActionPerformed
        comprobarCampoMail();
        String nuevoMail = getCampoMail();
        actualizar_ArrayMail(nuevoMail);
        actualizar_ListaMails();
    }//GEN-LAST:event_botonAgregarMailActionPerformed

    private void botonAgregarTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTeleActionPerformed
       comprobarCampoTelefono();
       String telefono = getCampoTelefono();
       actualizar_ArrayTelefono(telefono);
       actualizar_ListaTelefonos();
       
    }//GEN-LAST:event_botonAgregarTeleActionPerformed

    
    //Metodos
   public boolean comprobarCampoJerarquia () {
       return getCampoJerarquia().matches("[1-9]+");
   } 
   public String getCampoJerarquia () {
       return campoJerarquia.getText();
   }
   
     public boolean comprobarCampoRut() {
       return ValidarDatos.validarRut(getCampoRut());
   }

   public String getCampoRut () {
       return campoRut.getText();
   }

   public boolean comprobarCampoNombre() {
       return getCampoNombre().matches("[^0-9]*");
   }
   
   public String getCampoNombre () {
      return campoNombre.getText();
   }
 
   public boolean comprobarCampoApellido () {
       return getCampoApellido().matches("[^0-9]*");
   }
   
   public String getCampoApellido() {
       return campoApellido.getText();
   }

   public boolean comprobarCampoTelefono() {
       return getCampoTelefono().matches("^[0-9]{8}$");
   }

   public String getCampoTelefono () {
      return campoTelefono.getText();
   }
   
   public boolean comprobarCampoMail() {
       return getCampoMail().matches("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
   }
   
   public String getCampoMail() {
      return campoMail.getText();
   }

   public boolean comprobarCampoFechaNac () {     
       return getCampoFechaNac().matches("\\d{4}-\\d{2}-\\d{2}");
   }
   
   public String getCampoFechaNac() {
      return campoFechaNac.toString();
   }

   public boolean comprobarCampoEspecialidad() {
       return getCampoEspecialidad.matches("[^0-9]*");
   }

   public String getCampoEspecialidad() {
       return campoEspecialidad.getText();
   }
   
   public boolean comprobarCampoGenero() {
       return getCampoGenero.matches("[01]{1}");
   }

   public String getCampoGenero () {
       return campoGenero.getText();
   } 
 
    ///////////////////////////////////////
   
   public void setOperacionesBD (Operaciones ope) {
        operacionesBD = ope;
   }
  
   public Operaciones getOperacionesBD() {
       return operacionesBD;
   } 
   
   public void setIglesia(Iglesia igle) {
       iglesia = igle;
   }
   
   public Iglesia getIglesia () {
      return iglesia;
   }
    
   public void iniciar_ArrayPastores() {
      arrayPastores = operacionesBD.consultar.obtenerPastores(Integer.toString(iglesia.getId()));    
   }
  
   public void  actualizar_ArrayPastores(Pastor pastor) {
     arrayPastores.add(pastor);
   }

   public void actualizar_ListaPastores (){
           listaPastores.setListData(arrayPastores.toArray()); 
   }
 
   public void actualizar_ArrayMail (String mail)  {
        arrayMails.add(mail);
   }

   public void actualizar_ListaMails() {
          listaMails.setListData(arrayMails.toArray());    
   }

   public void actualizar_ArrayTelefono (String telefono ) {
       arrayTelefonos.add(telefono);
   } 
   
   public void actualizar_ListaTelefonos () {
       listaTelefonos.setListData(arrayTelefonos.toArray()); 
   }  
  
   public void iniciar_componentes () {
        listaPastores.setVisibleRowCount(7);
        listaTelefonos.setVisibleRowCount(7);
        listaMails.setVisibleRowCount(7);
   }
   
   public void actualizarBD(Pastor pastor) {
      operacionesBD.insertar.insertarPastor(pastor);
   }
   
    //Atributos
    private ArrayList<String> arrayMails;
    private ArrayList<String> arrayTelefonos;
    private ArrayList<Pastor> arrayPastores;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarMail;
    private javax.swing.JButton botonAgregarPastor;
    private javax.swing.JButton botonAgregarTele;
    private javax.swing.JButton botonEliminarMail;
    private javax.swing.JButton botonEliminarPastor;
    private javax.swing.JButton botonEliminarTele;
    private javax.swing.JTextField campoApellido;
    private com.toedter.calendar.JDateChooser campoFechaNac;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoJerarquia;
    private javax.swing.JTextField campoMail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoRut;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaFechaNac;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaJerarquia;
    private javax.swing.JLabel etiquetaMail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRut;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList listaMails;
    private javax.swing.JList listaPastores;
    private javax.swing.JList listaTelefonos;
    // End of variables declaration//GEN-END:variables
}
