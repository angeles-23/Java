
package _04_Figuras_graficas;

import fundamentos.ColorFig;
import fundamentos.Dibujo;
import java.io.ObjectInputFilter;

/**
 *
 * @author angam
 */
public class POO {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dibujo dibujo = new Dibujo("Figuras");
        
        
        Rectangulo r1 = new Rectangulo(dibujo, 150, 100, 150, 100);
        r1.setColor(ColorFig.amarillo);
        r1.pintar();
        
        
        
        Triangulo t1 = new Triangulo(dibujo, 150, 150, 150, 150);
        t1.setColor(ColorFig.azul);
        t1.pintar();
        
        
        
        Circulo c1 = new Circulo(dibujo, 150, 120, 120);
        c1.setColor(ColorFig.rojo);
        c1.pintar();
        
        dibujo.espera();
        System.exit(0);
               
        
    }//MAIN
    
}//
