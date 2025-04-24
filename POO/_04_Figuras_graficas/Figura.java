/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Figuras_graficas;

import fundamentos.*;

/**
 *
 * @author angam
 */
public abstract class Figura {
    
    protected ColorFig color;
    protected int x;
    protected int y;
    protected Dibujo dibujo;

    
    
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    
    public void setColor(ColorFig color) {
        this.color = color;
    }
    
    
    public void setXY(int x, int y){
        
    }
    
    
    public abstract double area();
    
    
    public abstract double perimetro();
    
    
    public abstract void pintar();
    
    
    
    
    
    
}//FIN
