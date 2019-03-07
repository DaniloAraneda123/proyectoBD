

package vista;

public class VistaPlanSemanal extends javax.swing.JFrame {


    public VistaPlanSemanal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
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

        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        etiquetaTitulo.setText("Plan semanal");

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
        jScrollPane2.setViewportView(listaReuniones);

        Menu.setText("Menú");

        MenuPastores.setText("Pastores");
        Menu.add(MenuPastores);

        MenuServidores.setText("Servidores");
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
        Menu.add(MenuTipoAct);

        MenuTipoReu.setText("Tipo Reu.");
        MenuTipoReu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTipoReuActionPerformed(evt);
            }
        });
        Menu.add(MenuTipoReu);

        MenuConsultas.setText("Consultas");
        Menu.add(MenuConsultas);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(etiquetaTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(etiquetaTitulo)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

    private void MenuTipoReuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTipoReuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuTipoReuActionPerformed

    private void MenuReunionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReunionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuReunionActionPerformed

    private void MenuSectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSectoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuSectoresActionPerformed


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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaReuniones;
    // End of variables declaration//GEN-END:variables
}
