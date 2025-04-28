/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Alquiler_coches;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class BD_Empresa {
    
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();

            
    
    public static void añadirVehiculo(Vehiculo v){
        BD_Empresa.listaVehiculos.add(v);
    }
    
    
    public static void añadirAlquiler(Alquiler alquiler){
        BD_Empresa.listaAlquileres.add(alquiler);
    }
    
    
    
    public static void listarFlota(){
        System.out.println("\033[34m ".repeat(6) + "LISTADO DE TURISMOS\033[30m");
        for(Vehiculo t:BD_Empresa.listaVehiculos){
            if(t instanceof Turismo){
                System.out.println(t.toString());
            }
        }
        
        System.out.println("\033[34m ".repeat(6) + "LISTADO DE FURGONETAS\033[30m");
        for(Vehiculo f:BD_Empresa.listaVehiculos){
            if(f instanceof Furgoneta){
                System.out.println(f.toString());
            }
        }
        
    }
    
    
    
    public static Vehiculo obtenerVehiculo(String matricula){
        return null;
    }
    
    
    
    public static Alquiler obetenerUltimoAlquiler(String matricula){
        return null;
    }
    
    
    
    public static void imprimirHistoricoAlquileres(){
        
    }
    
    
    
    
    
    
    
}//
