/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _06_Alquiler_coches;

import java.time.LocalDate;

/**
 *
 * @author angam
 */
public class Alquiler {
    
    private Vehiculo vehiculo;
    private int km_inicio;
    private int km_fin;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private double importe;

    
    
    public Alquiler(Vehiculo v) {
        this.vehiculo = v;
    }
    
    
    
    public double calcularImporte(){
        return 0;
    }
    
    
    
    public void imprimir(){
        
    }
    
    
    
    private int calcularDias(){
        
        return 0;
    }
    
    
    
    

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getKm_inicio() {
        return km_inicio;
    }

    public int getKm_fin() {
        return km_fin;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public double getImporte() {
        return importe;
    }
    
    
    
    
    
}//
