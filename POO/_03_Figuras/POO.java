/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _03_figuras;

/**
 *
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r1 = new Rectangulo(8, 3);
        r1.setColor(TipoColor.ROJO);
        r1.pintar();
        System.out.println(r1);
        
        
        System.out.println("\n");
        
        
        Cuadrado c1 = new Cuadrado(3);
        c1.setColor(TipoColor.AZUL);
        c1.pintar();
        System.out.println(c1);
        
        
        System.out.println("\n");
        
        Piramide p1 = new Piramide(4);
        p1.setColor(TipoColor.VERDE);
        p1.pintar();
        System.out.println(p1);
        
        
        
        
    }
    
}
