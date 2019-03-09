package vista;
import bd_final.Operaciones;
import java.util.ArrayList;
import bd_final.Iglesia;
import javax.swing.ListSelectionModel;


public class VistaInicio extends javax.swing.JFrame {
///////////////////////////////////////////////////////////////////////////////////////////
                          //PESTAÑA SELECCIONAR//
    //CONSTRUCTORES    
    public VistaInicio( Operaciones ope) 
    {
        initComponents();
        setOperacionesBD (ope);
        iniciar_ArrayIglesias();
        iniciar_ListaIglesiaSelec();
        actualizar_ListaIglesiaSelec();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    //MÉTODOS.
    public void setOperacionesBD (Operaciones ope)  {
          operacionesBD = ope;
    }
    public Operaciones getOperacionesBD () {
          return operacionesBD;
    } 
    
    public ArrayList<Iglesia> getArrayIglesias () {
         return arrayIglesias;
    }
    
    public void setArrayIglesias ( ArrayList<Iglesia> arrayI ) {
         arrayIglesias = arrayI;
    }
             
    public void iniciar_ArrayIglesias() {
      arrayIglesias  = getOperacionesBD().obtenerIglesias();
    }
        
     public void iniciar_ListaIglesiaSelec() {
        listaIglesiasSelec.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaIglesiasSelec.setVisibleRowCount(7);
    }    
     
    public void actualizar_ListaIglesiaSelec() {
       listaIglesiasSelec.setListData(arrayIglesias.toArray()); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seleccionar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        deslizadorSelec = new javax.swing.JScrollPane();
        listaIglesiasSelec = new javax.swing.JList();
        etiquetaTitulo1 = new javax.swing.JLabel();
        botonSeleccionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaRegion = new javax.swing.JLabel();
        etiquetaNum = new javax.swing.JLabel();
        etiquetaCalle = new javax.swing.JLabel();
        campoRegion = new javax.swing.JTextField();
        campoNum = new javax.swing.JTextField();
        campoCalle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaIglesiasAgre = new javax.swing.JList();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        etiquetaComuna = new javax.swing.JLabel();
        campoComuna = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaIglesiasSelec.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        deslizadorSelec.setViewportView(listaIglesiasSelec);

        etiquetaTitulo1.setText("Seleccione una iglesia");

        botonSeleccionar.setText("Seleccionar");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(deslizadorSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(etiquetaTitulo1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(botonSeleccionar)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(etiquetaTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(deslizadorSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(botonSeleccionar)
                .addGap(59, 59, 59))
        );

        Seleccionar.addTab("Seleccionar", jPanel1);

        etiquetaTitulo.setText("Agregar/Eliminar una iglesia");

        etiquetaRegion.setText("Región :");

        etiquetaNum.setText("número :");

        etiquetaCalle.setText("Calle :");

        listaIglesiasAgre.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaIglesiasAgre);

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");

        etiquetaComuna.setText("Comuna :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(etiquetaCalle))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(etiquetaComuna)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoComuna))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(etiquetaRegion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addComponent(etiquetaNum)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(campoNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAgregar)
                            .addComponent(botonEliminar))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(etiquetaTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaRegion)
                    .addComponent(etiquetaCalle)
                    .addComponent(campoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNum)
                    .addComponent(botonEliminar)
                    .addComponent(etiquetaComuna)
                    .addComponent(campoComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        Seleccionar.addTab("agregar/eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Seleccionar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Seleccionar, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Seleccionar.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
       int indice = listaIglesiasSelec.getSelectedIndex();
       if (indice >= 0)
       {
           Iglesia iglesiaSeleccionada = arrayIglesias.get(indice);
           VistaPlanSemanal vista= new VistaPlanSemanal( getOperacionesBD() , iglesiaSeleccionada);
       }
       
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        //comprobar que todos lo campos esten correctos
         Iglesia nuevaIglesia = new Iglesia ( obtener_UltimoId(), getRegion() , getComuna() ,getCalle() , Integer.parseInt(getNumero()) ) ;
         actualizar_ArrayIglesia(nuevaIglesia);
         actualizar_ListaIglesiaAgre();
         actualizar_ListaIglesiaSelec();
         actualizar_IglesiasBD(nuevaIglesia);
    }//GEN-LAST:event_botonAgregarActionPerformed

    public static void main(String args[]) 
    {      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                Operaciones operaciones = new Operaciones();
                VistaInicio vista = new VistaInicio(operaciones);
  
                
            }
        });
    }
    
///////////////////////////////////////////////////////////////////////////////////////////////////////
                              //PESTAÑA AGREGAR/ELIMINAR.//
    
     public boolean comprobarRegion() {
        //definirlo
      
        
     } 
     
     public boolean comprobarComuna() {
        //definirlo
     }
     
     public boolean comprobarNumero () {
        //tiene que ser un numero entero positivo
     }
     
     public boolean comprobarCalle () {
        //definirlo
     } 
     //GETTEXT MANDA EXCEPCION OJO XD.
     public String getRegion () {
        String texto = campoRegion.getText();
        return texto;
     }
     
     public String getComuna() {
         String texto = campoComuna.getText();
         return texto;
     }
      
     public String getNumero ()  {
         String texto = campoNum.getText();
         return texto; 
     }

     public String getCalle () {
         String texto = campoCalle.getText();
         return texto;
     }
     
     public int obtener_UltimoId () {
         int id = arrayIglesias.size() - 1;
         Iglesia ultima = arrayIglesias.get(id); 
         int ultimoId = ultima.getId() + 1 ;
         return ultimoId;
     }
         
      public void actualizar_ArrayIglesia (Iglesia iglesia) {
         arrayIglesias.add(iglesia);
      }
       
      public void actualizar_ListaIglesiaAgre () {
         listaIglesiasAgre.setListData(arrayIglesias.toArray()); 
      }

      public void actualizar_IglesiasBD (Iglesia iglesia) {
          operacionesBD.insertarIglesia(iglesia.getId() , iglesia.getRegion() , iglesia.getComuna() , iglesia.getCalle() , iglesia.getNumero());
      }
    
    
    
    //ATRIBUTOS
    private Operaciones operacionesBD;
    private ArrayList<Iglesia> arrayIglesias;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Seleccionar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JTextField campoCalle;
    private javax.swing.JTextField campoComuna;
    private javax.swing.JTextField campoNum;
    private javax.swing.JTextField campoRegion;
    private javax.swing.JScrollPane deslizadorSelec;
    private javax.swing.JLabel etiquetaCalle;
    private javax.swing.JLabel etiquetaComuna;
    private javax.swing.JLabel etiquetaNum;
    private javax.swing.JLabel etiquetaRegion;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaIglesiasAgre;
    private javax.swing.JList listaIglesiasSelec;
    // End of variables declaration//GEN-END:variables
}
