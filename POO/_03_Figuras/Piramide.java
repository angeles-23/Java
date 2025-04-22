/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_figuras;

/**
 *
 * @author angam
 */
public class Piramide extends Figura {
    
    private int altura;
    private int base;

    
    
    public Piramide(int altura) {
        super();
        this.altura = altura;
        this.base = this.altura*2-1;
    }

    
    
    
    @Override
    public double area() {
        return (this.base*this.altura)/2;
    }

    
    @Override
    public double perimetro() {
        double lado = Math.sqrt(  Math.pow(base/2, 2) + Math.pow(this.altura, 2)  );
        return this.base + 2*lado;
    }

    
    @Override
    public void pintar() {
        
        int cantidad = 0;
        
        for(int i=0; i<this.altura; i++){
            for(int j=this.altura; j>i; j--){
                System.out.print("  ");
            }
            cantidad += 1;
            System.out.print(this.colorRelleno + "* ".repeat(cantidad));
            System.out.println("");
            cantidad += 1;
        }
    
    }

        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//FIN
