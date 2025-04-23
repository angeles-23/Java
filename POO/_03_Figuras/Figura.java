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
    
    protected String colorRelleno;
    
    public static final String NEGRO="\033[30m";
    public static final String ROJO="\033[31m";
    public static final String VERDE="\033[32m";
    public static final String AZUL="\033[34m";

    
    
    public Figura() {
        this.colorRelleno = NEGRO;
    }

    
    
    public void setColorRelleno(TipoColor color) {
        switch (color) {
            case NEGRO:
                this.colorRelleno = NEGRO;
                break;
            case ROJO:
                this.colorRelleno = ROJO;
                break;
            case VERDE:
                this.colorRelleno = VERDE;
                break;
            case AZUL:
                this.colorRelleno = AZUL;
                break;
            default:
                System.out.println("El color " +  color + " no existe");
        }
    }
    
    
    
    public abstract double area();
    
    
    public abstract double perimetro();
    
    
    public abstract void pintar();
    
    
    
    public String toString(){
        return String.format("Area: %6.2f cm²   Perimetro: %6.2f cm", this.area(), this.perimetro());
    }
    
    
    
    
}//FIN
