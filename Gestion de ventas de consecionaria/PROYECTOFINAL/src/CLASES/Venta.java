/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.util.Date;

public class Venta {
    private String codigo;
    private Cotizacion cotizacion;
    private Date fecha;
    private double montoTotal;

    private Pago[] pagos = new Pago[20];
    private int contadorPagos = 0;

    public Venta(String codigo, Cotizacion cotizacion, double montoTotal) {
        this.codigo = codigo;
        this.cotizacion = cotizacion;
        this.fecha = new Date();
        this.montoTotal = montoTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void registrarPago(Pago p) {
        if (contadorPagos < pagos.length) {
            pagos[contadorPagos++] = p;
        }
    }

    public Pago[] getPagos() {
        return pagos;
    }

    public double getSaldoPendiente() {
        double pagado = 0;
        for (int i = 0; i < contadorPagos; i++) {
            pagado += pagos[i].getMonto();
        }
        return montoTotal - pagado;
    }
}

