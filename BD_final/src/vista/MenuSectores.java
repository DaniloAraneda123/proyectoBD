
package vista;
import modelo.Operaciones;
import modelo.Iglesia;
import modelo.Sector;
import java.util.ArrayList;

public class MenuSectores extends javax.swing.JDialog {
  
  

    public MenuSectores(java.awt.Frame parent, boolean modal , Operaciones ope , Iglesia iglesia) {
        super(parent, modal);
        initComponents();
        setOperacionesBD (ope);
        setIglesia(iglesia);
        iniciar_Componentes();
        iniciar_ArraySectores();
        actualizar_ListaSectores();
        //DARLE UNA POSICION AL CUADRO DE DIALOGO
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSectores = new javax.swing.JList();
        etiquetaTipo = new javax.swing.JLabel();
        etiquetaCapacidad = new javax.swing.JLabel();
        campoTipo = new javax.swing.JTextField();
        campoCapacidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Lista de Sectores");

        botonAgregar.setBackground(new java.awt.Color(52, 152, 219));
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/agregar.png"))); // NOI18N
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
        botonEliminar.setBorder(null);
        botonEliminar.setBorderPainted(false);
        botonEliminar.setFocusPainted(false);
        botonEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/eliminar_1.png"))); // NOI18N

        listaSectores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaSectores);

        etiquetaTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaTipo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTipo.setText("Tipo :");

        etiquetaCapacidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCapacidad.setText("Capacidad :");

        campoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoActionPerformed(evt);
            }
        });

        campoCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCapacidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCapacidad)
                            .addComponent(etiquetaTipo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTipo)
                    .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaCapacidad)
                        .addComponent(campoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTipoActionPerformed

    private void campoCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCapacidadActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
       //LLAMAR A LOS METODO COMRPOBAR.
        Sector nuevoSector = new Sector ( iglesia.getId() , getCampoTipo() , Integer.parseInt(getCampoCapacidad()) ,iglesia.getId() );
        actualizar_ArraySectores(nuevoSector);
        actualizar_ListaSectores();
        actualizarBD(nuevoSector);
    }//GEN-LAST:event_botonAgregarActionPerformed

    

    
      public boolean comprobar_CampoTipo () {
          //definir
          return true;
      }
      
      public String getCampoTipo () {
         return campoTipo.getText(); // gettext da excepcion , cuidado
      }

      public boolean comprobar_CampoCapacidad() {
        // debe ser un entero.
         return true;
     }
      
      public String getCampoCapacidad () {
         return campoCapacidad.getText();
      }
         
      public void setOperacionesBD (Operaciones ope) {
          operacionesBD = ope;
      }
   
     public Operaciones getOperacionesBD() {
        return operacionesBD;
     }
   
     public void iniciar_ArraySectores() {
       arraySectores = operacionesBD.consultar.obtenerSectores( iglesia.getId());
     } 

     public void actualizar_ArraySectores (Sector sector) {
        arraySectores.add(sector);
     }
    
     public void actualizar_ListaSectores () {
         listaSectores.setListData(arraySectores.toArray());
     }
   
     public void iniciar_Componentes () {
         listaSectores.setVisibleRowCount(7);      
     }
   
     public void setIglesia (Iglesia igle) {
       iglesia = igle;
     }
     
     public Iglesia getIglesia () {
         return iglesia;
     }
     
    public void actualizarBD (Sector nuevoSector)  {
        operacionesBD.insertar.agregarSector(nuevoSector, iglesia.getId());
    }

   
    //Atributos
    private Operaciones operacionesBD;
    private ArrayList<Sector> arraySectores;
    private Iglesia iglesia;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoCapacidad;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JLabel etiquetaCapacidad;
    private javax.swing.JLabel etiquetaTipo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaSectores;
    // End of variables declaration//GEN-END:variables
}
