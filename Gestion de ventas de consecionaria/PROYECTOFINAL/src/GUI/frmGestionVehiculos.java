/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import CLASES.Vehiculo;
import GESTION.GestionVehiculo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmGestionVehiculos extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private GestionVehiculo gestionVehiculo = new GestionVehiculo();
    
    public frmGestionVehiculos() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Año Fabricación");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio Base");
        modelo.addColumn("Estado");
        
        tbVehiculos.setModel(modelo);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        listarVehiculos();
    }
    
    void listarVehiculos() {
        modelo.setNumRows(0); 
        
        for (int i = 0; i < gestionVehiculo.obtenerTotalVehiculos(); i++) {
            Object[] fila = {
                gestionVehiculo.obtenerVehiculos()[i].getCodigo(),
                gestionVehiculo.obtenerVehiculos()[i].getMarca(),
                gestionVehiculo.obtenerVehiculos()[i].getModelo(),
                gestionVehiculo.obtenerVehiculos()[i].getColor(),
                gestionVehiculo.obtenerVehiculos()[i].getAnioFabricacion(),
                gestionVehiculo.obtenerVehiculos()[i].getTipo(),
                gestionVehiculo.obtenerVehiculos()[i].getPrecioBase(),
                gestionVehiculo.obtenerVehiculos()[i].getEstado()
            };
            modelo.addRow(fila);
        }
    }
    
    void limpiar() {
        txtCodigo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtAnioFabricacion.setText("");
        txtColor.setText("");
        txtTipo.setText("");
        txtPrecioBase.setText("");
        txtEstado.setText("");
        txtCodigo.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        txtEstado = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblAnioFabricacion = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtAnioFabricacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVehiculos = new javax.swing.JTable();
        lblPrecioBase = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnRegistrar2 = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMarca.setText("Marca");

        lblAnioFabricacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAnioFabricacion.setText("Año de fabricación");

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblModelo.setText("Modelo");

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblColor.setText("Color");

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("Tipo");

        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtAnioFabricacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tbVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbVehiculos);

        lblPrecioBase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrecioBase.setText("Precio Base");

        txtTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnRegistrar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrar2.setText("Registrar");
        btnRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar2ActionPerformed(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado.setText("Estado");

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código");

        txtPrecioBase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblAnioFabricacion)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtAnioFabricacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTipo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                                .addComponent(txtPrecioBase, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(btnRegistrar2)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnioFabricacion)
                    .addComponent(txtAnioFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar2)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigo = txtCodigo.getText().trim();
        String marca = txtMarca.getText().trim();
        String modelo = txtModelo.getText().trim();
        String color = txtColor.getText().trim();
        int anioFabricacion = Integer.parseInt(txtAnioFabricacion.getText().trim());
        String tipo = txtTipo.getText().trim();
        double precioBase = Double.parseDouble(txtPrecioBase.getText().trim());
        String estado = txtEstado.getText().trim();
        
        Vehiculo vehiculo = new Vehiculo(codigo, marca, modelo, color, anioFabricacion, tipo, precioBase, estado);
        
        if(gestionVehiculo.actualizar(vehiculo)){
            listarVehiculos();
            JOptionPane.showMessageDialog(this, "Vehículo actualizado");
        }else{
            JOptionPane.showMessageDialog(this, "No se encontró el vehículo a actualizar");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText().trim();
        
        if(gestionVehiculo.eliminar(codigo)){
            listarVehiculos();
            limpiar();
            JOptionPane.showMessageDialog(this, "Vehículo eliminado");
        }else{
            JOptionPane.showMessageDialog(this, "No se encontró el vehículo a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar2ActionPerformed
        String codigo = txtCodigo.getText().trim();
        String marca = txtMarca.getText().trim();
        String modelo = txtModelo.getText().trim();
        String color = txtColor.getText().trim();
        int anioFabricacion = Integer.parseInt(txtAnioFabricacion.getText().trim());
        String tipo = txtTipo.getText().trim();
        double precioBase = Double.parseDouble(txtPrecioBase.getText().trim());
        String estado = txtEstado.getText().trim();
        
        Vehiculo vehiculo = new Vehiculo(codigo, marca, modelo, color, anioFabricacion, tipo, precioBase, estado);
        
        if(gestionVehiculo.registrar(vehiculo)){
            listarVehiculos();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "No se pudo registrar");
        }
    }//GEN-LAST:event_btnRegistrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmGestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGestionVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGestionVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnioFabricacion;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecioBase;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tbVehiculos;
    private javax.swing.JTextField txtAnioFabricacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecioBase;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
