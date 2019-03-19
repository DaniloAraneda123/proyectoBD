
package vista;
import modelo.Operaciones;
import modelo.TipoActividad;
import java.util.ArrayList;        

        
public class MenuTiposActividades extends javax.swing.JDialog {

 
    public MenuTiposActividades(java.awt.Frame parent, boolean modal , Operaciones ope ) {
        super(parent, modal);
        initComponents();
        setOperacionesBD (ope);
        iniciar_ArrayTiposActividades();
        actualizar_ListaTiposActividades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        etiquetaTipo = new javax.swing.JLabel();
        etiquetaEspecialidad = new javax.swing.JLabel();
        campoTipo = new javax.swing.JTextField();
        campoEspecialidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setText("Lista de Actividades");

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

        etiquetaTipo.setText("Tipo :");

        etiquetaEspecialidad.setText("Especialidad : ");

        campoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoActionPerformed(evt);
            }
        });

        listaActividades.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaActividades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(etiquetaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaEspecialidad)
                            .addComponent(etiquetaTipo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEspecialidad)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonEliminar)
                            .addComponent(botonAgregar))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTipo)
                    .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(etiquetaEspecialidad)
                    .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //LLAMAMOS A LOS METODOS COMPROBAR
        TipoActividad tipoAct = new TipoActividad( getCampoTipo() , getCampoEspecialidad());
        actualizar_ArrayTiposActividades(tipoAct);
        actualizar_ListaTiposActividades();
        actualizarBD(tipoAct);
        //colocarla al lado
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void campoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoActionPerformed

    
      public boolean comprobarCampoTipo() {
          //DEIFINIR
          return true;
      }
          
      public String getCampoTipo() {
         return campoTipo.getText();
      }   
              
      public boolean comporbarCampoEspecialidad() {
         //DEFINIR.
          return true;
      }
     
      public String getCampoEspecialidad() {
          return campoEspecialidad.getText();
      }
  
      
      public void iniciar_ArrayTiposActividades () {
            arrayTipoAct  = operacionesBD.consultar.tipoActividad();
            actualizar_ListaTiposActividades();
      }     

       public void setOperacionesBD (Operaciones ope)  {
          operacionesBD = ope;
       }

       public Operaciones getOperacionesBD() {
         return operacionesBD;
      }
   
      
      public void actualizar_ArrayTiposActividades ( TipoActividad tipoAct) {
           arrayTipoAct.add(tipoAct);
      }
    
      public void actualizar_ListaTiposActividades() {
        listaActividades.setListData(arrayTipoAct.toArray()); 
      }
      
   
      public void actualizarBD (TipoActividad tipoAct) {
        //NECESITO UN METODO PARA AGREGAR A LA BD EL TIPO ACTIVIDAD
         operacionesBD.insertar.agregarTipoActividad(tipoAct);
      }
  
  
    private Operaciones operacionesBD;
    private ArrayList<TipoActividad> arrayTipoAct;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoEspecialidad;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JLabel etiquetaEspecialidad;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaActividades;
    // End of variables declaration//GEN-END:variables
}
