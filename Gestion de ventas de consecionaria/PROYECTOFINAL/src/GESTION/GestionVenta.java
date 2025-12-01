/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION;

import CLASES.Venta;
import CLASES.Usuario;
import CLASES.Pago;

public class GestionVenta {

    private Venta[] ventas;
    private int total;

    public GestionVenta() {
        ventas = new Venta[100];
        total = 0;
    }

    public boolean registrar(Venta v) {
        if (total == ventas.length) return false;
        ventas[total++] = v;
        return true;
    }

    public String generarCodigoVenta() {
        return "VEN" + String.format("%04d", total + 1);
    }

    public Venta buscarVenta(String codigo) {
        for (int i = 0; i < total; i++) {
            if (ventas[i].getCodigo().equalsIgnoreCase(codigo)) {
                return ventas[i];
            }
        }
        return null;
    }

    public Venta[] obtenerVentas() {
        return ventas;
    }

    
    public Venta[] obtenerVentasPorVendedor(Usuario vendedor) {
        int contador = 0;

        for (int i = 0; i < total; i++) {
            if (ventas[i].getCotizacion().getVendedor().getDni()
                .equals(vendedor.getDni())) {
                contador++;
            }
        }

        Venta[] resultado = new Venta[contador];
        int index = 0;

        for (int i = 0; i < total; i++) {
            if (ventas[i].getCotizacion().getVendedor().getDni()
                .equals(vendedor.getDni())) {
                resultado[index++] = ventas[i];
            }
        }

        return resultado;
    }

    public void registrarPago(String codVenta, Pago p) {
        Venta v = buscarVenta(codVenta);
        if (v != null) {
            v.registrarPago(p);
        }
    }
}

