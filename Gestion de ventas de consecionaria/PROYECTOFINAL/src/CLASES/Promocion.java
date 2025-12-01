/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

public class Promocion {
    private String nombre;
    private String tipo; 
    private double valor;
    private String inicio;
    private String fin;
    
    public Promocion(String nombre, String tipo, double valor, String inicio, String fin) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
    
    public double calcularDescuento(double precioBase) {
        if (tipo == null) return 0;

        String t = tipo.toUpperCase().replace(" ", "_");

    
        if (t.contains("PORCENTAJE") || t.contains("%")) {
            return precioBase * (valor / 100.0);
        }
        return valor;
    }
}

