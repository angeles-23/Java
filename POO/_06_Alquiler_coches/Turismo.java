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
public class Turismo extends Vehiculo{
    
    private double precioDia;

    
    
    public Turismo(String matricula, String marca_modelo, int km) {
        super(matricula, marca_modelo, km);
    }

    
    
    @Override
    public void alquilar(LocalDate fecha_alquiler, int km) {
        this.alquilado = true;
    }

    
    @Override
    public void devolver(LocalDate fecha_alquiler, int km) {
        this.alquilado = false;
    }

    
    
    
    
    
}
