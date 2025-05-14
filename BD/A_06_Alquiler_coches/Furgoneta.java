/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_06_Alquiler_coches;

import java.time.LocalDate;

/**
 *
 * @author angeles.angamarca
 */
public class Furgoneta extends Vehiculo{
    
    private double precioKilometro;
    
    

    public Furgoneta(String matricula, String marca_modelo, int km) {
        super(matricula, marca_modelo, km);
    }

    @Override
    public void alquilar(LocalDate fecha_alquiler, int km) {
    }

    @Override
    public void devolver(LocalDate fecha_alquiler, int km) {
    }
    
    
    
    
    
    
    
    
    
    
}//
