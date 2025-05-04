
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

    
    public Figura(Dibujo dibujo, int x, int y) {
        this.dibujo = dibujo;
        this.x = x;
        this.y = y;
        this.color = ColorFig.negro;
    }

    
    public void setColor(ColorFig color) {
        this.color = color;
    }
    
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    public abstract double area();
    
    public abstract double perimetro();
    
    public abstract void pintar();
    
    
    
}//
