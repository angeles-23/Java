package _07_Editorial_con_Publicaciones;

/**
 * @author angam
 */
public abstract class Publicacion {
    
    String codigo;
    String titulo;
    String dni_autor;
    String nombre_autor;
    String pais_autor;

    public Publicacion(String codigo, String titulo, String dni_autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dni_autor = dni_autor;
    }
    
    
    
    public abstract void imprimir();
    
    
    
    
    
    
}//
