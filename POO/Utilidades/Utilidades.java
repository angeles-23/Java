/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.Random;

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
    
    
    public static boolean esEmailValido(String email){
        
        boolean esValido = false;
        
        int posicionPunto = email.indexOf('.');
        int posicionArroba = email.indexOf('@');
        
        if(posicionArroba != -1 && posicionPunto != -1 && posicionArroba < posicionPunto){
            esValido = true;
        }
        
        return esValido;
    }
    
    
    
    public static String generarCodigoLibro(){
        
        Random random = new Random();
        
        int d1 = random.nextInt( (9-0) + 1);
        int d2 = random.nextInt( (9-0) + 1);
        int d3 = random.nextInt( (9-0) + 1);
        char l1 = (char)(65 + random.nextInt( (25-0) + 1) );
        char l2 = (char)(65 + random.nextInt( (25-0) + 1) );
        
        return String.format("%S%S%s%s%s", l1,l2,d1,d2,d3);
    }//
    
    
    
    
    
    public static boolean checkEmail(String email){
        boolean esEmailCorrecto;
        
        int posArroba = email.indexOf('@');
        int posPunto = email.indexOf('.');
        
        if(posArroba != -1 && posPunto != -1 && posArroba < posPunto){
            esEmailCorrecto = true;
        }else{
            esEmailCorrecto = false;
        }
        return esEmailCorrecto;
    }//
    
    
    
    
    
    
}//FIN
