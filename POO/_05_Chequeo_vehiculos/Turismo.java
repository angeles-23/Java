/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_Chequeo_vehiculos;

/**
 *
 * @author angam
 */
public class Turismo extends Vehiculo{

    
    public Turismo(String matri, String mar_modo) {
        super(matri, mar_modo);
    }

    
    
    public Turismo(String matri, String mar_modo, int km_m) {
        super(matri, mar_modo, km_m);
    }

    
    @Override
    public boolean checkAceite() {
        if(this.km_aceite >= 15_000){
            this.km_aceite = 0;
            return true;
        }else{
            return false;
        }
    }

    
    @Override
    public boolean checkRuedas() {
        if(this.km_ruedas >= 30_000){
            this.km_ruedas = 0;
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    
    
}//FIN
