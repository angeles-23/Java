package _11_Factura;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author angam
 */
public class Factura {
    
    private String cif;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura> lineas;
    private int IVA;

    
    public Factura(String cif, LocalDate fechaFactura, ArrayList<LineaFactura> lineas, int IVA) {
        this.cif = cif;
        this.fechaFactura = fechaFactura;
        this.lineas = lineas;
        this.IVA = IVA;
    }

    
    
    
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public LocalDate getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDate fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }
    
    
    public void añadirLinea(String ref, String desc, int cantidad, double precioU){
        
    }//
    
    
    private double getSubtotal(){
        return 0;
    }//
    
    
    private double getIva(){
        return 0;
    }//
    
    private double getTotal(){
        return 0;
    }//
    
    
    public void imprimirFactura(){
        
    }//
    
    
}///
