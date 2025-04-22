/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _03_figuras;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class POO_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangulo r1 = new Rectangulo(8,3);
        Cuadrado c1 = new Cuadrado(3);
        Piramide p1 = new Piramide(4);
        
        r1.setColor(TipoColor.ROJO);
        c1.setColor(TipoColor.AZUL);
        p1.setColor(TipoColor.VERDE);
                
        ArrayList<Figura> listaFiguras = new ArrayList();
        listaFiguras.add(r1);
        listaFiguras.add(c1);
        listaFiguras.add(p1);
        
        
        for(Figura figura: listaFiguras){
            figura.pintar();
            System.out.printf("Area:%7.2f Perimetro:%.2f\n", figura.area(), figura.perimetro());
            System.out.println("");
        }
        
        
        
        
    }//MAIN
    
    
}//FIN
