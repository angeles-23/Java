package _10_Coches;

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
        
        String marca, modelo;
        int caballos = 0, radio = 0;
        String opcionCambio;
        String opcionCombustible;
        
        Coche volvo = new Coche("VOLVO", "XC60", 140, TipoCombustible.DIESEL, TipoCambio.AUTOMATICO, 19);
        
        System.out.println("Crear coche");
        System.out.println("=".repeat(55));
        
        do{
            System.out.print("Marca: ");
            marca = teclado.nextLine();
            if(marca.isEmpty()){
                System.out.println("Marca incorrecta");
            }
        }while(marca.isEmpty());
        
        
        do{
            System.out.print("Modelo: ");
            modelo = teclado.nextLine();
            if(marca.isEmpty()){
                System.out.println("Modelo incorrect");
            }
        }while(modelo.isEmpty());
        
        /*BIEN HECHO***************************************************************/
        boolean sonCaballosCorrectos = true;
        do{
            try{
                System.out.print("Caballos: ");
                caballos = Integer.parseInt(teclado.nextLine());
                sonCaballosCorrectos = true;
                if(caballos < 0){
                    System.out.println("Error: el numero no puede ser negativo");
                    sonCaballosCorrectos = false;
                }
            }catch(NumberFormatException error){
                System.out.println("Error: valor no numérico");
                sonCaballosCorrectos = false;
            }catch(Exception error){
                System.out.println("Error: inesperado" + error.getMessage());
                sonCaballosCorrectos = false;
            }
        }while(!sonCaballosCorrectos);
        /*****************************************************************************/
        
        TipoCombustible combustible = TipoCombustible.DIESEL;
        do{
            System.out.print("Combustible[D/G]: ");
            opcionCombustible = teclado.nextLine().toUpperCase();
            
            switch (opcionCombustible) {
                case "D":
                    combustible = TipoCombustible.DIESEL;
                    break;
                case "G":
                    combustible = TipoCombustible.GASOLINA;
                    break;          
            }
            if(!opcionCombustible.equalsIgnoreCase("D") && !opcionCombustible.equalsIgnoreCase("G")){
                System.out.println("Opcion combustible incorrecta. Intentalo de nuevo");
            }
        }while(!opcionCombustible.equalsIgnoreCase("D") && !opcionCombustible.equalsIgnoreCase("G"));
        
        
        
        TipoCambio cambio = TipoCambio.MANUAL;
        do{
            System.out.print("Cambio[A/M]: ");
            opcionCambio = teclado.nextLine().toUpperCase();
            
            switch (opcionCambio) {
                case "A":
                    cambio = TipoCambio.AUTOMATICO;
                    break;
                case "M":
                    cambio = TipoCambio.MANUAL;
                    break;           
            }
            if(!opcionCambio.equalsIgnoreCase("A") && !opcionCambio.equalsIgnoreCase("M")){
                System.out.println("Opcion cambio incorrecta. Intentalo de nuevo");
            }
        }while(!opcionCambio.equalsIgnoreCase("A") && !opcionCambio.equalsIgnoreCase("M"));
        
        
        boolean esRadioCorrecto = true;
        do{
            try{
                System.out.print("Radio: ");
                radio = Integer.parseInt(teclado.nextLine());
                esRadioCorrecto = true;
                if(radio < 0){
                    esRadioCorrecto = false;
                }
            }catch(NumberFormatException error){
                System.out.println("Formato incorrecto, tiene que ser numérico");
                esRadioCorrecto = false;
            }catch(Exception error){
                System.out.println("Error: "+ error.getMessage());
                esRadioCorrecto = false;
            }
        }while(!esRadioCorrecto);
        
        
        Coche porche = new Coche(marca, modelo, caballos, combustible, cambio, radio);
        
        
        volvo.imprimirFicha();
        System.out.println("");
        porche.imprimirFicha();
        System.out.println("");
        volvo.recorrer(10_000);
        volvo.cambiarRueda(3);
        porche.recorrer(500);
        
        volvo.imprimirFicha();
        System.out.println("");
        porche.imprimirFicha();
        System.out.println("");
       
        
//        volvo.imprimirFicha();
        System.out.println("");
        porche.imprimirFicha();
        
        
    }//MAIN
    
}//
