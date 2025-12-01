/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION;

import CLASES.Cliente;

public class GestionClientes {
   private Cliente[] clientes;
    private int total;

    public GestionClientes() {
        clientes = new Cliente[50]; 
        total = 0;
        
        clientes[total++] = new Cliente("12345678A", "Juan Carlos", "García López", "Calle Principal 123", "600123456", "juan.garcia@email.com");
        clientes[total++] = new Cliente("87654321B", "María Elena", "Rodríguez Sánchez", "Avenida Central 456", "611987654", "maria.rodriguez@email.com");
        clientes[total++] = new Cliente("11223344C", "Pedro Antonio", "Martínez Fernández", "Plaza Mayor 789", "622555888", "pedro.martinez@email.com");
        clientes[total++] = new Cliente("55667788D", "Ana Isabel", "González Pérez", "Calle Secundaria 321", "633444777", "ana.gonzalez@email.com");
        clientes[total++] = new Cliente("99887766E", "Carlos Manuel", "Hernández Castro", "Avenida Norte 654", "644333222", "carlos.hernandez@email.com");
    }
    
    public Cliente buscarPorDNI(String dni){
        for (int i = 0; i < total; i++) {
            if(clientes[i].getDni().equals(dni)){
                return clientes[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Cliente cliente) {
        if (total == clientes.length) {
            return false;
        }
        
        if (buscarPorDNI(cliente.getDni()) != null) {
            return false;
        }
   
        clientes[total] = cliente;
        total++;
        return true;
    }
    
        public boolean actualizar(Cliente cliente) {
        for (int i = 0; i < total; i++) {
            if (clientes[i].getDni().equals(cliente.getDni())) {

                clientes[i].setNombres(cliente.getNombres());
                clientes[i].setApellidos(cliente.getApellidos());
                clientes[i].setApellidos(cliente.getDireccion());
                clientes[i].setTelefono(cliente.getTelefono());
                clientes[i].setCorreo(cliente.getCorreo());

                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String dni) {
        for (int i = 0; i < total; i++) {
            if (clientes[i].getDni().equals(dni)) {

                // Desplazar los elementos hacia arriba
                for (int j = i; j < total - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }

                clientes[total - 1] = null;
                total--;
                return true;
            }
        }
        return false;
    }

    
    public Cliente[] obtenerClientes() {
        return clientes;
    }

    public int obtenerTotalClientes() {
        return total;
    }
}
