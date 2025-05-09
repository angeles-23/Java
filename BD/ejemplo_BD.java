package __P_01_EjemploConexionBD;
import com.mysql.cj.xdevapi.InsertStatement;
import java.sql.*;

/**
 * @author angam
 */

public class ejemplo_BD {

    public static void main(String[] args) {
        
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
            
            
            /**************************
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
                int codigo = rs.getInt("codigo"); // rs.getTipoVariable(nombreColumna);
                System.out.println("Codigo: " + codigo + " - Nombre: " + nombre);
            }
            
            ResultSet rsProducto = stmt.executeQuery("SELECT * "
                                                   + "FROM producto");
            
            ResultSet rsFabricante = stmt.executeQuery("SELECT * "
                                                     + "FROM fabricante");
            
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
            
//            String consultaEjemplo;
//            while(rs.next()){
//                if(rs.getInt("codigo") > 10){
//                     consultaEjemplo= "UPDATE ... SET precio 100";
//                }else{
//                    consultaEjemplo = "UPDATE ... SET precio 600";
//                }
//            }
            
            
            /********************
             * 4. INSERTAR EN BD
             ********************/
            String nombre = "SATA50000";
            double precio = 299.99;
            int codigo_fabricante = 4;
            
            String consulta = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('"+nombre+"',"+precio+","+codigo_fabricante+");" ;
            String consultaConNullSinVariables = "INSERT INTO producto VALUES (null,'"+nombre+"',"+precio+","+codigo_fabricante+");" ;
            System.out.println(consulta);
            int result = stmt.executeUpdate(consulta);
            

            /******************
             * 5. UPDATE EN BD
             ******************/
//          Actualiza, ya sea para borrar o añadir
            String cambioNombre = "Ordenador de mesa";
            String actualizacion = "UPDATE producto SET nombre='" + cambioNombre + "' "
                                + "WHERE codigo = 14;";
            System.out.println(actualizacion);
            int resultUpdate = stmt.executeUpdate(actualizacion);
            
            
            /******************
             * 6. DELETE EN BD
             ******************/
            String borrar = "DELETE FROM producto "
                           + "WHERE codigo = 14;";
            System.out.println(borrar);
            int resultDelete = stmt.executeUpdate(borrar);
            
            
            /**************************
             * 7. CONSULTAS PREPARADAS
             **************************/
            String nombrePreparado = "SATA50000";
            int codigo = 3;
            
            String sql1 = "SELECT * "
                    + "FROM producto "
                    + "WHERE nombre = '" + nombrePreparado + "';";
            
            String sql2 = "SELECT * "
                    + "FROM producto "
                    + "WHERE nombre = ? OR codigo = ?";
            
            PreparedStatement preparadaStmt = miConexion.prepareStatement(sql2);
            preparadaStmt.setString(1, nombrePreparado);
            preparadaStmt.setInt(2, codigo);
            ResultSet rsConsultaPreparada1 = preparadaStmt.executeQuery();
            
            
            preparadaStmt.setString(1, "SATA8000");
            preparadaStmt.setInt(2, 45);
            ResultSet rsConsultaPreparada2 = preparadaStmt.executeQuery();
            
            
            String insert = "INSERT INTO producto VALUES(null,?,?,?);" ;
            PreparedStatement insertPreparada = miConexion.prepareStatement(insert);
            
            // Cambia de la función preparada con el tipo de cambio y en los (), 
            // le damos la poscicion de la variable y la variable por la que se quiere cambiar
            // finalmente actualizo la función preparada
            insertPreparada.setString(1, "SATA232323");
            insertPreparada.setDouble(2, 233.64);
            insertPreparada.setInt(3, 4);
            insertPreparada.executeUpdate();
            
            
            /**************************
             * 8. DESCONEXIÓN DE LA BD
             **************************/
            rs.close();
            rsProducto.close();
            rsFabricante.close();
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
