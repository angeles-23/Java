/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _05_Chequeo_vehiculos;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList();
        
        listaVehiculos.add(new Turismo("PEUGEOT 308", "1111FFF"));
        listaVehiculos.add(new Turismo("SEAT IBIZA", "2222AAA", 10_000));
        listaVehiculos.add(new Camion("VOLVO 500", "3333GGG"));
        listaVehiculos.add(new Camion("SCANIA 500", "5555BBB", 100_000));
        
        
        System.out.println("LISTA DE VEHICULOS");
        for(Vehiculo v: listaVehiculos){
            System.out.println(v.toString());
        }
        
        
        System.out.println("\nAVANZA");
        for(Vehiculo v: listaVehiculos){
            if(v.getMatricula().equals("1111FFF")){
               v.avanzar(20_000);
                
            }
            
            if(v.getMatricula().equals("2222AAA")){
                v.avanzar(30_000);
            }
            
            if(v.getMatricula().equals("3333GGG")){
                v.avanzar(20_000);
            }
            
            if(v.getMatricula().equals("5555BBB")){
                v.avanzar(60_000);
            }
            
            
            
            
        }
        
        
        
        
        
        System.out.println("\nTURISMOS");
        System.out.println("- ".repeat(10));
        for(Vehiculo v: listaVehiculos){
            if(v instanceof Turismo){
                System.out.println(v.toString());
            }
        }
        
        
        
        System.out.println("\nCAMIONES");
        System.out.println("- ".repeat(10));
        for(Vehiculo v: listaVehiculos){
            if(v instanceof Camion){
                System.out.println(v.toString());
            }
        }
        
        
        
    }//MAIN
    
}//FIN
