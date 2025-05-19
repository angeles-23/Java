package _07_Editorial_con_Publicaciones;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.*;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author angam
 */
public class BD_AutoresSQL {
    /*
    static String DB_NAME = "autores";
    static String username = "alumno";
    static String password = "Administrad0r+";
    static String IP = "144.91.104.12";
    static String puerto = "3306";
    */
    
    public static void cargarDriver(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException error){
            System.out.println("Error: Driver no cargado");
        }
    }
    
    
    public static Connection crearConexion(String endpoint){
        String url = endpoint;
        String user = "root";
        String password= "";
        Connection miConexion = null;
        
        try{
            miConexion = DriverManager.getConnection(url, user, password);
        }catch(SQLException error){
            System.out.println("Error Conexion no creada: " + error.getMessage());
        }
        return miConexion;
    }
    
    
    public static void crearBD(){
        Connection miConexion = BD_AutoresSQL.crearConexion("jdbc:mysql://localhost/");
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("DROP DATABASE IF EXISTS autores;");
            consulta.executeUpdate("CREATE DATABASE autores;");
            consulta.close();
        }catch(SQLException error){
            System.out.println("Error BD no creada: " + error.getMessage());
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la conexion");
            }
        }
        
    }
    

    public static void crearTabla(){
        Connection miConexion = BD_AutoresSQL.crearConexion("jdbc:mysql://localhost/autores");
        
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("USE autores;");
            consulta.executeUpdate("CREATE TABLE autor("
                                + "dni varchar(10) PRIMARY KEY, "
                                + "nombre varchar(50), "
                                + "pais varchar(50), "
                                + "edad int"
                                + ");");
        }catch(SQLException error){
            System.out.println("Error al crear la tabla: " + error.getMessage());
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la conexion;");
            }
        }
        
    }
    
    
    public static void añadirDatos(){
        Connection miConexion = BD_AutoresSQL.crearConexion("jdbc:mysql://localhost/autores");
        
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("INSERT INTO autor VALUES ('23230001A', 'Juan Gomez JuradoXC60', 'España', 38)");
            consulta.executeUpdate("INSERT INTO autor VALUES ('48484400A', 'Juan Cuello Largo', 'España', 43)");
            consulta.executeUpdate("INSERT INTO autor VALUES ('11111111B', 'Pablo Neruda', 'Chile', 81)");
            consulta.executeUpdate("INSERT INTO autor VALUES ('33445566X', 'Edicciones B', 'Andorra', 51)");
            consulta.executeUpdate("INSERT INTO autor VALUES ('88888888Z', 'Stephen Kings', 'U.S.A.', 65)");

        }catch(SQLException error){
            System.out.println("Error al añadir los datos");
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la concexión: " + error.getMessage());
            }
        }
        
        
    }
    
    
    
    
    public static JSONObject obtenerDatosAutorJSON(String dni_autor){
        JSONObject autorBuscado = new JSONObject();
        Connection miConexion = BD_AutoresSQL.crearConexion("jdbc:mysql://localhost/autores");
        
        try{
            String sql1 = "SELECT nombre, pais FROM autores WHERE dni = ?";
            PreparedStatement consultaPreparada = miConexion.prepareStatement(sql1);
            consultaPreparada.setString(1, dni_autor);
            ResultSet resultado = consultaPreparada.executeQuery();
            
            if(resultado.next()){
                String nombreAutor = resultado.getString("nombre");
                String paisAutor = resultado.getString("pais");
                
                autorBuscado.put("nombre", nombreAutor);
                autorBuscado.put("pais", paisAutor);
            }else{
                autorBuscado.put("nombre", "Desconocido");
                autorBuscado.put("Pais", "Desconocido");
            }
            
        }catch(SQLException error){
            System.out.println("Error al obtener el autor");
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la conexion: " + error.getMessage());
            }
        }
        return autorBuscado;
        
        
        /*
        try{
            // Usar PreparedStatement para evitar SQL Injection
            String sql1 ="SELECT nombre, pais FROM autor WHERE dni = ?"; // Consulta a buscar
            PreparedStatement consultaPreparada1 = miConexion.prepareStatement(sql1);
            
            // Pasar el parámetro DNI al PreparedStatement
            consultaPreparada1.setString(1, dni_autor);
            
            // Ejecutar la consulta y obtener los resultados
            ResultSet resultado = consultaPreparada1.executeQuery(); 
            
            // Verificar si la consulta devolvió algún resultado
            if(resultado.next()){
                /// Llenar el objeto JSON con los datos del autor
                String nombre = resultado.getString("nombre");
                String pais = resultado.getString("pais");
                
                // Rellenar el JSON con los valores obtenidos
                autorBuscado.put("nombre", nombre);
                autorBuscado.put("pais", pais);
            }else{
                autorBuscado.put("nombre", "Desconocido");
                autorBuscado.put("pais", "Desconocido");
            }
            
        }catch(SQLException error){
            System.out.println("Error al obtener los datos del autor");
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la conexion;");
            }
        }
        
        return autorBuscado;
    */
    }
    
    
    
}//
