/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Libro;

/**
 *
 * @author angam
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int año;

    
    
    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    
    public Libro(String isbn, String titulo, String autor, int año) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    
    
    public String getIsbn() {
        if(this.isbn == null){
            return String.format("*** [%s] no tiene ISBN ***", this.titulo);
        }else{
            return isbn;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    
    
    public void setIsbn(String isbn) {
        if(esIsbnCorrecto(isbn) == true){
            this.isbn = isbn;
        }else{
            System.out.println("ISBN incorrecto");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    
    public String citaBibliografica(){
        if(this.isbn != null){
            return String.format("%s %S.(%d). %s, %s", this.autor, this.autor.charAt(0), this.año, this.titulo, this.isbn);
        }else{
            return String.format("%s %S.(%d). %s", this.autor, this.autor.charAt(0), this.año, this.titulo);
        }
        
    }
    
    
    
    
    
    public boolean esIsbnCorrecto(String isbn){
        boolean esLongitudCorrecta = false;
        boolean esLetraCorrecta = false;
        boolean sonDigitosCorrectos = false;
        boolean esCorrecto = false;
        
        if(isbn.length() == 4){
            esLongitudCorrecta = true;
        }
        
        for(int i=0; i<isbn.length(); i++){
            
            if(i == 0){
                char letra = isbn.charAt(0);
                
                if(Character.isLetter(letra)){
                    esLetraCorrecta = true;
                }
                
            }else{
                try{
                    char digito1 = isbn.charAt(1);
                    char digito2 = isbn.charAt(2);
                    char digito3 = isbn.charAt(3);
                    
                    if(Character.isDigit(digito1) == true && Character.isDigit(digito2) == true && Character.isDigit(digito3) == true){
                    sonDigitosCorrectos = true;
                    }
                }catch(Exception error){
                    System.out.println("Error: " + error.getMessage());
                    break;
                }
                
            }
        }
        
        if(esLongitudCorrecta == true && esLetraCorrecta == true && sonDigitosCorrectos ==  true){
            esCorrecto = true;
        }
        
        return esCorrecto;
    }
    
    
    
}
