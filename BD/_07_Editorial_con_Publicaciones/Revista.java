package _07_Editorial_con_Publicaciones;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author angam
 */
public class Revista extends Publicacion{
    
    private TipoPeriocidad periocidad;
    private LocalDate fechaSalida;
    private ArrayList<LocalDate> numeros;

    
    
    public Revista(String codigo, String titulo, String dni_autor, LocalDate fechaSalida) {
        super(codigo, titulo, dni_autor);
        this.fechaSalida = fechaSalida;
    }
    
    
    public void añadirNumero(){
        
    }
    
    
    public int getTotalNumeros(){
        return 0;
    }

    
    
    @Override
    public void imprimir() {
        
    }
    
    
    
}///
