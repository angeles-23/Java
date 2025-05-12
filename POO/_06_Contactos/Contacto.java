
package _06_Contactos;

/**
 *
 * @author angam
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contadorId = 0;

    
    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        Contacto.contadorId++;
        this.id = Contacto.contadorId;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContadorId() {
        return Contacto.contadorId;
    }

    public static void setContadorId(int contadorId) {
        Contacto.contadorId = contadorId;
    }
    
    
    public String toString(){
        return String.format("%-3d %11s %20s %10s", this.id, this.nombre, this.email, this.telefono);
    }
       
            
}//
