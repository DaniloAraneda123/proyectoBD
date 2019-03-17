
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

        botonAgregarMail = new javax.swing.JButton();
        botonEliminarMail = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaServidores = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaRut = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        campoRut = new javax.swing.JTextField();
        etiquetaApellido = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etiquetaFechaNac = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        etiquetaEspecialidad = new javax.swing.JLabel();
        etiquetaGenero = new javax.swing.JLabel();
        campoEspecialidad = new javax.swing.JTextField();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaMail = new javax.swing.JLabel();
        campoGenero = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTelefonos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMails = new javax.swing.JList();
        botonAgregarTele = new javax.swing.JButton();
        botonEliminarTele = new javax.swing.JButton();
        botonAgregarServidor = new javax.swing.JButton();
        botonEliminarServidor = new javax.swing.JButton();
        campoFechaNac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonAgregarMail.setText("AGREGAR");
        botonAgregarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMailActionPerformed(evt);
            }
        });

        botonEliminarMail.setText("ELIMINAR");

        listaServidores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaServidores);

        etiquetaTitulo.setText("Lista de servidores");

        etiquetaRut.setText("Rut :");

        etiquetaNombre.setText("Nombre :");

        etiquetaApellido.setText("Apellido :");

        etiquetaFechaNac.setText("Fecha Nac :");

        etiquetaEspecialidad.setText("Especialidad :");

        etiquetaGenero.setText("Género :");

        etiquetaTelefono.setText("Teléfono :");

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

        botonAgregarTele.setText("AGREGAR");
        botonAgregarTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTeleActionPerformed(evt);
            }
        });

        botonEliminarTele.setText("ELIMINAR");

        botonAgregarServidor.setText("AGREGAR");
        botonAgregarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarServidorActionPerformed(evt);
            }
        });

        botonEliminarServidor.setText("ELIMINAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaRut)
                    .addComponent(etiquetaNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoRut)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaFechaNac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTitulo)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaEspecialidad)
                    .addComponent(etiquetaGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaTelefono)
                .addGap(4, 4, 4)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminarTele)
                            .addComponent(botonAgregarTele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(etiquetaMail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoMail))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAgregarMail)
                                    .addComponent(botonEliminarMail)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregarServidor)
                                .addGap(44, 44, 44)
                                .addComponent(botonEliminarServidor))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaApellido)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaEspecialidad)
                            .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFechaNac)
                            .addComponent(etiquetaGenero)
                            .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaRut)
                            .addComponent(campoRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaMail)
                            .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonAgregarMail)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminarMail))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTelefono)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregarTele)
                                .addGap(11, 11, 11)
                                .addComponent(botonEliminarTele))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarServidor)
                    .addComponent(botonEliminarServidor))
                .addContainerGap(24, Short.MAX_VALUE))
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
       return 0;
   }

   public String getCampoRut () {
       return campoRut.getText();
   }

   public boolean comprobarCampoNombre() {
       //DEFINIR
       return 0;
   }
   
   public String getCampoNombre () {
      return campoNombre.getText();
   }
 
   public boolean comprobarCampoApellido () {
       //DEFINIR
       return 0;
   }
   
   public String getCampoApellido() {
       return campoApellido.getText();
   }

   public boolean comprobarCampoTelefono() {
      //DEFINIR
       return 0;
   }

   public String getCampoTelefono () {
      return campoTelefono.getText();
   }
   
   public boolean comprobarCampoMail() {
      //DEFINIR
       return 0;
   }
   
   public String getCampoMail() {
      return campoMail.getText();
   }

   public boolean comprobarCampoFechaNac () {
       //DEFINIR     
       return 0;
   }
   
   public String getCampoFechaNac() {
      return campoFechaNac.toString();
   }

   public boolean comprobarCampoEspecialidad() {
      //DEFINIR
       return 0;
   }

   public String getCampoEspecialidad() {
       return campoEspecialidad.getText();
   }
   
   public boolean comprobarCampoGenero() {
       //DEFINIR
       return 0;
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
      arrayServidores = operacionesBD.consultar.servidoresIglesia(Integer.toString(iglesia.getId()));   
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaMails;
    private javax.swing.JList listaServidores;
    private javax.swing.JList listaTelefonos;
    // End of variables declaration//GEN-END:variables
}
