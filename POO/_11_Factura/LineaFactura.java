package _11_Factura;

/**
 * @author angam
 */
public class LineaFactura {
    
    private String refProducto;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double importeLinea;
    private static int numeroReferencia = 0;

    
    public LineaFactura(String ref, String desc, int cantidad, double precioU) {
//        numeroReferencia++;
//        ref = "REF" + String.format("%03d", numeroReferencia); // Rellena con 0s a la izquierda
        this.refProducto = "REF" + ref;
        this.descripcion = desc;
        this.cantidad = cantidad;
        this.precioUnitario = precioU;
        this.importeLinea = this.cantidad*this.precioUnitario;
    }

    
    public String getRefProducto() {
        return refProducto;
    }

    public void setRefProducto(String refProducto) {
        this.refProducto = refProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporteLinea() {
        return importeLinea;
    }

    public void setImporteLinea(double importeLinea) {
        this.importeLinea = importeLinea;
    }
    

    
    public void imprimirLinea(){
        String formatoLinea = String.format("%-6d %-18s %-12.2f %.2f", this.cantidad, this.descripcion, this.precioUnitario, this.importeLinea);
        System.out.println(formatoLinea);
    }//
    
}///
