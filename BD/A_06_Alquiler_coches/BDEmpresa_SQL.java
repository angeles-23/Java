package A_06_Alquiler_coches;

import java.sql.*;

/**
 * @author angam
 */
public class BDEmpresa_SQL {
    
    // Cargar Driver
    public static void cargarDriver(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver cargado correctamente");
            
        }catch(ClassNotFoundException error){
            System.out.println("Error al cargar Driver");
        }
    }//
    
    
    // Crear Conexion
    public static Connection crearConexion(String endpoint){
        String url = endpoint;
        String user = "root";
        String password = "";
        Connection miConexion = null;
        
        try{
            miConexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión realizada correctamente");
            
        }catch(SQLException error){
            System.out.println("Error: " + error.getMessage());
        }
        return miConexion;
    }//
    
    
    public static void CrearBD(){
        Connection miConexion = BDEmpresa_SQL.crearConexion("jdbc:mysql://localhost/");
        
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("DROP DATABASE IF EXISTS alquilervehiculos;");
            consulta.executeUpdate("CREATE DATABASE alquilervehiculos CHARACTER SET utf8mb4;");
            consulta.close();
        }catch(SQLException error){
            System.out.println("Error al crear la BD: " + error.getMessage());
        }finally{
            if(miConexion != null){
                try{
                    miConexion.close();
                }catch(SQLException error){
                    System.out.println("Error al cerrar la conexión");
                }
            }
        }
        
    }//
    
    
    public static void crearTablas(){
        Connection miConexion = BDEmpresa_SQL.crearConexion("jdbc:mysql://localhost/alquilervehiculos");
        
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("USE alquilervehiculos;");
            
            // Tabla vehiculos
            consulta.executeUpdate("CREATE TABLE vehiculo(" 
                + "matricula 		varchar(50) NOT NULL,"
                + "marca_modelo 	varchar(50),"
                + "km 			int UNSIGNED DEFAULT 0,"
                + "alquilado 		boolean,"
                + "precioKilometro      decimal(10,2),"
                + "precioDia 		decimal(10,2),"
                + "tipoVehiculo 	varchar(50) NOT NULL,"
                + "PRIMARY KEY(matricula));"
                );
            
            consulta.executeUpdate("CREATE TABLE alquiler("
                + "id 			int UNSIGNED NOT NULL AUTO_INCREMENT,"
                + "matricula 		varchar(50) NOT NULL,"
                + "km_inicio 		int UNSIGNED NOT NULL,"
                + "km_fin		int UNSIGNED NOT NULL,"
                + "fecha_inicio 	date,"
                + "fecha_fin		date,"
                + "importe		decimal(10,2),"
                + "PRIMARY KEY (id),"
                + "CONSTRAINT matricula_vehiculo FOREIGN KEY (matricula) REFERENCES vehiculo(matricula)"
                +");"
            );
                        
        }catch(SQLException error){
            System.out.println("Error al crear la BD: " + error.getMessage());
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la conexión: " + error.getMessage());
            }
        }
    }//
    
    
    public static void insertarDatos(){
        Connection miConexion = BDEmpresa_SQL.crearConexion("jdbc:mysql://localhost/alquilervehiculos");
        
        try{
            Statement consulta = miConexion.createStatement();
            consulta.executeUpdate("USE alquilervehiculos;");
            consulta.executeUpdate("INSERT INTO vehiculo VALUES('1111TTT', 'Volvo XC60', 100, true, null, 30, 'turismo');");
            consulta.executeUpdate("INSERT INTO vehiculo VALUES('2222TTT', 'Audi A4', 0, false, null, 30, 'turismo');");
            consulta.executeUpdate("INSERT INTO vehiculo VALUES('3333FFF', 'Citroen C16', 250, false, 0.5, null, 'furgoneta');");
            consulta.executeUpdate("INSERT INTO alquiler VALUES(null, '1111TTT', 0, 100, '2023-01-01', '2023-01-05', 120);");
            consulta.executeUpdate("INSERT INTO alquiler VALUES(null, '3333FFF', 0, 250, '2023-01-01', '2023-01-02', 125);");
            consulta.executeUpdate("INSERT INTO alquiler VALUES(null, '1111TTT', 100, 0, '2023-05-19', null, 0);");
        }catch(SQLException error){
            System.out.println("Error al insertar datos: " + error.getMessage());
        }finally{
            try{
                if(miConexion != null){
                    miConexion.close();
                }
            }catch(SQLException error){
                System.out.println("Error al cerrar la conexión: " + error.getMessage());
            }
        }
        
    }//
    
    
    
    public static void añadirVehiculo(String matricula, String marca_modelo, int km, String tipo){
        Connection miConexion = BDEmpresa_SQL.crearConexion("jdbc:mysql://localhost/alquilervehiculos");
        
        try{
            String insert = "INSERT INTO producto VALUES (?,?,?,?,?,?,?)";
            PreparedStatement insertPreparada = miConexion.prepareStatement(insert);
            
            insertPreparada.setString(1, matricula);
            insertPreparada.setString(2, marca_modelo);
            insertPreparada.setInt(3, km);
            insertPreparada.setBoolean(4, false);
            
            if(tipo.equalsIgnoreCase("turismo")){
                insertPreparada.setString(5, null);
                insertPreparada.setDouble(6, 30.0);
            }else{
                insertPreparada.setDouble(5, 0.50);
                insertPreparada.setString(6, null);
            }
            
            insertPreparada.setString(7, tipo);
            
        }catch(Exception error){
            System.out.println("Error: " + error.getMessage());
        }
        
    }
    
    
    
    
    
}//
