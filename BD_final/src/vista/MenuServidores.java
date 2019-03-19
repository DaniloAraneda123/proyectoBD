
package vista;
import java.util.ArrayList;
import modelo.Iglesia;
import modelo.Servidor;
import modelo.Operaciones;

        
public class MenuServidores extends javax.swing.JDialog {

    public MenuServidores(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia iglesia) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        setIglesia(iglesia);
        iniciar_ArrayServidores();
        actualizar_ListaServidores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaMail = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTelefonos = new javax.swing.JList();
        botonAgregarMail = new javax.swing.JButton();
        botonEliminarMail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMails = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaServidores = new javax.swing.JList();
        botonAgregarTele = new javax.swing.JButton();
        botonEliminarTele = new javax.swing.JButton();
        botonAgregarServidor = new javax.swing.JButton();
        etiquetaRut = new javax.swing.JLabel();
        botonEliminarServidor = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        campoFechaNac = new com.toedter.calendar.JDateChooser();
        campoRut = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaFechaNac = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        etiquetaEspecialidad = new javax.swing.JLabel();
        etiquetaGenero = new javax.swing.JLabel();
        campoEspecialidad = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Lista de servidores");

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

        botonAgregarMail.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarMail.setToolTipText("agregar mail");
        botonAgregarMail.setBorder(null);
        botonAgregarMail.setBorderPainted(false);
        botonAgregarMail.setFocusable(false);
        botonAgregarMail.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMailActionPerformed(evt);
            }
        });

        botonEliminarMail.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarMail.setToolTipText("eliminar mail");
        botonEliminarMail.setBorder(null);
        botonEliminarMail.setBorderPainted(false);
        botonEliminarMail.setFocusPainted(false);
        botonEliminarMail.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        listaMails.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaMails);

        listaServidores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaServidores);

        botonAgregarTele.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarTele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarTele.setToolTipText("agregar telefono");
        botonAgregarTele.setBorder(null);
        botonAgregarTele.setBorderPainted(false);
        botonAgregarTele.setFocusable(false);
        botonAgregarTele.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTeleActionPerformed(evt);
            }
        });

        botonEliminarTele.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarTele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarTele.setToolTipText("eliminar telefono");
        botonEliminarTele.setBorder(null);
        botonEliminarTele.setBorderPainted(false);
        botonEliminarTele.setFocusPainted(false);
        botonEliminarTele.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        botonAgregarServidor.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregarServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregarServidor.setToolTipText("agregar servidor");
        botonAgregarServidor.setBorder(null);
        botonAgregarServidor.setBorderPainted(false);
        botonAgregarServidor.setFocusable(false);
        botonAgregarServidor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarServidorActionPerformed(evt);
            }
        });

        etiquetaRut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaRut.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaRut.setText("Rut :");

        botonEliminarServidor.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminarServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminarServidor.setToolTipText("eliminar servidor");
        botonEliminarServidor.setBorder(null);
        botonEliminarServidor.setBorderPainted(false);
        botonEliminarServidor.setFocusPainted(false);
        botonEliminarServidor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("Nombre :");

        etiquetaApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaApellido.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaApellido.setText("Apellido :");

        etiquetaFechaNac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaFechaNac.setText("Fecha Nac :");

        etiquetaEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEspecialidad.setText("Especialidad :");

        etiquetaGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaGenero.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGenero.setText("Género :");

        etiquetaTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTelefono.setText("Teléfono :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo)
                .addGap(229, 229, 229))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminarTele)
                            .addComponent(botonAgregarTele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAgregarMail)
                                    .addComponent(botonEliminarMail)))
                            .addComponent(campoMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(etiquetaTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(etiquetaMail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(etiquetaApellido)
                                        .addGap(25, 25, 25)
                                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etiquetaRut)
                                            .addComponent(etiquetaNombre))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoRut)
                                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addComponent(etiquetaFechaNac)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaEspecialidad)
                                    .addComponent(etiquetaGenero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(botonAgregarServidor)
                .addGap(115, 115, 115)
                .addComponent(botonEliminarServidor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaApellido)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaEspecialidad)
                            .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaFechaNac)
                                .addComponent(etiquetaGenero)
                                .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaRut)
                            .addComponent(campoRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAgregarMail)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminarMail))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTelefono)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaMail))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAgregarTele)
                                .addGap(11, 11, 11)
                                .addComponent(botonEliminarTele))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarServidor)
                    .addComponent(botonEliminarServidor))
                .addGap(31, 31, 31))
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

    private void campoMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMailActionPerformed

    }//GEN-LAST:event_campoMailActionPerformed

    private void botonAgregarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarServidorActionPerformed
               //COMPROBAR CAMPOS
        Servidor servidor = new Servidor();
        actualizar_ArrayServidores(servidor);
        actualizar_ListaServidores();
        actualizarBD(servidor); 
    }//GEN-LAST:event_botonAgregarServidorActionPerformed

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
   public boolean comprobarCampoRut() {
       //DEFINIR
       return true;
   }

   public String getCampoRut () {
       return campoRut.getText();
   }

   public boolean comprobarCampoNombre() {
       //DEFINIR
       return true;
   }
   
   public String getCampoNombre () {
      return campoNombre.getText();
   }
 
   public boolean comprobarCampoApellido () {
       //DEFINIR
       return true;
   }
   
   public String getCampoApellido() {
       return campoApellido.getText();
   }

   public boolean comprobarCampoTelefono() {
      //DEFINIR
       return true;
   }

   public String getCampoTelefono () {
      return campoTelefono.getText();
   }
   
   public boolean comprobarCampoMail() {
      //DEFINIR
       return true;
   }
   
   public String getCampoMail() {
      return campoMail.getText();
   }

   public boolean comprobarCampoFechaNac () {
       //DEFINIR     
       return true;
   }
   
   public String getCampoFechaNac() {
      return campoFechaNac.toString();
   }

   public boolean comprobarCampoEspecialidad() {
      //DEFINIR
       return true;
   }

   public String getCampoEspecialidad() {
       return campoEspecialidad.getText();
   }
   
   public boolean comprobarCampoGenero() {
       //DEFINIR
       return true;
   }

   public String getCampoGenero () {
       return campoGenero.getText();
   } 

   public ArrayList<String> getlListaTelefonos()  {
      return arrayTelefonos;
   }  

   public ArrayList<String> getListaMails() {
       return arrayMails;
   }
 
    
    //////////////////////////////////////////////////////////
   
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
   
   public void iniciar_ArrayServidores() {
      arrayServidores = operacionesBD.consultar.servidoresIglesia(iglesia.getId());   
   }
  
   public void  actualizar_ArrayServidores(Servidor servidor) {
     arrayServidores.add(servidor);
   }

   public void actualizar_ListaServidores (){
           listaServidores.setListData(arrayServidores.toArray()); 
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
        listaServidores.setVisibleRowCount(7);
        listaTelefonos.setVisibleRowCount(7);
        listaMails.setVisibleRowCount(7);
   }
   
   public void actualizarBD(Servidor servidor) {
      operacionesBD.insertar.insertarServidor(servidor);
   }
    
    //Atributos
    private ArrayList<String> arrayMails;
    private ArrayList<String> arrayTelefonos;
    private ArrayList<Servidor> arrayServidores;
    private Operaciones operacionesBD;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarMail;
    private javax.swing.JButton botonAgregarServidor;
    private javax.swing.JButton botonAgregarTele;
    private javax.swing.JButton botonEliminarMail;
    private javax.swing.JButton botonEliminarServidor;
    private javax.swing.JButton botonEliminarTele;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoEspecialidad;
    private com.toedter.calendar.JDateChooser campoFechaNac;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoMail;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoRut;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaEspecialidad;
    private javax.swing.JLabel etiquetaFechaNac;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaMail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaRut;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaMails;
    private javax.swing.JList listaServidores;
    private javax.swing.JList listaTelefonos;
    // End of variables declaration//GEN-END:variables
}
