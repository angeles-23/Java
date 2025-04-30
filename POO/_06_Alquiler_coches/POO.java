/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _06_Alquiler_coches;

import java.time.LocalDate;
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
        Vehiculo t1 = new Turismo("1111TTT", "Volvo XC60", 0);
        BD_Empresa.añadirVehiculo(t1);
        Vehiculo t2 = new Turismo("2222TTT", "Audi A4", 0);
        BD_Empresa.añadirVehiculo(t2);
        Furgoneta f1 = new Furgoneta("2222FFF", "Citroen C16", 0);
        BD_Empresa.añadirVehiculo(f1);
        Furgoneta f2 = new Furgoneta("1111FFF", "Mercedes VITO", 10_000);
        BD_Empresa.añadirVehiculo(f2);
       
        BD_Empresa.listarFlota();
        
        
        int opcionMenu = 0;
        String tipoVehiculo, matricula, marcaModelo;
        int km = 0;
        
        
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
                    
                    
                    do{
                        System.out.print("Matricula: ");
                        matricula = teclado.nextLine();
                        
                        if(matricula.isEmpty()){
                            System.out.println("Error: No puedes introducir un espacio vacío");
                        }
                        
                    }while(matricula.isEmpty());
                    
                    
                    do{
                        System.out.print("Marca y modelo: ");
                        marcaModelo = teclado.nextLine();
                        
                        if(marcaModelo.isEmpty()){
                            System.out.println("Error: No puedes introducir un espacio vacío");
                        }
                        
                    }while(marcaModelo.isEmpty());
                    
                    
                    boolean sonKmCorrectos = false;
                    do{
                        System.out.print("Km: ");
                        try{
                            km = Integer.parseInt(teclado.nextLine());
                            if(km >= 0){
                                sonKmCorrectos = true;
                            }else{
                                System.out.println("Error: Los km tienen que ser positivos");
                            }
                        }catch(NumberFormatException error){
                            System.out.println("Error: Tipo formato -> " + error.getMessage());
                        }
                        
                    }while(sonKmCorrectos == false);
                    
                   
                    
                    if(tipoVehiculo.equals("T")){
                        BD_Empresa.añadirVehiculo(new Turismo(matricula, marcaModelo, km));
                    }else{
                        BD_Empresa.añadirVehiculo(new Furgoneta(matricula, marcaModelo, km));
                    }
                    
                    break;
                    
                case 2:
                    BD_Empresa.imprimirHistoricoAlquileres();
                    
                    break;
                case 3:
                    System.out.print("Matricula del vehiculo: ");
                    matricula = teclado.nextLine();
                    Vehiculo v1 = BD_Empresa.obtenerVehiculo(matricula);
                    
                    if(v1 == null){
                        System.out.println("El vehiculo no existe");
                    }else{
                        
                        if(v1.isAlquilado() == true){
                            System.out.println("El vehiculo ya a sido alquilado");
                            
                            System.out.print("Fecha de alquiler: ");
                            LocalDate fechaInicio = LocalDate.parse(teclado.nextLine());

                            System.out.print("KM: ");
                            km = Integer.parseInt(teclado.nextLine());
                        
                        }else{
                            Alquiler a1 = null;
                            
                            if(v1 instanceof Turismo){
                                Turismo t = (Turismo)v1;
                            }else{
                                Furgoneta f = (Furgoneta)v1;
                            }
                            
                        BD_Empresa.añadirAlquiler(a1);
                        }
                    }
                    
                    
                    break;
                case 4:
                    System.out.print("Matricula del vehiculo: ");
                    matricula = teclado.nextLine();
                    
                    Vehiculo v2 = BD_Empresa.obtenerVehiculo(matricula);
                    if(v2 == null){
                        System.out.println("La matricula del vehiculo no existe");
                    }else{
                        System.out.print("Fecha de alquiler: ");
                        LocalDate fechaFin = LocalDate.parse(teclado.nextLine());
                        
                        if(v2.isAlquilado()==true){
                            
                        }
                    }
                    
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
