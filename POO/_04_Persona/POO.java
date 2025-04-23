/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _04_Persona;

import java.util.Scanner;

/**
 *
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona [] listaPersonas = new Persona[10];
        
        String nombre;
        String email;
        boolean esEmailCorrecto;
        
        
        // FORMA 1: Sin usar static contadorPersonas
        
        for(int i=0; i<3; i++){
            
            do{
                System.out.print("Nombre: ");
                nombre = teclado.nextLine();
                
                if(nombre.isEmpty()){
                    System.out.println("Error: Nombre incorrecto");
                }
            }while(nombre.isEmpty());
            
            
            do{
                System.out.print("Email: ");
                email = teclado.nextLine();

                int posicionPunto = email.indexOf('.');
                int posicionArroba = email.indexOf('@');

                if(posicionPunto != -1 && posicionArroba != -1 && posicionArroba<posicionPunto){
                    esEmailCorrecto = true;
                    listaPersonas[i] = new Persona(nombre, email);
                    System.out.println("-".repeat(15) + " añadida." + (i+1) + " en la lista");
                }else{
                    esEmailCorrecto = false;
                    System.out.println("--> ERROR: email incorrecto");
                }
                
            }while(esEmailCorrecto == false);
            
            System.out.println("");
        }
        
        
        System.out.println("LISTA PERSONAS");
        System.out.println("=".repeat(40));
        for(Persona persona: listaPersonas){
            if(persona != null){
                System.out.println(persona);
            }
        }
        System.out.println("=".repeat(40));
        
        
        
        
        
        // FORMA 2: Usando static contadorPersonas
        
        for(int i=0; i<3; i++){
            
            do{
                System.out.print("Nombre: ");
                nombre = teclado.nextLine();
                
                if(nombre.isEmpty()){
                    System.out.println("Error: Nombre incorrecto");
                }
            }while(nombre.isEmpty());
            
            
            do{
                System.out.print("Email: ");
                email = teclado.nextLine();

                int posicionPunto = email.indexOf('.');
                int posicionArroba = email.indexOf('@');

                if(posicionPunto != -1 && posicionArroba != -1 && posicionArroba<posicionPunto){
                    esEmailCorrecto = true;
                    listaPersonas[i] = new Persona(nombre, email);
                    System.out.println("-".repeat(15) + " añadida. " + Persona.getContadorPersonas() + " en la lista");
                }else{
                    esEmailCorrecto = false;
                    System.out.println("--> ERROR: email incorrecto");
                }
                
            }while(esEmailCorrecto == false);
            
            System.out.println("");
        }
        
        
        System.out.println("LISTA PERSONAS");
        System.out.println("=".repeat(40));
        for(Persona persona: listaPersonas){
            if(persona != null){
                System.out.println(persona);
            }
        }
        System.out.println("=".repeat(40));
        
        
        
        
        
    }//MAIN
    
    
}//FIN
