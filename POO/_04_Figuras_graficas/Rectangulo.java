/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Figuras_graficas;

import fundamentos.ColorFig;
import fundamentos.Dibujo;

/**
 *
 * @author angam
 */
public class Rectangulo extends Figura{
    
    private int ladoLargo;
    private int ladoCorto;

    
    public Rectangulo(Dibujo dibujo, int x, int y, int lar, int cor) {
        super(dibujo, x, y);
        this.ladoLargo = lar;
        this.ladoCorto = cor;
    }
    

    public int getLadoLargo() {
        return this.ladoLargo;
    }

    public int getLadoCorto() {
        return this.ladoCorto;
    }

    public ColorFig getColor() {
        return this.color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Dibujo getDibujo() {
        return this.dibujo;
    }
    
    
    
    
    @Override
    public double area() {
        return this.ladoLargo*this.ladoCorto;
    }

    @Override
    public double perimetro() {
        return (this.ladoCorto + this.ladoLargo)*2;
    }

    @Override
    public void pintar() {
        
        int cantidadEspaciosX = 30;
        int cantidadEspaciosY = 50;
        
        this.dibujo.ponRelleno(this.color);
        this.dibujo.dibujaRectangulo(cantidadEspaciosX, cantidadEspaciosY,this.x+cantidadEspaciosX, this.y+ cantidadEspaciosY);
        
        this.dibujo.dibujaTexto("Area: " + this.area() + "m2", cantidadEspaciosX, this.y+70);
        this.dibujo.dibujaTexto("Perimetro: " + this.perimetro()  + "m", cantidadEspaciosX, this.y+90);
        
        this.dibujo.pinta();
        
        
    }
    
    
    
}//
