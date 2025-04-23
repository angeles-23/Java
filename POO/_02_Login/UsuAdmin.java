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
public class UsuAdmin extends UsuNormal{

    
    
    public UsuAdmin(String nombre, String password, String email) {
        super(nombre, password, email);
    }
    
    
    
    
    //listarUsuarios    
    @Override
    public void listarUsuarios(ArrayList<UsuNormal> lista){
        
        System.out.println(" ".repeat(10) + "LISTA DE USUARIOS");
        System.out.println("=".repeat(40));
        
        for(UsuNormal usu:lista){
            
            if(usu instanceof UsuAdmin){
                System.out.printf("%-1s %11s %10s %-17s\n", "A", usu.getNombre(), usu.getPassword(), usu.getEmail());
            }else{
                System.out.printf("%-1s %11s %10s %-17s\n", " ", usu.getNombre(), usu.getPassword(), usu.getEmail());
            }
        }
        
    }
    
    
    //cambiarPassword
    public void cambiarPassword(String nombre){
       UsuNormal usuario = BD_Usuarios.obtenerUsuario(nombre);
       usuario.cambiarPassword();
    }
    
    
    
    
    
}// FIN
