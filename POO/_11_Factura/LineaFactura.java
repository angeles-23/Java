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

    
    public LineaFactura(String ref, String desc, int cantidad, double precioU) {
        this.refProducto = ref;
        this.descripcion = desc;
        this.cantidad = cantidad;
        this.precioUnitario = precioU;
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
        
    }//
    
    
}///
