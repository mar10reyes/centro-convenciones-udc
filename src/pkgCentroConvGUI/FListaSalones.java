/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgCentroConvGUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkgCentroConvenciones.CcApp;

/**
 *
 * @author Win 10
 */
public class FListaSalones extends javax.swing.JFrame {

    /**
     * Creates new form FListaSalones
     */
    public FListaSalones() {
        initComponents();
        
        
        int l = 0;  //cantidad global de salones
        
        //contar la cantidad global de patrocinadores obteniendo la cantidad por evento
        for(int i=0; i< CcApp.cc.cantidadEventos(); i++)
        {
            System.out.println("loop");
            l += CcApp.cc.getEvento(i).cantidadSalones();
            System.out.println("l: "+l);
        }
        
        String matrizS[][] = new String[l][5];
        String titulosS[]  = {"Codigo", "Capacidad maxima", "Puestos libres", "Disponibilidad", "Evento"};
        int x = 0; //variable controla las iteraciones
        
        //for para llenar la matriz
        for(int i=0; i<CcApp.cc.cantidadEventos(); i++)
        {
            for(int j=0; j<CcApp.cc.getEvento(i).cantidadSalones(); j++, x++)
            {
                matrizS[x][0] = String.valueOf(CcApp.cc.getEvento(i).getSalon(j).getCodigo());
                matrizS[x][1] = String.valueOf(CcApp.cc.getEvento(i).getSalon(j).getCapacidadMax());
                matrizS[x][2] = String.valueOf(CcApp.cc.getEvento(i).getSalon(j).getCapacidadMax() - CcApp.cc.getEvento(i).getSalon(j).getOcupados());
                matrizS[x][3] = String.valueOf(CcApp.cc.getEvento(i).getSalon(j).isDisponible());
                matrizS[x][4] = CcApp.cc.getEvento(i).getNombre();
            }
        }
        
        //declarando nuestro modelo de JTable
        DefaultTableModel model = new DefaultTableModel(matrizS, titulosS);
        tblParticipantes.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblParticipantes = new javax.swing.JTable();
        txtFechaInicio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblFechaInicio = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        lblFechaFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Capacidad maxima", "Puestos libres", "Disponibilidad", "Evento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblParticipantes);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFechaInicio.setText("Fecha incio");

        lblFechaFin.setText("Fecha fin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaFin)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnAtras)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaInicio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaFin)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        FInicio fInicio = new FInicio();
        fInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(txtFechaInicio.getText().equals("") || txtFechaFin.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Hay campos vacios");
        }
        else
        {
            txtFechaInicio.getText();
            
            int l  = 0;  //cantidad de todos los salones
            int l2 = 0;  //cantidad de los salones de esa fecha
            
            
            for(int i=0; i< CcApp.cc.cantidadEventos(); i++)
            {
                l += CcApp.cc.getEvento(i).cantidadSalones();
            }
            
            //arraylist que contiene los eventos con salones en esas fechas
            ArrayList<String> eventos = new ArrayList<>();
            ArrayList<String> salones = new ArrayList<>();
            
            //contar los salones que tienen esa fecha
            for (int i = 0; i < CcApp.cc.cantidadEventos(); i++) 
            {
                for (int j = 0; j < CcApp.cc.getEvento(i).cantidadSalones(); j++) 
                {
                    //si las fechas de inicio y fin son iguales
                    if(CcApp.cc.getEvento(i).getSalon(j).getFechaInicio().equals(txtFechaInicio.getText()) && CcApp.cc.getEvento(i).getSalon(j).getFechaFin().equals(txtFechaFin.getText()))
                    {
                        eventos.add(String.valueOf(i));
                        salones.add(String.valueOf(j));
                        l2++;
                    }
                }
            }
            
            //declarar matriz de salones que tienen esa fecha
            String matrizS[][] = new String[l2][5];
            
            //llenar la matriz con los salones con esas fechas
            for (int i = 0; i < l2; i++) 
            {
                matrizS[i][0] = String.valueOf(CcApp.cc.getEvento(Integer.parseInt(eventos.get(i))).getSalon(Integer.parseInt(salones.get(i))).getCodigo());
                matrizS[i][1] = String.valueOf(CcApp.cc.getEvento(Integer.parseInt(eventos.get(i))).getSalon(Integer.parseInt(salones.get(i))).getCapacidadMax());
                matrizS[i][2] = String.valueOf(CcApp.cc.getEvento(Integer.parseInt(eventos.get(i))).getSalon(Integer.parseInt(salones.get(i))).getCapacidadMax() - CcApp.cc.getEvento(i).getSalon(Integer.parseInt(salones.get(i))).getOcupados());
                matrizS[i][3] = String.valueOf(CcApp.cc.getEvento(Integer.parseInt(eventos.get(i))).getSalon(Integer.parseInt(salones.get(i))).isDisponible());
                matrizS[i][4] = CcApp.cc.getEvento(i).getNombre();
            }

            String titulosS[]  = {"Codigo", "Capacidad maxima", "Puestos libres", "Disponibilidad", "Evento"};
            
            //declarando nuestro modelo de JTable
            DefaultTableModel model = new DefaultTableModel(matrizS, titulosS);
            tblParticipantes.setModel(model);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FListaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FListaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FListaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FListaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FListaSalones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaFin;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JTable tblParticipantes;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
