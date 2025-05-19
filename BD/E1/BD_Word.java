package E1;
import java.sql.*;

/**
 * @author angeles.angamarca
 */
public class BD_Word {
    
    private static final String URL = "jdbc:mysql://localhost/world";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection miConexion;
    
    
    
    public static Connection crearConexion() {
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
       }catch(ClassNotFoundException error){
           System.out.println("Error en el Driver: " + error.getMessage());
       }
       
       try{
           miConexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
       }catch(SQLException error){
           System.out.println("Error en la conexion: " + error.getMessage());
       }
       
        return miConexion;   
    }
    
    
    public static void cerrarConexion(){
        try{
            miConexion.close();
        }catch(SQLException error){
            System.out.println("Error al cerrar la conexion: " + error.getMessage());
        }
    }
    
    
    
    public static void buscarHabitantesDePais(String pais){
        try{
            String sql1 = "SELECT population " +
                          "FROM country " +
                          "WHERE name = ?; ";
             
            PreparedStatement consultaPreparada = miConexion.prepareStatement(sql1);
            consultaPreparada.setString(1, pais);
            
            ResultSet resultado1 = consultaPreparada.executeQuery();
            
            while(resultado1.next()){
                String nombre = resultado1.getString("name");
                String poblacion = resultado1.getString("population");
                
                System.out.printf("%-10s %-10s\n", "PAIS", "HABITANTES");
                System.out.printf("%-10s %-10s", nombre, poblacion);
            }
            
           
            cerrarConexion();
        }catch(SQLException error){
            System.out.println("Error: " + error.getMessage());
        }
    }//
    
    
    
    
    
    
    
    
}//
