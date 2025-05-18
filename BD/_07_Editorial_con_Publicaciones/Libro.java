package _07_Editorial_con_Publicaciones;

/**
 *
 * @author angam
 */
public class Libro extends Publicacion{
    
    private int num_edicion;
    private boolean prestado;

    
    public Libro(String codigo, String titulo, String dni_autor, int edicion) {
        super(codigo, titulo, dni_autor);
        this.num_edicion = edicion;
    }

    @Override
    public void imprimir() {
        
    }
    
    public void prestar(){
        
    }
    
    public void devolver(){
        
    } 
    
            
    public void estaPrestado(){
    
    }
        
    
}///
