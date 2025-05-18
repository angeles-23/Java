package _07_Editorial_con_Publicaciones;

import static _07_Editorial_con_Publicaciones.BD_AutoresSQL.IP;
import static _07_Editorial_con_Publicaciones.BD_AutoresSQL.puerto;
import java.util.Scanner;
import java.sql.*;
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
        
        int opcionMenu = 0;
        
        
        BD_AutoresSQL.cargarDriver();
        System.out.println("Driver correcto");
        System.out.println(BD_AutoresSQL.crearConexion("jdbc:mysql://" + BD_AutoresSQL.IP + ":" + BD_AutoresSQL.puerto + "/"));
        BD_AutoresSQL.crearBD();
        System.out.println("BD creada");
        
        
        
        System.out.println("EJERCICIO 7 - PUBLICACIONES");
        do{
            mostrarMenu();
            try{
                System.out.print("Elige una opción: ");
                opcionMenu = Integer.parseInt(teclado.nextLine());
                
                if(opcionMenu > 0 && opcionMenu < 7){
                    
                    switch (opcionMenu) {
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            
                            break;
                        case 6:
                            System.out.println("Saliendo...");
                            break;
                    }
                    
                    
                }else{
                    System.out.println("Error: fuera del rango [1-6]");
                }
                
            }catch(NumberFormatException error){
                System.out.println("Error: Tipo formato");
            }catch(Exception error){
                System.out.println("Error: " + error.getMessage());
            }
            System.out.println("");
        }while(opcionMenu != 6);
        
        
        
        
        
        
    }//MAIN
    
    public static void mostrarMenu(){
        System.out.println("1. Añadir libro");
        System.out.println("2. Añadir revista");
        System.out.println("3. Prestar/devolver libro");
        System.out.println("4. Sacar nuevo numero de revista");
        System.out.println("5. Detalles de publicacion");
        System.out.println("6. Salir");
    }
    
    
}///
