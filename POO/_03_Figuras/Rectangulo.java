/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_figuras;

/**
 *
 * @author angam
 */
public class Rectangulo extends Figura{
    
    private int ladoLargo;
    private int ladoCorto;

    
    public Rectangulo(int ladoLargo, int ladoCorto) {
        this.ladoLargo = ladoLargo;
        this.ladoCorto = ladoCorto;
    }

    @Override
    public double area() {
        return this.ladoLargo*this.ladoCorto;
    }

    
    @Override
    public double perimetro() {
        return 2*(this.ladoLargo+this.ladoCorto);
    }

    
    @Override
    public void pintar() {
        for(int i=0; i<this.ladoCorto; i++){
            for(int j=0; j<this.ladoLargo; j++){
                System.out.print(this.colorRelleno + "* ");
            }
            System.out.println("");
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
}//FIN
