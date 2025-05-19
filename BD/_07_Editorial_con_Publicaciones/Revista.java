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
        this.periocidad = periocidad.MENSUAL;
        this.numeros = new ArrayList<>();
        this.numeros.add(fechaSalida);
    }
    
    
    public void añadirNumero(){
        LocalDate ultima = numeros.get(numeros.size() - 1);
        LocalDate nueva = null;
        
        switch (this.periocidad) {
            case MENSUAL:
                nueva = ultima.plusMonths(1);
                break;
            case QUINCENAL:
                nueva = ultima.plusDays(15);
                break;
            case TRIMESTRAL:
                nueva = ultima.plusMonths(3);
                break;
        }
        this.numeros.add(nueva);
    }
    
    
    public int getTotalNumeros(){
        return this.numeros.size();
    }

    
    
    @Override
    public void imprimir() {
        System.out.printf("REVISTA [%s] %15s %d ejemplares - %s\n", this.codigo, this.titulo, this.numeros.size(), this.periocidad);
    }

    @Override
    public boolean esCodigoCorrecto() {
        boolean esCorrecto = true;
        
        if(this.codigo.length() > 6){
            esCorrecto = false;
            return esCorrecto;
        }
        
        if(this.codigo.charAt(0) != 'R' && this.codigo.charAt(1) != '-'){
            esCorrecto = false;
            return esCorrecto;
        }
        
        for(int i=2; i<this.codigo.length(); i++){
            char caracter = this.codigo.charAt(i);
            if(!Character.isDigit(caracter)){
                esCorrecto = false;
                return esCorrecto;
            }
        }
        return esCorrecto;
    }
    
    
    
}///
