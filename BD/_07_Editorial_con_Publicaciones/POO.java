package _07_Editorial_con_Publicaciones;


import java.util.Scanner;
import java.sql.*;
import java.time.LocalDate;
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
        BD_AutoresSQL.crearBD();
        System.out.println("BD creada");
        BD_AutoresSQL.crearTabla();
        System.out.println("Tabla correcta");
        BD_AutoresSQL.añadirDatos();
        System.out.println("Añadir datos");
        
        
        
        Editorial editorial = new Editorial();
        
        Libro l1 = new Libro("L-01", "Reina Roja", "23230001A", 3);
        Revista r1 = new Revista("R-01", "National Java", "47565134A", LocalDate.of(2024, 1, 1));

        r1.añadirNumero();
        r1.añadirNumero();
        editorial.añadirPublicacion(r1);
        editorial.añadirPublicacion(r1);
        
        
        System.out.println("EJERCICIO 7 - PUBLICACIONES");
        do{
            mostrarMenu();
            try{
                System.out.print("Elige una opciÃ³n: ");
                opcionMenu = Integer.parseInt(teclado.nextLine());
                
                if(opcionMenu > 0 && opcionMenu < 7){
                    
                    switch (opcionMenu) {
                        case 1:
                            System.out.println("\n Añadir libro");
                            System.out.print("Codigo [L-XX]: ");
                            System.out.print("Titulo: ");
                            System.out.print("DNI autor: ");
                            
                            break;
                        case 2:
                             System.out.println("\nAñadir revista");
                             
                             
                            break;
                        case 3:
                            System.out.println("\nPrestar/devolver libro");
                            
                            
                            
                            break;
                        case 4:
                            System.out.println("\nSacar nuevo numero de revista");
                            
                            
                            break;
                        case 5:
                            System.out.println("\nDetalles de publicacion");
                            
                            
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
