/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgCentroConvGUI;

import javax.swing.JOptionPane;
import pkgCentroConvenciones.CcApp;

/**
 *
 * @author Win 10
 */
public class FAdministrarEvento extends javax.swing.JFrame {

    /**
     * Creates new form FAdministarEvento
     */
    public FAdministrarEvento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddParticipante = new javax.swing.JButton();
        btnAddPatrocinador = new javax.swing.JButton();
        btnAddActividad = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAddSalon = new javax.swing.JButton();
        btnAddPonente = new javax.swing.JButton();
        btnAddConferencista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTAR EVENTO");

        btnAddParticipante.setText("add participante");
        btnAddParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddParticipanteActionPerformed(evt);
            }
        });

        btnAddPatrocinador.setText("add patrocinador");
        btnAddPatrocinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatrocinadorActionPerformed(evt);
            }
        });

        btnAddActividad.setText("add actividad");
        btnAddActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActividadActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAddSalon.setText("add Salon");
        btnAddSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalonActionPerformed(evt);
            }
        });

        btnAddPonente.setText("add Ponenete");
        btnAddPonente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPonenteActionPerformed(evt);
            }
        });

        btnAddConferencista.setText("add Conferencista");
        btnAddConferencista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConferencistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddSalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddPatrocinador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddPonente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddConferencista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPatrocinador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddPonente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddConferencista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FInicio fInicio = new FInicio();
        fInicio.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddParticipanteActionPerformed
        
        boolean existeActividad = false;
        boolean existeSalon     = false;
        
        for(int i=0; i<CcApp.cc.cantidadEventos(); i++)
        {
            if(CcApp.cc.getEvento(i).cantidadActividades() > 0)
            {
                existeActividad = true;
                break;
            }
        }
        
        for(int i=0; i<CcApp.cc.cantidadEventos(); i++)
        {
            if(CcApp.cc.getEvento(i).cantidadSalones() > 0)
            {
                existeSalon = true;
                break;
            }
        }
        
        //sebe existir almenos una actividdad y un salon para poder registrar y vincular participantes
        if(existeActividad && existeSalon)
        {
            FAdministrarParticipante fAdministrarParticipante = new FAdministrarParticipante();
            fAdministrarParticipante.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Acceso denegado: debe existir al menos una actividad y un salon");
        }
    }//GEN-LAST:event_btnAddParticipanteActionPerformed

    private void btnAddActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActividadActionPerformed
        FAddActividad fAddActividad = new FAddActividad();
        fAddActividad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddActividadActionPerformed

    private void btnAddPatrocinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatrocinadorActionPerformed
        
        FAddPatrocinador fAddPatrocinador = new FAddPatrocinador();
        fAddPatrocinador.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddPatrocinadorActionPerformed

    private void btnAddSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalonActionPerformed
        
        FCrearSalon fCrearSalon = new FCrearSalon();
        fCrearSalon.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddSalonActionPerformed

    private void btnAddPonenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPonenteActionPerformed
        
        FAddPonenete fAddPonenete = new FAddPonenete();
        fAddPonenete.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddPonenteActionPerformed

    private void btnAddConferencistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConferencistaActionPerformed
        
        FAddConferencista fAddConferencista = new FAddConferencista();
        fAddConferencista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddConferencistaActionPerformed

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
            java.util.logging.Logger.getLogger(FAdministrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAdministrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAdministrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAdministrarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAdministrarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddActividad;
    private javax.swing.JButton btnAddConferencista;
    private javax.swing.JButton btnAddParticipante;
    private javax.swing.JButton btnAddPatrocinador;
    private javax.swing.JButton btnAddPonente;
    private javax.swing.JButton btnAddSalon;
    private javax.swing.JButton btnCancelar;
    // End of variables declaration//GEN-END:variables
}
