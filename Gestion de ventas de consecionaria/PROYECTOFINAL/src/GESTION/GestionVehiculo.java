package GESTION;

import CLASES.Vehiculo;

public class GestionVehiculo {
    private Vehiculo[] vehiculos;
    private int total;
    
    
    public GestionVehiculo() {
        vehiculos = new Vehiculo[50];
        total = 0;
        
        
        vehiculos[total++] = new Vehiculo("V001", "Toyota", "Corolla", "Rojo", 2023, "Sedán", 25000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V002", "Honda", "Civic", "Azul", 2022, "Sedán", 28000.00, "Vendido");
        vehiculos[total++] = new Vehiculo("V003", "Hyundai", "Elantra", "Blanco", 2021, "Sedán", 23000.00, "Reservado");
        vehiculos[total++] = new Vehiculo("V004", "Kia", "Rio", "Negro", 2020, "Hatchback", 18000.00, "Vendidoo");
        vehiculos[total++] = new Vehiculo("V005", "Mazda", "CX-5", "Gris", 2023, "SUV", 35000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V006", "Ford", "Ranger", "Plata", 2022, "Pickup", 42000.00, "Vendido");
        vehiculos[total++] = new Vehiculo("V007", "Chevrolet", "Spark", "Amarillo", 2019, "Hatchback", 15000.00, "Reservado");
        vehiculos[total++] = new Vehiculo("V008", "Nissan", "Versa", "Blanco", 2021, "Sedán", 21000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V009", "Volkswagen", "Golf", "Azul", 2020, "Hatchback", 27000.00, "Reservado");
        vehiculos[total++] = new Vehiculo("V010", "BMW", "X3", "Negro", 2023, "SUV", 55000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V011", "Suzuki", "Swift", "Rojo", 2022, "Hatchback", 19000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V012", "Renault", "Duster", "Gris", 2023, "SUV", 29000.00, "Vendido");
        vehiculos[total++] = new Vehiculo("V013", "Peugeot", "3008", "Negro", 2021, "SUV", 33000.00, "Reservado");
        vehiculos[total++] = new Vehiculo("V014", "Fiat", "Cronos", "Blanco", 2020, "Sedán", 17000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V015", "Audi", "A3", "Azul", 2022, "Sedán", 41000.00, "Reservado");
        vehiculos[total++] = new Vehiculo("V016", "Mercedes-Benz", "GLA", "Plata", 2023, "SUV", 58000.00, "Vendido");
        vehiculos[total++] = new Vehiculo("V017", "Subaru", "Forester", "Verde", 2021, "SUV", 34000.00, "Disponible");
        vehiculos[total++] = new Vehiculo("V018", "Jeep", "Compass", "Negro", 2022, "SUV", 36000.00, "Reservado");
        vehiculos[total++] = new Vehiculo("V019", "Ford", "EcoSport", "Naranja", 2020, "SUV", 20000.00, "Vendido");
        vehiculos[total++] = new Vehiculo("V020", "Toyota", "Yaris", "Rojo", 2021, "Hatchback", 18000.00, "Disponible");
    
        
    }
    
    public Vehiculo buscarPorCodigo(String codigo) {
        for (int i = 0; i < total; i++) {
            if (vehiculos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return vehiculos[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Vehiculo vehiculo) {
        
        if (total == vehiculos.length) {
            return false;
        }
        
        
        if (buscarPorCodigo(vehiculo.getCodigo()) != null) {
            return false;
        }
        
        
        vehiculos[total] = vehiculo;
        total++;
        return true;
    }
    
    
    public boolean actualizar(Vehiculo vehiculo) {
        for (int i = 0; i < total; i++) {
            if (vehiculos[i].getCodigo().equalsIgnoreCase(vehiculo.getCodigo())) {
                vehiculos[i].setMarca(vehiculo.getMarca());
                vehiculos[i].setModelo(vehiculo.getModelo());
                vehiculos[i].setColor(vehiculo.getColor());
                vehiculos[i].setAnioFabricacion(vehiculo.getAnioFabricacion());
                vehiculos[i].setTipo(vehiculo.getTipo());
                vehiculos[i].setPrecioBase(vehiculo.getPrecioBase());
                vehiculos[i].setEstado(vehiculo.getEstado());
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String codigo) {
        for (int i = 0; i < total; i++) {
            if (vehiculos[i].getCodigo().equalsIgnoreCase(codigo)) {
                for (int j = i; j < total - 1; j++) {
                    vehiculos[j] = vehiculos[j + 1];
                }
                vehiculos[total - 1] = null;
                total--;
                return true;
            }
        }
        return false;
    }
    
    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }
    
    public int obtenerTotalVehiculos() {
        return total;
    }
    
    public Vehiculo[] obtenerVehiculosDisponibles() {
        int contador = 0;
        
       
        for (int i = 0; i < total; i++) {
            if (vehiculos[i].getEstado().equalsIgnoreCase("Disponible")) {
                contador++;
            }
        }
        
        
        Vehiculo[] disponibles = new Vehiculo[contador];
        int contador_2 = 0;
        
        for (int i = 0; i < total; i++) {
            if (vehiculos[i].getEstado().equalsIgnoreCase("Disponible")) {
                disponibles[contador_2] = vehiculos[i];
                contador_2++;
            }
        }
        
        return disponibles;
    }
}