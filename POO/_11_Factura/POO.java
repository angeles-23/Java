package _11_Factura;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * @author angam
 */

public class POO {
    public static Scanner teclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Factura miFactura = new Factura("B30341111", LocalDate.EPOCH);
        miFactura.añadirLinea("4", "Barra de pan", 2, 0.80);
        miFactura.añadirLinea("1", "Leche", 1, 1.5);
        
        pedirDatos(miFactura);
        miFactura.imprimirFactura();
        
        
    }//MAIN
    
    
    public static void pedirDatos(Factura miFactura){
        String numeroRef = "", descripcion;
        int cantidad = 0;
        double precio = 0;
        
        boolean esNumeroCorrecto = true;
        do{
            try{
                System.out.print("Numero ref: ");
                numeroRef = teclado.nextLine();
                esNumeroCorrecto = true;
                if(numeroRef.isEmpty()){
                    esNumeroCorrecto = false;
                    System.out.println("Error descripción vacía");
                }
            }catch(NumberFormatException error){
                System.out.println("Error tipo formato");
            }catch(Exception error){
                System.out.println("Error" + error.getMessage());
            }
        }while(!esNumeroCorrecto);
        
        
        boolean esDescripcionCorrecta = true;
        do{
            System.out.print("Descripción: ");
            descripcion = teclado.nextLine();
            esDescripcionCorrecta = true;
            if(descripcion.isEmpty()){
                esDescripcionCorrecta = false;
                System.out.println("Error descripción vacía");
            }
        }while(!esDescripcionCorrecta);
        
        
        boolean esCantidadCorrecta = true;
        do{
            try{
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(teclado.nextLine());
                esCantidadCorrecta = true;
            }catch(NumberFormatException error){
                System.out.println("Error tipo formato");
                esCantidadCorrecta = false;
            }catch(Exception error){
                System.out.println("Error: " + error.getMessage());
                esCantidadCorrecta = false;
            }
        }while(esCantidadCorrecta == false);
        
        
        boolean esPrecioCorrecto = true;
        do{
            try{
                System.out.print("Precio: ");
                precio = Double.parseDouble(teclado.nextLine());
                esPrecioCorrecto = true;
            }catch(NumberFormatException error){
                System.out.println("Error tipo formato");
                esPrecioCorrecto = false;
            }catch(Exception error){
                System.out.println("Error: " + error.getMessage());
                esPrecioCorrecto = false;
            }
        }while(esPrecioCorrecto == false);
        
        miFactura.añadirLinea(numeroRef, descripcion, cantidad, precio);
    }//
    
    
    
    
    
}//

