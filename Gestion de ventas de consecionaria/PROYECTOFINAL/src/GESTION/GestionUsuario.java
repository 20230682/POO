/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GESTION;

import CLASES.Usuario;

public class GestionUsuario {
    private Usuario[] usuarios;
    private int total;
    
    
    public GestionUsuario(){  
        usuarios = new Usuario[30];
        total = 0;
        
        
        usuarios[total++] = new Usuario("12345","Neil","","asdf","12345","ADMINISTRADOR");
        usuarios[total++] = new Usuario("56789","Sebastián","","qwer","56789","VENDEDOR");  
        usuarios[total++] = new Usuario("87654321B", "Laura", "Mendoza Ruiz", "lmendoza", "laura2024", "VENDEDOR");
        usuarios[total++] = new Usuario("11223344C", "Carlos", "Silva Torres", "csilva", "carlos#456", "VENDEDOR");
        usuarios[total++] = new Usuario("55667788D", "Ana", "Vargas López", "avargas", "anaV789", "ADMINISTRADOR");
        usuarios[total++] = new Usuario("99887766E", "Diego", "Ramírez Cruz", "dramirez", "diegoR_001", "VENDEDOR");
    }
    
    public Usuario validarLogin(String usuario, String contraseña){
        for(int i=0; i<total; i++){
            if(usuarios[i].getUsuario().equals(usuario) &&
               usuarios[i].getContraseña().equals(contraseña)){
                return usuarios[i];
            }
        }
        return null;
    }
    
    public Usuario buscarPorDNI(String dni){
        for (int i = 0; i < total; i++) {
            if(usuarios[i].getDni().equals(dni)){
                return usuarios[i];
            }
        }
        return null;
    }
    
    public boolean registrar(Usuario usuario){
        if(total == usuarios.length){
            return false;
        }
        
        if(buscarPorDNI(usuario.getDni()) != null){
            return false;
        }
   
        usuarios[total] = usuario;
        total++;
        return true;
    }
    
        public boolean actualizar(Usuario usuario){
        for(int i = 0; i < total; i++){
            if(usuarios[i].getDni().equals(usuario.getDni())){
                usuarios[i].setNombres(usuario.getNombres());
                usuarios[i].setNombres(usuario.getApellidos());
                usuarios[i].setUsuario(usuario.getUsuario());
                usuarios[i].setContraseña(usuario.getContraseña());
                usuarios[i].setRol(usuario.getRol());
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String dni){
        for(int i = 0; i < total; i++){
            if(usuarios[i].getDni().equals(dni)){
                for(int j = i; j < total - 1; j++){
                    usuarios[j] = usuarios[j + 1];
                }
                
                usuarios[total - 1] = null;
                total--;
                return true;
            }
        }
        return false;
    }

    
    public Usuario[] obtenerUsuarios(){
        return usuarios;
    }
    
    public int obtenerTotalUsuarios(){
        return total;
    }
    
    
}
