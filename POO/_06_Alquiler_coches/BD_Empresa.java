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
        for(Vehiculo v: BD_Empresa.listaVehiculos){
            if(v.getMatricula().equalsIgnoreCase(matricula)){
                return v;
            }
        }
        return null;
    }
    
    
    
    public static Alquiler obtenerUltimoAlquiler(String matricula){
        for(int i=BD_Empresa.listaAlquileres.size(); i>0; i--){
            Alquiler ultimoAlquiler = BD_Empresa.listaAlquileres.get(i);
            if(ultimoAlquiler.getVehiculo().getMatricula().equalsIgnoreCase(matricula)){
                return ultimoAlquiler;
            }
        }
        return null;
    }
    
    
    
    public static void imprimirHistoricoAlquileres(){
        System.out.println("=".repeat(11) + "  HISTORICO DEL ALQUILERES  " + "=".repeat(11));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("=".repeat(35));
        
    }
    
    
    
    
    
    
    
}//
