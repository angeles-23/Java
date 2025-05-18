package _07_Editorial_con_Publicaciones;

import java.sql.*;
import org.json.JSONObject;

/**
 * @author angam
 */
public class BD_AutoresSQL {
    
    static String DB_NAME = "autores";
    static String username = "alumno";
    static String password = "Administrad0r+";
    static String IP = "144.91.104.12";
    static String puerto = "3306";
    
    /*
    Connection conexion = DriverManager.getConnection(
    "jdbc:mysql://192.168.1.100:3306/miBaseDeDatos", "usuario", "contraseña");

    Aquí:
    192.168.1.100 → es la IP del servidor MySQL.
    3306 → es el puerto (por defecto de MySQL).
    miBaseDeDatos → es el nombre de la base de datos.
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
        Connection miConexion = null;
        
        try{
            miConexion = DriverManager.getConnection(url, username, password);
        }catch(SQLException error){
            System.out.println("Error Conexion no creada: " + error.getMessage());
        }
        return miConexion;
    }
    
    
    public static void crearBD(){
        Connection miConexion = BD_AutoresSQL.crearConexion("jdbc:mysql://" + IP + ":" + puerto + "/");
//        Connection miConexion = BD_AutoresSQL.crearConexion("jdbc:mysql://localhost");
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("DROP DATABASE IF EXISTS " + DB_NAME + ";");
            consulta.executeUpdate("CREATE DATABASE " + DB_NAME + ";");
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
    

    
    
    /*
    public static JSONObject obtenerDatosAutorJSON(String dni_autor){
        JSONObject json = new JSONObject();
        return json;
    }
    */
    
    
    
}//
