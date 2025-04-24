/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Figuras_graficas;

/**
 *
 * @author angeles.angamarca
 */
public class Rectangulo extends Figura{
    
    private int ladoLargo;
    private int ladoCorto;

    
    public Rectangulo(int x, int y, int lar, int cor) {
        super(x, y);
        this.ladoLargo = lar;
        this.ladoCorto = cor;
    }
    
    
    @Override
    public double area(){
        return 0;
    }
    
    
    @Override
    public double perimetro(){
        return 0;
    }
    
    
    @Override
    public void pintar(){
        
    }
    
    
    
    
    
    
}
