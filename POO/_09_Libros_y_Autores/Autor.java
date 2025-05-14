/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _09_Libros_y_Autores;

/**
 *
 * @author angam
 */
public class Autor {
   
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;

    
    public Autor(String n, String ap1, String ap2, String email) {
        this.nombre = n;
        this.apellido1 = ap1;
        this.apellido2 = ap2;
        this.email = email;
    }

    public String getApellido1() {
        return apellido1;
    }
    
    
    public String getNombreCita(){
        String formato;
        int posicionEspacio = this.nombre.indexOf(' ');
        
        if(posicionEspacio != -1){
            formato = String.format("%s, %S.%S.", this.apellido1, this.nombre.charAt(0), this.nombre.charAt(posicionEspacio+1));
        }else{
            formato = String.format("%s, %S.", this.apellido1, this.nombre.charAt(0));
        }
        return formato;
    }//
    
    
    
    
}//
