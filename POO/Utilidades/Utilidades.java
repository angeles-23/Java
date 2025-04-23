/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author angam
 */
public class Utilidades {
    
    public static boolean esEmailCorrecto(String email){
        
        boolean esEmailCorrecto = false;
        
        
        int posicionPunto = email.indexOf('.');
        int posicionArroba = email.indexOf('@');

        if(posicionPunto != -1 && posicionArroba != -1 && posicionArroba<posicionPunto){
            esEmailCorrecto = true;
        }
        
        return esEmailCorrecto;
    }
    
    
}//FIN
