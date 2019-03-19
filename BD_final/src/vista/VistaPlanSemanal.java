package vista;
import modelo.Operaciones;
import modelo.Iglesia;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Date;
import control.Fechas;
import modelo.Junta;
import javax.swing.table.DefaultTableModel;


public class VistaPlanSemanal extends javax.swing.JFrame {
         
    public VistaPlanSemanal( Operaciones operaciones , Iglesia iglesia) {
        initComponents();
        setOperacionesBD (operaciones);
        setIglesias(iglesia);
        actualizar_ArrayReuniones();
        actualizar_TablaReuniones();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
    }
    
      public void setIglesias (Iglesia unaIglesia) {
          iglesia = unaIglesia;
      }        
              
      public void setOperacionesBD (Operaciones ope)  {
         operacionesBD = ope;
      }

      public Operaciones getOperacionesBD () {
        return operacionesBD;
      } 
   

     public void actualizar_ArrayReuniones () {
         //LLAMAR A LA BD Y OBTENER EL ARREGLO DE REUNIONES
         Date fechaActual = new Date();
         fechaActual.setYear( fechaActual.getYear());
         Fechas fecha = new Fechas(fechaActual);
         Date fechaInicio = fecha.calcula_FechaInicio();
         Date fechaTermino = fecha.calcula_FechaTermino(); 
         //System.out.print(fechaTermino+" "+fechaInicio);
         arrayReuniones = operacionesBD.consultar.juntasSemanales(fechaInicio , fechaTermino , iglesia.getId());      
     } 
              
      public void actualizar_TablaReuniones() {
          
          String matriz [][] = new String [arrayReuniones.size()][3];
          for (int i=0 ; i<arrayReuniones.size() ; i++) {
             matriz[i][0] = arrayReuniones.get(i).getHoraInicio();
             matriz[i][1] = arrayReuniones.get(i).getFecha().toString();
             matriz[i][2] = arrayReuniones.get(i).getReunion();
          }
          listaReuniones.setModel( new DefaultTableModel (matriz , new String [] {"Hora Inicio" , "Fecha" , "tipo Reunión"}));
          
      }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaReuniones = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        MenuPastores = new javax.swing.JMenuItem();
        MenuServidores = new javax.swing.JMenuItem();
        MenuSectores = new javax.swing.JMenuItem();
        MenuReunion = new javax.swing.JMenuItem();
        MenuTipoAct = new javax.swing.JMenuItem();
        MenuTipoReu = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(52, 152, 219));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Plan semanal");

        botonVolver.setBackground(new java.awt.Color(52, 152, 219));
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/regresar.png"))); // NOI18N
        botonVolver.setBorder(null);
        botonVolver.setBorderPainted(false);
        botonVolver.setFocusPainted(false);
        botonVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imgs/regresar_1.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        listaReuniones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listaReuniones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaReunionesMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listaReuniones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(etiquetaTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(botonVolver)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addContainerGap())
        );

        Menu.setText("Menú");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        MenuPastores.setText("Pastores");
        MenuPastores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPastoresActionPerformed(evt);
            }
        });
        Menu.add(MenuPastores);

        MenuServidores.setText("Servidores");
        MenuServidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuServidoresActionPerformed(evt);
            }
        });
        Menu.add(MenuServidores);

        MenuSectores.setText("Sectores");
        MenuSectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSectoresActionPerformed(evt);
            }
        });
        Menu.add(MenuSectores);

        MenuReunion.setText("Reunión");
        MenuReunion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReunionActionPerformed(evt);
            }
        });
        Menu.add(MenuReunion);

        MenuTipoAct.setText("Tipo Act.");
        MenuTipoAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTipoActActionPerformed(evt);
            }
        });
        Menu.add(MenuTipoAct);

        MenuTipoReu.setText("Tipo Reu.");
        MenuTipoReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTipoReuActionPerformed(evt);
            }
        });
        Menu.add(MenuTipoReu);

        MenuConsultas.setText("Consultas");
        MenuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultasActionPerformed(evt);
            }
        });
        Menu.add(MenuConsultas);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

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

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        setVisible(false);
        VistaInicio vistaInicio = new VistaInicio();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void MenuTipoReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTipoReuActionPerformed
        MenuTiposReuniones dialogo = new MenuTiposReuniones(this,true,operacionesBD);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuTipoReuActionPerformed

    private void MenuReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReunionActionPerformed
        MenuReuniones dialogo = new MenuReuniones(this ,true , operacionesBD , iglesia);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuReunionActionPerformed

    private void MenuSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSectoresActionPerformed
        MenuSectores dialogo = new MenuSectores(this , true , operacionesBD , iglesia);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuSectoresActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       actualizar_ArrayReuniones();
       actualizar_TablaReuniones();
    }//GEN-LAST:event_formFocusGained

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed

    }//GEN-LAST:event_MenuActionPerformed

    private void MenuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultasActionPerformed
        MenuConsultas dialogo = new MenuConsultas(this , true , operacionesBD , iglesia);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuConsultasActionPerformed

    private void MenuTipoActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTipoActActionPerformed
        MenuTiposActividades dialogo = new MenuTiposActividades(this , true , operacionesBD);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuTipoActActionPerformed

    private void MenuServidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuServidoresActionPerformed
        MenuServidores dialogo = new MenuServidores(this , true , operacionesBD , iglesia);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuServidoresActionPerformed

    private void MenuPastoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPastoresActionPerformed
        MenuPastores dialogo = new MenuPastores(this ,true , operacionesBD , iglesia);
        dialogo.setVisible(true);
    }//GEN-LAST:event_MenuPastoresActionPerformed

    private void listaReunionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaReunionesMousePressed
        int fila = listaReuniones.getSelectedRow();
        try {
             Junta junta = arrayReuniones.get(fila);
             PlanificaReunion planifica = new PlanificaReunion(this,true,operacionesBD,iglesia,junta);
             planifica.setVisible(true);
        } catch (Exception e) {
           
            System.out.print(e);
        }
       // Junta junta = new Junta(listaReuniones.getValueAt(1) , listaReuniones.getValueAt(2) , listaReuniones.getValueAt(0), iglesia.getId());
    }//GEN-LAST:event_listaReunionesMousePressed


    //ATRIBUTOS
    Iglesia iglesia;
    Operaciones operacionesBD;
    ArrayList<Junta> arrayReuniones;  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuItem MenuConsultas;
    private javax.swing.JMenuItem MenuPastores;
    private javax.swing.JMenuItem MenuReunion;
    private javax.swing.JMenuItem MenuSectores;
    private javax.swing.JMenuItem MenuServidores;
    private javax.swing.JMenuItem MenuTipoAct;
    private javax.swing.JMenuItem MenuTipoReu;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaReuniones;
    // End of variables declaration//GEN-END:variables
}
