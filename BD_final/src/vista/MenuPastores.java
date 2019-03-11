
package vista;
import java.util.ArrayList;
import modelo.Iglesia;
import modelo.Operaciones;
import modelo.Pastor;


public class MenuPastores extends javax.swing.JDialog {


    public MenuPastores(java.awt.Frame parent, boolean modal , Operaciones ope ) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        //setIglesia(iglesia);
        iniciar_ArrayPastores();
        actualizar_ListaPastores();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        etiquetaJerarquia = new javax.swing.JLabel();
        etiquetaRut = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellido = new javax.swing.JLabel();
        etiquetaFechaNac = new javax.swing.JLabel();
        etiquetaGenero = new javax.swing.JLabel();
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
        botonEliminarMail = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPastores = new javax.swing.JList();
        etiquetaTitulo = new javax.swing.JLabel();
        campoJerarquia = new javax.swing.JTextField();
        campoRut = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoFechaNac = new org.netbeans.modules.form.InvalidComponent();
        botonAgregarPastor = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaJerarquia.setText("Jerarquía :");

        etiquetaRut.setText("Rut :");

        etiquetaNombre.setText("Nombre :");

        etiquetaApellido.setText("Apellido :");

        etiquetaFechaNac.setText("Fecha Nac :");

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

        botonAgregarMail.setText("AGREGAR");
        botonAgregarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMailActionPerformed(evt);
            }
        });

        botonEliminarMail.setText("ELIMINAR");

        listaPastores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaPastores);

        etiquetaTitulo.setText("Lista de pastores");

        botonAgregarPastor.setText("AGREGAR");
        botonAgregarPastor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPastorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTelefono)
                .addGap(379, 379, 379))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(botonAgregarPastor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminarTele)
                            .addComponent(botonAgregarTele))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(etiquetaMail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoMail, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonAgregarMail)
                                    .addComponent(botonEliminarMail))))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaRut)
                    .addComponent(etiquetaNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoRut)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaJerarquia)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 85, Short.MAX_VALUE))))
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
                            .addComponent(etiquetaJerarquia)
                            .addComponent(campoJerarquia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaApellido)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaFechaNac)
                                .addComponent(etiquetaGenero)
                                .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaRut)
                            .addComponent(campoRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAgregarTele)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarTele))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarPastor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     //DEFINIR
       return true;
   } 
   public String getCampoJerarquia () {
       return campoJerarquia.getText();
   }
   
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
      return campoFechaNac.getText();
   }

   public boolean comprobarCampoEspecialidad() {
      //DEFINIR
       return true;
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
 
    ///////////////////////////////////////
   
   public void setOperacionesBD (Operaciones ope) {
        operacionesBD = ope;
   }
  
   public Operaciones getOperacionesBD() {
       return operacionesBD;
   } 
   
   public void iniciar_ArrayPastores() {
      arrayPastores = operacionesBD.obtenerPastores(iglesia.getId());    
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
      //AGREGAR LA FORMA DE AGREGAR EL PASTOR
   }
   
    //Atributos
    private ArrayList<String> arrayMails;
    private ArrayList<String> arrayTelefonos;
    private ArrayList<Pastor> arrayPastores;
    private Operaciones operacionesBD;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarMail;
    private javax.swing.JButton botonAgregarPastor;
    private javax.swing.JButton botonAgregarTele;
    private javax.swing.JButton botonEliminarMail;
    private javax.swing.JButton botonEliminarTele;
    private javax.swing.JTextField campoApellido;
    private org.netbeans.modules.form.InvalidComponent campoFechaNac;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JList listaMails;
    private javax.swing.JList listaPastores;
    private javax.swing.JList listaTelefonos;
    // End of variables declaration//GEN-END:variables
}
