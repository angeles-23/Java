/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _09_Libros_y_Autores;

/**
 *
 * @author angam
 */
public class Libro {
    
    private String codigo;
    private String titulo;
    private Autor autor;
    private int año;

    
    
    public Libro(String c, String t, Autor autor, int año) {
        this.codigo = c;
        this.titulo = t;
        this.autor = autor;
        this.año = año;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
    public String getCita(){
        String formato;
        formato = String.format("%S - %s - (%d) - %s", this.codigo, this.titulo, this.año, this.autor.getNombreCita());
        return formato;
    }//
    
    
    
    
}//
