/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_Chequeo_vehiculos;

/**
 *
 * @author angam
 */
public abstract class Vehiculo {
    
    private String matricula;
    private String marca_modelo;
    protected int km_motor;
    protected int km_aceite;
    protected int km_ruedas;

    
    
    public Vehiculo(String matri, String mar_modo) {
        this.matricula = matri;
        this.marca_modelo = mar_modo;
        this.km_motor = 0;
        this.km_aceite = 0;
        this.km_ruedas = 0;
    }

    
    public Vehiculo(String matri, String mar_modo, int km_m) {
        this(matri, mar_modo);  // Llama al primer constructor
        this.km_motor = km_m;
    }
    
    
    
    public void avanzar(int km){
        
        if(km > 0){
            this.km_motor += km;
            this.km_aceite += km;
            this.km_ruedas += km;
            
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
            }else{
                System.out.println("No se ha hecho un cambio de aceite");
            }

            if(cambioRuedas == true){
                System.out.println("Se ha hecho un cambio de ruedas");
            }else{
                System.out.println("No se ha hecho un cambio de ruedas");
            }
            
        }else{
            System.out.println("Error: Vehiculo - avanzar(int km) Tienen que ser km positivos");
        }
    }
    

    public String toString(){
        if(this.km_motor == 0){
            return String.format("%s - %s - %s", this.matricula, this.marca_modelo, "nuevo");
        }else{
            return String.format("%s - %s - %dkm", this.matricula , this.marca_modelo, this.km_motor);
        }
    }
    
    
    
    public abstract boolean checkAceite();
    
    public abstract boolean checkRuedas();

    
    
    
    
    
    
    
    
    public String getMatricula() {
        return matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public int getKm_motor() {
        return km_motor;
    }

    public int getKm_aceite() {
        return km_aceite;
    }

    public int getKm_ruedas() {
        return km_ruedas;
    }
    
    
    
    
    
    
    
    
    
    
    
}//FIN
