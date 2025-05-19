package _07_Editorial_con_Publicaciones;

import java.util.ArrayList;



/**
 * @author angam
 */
public class Editorial {
    
    private ArrayList<Publicacion> publicaciones;

    
    
    public Editorial() {
        this.publicaciones = new ArrayList<>();
    }
    
    
    
    public void añadirPublicacion(Publicacion pub){
        publicaciones.add(pub);
    }
    
    
    
    
    public void imprimirPublicaciones(){
        for(Publicacion p: this.publicaciones){
            p.imprimir();
        }
    }
    
    
}
