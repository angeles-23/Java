/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Figuras_graficas;

/**
 *
 * @author angeles.angamarca
 */
public class Triangulo extends Figura{
    
    private int base;
    private int altura;

    public Triangulo(int x, int y, int b, int h) {
        super(x, y);
        this.base = b;
        this.altura = h;
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
