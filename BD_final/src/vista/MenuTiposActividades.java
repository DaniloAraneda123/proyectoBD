
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

        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Lista de Actividades");

        botonAgregar.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
        botonAgregar.setToolTipText("agregar actividad");
        botonAgregar.setBorder(null);
        botonAgregar.setBorderPainted(false);
        botonAgregar.setFocusPainted(false);
        botonAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar_1.png"))); // NOI18N
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(52, 152, 219));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar.png"))); // NOI18N
        botonEliminar.setToolTipText("eliminar actividad");
        botonEliminar.setBorder(null);
        botonEliminar.setBorderPainted(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        etiquetaTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTipo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTipo.setText("Tipo :");

        etiquetaEspecialidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaEspecialidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(botonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(botonEliminar)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(etiquetaTitulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaTipo)
                                .addGap(67, 67, 67)
                                .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregar)
                            .addComponent(botonEliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaTipo))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaEspecialidad)
                            .addComponent(campoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
         operacionesBD.insertar.insertarTipoActividad(tipoAct);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaActividades;
    // End of variables declaration//GEN-END:variables
}
