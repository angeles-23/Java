/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_Casa;

/**
 *
 * @author angam
 */
public class Casa {
    
    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    private double precioVenta;

    
    public Casa(String propietario, int p1, int p2, double precio) {
        this.propietario = propietario;
        this.superficiePlanta1 = p1;
        this.superficiePlanta2 = p2;
        this.precioVenta = precio;
    }
    
    public Casa(String propietario, int p1, double precio) {
        this.propietario = propietario;
        this.superficiePlanta1 = p1;
        this.precioVenta = precio;
    }

    
    
    public String getPropietario() {
        return this.propietario;
    }

    public int getSuperficiePlanta1() {
        return this.superficiePlanta1;
    }

    public int getSuperficiePlanta2() {
        return this.superficiePlanta2;
    }

    public double getPrecioVenta() {
        return this.precioVenta;
    }
    
    
    
    public void imprimirDatos(){
        String datos = String.format("%10s %6d m² %11.2f€", this.propietario, this.calcularSuperficieTotal(), this.precioVenta);
        System.out.println(datos);
    }
    
    
    
    private int calcularSuperficieTotal(){
        return this.superficiePlanta1 + this.superficiePlanta2;
    }
    
    
    
    
    
    
    
}
