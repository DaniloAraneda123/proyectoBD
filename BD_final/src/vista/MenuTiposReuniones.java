
package vista;
import modelo.Operaciones;
import modelo.TipoReunion;
import java.util.ArrayList;

public class MenuTiposReuniones extends javax.swing.JDialog {

    
    public MenuTiposReuniones(java.awt.Frame parent, boolean modal , Operaciones ope) {
        super(parent, modal);
        initComponents();
        setOperacionesBD(ope);
        iniciar_ArrayTiposReuniones();
        actualizar_ListaTiposReuniones();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaEdadMax = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoEdadMin = new javax.swing.JTextField();
        campoEdadMax = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaReuniones = new javax.swing.JList();
        etiquetaGenero = new javax.swing.JLabel();
        etiquetaEdadMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Tipos de reunión");

        etiquetaEdadMax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaEdadMax.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEdadMax.setText("edad max :");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoEdadMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEdadMinActionPerformed(evt);
            }
        });

        campoEdadMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEdadMaxActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregar.setToolTipText("agregar tipo de reunion");
        botonAgregar.setBorder(null);
        botonAgregar.setBorderPainted(false);
        botonAgregar.setFocusPainted(false);
        botonAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        etiquetaNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("nombre :");

        botonEliminar.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminar.setToolTipText("eliminar tipo de reunion");
        botonEliminar.setBorder(null);
        botonEliminar.setBorderPainted(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        listaReuniones.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaReuniones);

        etiquetaGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaGenero.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGenero.setText("género :");

        etiquetaEdadMin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaEdadMin.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEdadMin.setText("edad min :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaEdadMin)
                            .addComponent(etiquetaEdadMax))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEdadMin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEdadMax, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregar)
                            .addComponent(botonEliminar))
                        .addGap(44, 44, 44)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(etiquetaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaNombre)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etiquetaEdadMin)
                        .addComponent(campoEdadMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEliminar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaGenero)
                            .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaEdadMax)
                        .addComponent(campoEdadMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoEdadMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdadMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEdadMinActionPerformed

    private void campoEdadMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEdadMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEdadMaxActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //LLAMAMOS A LOS METODOS COMPROBAR.
        TipoReunion tipoReunion = new TipoReunion( Integer.parseInt(getCampoGenero()) , Integer.parseInt(getCampoEdadMax()) , Integer.parseInt(getCampoEdadMin()) , getCampoNombre());
        actualizar_ArrayTiposReuniones(tipoReunion);
        actualizar_ListaTiposReuniones(); 
        actualizarBD(tipoReunion);
    }//GEN-LAST:event_botonAgregarActionPerformed
  
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

 
     public boolean comprobarCampoNombre() {
         //DEFINIR
         return true;
     }
     
     public String getCampoNombre() {
          return campoNombre.getText();
     }
     
     public boolean comprobarCampoGenero () {
         //deifnir
         return true;
     }
    
     public String getCampoGenero () {
         return campoGenero.getText();
     }
       
     public boolean comprobarCampoEdadMin () {
         //DEFINIR
         return true;
     }
     
     public String getCampoEdadMin() {
         return campoEdadMin.getText();
     }
     
     public boolean comprobarCampoEdadMax () {
         //DEFINIR
         return true;
     }
     
     public String getCampoEdadMax() {
         return campoEdadMax.getText();
     }
   
      public void iniciar_ArrayTiposReuniones () {
        arrayTiposReuniones = operacionesBD.consultar.tipoReuniones();
        actualizar_ListaTiposReuniones();
      } 
    
      public void setOperacionesBD (Operaciones ope) {
         operacionesBD = ope;
      }

      public Operaciones getOperacionesBD () {
         return operacionesBD;
      }
  
      public void actualizar_ArrayTiposReuniones (TipoReunion tipoReu) {
          arrayTiposReuniones.add(tipoReu);
      }
      
      public void actualizar_ListaTiposReuniones() {
             listaReuniones.setListData(arrayTiposReuniones.toArray()); 
      }
      
      public void actualizarBD ( TipoReunion tipoReu) {
            //metodo para agregar una reunion
          operacionesBD.insertar.insertarTipoReunion(tipoReu);
      }
      
     
    //Atributos
    private Operaciones operacionesBD;
    private ArrayList<TipoReunion> arrayTiposReuniones;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoEdadMax;
    private javax.swing.JTextField campoEdadMin;
    private javax.swing.JTextField campoGenero;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaEdadMax;
    private javax.swing.JLabel etiquetaEdadMin;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaReuniones;
    // End of variables declaration//GEN-END:variables
}
