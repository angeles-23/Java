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
        String url = "jdbc:mysql://localhost/tienda";  // jdbc:mysql://127.0.0.1/nombreBaseDatos
        String user = "root";
        String password = "";
        
        Connection miConexion = null;
        try{
            miConexion = DriverManager.getConnection(url, user, password);
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
            //BD tienda
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
            
            
            /*
            //BD instituto
            ResultSet rs1 = stmt.executeQuery(""
                    + "SELECT * "
                    + "FROM alumno "
            );
            
            while(rs1.next()){
                Date fechaNacimiento = rs1.getDate("fecha_nacimiento");
                System.out.println("Fechas de nacimiento: " + fechaNacimiento);
            }
            */
            
            
            
            /*******************
             * 4. INSERTAR EN BD
             *******************/
            String nombre = "Portátil 4K";
            double precio = 299.99;
            int codigo_fabricante = 4;
            
            String consulta = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('"+nombre+"',"+precio+","+codigo_fabricante+");" ;
            String consultaConNullSinVariables = "INSERT INTO producto VALUES (null,'"+nombre+"',"+precio+","+codigo_fabricante+");" ;
//            System.out.println(consulta);
//            int result = stmt.executeUpdate(consulta);
            

            /**************
             * UPDATE EN BD:
             ***************/
//          Actualiza, ya sea para borrar o añadir

            String actualizacion = "UPDATE producto SET nombre='" + "Ordenador de mesa" + "' "
                                + "WHERE codigo = 12;";
            System.out.println(actualizacion);
            int resultUpdate = stmt.executeUpdate(actualizacion);
            
            
            /**************
             * DELETE EN BD:
             ***************/
            String borrar = "DELETE producto SET nombre='" + "Ordenador de mesa" + "' "
                           + "WHERE codigo = 12;";
            System.out.println(borrar);
            int resultDelete = stmt.executeUpdate(borrar);
            
            
            /***********************
             * DESCONEXIÓN DE LA BD
             ***********************/
            rs.close();
            stmt.close();
            
        }catch(SQLException sql){
            System.out.println("Error al conectar con la base de datos");
        
        }catch(Exception error){
            System.out.println("Error al crear la conexión");
        }finally{
            if(miConexion != null){
                try{
                    miConexion.close();
                }catch(SQLException error){
                    System.out.println("Error al cerrar la conexión");
                }
            }
        }
        
        
        
        
    }//MAIN
    
}//
