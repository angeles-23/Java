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
public class Triangulo extends Figura{
    
    private int base;
    private int altura;

    
    
    public Triangulo(Dibujo dibujo, int x, int y, int b, int h) {
        super(dibujo, x, y);
        this.base = b;
        this.altura = h;
    }

    
    
    
    
    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }
    

    @Override
    public double perimetro() {
        return this.base + 2 * Math.sqrt( Math.pow(this.base/2, 2) + Math.pow(this.altura, 2) );
    }
    

    @Override
    public void pintar() {
        
        this.dibujo.ponRelleno(this.color);
        
        int cantidadEspaciosX = 400;
        int cantidadEspaciosY = 10;
        
        int [] listaX = {cantidadEspaciosX, cantidadEspaciosX+this.x, cantidadEspaciosX+this.x/2};
        int [] listaY = {this.y, this.y, cantidadEspaciosY};
        
        this.dibujo.dibujaPoligono(listaX, listaY);
        
        this.dibujo.dibujaTexto("Area: " + this.area() + "m2", cantidadEspaciosX, this.y+30);
        this.dibujo.dibujaTexto("Perimetro: " + this.perimetro() + "m", cantidadEspaciosX, this.y + 45);
        
        this.dibujo.pinta();
    }
    
    
}//
