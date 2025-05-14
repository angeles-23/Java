
package _08_BD_Empresa;

/**
 *
 * @author angam
 */
public class Empresa {
    
    private String CIF;
    private String nombre;
    private String localidad;

    
    public Empresa(String CIF, String nombre, String localidad) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    
    
    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    
    public void imprimir(){
//        String encabezado = String.format("%-10S %-15S %-15S", "CIF", "NOMBRE", "LOCALIDAD");
        String formato = String.format("\033[31m%-10s\033[30m \033[34m%-15s %-15s\033[30m", this.CIF, this.nombre, this.localidad);
//        System.out.println(encabezado);
        System.out.println(formato);
    }
    
    
    
}//
