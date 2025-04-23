/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_login;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class BD_Usuarios {
    
    private static ArrayList<UsuNormal> bd = new ArrayList<>();
    
    
    
    
    // añadirUsuario
    public static void anadirUsuario(UsuNormal usuNormal){
        BD_Usuarios.bd.add(usuNormal);
    }
    
    
    
    // obtenerBD
    public static ArrayList<UsuNormal> obtenerBD(){
        return BD_Usuarios.bd;
    }
    
    
    
    
    
    // obtenerUsuario
    public static UsuNormal obtenerUsuario(String nombre){
        UsuNormal usuarioBuscado = null;
        
        for(UsuNormal usuario: BD_Usuarios.bd){
            if(usuario.getNombre().equals(nombre)){
                usuarioBuscado = usuario;
                break;
            }
        }
        
        return usuarioBuscado;
    }
    
    
    
    // verificarLogin
    public static boolean verificarLogin(String nombre, String password){
        
        boolean usuarioEncontrado = false;
        
        for(UsuNormal usuario:BD_Usuarios.bd){
            if(usuario.getNombre().equals(nombre) && usuario.getPassword().equals(password)){
                usuarioEncontrado = true;
                break;
            }
        }
        
        return usuarioEncontrado;
    }
    
    
    
    
    
}// FIN
