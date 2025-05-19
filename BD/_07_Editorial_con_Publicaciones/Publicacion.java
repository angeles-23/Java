package _07_Editorial_con_Publicaciones;

import java.sql.*;
import org.json.JSONObject;

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
        cargarDatos();
    }
    
    
    
    private void cargarDatos(){
        JSONObject datosAutor = BD_AutoresSQL.obtenerDatosAutorJSON(this.dni_autor);
        this.nombre_autor = (String)datosAutor.getString("nombre");
        this.pais_autor = (String)datosAutor.getString("pais");
    }
    
    
    
    
    public abstract void imprimir();
    
    
    
    public abstract boolean esCodigoCorrecto();
    
    
    
}///
