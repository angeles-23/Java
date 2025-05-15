package _11_Factura;

import _11_Factura.LineaFactura;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * @author angam
 */
public class Factura {
    
    private String cif;
    private LocalDate fechaFactura;
    private ArrayList<LineaFactura> lineas;
    private final int IVA = 21;

    
    public Factura(String cif, LocalDate fechaFactura) {
        this.cif = cif;
        this.fechaFactura = fechaFactura;
        this.lineas = new ArrayList<>();
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

    
    
    public void añadirLinea(String ref, String desc, int cantidad, double precioU){
        LineaFactura nuevaLinea = new LineaFactura(ref, desc, cantidad, precioU);
        this.lineas.add(nuevaLinea);
    }//
    
    
    private double getSubtotal(){
        double sumaTotal = 0;
        for(LineaFactura l: this.lineas){
            sumaTotal += l.getImporteLinea();
        }
        return sumaTotal;
    }//
    
    
    private double getIva(){
        double ivaCalculado = (this.getSubtotal() * this.IVA) / 100;
        return ivaCalculado;
    }//
    
    
    
    private double getTotal(){
        return this.getSubtotal() + this.getIva();
    }//
    
    
    public void imprimirFactura(){
        System.out.println("=".repeat(45));
        System.out.println(" ".repeat(20) + "FACTURA");
        System.out.println(String.format("CIF: %s", this.getCif()));
        
        // Formato fecha
        DateTimeFormatter formatoFechaConcreta = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Buscar la fecha concreta
        LocalDate fechaBuscada = LocalDate.parse("03/03/2022", formatoFechaConcreta);
        // Formatear la fecha concreta
        String fechaFormateada = fechaBuscada.format(formatoFechaConcreta);
        
        
        System.out.println(String.format("Fecha: %s", fechaFormateada));
        
        System.out.println(String.format("%-8S %-15S %-12s %-10s", "CANT", "DESCRIPCION", "PRECIO U", "IMPORTE"));
        System.out.println("-".repeat(45));
        for(LineaFactura l: this.lineas){
            l.imprimirLinea();
        }
        
        System.out.println(String.format("\n%35s: %.2f €", "Subtotal", this.getSubtotal()));
        System.out.println(String.format("%30s %d:   %.2f €", "IVA", this.IVA, getIva()));
        System.out.println(String.format("%32s:    %.2f€", "TOTAL", this.getTotal()));
        System.out.println("=".repeat(45));
    }//

}///
