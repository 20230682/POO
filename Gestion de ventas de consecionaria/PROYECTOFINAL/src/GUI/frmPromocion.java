/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import CLASES.Promocion;
import GESTION.GestionPromocion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anahy
 */
public class frmPromocion extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private GestionPromocion gestionPromocion = new GestionPromocion();
    
    public frmPromocion() {
        initComponents();
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Valor");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
        
        tbPromociones.setModel(modelo);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        listarPromociones();
    }
     void listarPromociones() {
        modelo.setNumRows(0);
        for (int i = 0; i < gestionPromocion.obtenerTotalPromociones(); i++) {
            Object[] fila = {
                gestionPromocion.obtenerPromociones()[i].getNombre(),
                gestionPromocion.obtenerPromociones()[i].getTipo(),
                gestionPromocion.obtenerPromociones()[i].getValor(),
                gestionPromocion.obtenerPromociones()[i].getInicio(),
                gestionPromocion.obtenerPromociones()[i].getFin()
            };
            modelo.addRow(fila);
        }   
    }

    void limpiar() {
        txtNmbPromo.setText("");
        txtTipo.setText("");
        txtValor.setText("");
        txtInicio.setText("");
        txtFin.setText("");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        txtNmbPromo = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnRegistrar2 = new javax.swing.JButton();
        lblFin = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        lblNmbPromo = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPromociones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setText("Valor");

        btnRegistrar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrar2.setText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        lblFin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFin.setText("Fin");

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblNmbPromo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNmbPromo.setText("Nombre");

        lblInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblInicio.setText("Inicio");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("Tipo");

        tbPromociones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbPromociones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnRegistrar2)
                        .addGap(38, 38, 38)
                        .addComponent(btnActualizar)
                        .addGap(38, 38, 38)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNmbPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                    .addComponent(txtFin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtNmbPromo)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmbPromo)
                    .addComponent(txtNmbPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInicio)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFin)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar2)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       String NmbPromo = txtNmbPromo.getText().trim();
        
        if(gestionPromocion.eliminar(NmbPromo)){
            listarPromociones();
            limpiar();
            JOptionPane.showMessageDialog(this, "Promoción eliminada");
        }else{
            JOptionPane.showMessageDialog(this, "No se encontró la promoción a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        String nombre = txtNmbPromo.getText().trim();
        String tipo = (String) txtTipo.getText().trim();
        double valor = Double.parseDouble(txtValor.getText().trim());
        String fechaInicio = txtInicio.getText().trim();
        String fechaFin = txtFin.getText().trim();
        
        Promocion promocion = new Promocion(nombre, tipo, valor, fechaInicio, fechaFin);
        
        if(gestionPromocion.registrar(promocion)){
            listarPromociones();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo registrar");
        }             
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre = txtNmbPromo.getText().trim();
        String tipo = (String) txtTipo.getText().trim();
        double valor = Double.parseDouble(txtValor.getText().trim());
        String fechaInicio = txtInicio.getText().trim();
        String fechaFin = txtFin.getText().trim();
        
        Promocion promocion = new Promocion(nombre, tipo, valor, fechaInicio, fechaFin);
        
        if(gestionPromocion.actualizar(promocion)){
            listarPromociones();
            JOptionPane.showMessageDialog(this, "Promoción actualizada");
        }else{
            JOptionPane.showMessageDialog(this, "No se encontró la promoción a actualizar");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPromocion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPromocion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblNmbPromo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tbPromociones;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtNmbPromo;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
