/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package GUI;

import CLASES.*;
import GESTION.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class frmCotizacion extends javax.swing.JFrame {

    private GestionVehiculo gestionVehiculo;
    private GestionClientes gestionClientes;
    private GestionPromocion gestionPromocion;
    private GestionCotizacion gestionCotizacion;
    private GestionUsuario gestionUsuario;
    private Usuario vendedorActual;
    
    private Vehiculo vehiculoSeleccionado;
    private Cliente clienteSeleccionado;
    private Promocion promocionSeleccionada;
    
    
    public frmCotizacion(Usuario vendedor, GestionVehiculo gv, 
                         GestionClientes gc, GestionPromocion gp, 
                         GestionUsuario gu,GestionCotizacion gCot) {
        initComponents();
        
        this.vendedorActual = vendedor;
        this.gestionVehiculo = gv;
        this.gestionClientes = gc;
        this.gestionPromocion = gp;
        this.gestionUsuario = gu;
        this.gestionCotizacion = gCot;
        
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setTitle("Gestión de Cotizaciones");
        setLocationRelativeTo(null);
        
        inicializarFormulario();
    }
    
    private void inicializarFormulario() {
        
        String codigoCotizacion = "COT" + String.format("%04d", 
            (int)(Math.random() * 9999) + 1);
        txtCodigoCotizacion.setText(codigoCotizacion);
        txtCodigoCotizacion.setEditable(false);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtFecha.setText(sdf.format(new Date()));
        
        
        cargarVendedores();
        
       
        cargarClientes();
        
       
        cargarPromociones();
        
       
        txtMarca.setEditable(false);
        txtModelo.setEditable(false);
        txtColor.setEditable(false);
        txtMostrarPB.setEditable(false);
        txtTotalPagar.setEditable(false);
    }
    
    private void cargarVendedores() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("-- Seleccione Vendedor --");
        
        for (int i = 0; i < gestionUsuario.obtenerTotalUsuarios(); i++) {
            Usuario u = gestionUsuario.obtenerUsuarios()[i];
            if (u.getRol().equalsIgnoreCase("VENDEDOR")) {
                modelo.addElement(u.getNombres() + " " + u.getApellidos() + 
                    " (" + u.getDni() + ")");
            }
        }
        
        cboVendedor.setModel(modelo);
        
       
        if (vendedorActual != null) {
            String nombreVendedor = vendedorActual.getNombres() + " " + 
                vendedorActual.getApellidos() + " (" + vendedorActual.getDni() + ")";
            cboVendedor.setSelectedItem(nombreVendedor);
        }
    }
    
    private void cargarClientes() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("-- Seleccione Cliente --");
        
        for (int i = 0; i < gestionClientes.obtenerTotalClientes(); i++) {
            Cliente c = gestionClientes.obtenerClientes()[i];
            modelo.addElement(c.getNombres() + " " + c.getApellidos() + 
                " (" + c.getDni() + ")");
        }
        
        cboCliente.setModel(modelo);
    }
    
    private void cargarPromociones() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("-- Sin Promoción --");

        for (int i = 0; i < gestionPromocion.obtenerTotalPromociones(); i++) {
            Promocion p = gestionPromocion.obtenerPromociones()[i];

        
            if (p == null) continue;

            String texto = p.getNombre() + " - ";
            if (p.getTipo().equalsIgnoreCase("porcentaje")) {
                texto += p.getValor() + "%";
            } else {
                texto += "S/ " + p.getValor();
            }

            modelo.addElement(texto);
        }

        cboPromocion.setModel(modelo);
    }
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCotizacion = new javax.swing.JPanel();
        txtFecha = new javax.swing.JTextField();
        txtCodigoCotizacion = new javax.swing.JTextField();
        lblVendedor = new javax.swing.JLabel();
        lblCodigoCotizacion = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        cboVendedor = new javax.swing.JComboBox<>();
        pnlDatosCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox<>();
        pnlVehiculoSeleccionado = new javax.swing.JPanel();
        lblCodigoVehiculo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtCodigoVehiculo = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        pnlTotal = new javax.swing.JPanel();
        lblMostrarPB = new javax.swing.JLabel();
        txtMostrarPB = new javax.swing.JTextField();
        lblCalculoDescuento = new javax.swing.JLabel();
        lbllinea = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        cboPromocion = new javax.swing.JComboBox<>();
        btnGenerarCotizacion = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCodigoCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCotizacionActionPerformed(evt);
            }
        });

        lblVendedor.setText("Vendedor");

        lblCodigoCotizacion.setText("Código");

        lblFecha.setText("Fecha");

        cboVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCotizacionLayout = new javax.swing.GroupLayout(pnlCotizacion);
        pnlCotizacion.setLayout(pnlCotizacionLayout);
        pnlCotizacionLayout.setHorizontalGroup(
            pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCotizacionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboVendedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha)
                    .addComponent(txtCodigoCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        pnlCotizacionLayout.setVerticalGroup(
            pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCotizacionLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCotizacion)
                    .addComponent(txtCodigoCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCotizacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(cboVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnlDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblCliente.setText("Cliente");

        cboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosClienteLayout = new javax.swing.GroupLayout(pnlDatosCliente);
        pnlDatosCliente.setLayout(pnlDatosClienteLayout);
        pnlDatosClienteLayout.setHorizontalGroup(
            pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlDatosClienteLayout.setVerticalGroup(
            pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnlVehiculoSeleccionado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehículo Seleccionado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblCodigoVehiculo.setText("Código");

        lblMarca.setText("Marca");

        txtCodigoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVehiculoActionPerformed(evt);
            }
        });

        lblModelo.setText("Modelo");

        lblColor.setText("Color");

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtMarca.setEditable(false);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtModelo.setEditable(false);

        txtColor.setEditable(false);

        javax.swing.GroupLayout pnlVehiculoSeleccionadoLayout = new javax.swing.GroupLayout(pnlVehiculoSeleccionado);
        pnlVehiculoSeleccionado.setLayout(pnlVehiculoSeleccionadoLayout);
        pnlVehiculoSeleccionadoLayout.setHorizontalGroup(
            pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculoSeleccionadoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlVehiculoSeleccionadoLayout.createSequentialGroup()
                        .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtModelo)))
                    .addGroup(pnlVehiculoSeleccionadoLayout.createSequentialGroup()
                        .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(txtMarca))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVehiculoSeleccionadoLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(btnMostrar)
                .addGap(135, 135, 135))
        );
        pnlVehiculoSeleccionadoLayout.setVerticalGroup(
            pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculoSeleccionadoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoVehiculo)
                    .addComponent(txtCodigoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlVehiculoSeleccionadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnMostrar)
                .addGap(39, 39, 39))
        );

        pnlTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblMostrarPB.setText("Precio base");

        lblCalculoDescuento.setText("Descuento / promoción");

        lbllinea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbllinea.setText("__________________________________________________________________________________");
        lbllinea.setToolTipText("");

        lblTotalPagar.setText("TOTAL A PAGAR");

        cboPromocion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPromocionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTotalLayout = new javax.swing.GroupLayout(pnlTotal);
        pnlTotal.setLayout(pnlTotalLayout);
        pnlTotalLayout.setHorizontalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTotalLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addComponent(lblCalculoDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(cboPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbllinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addComponent(lblTotalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTotalLayout.createSequentialGroup()
                        .addComponent(lblMostrarPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addComponent(txtMostrarPB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(143, 143, 143))
        );
        pnlTotalLayout.setVerticalGroup(
            pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTotalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMostrarPB)
                    .addComponent(txtMostrarPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCalculoDescuento)
                    .addComponent(cboPromocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbllinea, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalPagar)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnGenerarCotizacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGenerarCotizacion.setText("Generar Cotización");
        btnGenerarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCotizacionActionPerformed(evt);
            }
        });

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pnlCotizacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pnlDatosCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(pnlVehiculoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnGenerarCotizacion)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlVehiculoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pnlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
      if (vehiculoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, 
                "Primero debe buscar y mostrar un vehículo",
                "Validación",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        double precioBase = vehiculoSeleccionado.getPrecioBase();
        double descuento = 0;
        
        
        int indexPromo = cboPromocion.getSelectedIndex();
        if (indexPromo > 0) {
            promocionSeleccionada = gestionPromocion.obtenerPromociones()[indexPromo - 1];
            descuento = promocionSeleccionada.calcularDescuento(precioBase);
        } else {
            promocionSeleccionada = null;
            descuento = 0;
        }
        
        double total = precioBase - descuento;
        
        
        txtTotalPagar.setText(String.format("S/ %.2f", total));
        
        
        String mensaje = "Cálculo realizado:\n\n" +
                        "Precio Base: S/ " + String.format("%.2f", precioBase) + "\n" +
                        "Descuento: S/ " + String.format("%.2f", descuento) + "\n" +
                        "Total a Pagar: S/ " + String.format("%.2f", total);
        
        JOptionPane.showMessageDialog(this, mensaje, "Cálculo Completado", 
                                      JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cboVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboVendedorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, 
            "¿Está seguro que desea cancelar? Los datos no guardados se perderán.",
            "Confirmar cancelación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarDatosVehiculo() {
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtMostrarPB.setText("");
        txtTotalPagar.setText("");
    }
    
    private void limpiarFormulario() {
        
        String nuevoCodigo = "COT" + String.format("%04d", 
            (int)(Math.random() * 9999) + 1);
        txtCodigoCotizacion.setText(nuevoCodigo);
        
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        txtFecha.setText(sdf.format(new Date()));
        
        
        txtCodigoVehiculo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtColor.setText("");
        txtMostrarPB.setText("");
        cboCliente.setSelectedIndex(0);
        cboPromocion.setSelectedIndex(0);
        txtTotalPagar.setText("");
        
        vehiculoSeleccionado = null;
        clienteSeleccionado = null;
        promocionSeleccionada = null;
    }
    
    private void btnGenerarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCotizacionActionPerformed
                                                   
        if (vehiculoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un vehículo");
            return;
        }

        if (cboCliente.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente");
            return;
        }

        if (txtTotalPagar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Calcule el total primero");
            return;
        }

        int indexCliente = cboCliente.getSelectedIndex() - 1;
        clienteSeleccionado = gestionClientes.obtenerClientes()[indexCliente];

        String codigo = txtCodigoCotizacion.getText();
        String fecha = txtFecha.getText();

        Cotizacion cot = new Cotizacion(codigo,clienteSeleccionado,vendedorActual,vehiculoSeleccionado,promocionSeleccionada,fecha);

   

        if (gestionCotizacion.registrar(cot)) {

            JOptionPane.showMessageDialog(this, "Cotización generada exitosamente");

        
            txtCodigoCotizacion.setText(gestionCotizacion.generarCodigoCotizacion());

        }  
    }//GEN-LAST:event_btnGenerarCotizacionActionPerformed
    
    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboClienteActionPerformed

    private void txtCodigoCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCotizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCotizacionActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
       String codigoVehiculo = txtCodigoVehiculo.getText().trim();
        
        if (codigoVehiculo.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Por favor ingrese el código del vehículo",
                "Validación",
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Vehiculo v = gestionVehiculo.buscarPorCodigo(codigoVehiculo);
        
        if (v != null && v.getEstado().equalsIgnoreCase("Disponible")) {
            vehiculoSeleccionado = v;
            
            
            txtMarca.setText(v.getMarca());
            txtModelo.setText(v.getModelo());
            txtColor.setText(v.getColor());
            txtMostrarPB.setText(String.format("S/ %.2f", v.getPrecioBase()));
            
            JOptionPane.showMessageDialog(this, 
                "Vehículo encontrado y cargado correctamente",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            vehiculoSeleccionado = null;
            limpiarDatosVehiculo();
            
            JOptionPane.showMessageDialog(this, 
                "No se encontró un vehículo disponible con el código: " + codigoVehiculo,
                "Vehículo no encontrado",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void txtCodigoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVehiculoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void cboPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPromocionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPromocionActionPerformed

    public static void main(String[] args) {

        GestionVehiculo gv = new GestionVehiculo();
        GestionClientes gc = new GestionClientes();
        GestionPromocion gp = new GestionPromocion();
        GestionUsuario gu = new GestionUsuario();
        GestionCotizacion gCot = new GestionCotizacion();

        
        Usuario vendedor = gu.buscarPorDNI("56789"); 

        frmCotizacion frm = new frmCotizacion(vendedor,gv,gc,gp,gu,gCot );
        frm.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarCotizacion;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboPromocion;
    private javax.swing.JComboBox<String> cboVendedor;
    private javax.swing.JLabel lblCalculoDescuento;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigoCotizacion;
    private javax.swing.JLabel lblCodigoVehiculo;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMostrarPB;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JLabel lbllinea;
    private javax.swing.JPanel pnlCotizacion;
    private javax.swing.JPanel pnlDatosCliente;
    private javax.swing.JPanel pnlTotal;
    private javax.swing.JPanel pnlVehiculoSeleccionado;
    private javax.swing.JTextField txtCodigoCotizacion;
    private javax.swing.JTextField txtCodigoVehiculo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMostrarPB;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
