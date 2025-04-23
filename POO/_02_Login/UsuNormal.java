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



public class UsuNormal {
    
    private String nombre;
    private String password;
    private String email;

    
    public UsuNormal(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    
    
    
    public String getNombre() {
        return this.nombre;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    
    
    
    
    
    
    //cambiarPassword
    public void cambiarPassword(){
        System.out.print("Nueva contraseña: ");
        String nuevaContrasenia = POO.teclado.nextLine();
        this.password = nuevaContrasenia;
    }
    
    
    
    //listarUsuarios
    public void listarUsuarios(ArrayList<UsuNormal> lista){
        System.out.println(" ".repeat(10) + "LISTA DE USUARIOS");
        System.out.println("=".repeat(40));
        
        for(UsuNormal usuario: BD_Usuarios.obtenerBD()){
            System.out.println(usuario.toString());
        }
        
    }
    
    
    
    //toString
    @Override
    public String toString(){
        
        UsuNormal usuario = BD_Usuarios.obtenerUsuario(this.nombre);
        
        if(usuario instanceof UsuAdmin){
            return String.format("%-1s %11s %10s %-17s", "A", this.nombre, "*".repeat(10), this.email);
        }else{
            return String.format("%-1s %11s %10s %-17s", " ", this.nombre, "*".repeat(10), this.email);
        }
    }
    
    
    
    
    
    
}// FIN
