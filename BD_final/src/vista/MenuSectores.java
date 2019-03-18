
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

        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaTipo = new javax.swing.JLabel();
        etiquetaCapacidad = new javax.swing.JLabel();
        campoTipo = new javax.swing.JTextField();
        campoCapacidad = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSectores = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        etiquetaTitulo.setText("Lista de Sectores");

        etiquetaTipo.setText("Tipo :");

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

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");

        listaSectores.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaSectores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCapacidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAgregar)
                    .addComponent(botonEliminar))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(etiquetaTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTipo)
                    .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCapacidad)
                    .addComponent(campoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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
        Sectores nuevoSector = new Sectores ( iglesia.getId() , getCampoTipo() , Integer.parseInt(getCampoCapacidad())  );
        actualizar_ArraySectores(nuevoSector);
        actualizar_ListaSectores();
        actualizarBD(nuevoSector);
    }//GEN-LAST:event_botonAgregarActionPerformed

    

    
      public boolean comprobar_CampoTipo () {
          //definir
          return 0;
      }
      
      public String getCampoTipo () {
         return campoTipo.getText(); // gettext da excepcion , cuidado
      }

      public boolean comprobar_CampoCapacidad() {
        // debe ser un entero.
         return 0;
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
       arraySectores = operacionesBD.obtenerSectores( iglesia.getId());
     } 

     public void actualizar_ArraySectores (Sectores sector) {
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
     
    public void actualizarBD (Sectores nuevoSector) 
    {
       //necesito una pregunta para añadir a la BD uns sector
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaSectores;
    // End of variables declaration//GEN-END:variables
}
