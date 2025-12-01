/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CLASES.Vehiculo;
import CLASES.Usuario;
import GESTION.GestionVehiculo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBuscarEstado extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private GestionVehiculo gestionVehiculo;
    
    public frmBuscarEstado(GestionVehiculo gv) {
        initComponents();
        this.gestionVehiculo = gv;
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Color");
        modelo.addColumn("Año");
        modelo.addColumn("Precio");
        
        tbEstado.setModel(modelo);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setTitle("Estado de Vehículos");
        
        listarVehiculos();
    }
    
    void listarVehiculos() {
        modelo.setNumRows(0);
        
        for (int i = 0; i < gestionVehiculo.obtenerTotalVehiculos(); i++) {
            if (gestionVehiculo.obtenerVehiculos()[i].getEstado().equalsIgnoreCase("Disponible")) {
                Object[] fila = {
                    gestionVehiculo.obtenerVehiculos()[i].getCodigo(),
                    gestionVehiculo.obtenerVehiculos()[i].getMarca(),
                    gestionVehiculo.obtenerVehiculos()[i].getModelo(),
                    gestionVehiculo.obtenerVehiculos()[i].getColor(),
                    gestionVehiculo.obtenerVehiculos()[i].getAnioFabricacion(),
                    gestionVehiculo.obtenerVehiculos()[i].getPrecioBase(),
                };
            modelo.addRow(fila);
            }
            if (gestionVehiculo.obtenerVehiculos()[i].getEstado().equalsIgnoreCase("Vendido")) {
                Object[] fila = {
                    gestionVehiculo.obtenerVehiculos()[i].getCodigo(),
                    gestionVehiculo.obtenerVehiculos()[i].getMarca(),
                    gestionVehiculo.obtenerVehiculos()[i].getModelo(),
                    gestionVehiculo.obtenerVehiculos()[i].getColor(),
                    gestionVehiculo.obtenerVehiculos()[i].getAnioFabricacion(),
                    gestionVehiculo.obtenerVehiculos()[i].getPrecioBase(),
                };
            modelo.addRow(fila);
            }
            if (gestionVehiculo.obtenerVehiculos()[i].getEstado().equalsIgnoreCase("Reservado")) {
                Object[] fila = {
                    gestionVehiculo.obtenerVehiculos()[i].getCodigo(),
                    gestionVehiculo.obtenerVehiculos()[i].getMarca(),
                    gestionVehiculo.obtenerVehiculos()[i].getModelo(),
                    gestionVehiculo.obtenerVehiculos()[i].getColor(),
                    gestionVehiculo.obtenerVehiculos()[i].getAnioFabricacion(),
                    gestionVehiculo.obtenerVehiculos()[i].getPrecioBase(),
                };
            modelo.addRow(fila);
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBusqueda = new javax.swing.JPanel();
        lblEstadoBusqueda = new javax.swing.JLabel();
        txtEstadoBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEstado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterio de búsqueda "));

        lblEstadoBusqueda.setText("Estado");
        lblEstadoBusqueda.setToolTipText("");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBusquedaLayout = new javax.swing.GroupLayout(pnlBusqueda);
        pnlBusqueda.setLayout(pnlBusquedaLayout);
        pnlBusquedaLayout.setHorizontalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblEstadoBusqueda)
                .addGap(18, 18, 18)
                .addComponent(txtEstadoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        pnlBusquedaLayout.setVerticalGroup(
            pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoBusqueda)
                    .addComponent(txtEstadoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tbEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbEstado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pnlBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionVehiculo gv = new GestionVehiculo();
                
                new frmBuscarEstado(gv).setVisible(true);
            }
        });
    }
            
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String estadoBusqueda = txtEstadoBusqueda.getText().trim();
        
        modelo.setNumRows(0);
        boolean encontrado = false;
        for (int i = 0; i < gestionVehiculo.obtenerTotalVehiculos(); i++) {
            Vehiculo vehiculo = gestionVehiculo.obtenerVehiculos()[i];
            if (vehiculo.getEstado().equalsIgnoreCase(estadoBusqueda)) {
                Object[] fila = {
                    vehiculo.getCodigo(),
                    vehiculo.getMarca(),
                    vehiculo.getModelo(),
                    vehiculo.getColor(),
                    vehiculo.getAnioFabricacion(),               
                    vehiculo.getPrecioBase()
                };
            modelo.addRow(fila);
            encontrado = true;
            }
        }
        
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "La búsqueda no encontró resultados");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEstadoBusqueda;
    private javax.swing.JPanel pnlBusqueda;
    private javax.swing.JTable tbEstado;
    private javax.swing.JTextField txtEstadoBusqueda;
    // End of variables declaration//GEN-END:variables
}
