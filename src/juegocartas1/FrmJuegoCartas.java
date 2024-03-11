package juegocartas1;

import javax.swing.JOptionPane;

public class FrmJuegoCartas extends javax.swing.JFrame {
    Jugador gamer1 = new Jugador();
    Jugador gamer2 = new Jugador();

    public FrmJuegoCartas() {
        initComponents();
        btnVerificar.setEnabled(false);
        btnGetPuntajes.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRepartir = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        tpJugadores = new javax.swing.JTabbedPane();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        btnGetPuntajes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnRepartir.setBackground(new java.awt.Color(102, 255, 255));
        btnRepartir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRepartir.setText("Repartir");
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });

        btnVerificar.setBackground(new java.awt.Color(102, 255, 255));
        btnVerificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.setEnabled(false);
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        tpJugadores.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        pnlJugador1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Esteban Garcia", pnlJugador1);

        pnlJugador2.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Isabela Bedoya", pnlJugador2);

        btnGetPuntajes.setBackground(new java.awt.Color(102, 255, 255));
        btnGetPuntajes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnGetPuntajes.setText("Obtener Puntajes");
        btnGetPuntajes.setEnabled(false);
        btnGetPuntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetPuntajesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRepartir)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGetPuntajes))
                    .addComponent(tpJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRepartir)
                    .addComponent(btnVerificar)
                    .addComponent(btnGetPuntajes))
                .addGap(29, 29, 29)
                .addComponent(tpJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
        try{
            gamer1.repartir();
            gamer2.repartir();

            gamer1.mostrar(pnlJugador1, false);
            gamer2.mostrar(pnlJugador2, false);
            
            btnVerificar.setEnabled(true);
            btnGetPuntajes.setEnabled(true);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnRepartirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        int pestaña = tpJugadores.getSelectedIndex();
        String msg = "";
        
        switch(pestaña){
            case 0:
                msg = gamer1.getGrupos();
                break;
            case 1:
                msg = gamer2.getGrupos();
                break;
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnGetPuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetPuntajesActionPerformed
        try{
            String msg = "El puntaje de jugador 1 es " + gamer1.getPuntaje() + "\n";
            msg += "El puntaje de jugador 2 es " + gamer2.getPuntaje();
            
            JOptionPane.showMessageDialog(null, msg);
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnGetPuntajesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuegoCartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetPuntajes;
    private javax.swing.JButton btnRepartir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JTabbedPane tpJugadores;
    // End of variables declaration//GEN-END:variables
}
