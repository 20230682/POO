/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION;
import CLASES.Promocion;


public class GestionPromocion {
    private Promocion[] promociones;
    private int total;

    public GestionPromocion() {
        promociones = new Promocion[10];
        total = 0;
        
        promociones[total++] = new Promocion("Descuento Verano", "porcentaje", 15.0, "2024-01-15", "2024-02-15");
        promociones[total++] = new Promocion("Oferta Especial", "monto fijo", 50.0, "2024-01-20", "2024-03-20");
        promociones[total++] = new Promocion("Promo Aniversario", "porcentaje", 20.0, "2024-02-01", "2024-02-29");
        promociones[total++] = new Promocion("Descuento Flash", "monto fijo", 30.0, "2024-01-25", "2024-01-31");
        promociones[total++] = new Promocion("Liquidación Invierno", "porcentaje", 25.0, "2024-03-01", "2024-03-31");
    }   
    public Promocion buscarPorNombre(String nombre) {
        for(int i = 0; i < total; i++) {
            if(promociones[i].getNombre().equalsIgnoreCase(nombre)) {
                return promociones[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Promocion promo) {
        if (total == promociones.length) {
            return false;
        }

        if (buscarPorNombre(promo.getNombre()) != null) {
            return false;
        }

        promociones[total] = promo;  
        total++;
        return true;
    }


    public boolean actualizar(Promocion promo) {
        for(int i = 0; i < total; i++) {
            if(promociones[i].getNombre().equalsIgnoreCase(promo.getNombre())) {
                promociones[i].setTipo(promo.getTipo());
                promociones[i].setValor(promo.getValor());
                promociones[i].setInicio(promo.getInicio());
                promociones[i].setFin(promo.getFin());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String nombre) {
        for (int i = 0; i < total; i++) {
            if (promociones[i].getNombre().equalsIgnoreCase(nombre)) {

                // Compactar arreglo
                for (int j = i; j < total - 1; j++) {
                    promociones[j] = promociones[j + 1];
                }

                promociones[total - 1] = null;
                total--;
                return true;
            }
        }
        return false;
    }

    public Promocion[] obtenerPromociones() {
        return promociones;  
    }

    public int obtenerTotalPromociones() {
        return total;
    }
}
