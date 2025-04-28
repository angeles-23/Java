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
public abstract class Vehiculo {
    
    private String matricula;
    private String marca_modelo;
    protected int km;
    protected boolean alquilado;

    
    
    
    public Vehiculo(String matricula, String marca_modelo, int km) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.km = km;
    }
    
    
    
    public abstract void alquilar(LocalDate fecha_alquiler, int km);
    
    
    public abstract void devolver(LocalDate fecha_alquiler, int km);
    
    
    public String toString(){
        if(this.isAlquilado() == true){
            return String.format("\033[35m%-4s %-7s %15s [%d km]\033[30m", "A", this.matricula, this.marca_modelo, this.km);
        }else{
            return String.format("%-4s %-7s %15s [%d km]", " ", this.matricula, this.marca_modelo, this.km);
        }
        
    }

    
    
    
    
    public String getMatricula() {
        return matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public int getKm() {
        return km;
    }

    public boolean isAlquilado() {
        return alquilado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}//
