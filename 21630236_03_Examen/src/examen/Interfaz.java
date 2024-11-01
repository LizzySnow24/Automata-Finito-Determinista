package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author frida
 */
public class Interfaz extends javax.swing.JFrame {

    Grafo G = new Grafo();

    public Interfaz() {
        initComponents();
    }

    public void Recorrer() {
        Nodo nodoAct = G.nodoPri;
        StringBuilder texto = new StringBuilder(); // StringBuilder para acumular el texto

        while (nodoAct != null) {
            texto.append("Nodo Actual: ").append(nodoAct.getDato()).append("\n");

            Lista lisAct = nodoAct.lista;

            while (lisAct != null) {
                texto.append("--------> : ").append(lisAct.getDestino().getDato()).append(" con: ").append(lisAct.getLetra()).append("\n");
                lisAct = lisAct.sig;
            }
            nodoAct = nodoAct.siguiente;
        }
        // Establecer el texto acumulado en el área de texto
        Pizarron.setText(texto.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Proceso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pizarron = new javax.swing.JTextArea();
        Destino = new javax.swing.JButton();
        Cadena = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autómata Finito Determinista");
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 204, 204));

        Proceso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Proceso.setForeground(new java.awt.Color(51, 0, 102));
        Proceso.setText("Ingrese Procesos");
        Proceso.setToolTipText("");
        Proceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProcesoMouseClicked(evt);
            }
        });
        Proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoActionPerformed(evt);
            }
        });

        Pizarron.setColumns(20);
        Pizarron.setRows(5);
        jScrollPane1.setViewportView(Pizarron);

        Destino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Destino.setForeground(new java.awt.Color(51, 0, 102));
        Destino.setText("Ingrese Destinos");
        Destino.setToolTipText("");
        Destino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DestinoMouseClicked(evt);
            }
        });
        Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinoActionPerformed(evt);
            }
        });

        Cadena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cadena.setForeground(new java.awt.Color(51, 0, 102));
        Cadena.setText("Ingrese Cadena");
        Cadena.setToolTipText("");
        Cadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadenaMouseClicked(evt);
            }
        });
        Cadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadenaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("Autómata Finito Determinista");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Genere su tabla de proceso:");

        Salir.setBackground(new java.awt.Color(255, 153, 153));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(51, 0, 102));
        Salir.setText("Salir");
        Salir.setToolTipText("");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Proceso)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cadena)
                        .addComponent(Destino)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(Salir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(Proceso)
                .addGap(38, 38, 38)
                .addComponent(Destino)
                .addGap(41, 41, 41)
                .addComponent(Cadena)
                .addGap(57, 57, 57)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoActionPerformed

    }//GEN-LAST:event_ProcesoActionPerformed

    private void ProcesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcesoMouseClicked
        int numProc = 0;
        Nodo actual = G.nodoPri;
        //aseguramos que ingrese un numero 
        try {
            numProc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de procesos: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido: ");
            return;
        }
        for (int j = 0; j < numProc; j++) {
            String Proc = JOptionPane.showInputDialog(null, "Ingrese Proceso Origen n°" + (j + 1));

           /* while (actual != null) {
                if (!Proc.equals(actual.getDato())) {
                    actual = actual.siguiente;
                } else {
                    JOptionPane.showMessageDialog(null, "Ya ingresaste este Proceso");
                    Proc = JOptionPane.showInputDialog(null, "Ingrese Proceso Origen n°" + (j + 1));
                    actual = G.nodoPri;
                }
            } */

            String etapaFin = JOptionPane.showInputDialog(null, "¿El Proceso: " + (j + 1) + " es de Estado Final? si/no");
            G.InsertarNodo(Proc, etapaFin);
            Recorrer();
        }
    }//GEN-LAST:event_ProcesoMouseClicked

    private void DestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DestinoMouseClicked
        int numDest = 0;
        try {
            numDest = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de destinos: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido: ");
            return;
        }
        try {
            for (int j = 0; j < numDest; j++) {
                String origen = JOptionPane.showInputDialog(null, "Ingrese Proceso Origen: ");
                String destino = JOptionPane.showInputDialog(null, "Ingrese Proceso Destino " + (j + 1) + ": ");
                String letra = JOptionPane.showInputDialog(null, "Voy de " + origen + " a " + destino + " con: ");
                // Buscar el nodo de origen para cada conexión
                Nodo proOrigen = G.BuscarOrigen(origen);
                if (proOrigen != null && letra != "*") {
                    // Crear un nuevo nodo para cada destino y conectarlo
                    G.CrearArista(proOrigen, destino, letra);
                    Recorrer();
                } else {
                    JOptionPane.showMessageDialog(null, "No existe el Origen");
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_DestinoMouseClicked

    private void DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinoActionPerformed

    private void CadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadenaMouseClicked
        String Cadena = "";
        String Aprob = "si";
        try {
            do {
                if (Aprob.equalsIgnoreCase("si")) {
                    Cadena = JOptionPane.showInputDialog("Ingrese la cadena a evaluar: ");

                    G.SepararCadena(Cadena);
                    G.Mostrar();
                    if (G.Comparar(G.nodoPri, G.cadePri)) {
                        JOptionPane.showMessageDialog(null, "Cadena Válida :) ");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cadena no válida :( ");
                    }
                }
                Aprob = JOptionPane.showInputDialog("Desea ingresar una cadena (si/no): ");
            } while (!Aprob.equalsIgnoreCase("no"));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CadenaMouseClicked

    private void CadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadenaActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadena;
    private javax.swing.JButton Destino;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextArea Pizarron;
    private javax.swing.JButton Proceso;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
