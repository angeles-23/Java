/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_figuras;

/**
 *
 * @author angam
 */
public abstract class Figura {
    
    protected String colorRelleno = NEGRO;
    
    static final String NEGRO="\033[30m";
    static final String ROJO="\033[31m";
    static final String VERDE="\033[32m";
    static final String AZUL="\033[34m";

    
    
    public Figura() {
    }

    
    
    public String setColor(TipoColor color) {
        switch (color) {
        case VERDE:
            this.colorRelleno = VERDE;
            return colorRelleno;
        case AZUL:
            this.colorRelleno = AZUL;
            return colorRelleno;
        case ROJO:
            this.colorRelleno = ROJO;
            return colorRelleno;
        case NEGRO:
            this.colorRelleno = NEGRO;
            return colorRelleno;
        }
        return colorRelleno;
    }
    
    
    
    public abstract double area();
    
    
    public abstract double perimetro();
    
    
    public abstract void pintar();
    
    
    
    public String toString(){
        return String.format("Area: %6.2f cm²   Perimetro: %6.2f cm", this.area(), this.perimetro());
    }
    
    
    
    
}//FIN
