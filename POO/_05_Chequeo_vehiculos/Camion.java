/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_Chequeo_vehiculos;

/**
 *
 * @author angam
 */
public class Camion extends Vehiculo{
    
    private int km_tacografo;

    
    
    public Camion(String matri, String mar_modo) {
        super(matri, mar_modo);
        this.km_tacografo = 0;
    }
    

    public Camion(String matri, String mar_modo, int km_m) {
        super(matri, mar_modo, km_m);
        this.km_tacografo = 0;
    }
    
    
    @Override
    public void avanzar(int km){
        super.avanzar(km);
        this.km_tacografo = 0;
        
        boolean cambioAceite = false;
        boolean cambioRuedas = false;
        
        if(checkAceite() == true){
            cambioAceite = true;
        }
        
        if(checkRuedas() == true){
            cambioRuedas = true;
        }
        
        if(cambioAceite == true){
            System.out.println("Se ha hecho un cambio de aceite");
        }
        
        if(cambioRuedas == true){
            System.out.println("Se ha hecho un cambio de ruedas");
        }
        
    }
    
    
    public boolean checkTacografo(){
        if(this.checkRuedas() == true){
            this.km_tacografo = 0;
            return true;
        }else{
            return false;
        }
    }

    
    
    @Override
    public boolean checkAceite() {
        if(this.km_tacografo >=  30_000){
            this.km_aceite = 0;
            return true;
        }else{
            return false;
        }
    }

    
    @Override
    public boolean checkRuedas() {
        if(this.km_motor >= 50_000){
            this.km_ruedas = 0;
            return true;
        }else{
            return false;
        }
    }
    
    
}//FIN
