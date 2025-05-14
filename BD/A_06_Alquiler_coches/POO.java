package A_06_Alquiler_coches;
import java.sql.*;
import java.util.Scanner;
/**
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        
        do{
            mostrarMenu();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    boolean opcion2;
                    String tipo_vehiculo;
                    
                    do{
                        System.out.print("Turismo o furgoneta: ");
                        tipo_vehiculo = teclado.nextLine();
                        if(!tipo_vehiculo.equalsIgnoreCase("turismo") && !tipo_vehiculo.equalsIgnoreCase("furgoneta")){
                            System.out.print("Introduce furgo o turismo: ");
                            opcion2 = true;
                        }else{
                            opcion2 = false;
                        }
                        
                    }while(opcion2);
                    
                    System.out.print("Matricula: ");
                    
                    System.out.print("Marca: ");
                    
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Cerrando...");
                    break;
                default:
                    throw new AssertionError();
            }
            
            
            
        }while(opcion != 5);
        
        
        
        
        
        
        try{
            BDEmpresa_SQL.cargarDriver();
            BDEmpresa_SQL.CrearBD();
            System.out.println("Se ha creado la base de datos.");
            
            BDEmpresa_SQL.crearTablas();
            System.out.println("Tablas creadas correctamente");
            
            BDEmpresa_SQL.insertarDatos();
            System.out.println("Se han insertado los datos en la tabla");
            
        }catch(Exception error){
            System.out.println("Error en el main: " + error.getMessage());
        }
        
        
        
    }//MAIN
    
    public static void mostrarMenu(){
        System.out.println("ALQUILER");
        System.out.println("*".repeat(15));
        System.out.println("1. Añadir vehiculo");
        System.out.println("2. Historico alquileres");
        System.out.println("3. Alquiler vehiculo");
        System.out.println("4. Devolver vehiculo");
        System.out.println("5. Salir del sistema");
    }
    
}//
