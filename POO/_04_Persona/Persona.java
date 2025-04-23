/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Persona;

/**
 *
 * @author angam
 */
public class Persona {
    
    private String nombre;
    private String email;
    private static int contadorPersonas = 0;
    
    
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.contadorPersonas++;
        
    }

    
    
    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }
    
    
    
    public String toString(){
        return String.format("%15s - %-22s", this.nombre, this.email);
    }
    
    
    
    
    
}//FIN
