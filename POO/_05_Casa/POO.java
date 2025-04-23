/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _05_Casa;

import java.util.Scanner;

/**
 *
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Casa [] listaCasas = new Casa[50];
        
        listaCasas[0] = new Casa("Juan", 30, 45, 120_000);
        listaCasas[1] = new Casa("Pedro", 120, 100_000);
        listaCasas[2] = new Casa("Alicia", 70, 70, 150_000);
        
        for(Casa casa:listaCasas){
            if(casa != null){
                casa.imprimirDatos();
            }
        }
        
        
        int opcion = 0;
        
        do{
            mostrarMenu();
            
            try{
                System.out.print("Elige una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
                
                switch (opcion) {
                case 1:
                    añadirCasa(listaCasas);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("\033[31mError: has introducido un valor fuera del rango\033[30m");
                }
                
            }catch(NumberFormatException error){
                System.out.println("\033[31mError: has introducido un valor incorrecto\033[30m");
            }catch(Exception error){
                System.out.println("\033[31mError: Se ha producido un error -> " + error.getMessage() + "\033[30m");
            }
            
            
            
            System.out.println("");
            
        }while(opcion != 4);
        
        
    }//MAIN
    
    
    public static void mostrarMenu(){
        System.out.println("=".repeat(20));
        System.out.println("    MENU CASAS");
        System.out.println("=".repeat(20));
        System.out.println("1. Añadir casa");
        System.out.println("2. Listar casas");
        System.out.println("3. Cambiar propietario");
        System.out.println("4. Salir");
    }//
    
    
    
    
    public static void añadirCasa(Casa [] listaCasas){
        String nombre;
        int p1;
        int p2;
        double precio;
        
        char [] caracteresIncorrectos = {'0','1','2','3','4','5','6','7','8','9','.','_','-',';',',','?','¿','"'};
        boolean esNombreCorrecto;
        
        do{
            esNombreCorrecto = true;
            
            try{
                System.out.print("Nombre:");
                nombre = teclado.nextLine();

                for(int i=0; i<nombre.length(); i++){
                    for(int j=0; j<caracteresIncorrectos.length; j++){
                        if(nombre.charAt(i) == caracteresIncorrectos[j]){
                            esNombreCorrecto = false;
                            System.out.println("\033[31mError: Se ha introducido algún caracter incorrecto\033[30m");
                            break;
                        }
                    }
                    if(esNombreCorrecto == false){
                        break;
                    }
                }

            }catch(Exception error){
                System.out.println("\033[31mError: Se ha producido un error -> " + error.getMessage() + "\033[30m");
            }
        }while(esNombreCorrecto == false);
        
        
        
        System.out.print("Planta 1:");
        p1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Planta 2:");
        p2 = Integer.parseInt(teclado.nextLine());
        System.out.print("Precio:");
        precio = Double.parseDouble(teclado.nextLine());
        
        
        
        
    }//
    
    
    
    
    
    
    
    
}//FIN
