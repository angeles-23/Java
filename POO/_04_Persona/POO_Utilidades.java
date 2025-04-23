/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _04_Persona;

import Utilidades.Utilidades;
import static _04_Persona.POO.teclado;

/**
 *
 * @author angam
 */
public class POO_Utilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona [] listaPersonas = new Persona[10];
        
        String nombre;
        String email;
        
        
        for(int i=0; i<3; i++){
            System.out.println("Persona " + (i+1) + ":");
            do{
                System.out.print("Nombre: ");
                nombre = teclado.nextLine();
                
                if(nombre.isEmpty()){
                    System.out.println("\tError: nombre incorrecto");
                }
                
            }while(nombre.isEmpty());
            
            do{
                System.out.print("Email: ");
                email = teclado.nextLine();
                
                if(Utilidades.esEmailCorrecto(email) == false){
                    System.out.println("\tERROR: email incorrecto");
                }else{
                    System.out.println("-".repeat(15) + "añadida." + (i+1) + " en la lista");
                    listaPersonas[i] = new Persona(nombre, email);
                    System.out.println("");
                }
            
            }while(Utilidades.esEmailCorrecto(email) == false);
        
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
