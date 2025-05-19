package E1;

import java.util.Scanner;

/**
 * @author angeles.angamarca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        BD_Word.crearConexion();
        
        
        int opcionMenu = 0;
        String pais;
        
        do{
            mostrarMenu();
            try{
                System.out.print("Elige una opción: ");
                opcionMenu = Integer.parseInt(teclado.nextLine());
                
                if(opcionMenu > 0 && opcionMenu < 6){
                    
                    switch (opcionMenu) {
                        case 1:
                            System.out.print("Introduce el pais: ");
                            pais = teclado.nextLine();
                            BD_Word.buscarHabitantesDePais(pais);
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                        case 4:
                            
                            break;
                        case 5:
                            System.out.println("Saliendo...");
                            break;
                    }
                    
                    
                    
                }else{
                    System.out.println("Error: fuera del rango [1-6]");
                }
            }catch(Exception error){
                System.out.println("Error tipo formato: " + error.getMessage());
            }
            System.out.println("");
        }while(opcionMenu != 5);
        
        
        
        
    }//main
    
    
    public static void mostrarMenu(){
        System.out.println("1. Habitantes de paises");
        System.out.println("2. Habitantes de ciudades");
        System.out.println("3. Paises con un mínimo de X habitantes");
        System.out.println("4. Ciudades con un mínimo de X habitantes");
        System.out.println("5. Salir");
    }
    
    
    
    
    
    
    
    
}//
