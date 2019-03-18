
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

        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaReuniones = new javax.swing.JList();
        etiquetaGenero = new javax.swing.JLabel();
        etiquetaEdadMin = new javax.swing.JLabel();
        etiquetaEdadMax = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoGenero = new javax.swing.JTextField();
        campoEdadMin = new javax.swing.JTextField();
        campoEdadMax = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setText("Tipos de reunión");

        etiquetaNombre.setText("nombre :");

        listaReuniones.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaReuniones);

        etiquetaGenero.setText("género :");

        etiquetaEdadMin.setText("edad min :");

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

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEdadMin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEdadMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaEdadMin)
                            .addComponent(etiquetaEdadMax))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(etiquetaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaEdadMin)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEdadMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaGenero)
                    .addComponent(etiquetaEdadMax)
                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEdadMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaReuniones;
    // End of variables declaration//GEN-END:variables
}
