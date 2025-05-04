/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Figuras_graficas;

import fundamentos.Dibujo;

/**
 *
 * @author angam
 */
public class Circulo extends Figura{

    private int radio;

    public Circulo(Dibujo dibujo, int x, int y, int radio) {
        super(dibujo, x, y);
        this.radio = radio;
    }
    
    
    
    
    
    
    
    
    @Override
    public double area() {
        return Math.PI*Math.pow(this.radio, 2);
    }

    @Override
    public double perimetro() {
        return Math.PI*(this.radio*2);   
    }

    @Override
    public void pintar() {
        
        int cantidadEspaciosX = 190;
        int cantidadEspaciosY = 200;
        
        this.dibujo.ponRelleno(this.color);
        this.dibujo.dibujaElipse(cantidadEspaciosX, cantidadEspaciosY, this.x+cantidadEspaciosX, this.y+cantidadEspaciosY+20);
        
        this.dibujo.dibujaTexto("Area: " + this.area() + "m2", cantidadEspaciosX, this.y+240);
        this.dibujo.dibujaTexto("Perimetro: " + this.perimetro() + "m" , cantidadEspaciosX, this.y+ 255);
        this.dibujo.pinta();
    }
    
    
    
    
}//
