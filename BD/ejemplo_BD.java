
package __P_01_EjemploConexionBD;

import java.sql.*;

/**
 * @author angam
 */

public class ejemplo_BD {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /**********************
         * 1. CARGAR EL DRIVER
         **********************/
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver com.mysql.cj.jdbc.Driver cargado correctamente");

        }catch(ClassNotFoundException error){
            System.out.println("Error, no se ha podido cargar el driver");
        }
        
        
        
        /*************************************
         * 2. CREAMOS LA CONEXIÓN CON LA BBDD
         *************************************/
        String url = "jdbc:mysql://localhost/instituto";  // jdbc:mysql://127.0.0.1/nombreBaseDatos
        String user = "root";
        String password = "";
        
        
        try{
            Connection miConexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión realizada correctamente");
            System.out.println("");
            
            /***************************
            * 3. EJECUTAR UNA CONSULTA
            ***************************/
            
            /* 
            ResultSet
                - Dispone de un cursor para desplazarse por la consulta.
                - Dispone de métodos para acceder al valor de cada campo(nombre columna).
                - Es un objeto de SOLO LECTURA y de SOLO AVANCE. Se recorrer de atrás hacia delante.
                - El método next() nos permite desplazarnos.
                - next() devuelve true si encuentra algún valor y devuelve false si NO lo encuentra.
            */
            
            Statement stmt = miConexion.createStatement();
           
            /* SELECT */
            // BD tienda
            /*
            ResultSet rs = stmt.executeQuery(""
                    + "SELECT * "
                    + "FROM producto "
                    + "WHERE codigo = 7 OR codigo = 10"
            );
            
            while(rs.next()){
                String nombre = rs.getString("nombre");
                int codigo = rs.getInt("codigo"); // rs.getInt(nombreColumna);
                
                System.out.println("Codigo: " + codigo + " - Nombre: " + nombre);
            }
            */
            
            //BD instituto
            ResultSet rs1 = stmt.executeQuery(""
                    + "SELECT * "
                    + "FROM alumno "
            );
            
            while(rs1.next()){
                Date fechaNacimiento = rs1.getDate("fecha_nacimiento");
                System.out.println("Fechas de nacimiento: " + fechaNacimiento);
            }
            
            
        }catch(Exception error){
            System.out.println("Error al crear la conexión");
        }
        
        
        
        
        
    }//MAIN
    
}
