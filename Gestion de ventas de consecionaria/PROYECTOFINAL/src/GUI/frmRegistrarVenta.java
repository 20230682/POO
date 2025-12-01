/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CLASES.Cliente;
import CLASES.Cotizacion;
import CLASES.Venta;
import CLASES.Vehiculo;
import CLASES.Pago;
import CLASES.Usuario;
import GESTION.GestionCotizacion;
import GESTION.GestionVenta;
import GESTION.GestionVehiculo;
import java.util.Date;
import javax.swing.JOptionPane;


public class frmRegistrarVenta extends javax.swing.JFrame {
    private Cotizacion cotizacion;
    private GestionVenta gVenta;
    private GestionVehiculo gVeh;

    private Venta ventaActual;
    
    public frmRegistrarVenta(Cotizacion c, GestionVenta gv, GestionVehiculo gveh) {
        initComponents();
        this.cotizacion = c;
        this.gVenta = gv;
        this.gVeh = gveh;
        setLocationRelativeTo(null);

        cargarDatosVenta();
        inicializarPago();
    }

    private void cargarDatosVenta() {
        txtCodCot.setText(cotizacion.getCodigo());
        txtCliente.setText(cotizacion.getCliente().getNombres() + " " + cotizacion.getCliente().getApellidos());
        txtVendedor.setText(cotizacion.getVendedor().getNombres());
        txtVehiculo.setText(cotizacion.getVehiculo().getMarca() + " " + cotizacion.getVehiculo().getModelo());
        txtMonto.setText(String.valueOf(cotizacion.getMontoTotal()));

        
        txtCodCot.setEditable(false);
        txtCliente.setEditable(false);
        txtVendedor.setEditable(false);
        txtVehiculo.setEditable(false);
        txtMonto.setEditable(false);
    }

    private void inicializarPago() {
        cboMetodoPago.removeAllItems();
        cboMetodoPago.addItem("Efectivo");
        cboMetodoPago.addItem("Tarjeta");
        cboMetodoPago.addItem("Transferencia");
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarVenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblCodCot = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        txtCodCot = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        txtVehiculo = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblMetodoPago = new javax.swing.JLabel();
        lblMontoPago = new javax.swing.JLabel();
        txtMontoPago = new javax.swing.JTextField();
        cboMetodoPago = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarVenta.setText("Registrar venta y pago");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar venta"));
        jPanel1.setToolTipText("");

        lblCodCot.setText("Código de Cotización");

        lblCliente.setText("Cliente");

        lblVendedor.setText("Vendedor");

        lblVehiculo.setText("Vehículo");

        lblMonto.setText("Monto Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodCot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodCot)
                    .addComponent(txtCliente)
                    .addComponent(txtVendedor)
                    .addComponent(txtVehiculo)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodCot)
                    .addComponent(txtCodCot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehiculo)
                    .addComponent(txtVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago"));

        lblMetodoPago.setText("Método de Pago");

        lblMontoPago.setText("Monto Pagado");

        cboMetodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMetodoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMetodoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMontoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMontoPago)
                    .addComponent(cboMetodoPago, 0, 160, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMetodoPago)
                    .addComponent(cboMetodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoPago)
                    .addComponent(txtMontoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarVenta)
                .addGap(41, 41, 41)
                .addComponent(btnCerrar)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVenta)
                    .addComponent(btnCerrar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Registrar Venta");

        getAccessibleContext().setAccessibleName("Registrar Venta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
                                                          
    
        if (ventaActual != null) {
        JOptionPane.showMessageDialog(this, "La venta ya fue registrada.");
        return;
    }

   
        String codigoVenta = gVenta.generarCodigoVenta();
        ventaActual = new Venta(codigoVenta, cotizacion, cotizacion.getMontoTotal());
        gVenta.registrar(ventaActual);

    
        Vehiculo v = cotizacion.getVehiculo();
        v.setEstado("VENDIDO");
        gVeh.actualizar(v);

   
        String metodo = cboMetodoPago.getSelectedItem().toString();
        double monto;

        try {
            monto = Double.parseDouble(txtMontoPago.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Monto inválido.");
            return;
        }

        Pago p = new Pago(new Date(), metodo, monto);
        ventaActual.registrarPago(p);

        double saldo = ventaActual.getSaldoPendiente();

    
        JOptionPane.showMessageDialog(this,
            "Venta y pago registrados correctamente.\n\n" +
            "Código de venta: " + codigoVenta + "\n" +
            "Monto abonado: S/ " + monto + "\n" +
            "Saldo pendiente: S/ " + String.format("%.2f", saldo)
        );

    
        txtMonto.setText("");
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void cboMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMetodoPagoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public static void main(String[] args) {

    

        GestionCotizacion Cot = new GestionCotizacion();
        GestionVehiculo gVeh = new GestionVehiculo();
        GestionVenta gVen = new GestionVenta();

   
        Vehiculo v = new Vehiculo(
            "V001", "Toyota", "Yaris", "Rojo", 2024,
            "Sedan", 45000, "DISPONIBLE"
        );
        gVeh.registrar(v);

    
        Cliente c = new Cliente(
            "12345678", "Juan", "Pérez",
            "Av. Lima 123", "987654321", "jp@gmail.com"
        );

    
        Usuario u = new Usuario(
            "87654321", "Carlos", "Vargas",
            "cvargas", "123", "VENDEDOR"
        );

    
        Cotizacion cot = new Cotizacion(
            "COT0001", c, u, v, null, "10/02/2025"
        );
        cot.setEstado("APROBADA"); 

    
        frmRegistrarVenta frm = new frmRegistrarVenta(cot, gVen, gVeh);
        frm.setVisible(true);
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox<String> cboMetodoPago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodCot;
    private javax.swing.JLabel lblMetodoPago;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblMontoPago;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodCot;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoPago;
    private javax.swing.JTextField txtVehiculo;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
