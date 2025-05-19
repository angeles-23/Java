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
        this.prestado = false;
    }

    @Override
    public void imprimir() {
        System.out.printf("LIBRO [%s] %-20s %2dª edicion (%s)\n", this.codigo, this.titulo, this.num_edicion, this.prestado);
    }
    
    public void prestar(){
        if(this.prestado == false){
            this.prestado = true;
        }else{
            System.out.println("Error ya ha sido prestado");
        }
    }
    
    public void devolver(){
        if(this.prestado == true){
            this.prestado = false;
        }else{
            System.out.println("El librp esta prestado");
        this.prestado = false;
        } 
    }
            
    public void estaPrestado(){
        System.out.println(this.prestado);
    }

    
    @Override
    public boolean esCodigoCorrecto() {
        boolean esCodigoCorrecto = true;
        String numeros = "01234567859";
        
        if(this.codigo.length() > 5){
            esCodigoCorrecto = false;
            return esCodigoCorrecto;
        }
        
        if(this.codigo.charAt(0) != 'L' && this.codigo.charAt(1) != '-'){
            esCodigoCorrecto = false;
            return esCodigoCorrecto;
        }
        
        for(int i=2; i<this.codigo.length(); i++){
            char caracter = this.codigo.charAt(i);
            if(!Character.isDigit(caracter)){
                return false;
            }
        }
        
        return esCodigoCorrecto;
    }
        
    
    
    
    
}///
