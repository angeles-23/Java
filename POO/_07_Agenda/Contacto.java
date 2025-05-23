
package _07_Agenda;

/**
 *
 * @author angam
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    

    
    
    public Contacto(int id, String nombre, String email, String telefono) {
        this.id = Agenda.getContadorID();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String aCadena(){
        return String.format("%-3d %-15s %-20s %10s", this.id, this.nombre, this.email, this.telefono);
    }
    
    
    
    
}//
