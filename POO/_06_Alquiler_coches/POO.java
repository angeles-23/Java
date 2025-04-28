/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _06_Alquiler_coches;

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
        
        BD_Empresa.añadirVehiculo(new Turismo("1111TTT", "Volvo XC60", 0));
        BD_Empresa.añadirVehiculo(new Turismo("2222TTT", "Audi A4", 0));
        BD_Empresa.añadirVehiculo(new Furgoneta("2222FFF", "Citroen C16", 0));
        //BD_Empresa.añadirVehiculo(new Furgoneta("1111FFF", "Mercedes VITO", 10_000));
        
        BD_Empresa.listarFlota();
        
        int opcionMenu = 0;
        String tipoVehiculo, matricula, marcaModelo;
        int km;
        
        
        do{
            mostrarMenu();
            try{
                System.out.print("Elige una opción > ");
                opcionMenu = Integer.parseInt(teclado.nextLine());
                
                if(opcionMenu < 1 || opcionMenu > 5){
                    System.out.println("Error: Fuera del rango");
                }
                
            }catch(NumberFormatException error){
                System.out.println("Error: Tipo formato ->" + error.getMessage());
            }
            
            
            switch (opcionMenu) {
                case 1:
                    
                    do{
                        System.out.print("Turismo o furgoneta?[T/F]: ");
                        tipoVehiculo = teclado.nextLine().toUpperCase();
                        
                        if(!tipoVehiculo.equals("T") && !tipoVehiculo.equals("F")){         //Diferente de T y F
                            System.out.println("Error: Tipo vehiculo incorrecto");
                            System.out.println("Vuelve a intentarlo");
                        }
                        
                    }while(!tipoVehiculo.equals("T") && !tipoVehiculo.equals("F"));        // Diferemte de T y F
                    
                    System.out.print("Matricula: ");
                    matricula = teclado.nextLine();
                    
                    System.out.print("Marca y modelo: ");
                    marcaModelo = teclado.nextLine();
                    System.out.print("Km: ");
                    km = Integer.parseInt(teclado.nextLine());
                    
                    if(tipoVehiculo.equals("T")){
                        BD_Empresa.añadirVehiculo(new Turismo(matricula, marcaModelo, km));
                    }else{
                        BD_Empresa.añadirVehiculo(new Furgoneta(matricula, marcaModelo, km));
                    }
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            }
            
            
        }while(opcionMenu != 5);
        
        
        
        
    }//MAIN
    
    public static void mostrarMenu(){
        System.out.println("\nALQUILER");
        System.out.println("*************************");
        System.out.println("1. Añadir vehiculo");
        System.out.println("2. Historico alquileres");
        System.out.println("3. Alquilar vehiculo");
        System.out.println("4. Devolver vehiculo");
        System.out.println("5. Salir del sistema");
    }
    
    
}//
