package _05_Casa;
import java.util.Scanner;

/**
 * @author angam
 */
public class POO {

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
                    listarCasas(listaCasas);
                    break;
                case 3:
                    cambiarPropietario(listaCasas);
                    break;
                case 4:
                    buscarCasas(listaCasas);
                    break;
                case 5:
                    System.out.println("Hasta luego :)");
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
            
        }while(opcion != 5);
        
        
    }//MAIN
    
    
    public static void mostrarMenu(){
        System.out.println("=".repeat(20));
        System.out.println("    MENU CASAS");
        System.out.println("=".repeat(20));
        System.out.println("1. Añadir casa");
        System.out.println("2. Listar casas");
        System.out.println("3. Cambiar propietario");
        System.out.println("4. Buscar casas");
        System.out.println("5. Salir");
    }//
    
    
    public static void añadirCasa(Casa [] listaCasas){
        String nombre = "";
        String p1_cadena;
        String p2_cadena;
        double precio = 0;
        int p1 = 0;
        int p2 = 0;
        
        char [] caracteresIncorrectos = {'0','1','2','3','4','5','6','7','8','9','.','_','-',';',',','?','¿','"'};
        boolean esNombreCorrecto;
        
        System.out.println("==== Alta de nueva casa ====");
        
        do{
            esNombreCorrecto = true;
            
            try{
                System.out.print("Nombre: ");
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
        
        
        boolean esP1Correcto = false;
        do{
            System.out.print("Planta 1: ");
            p1_cadena = teclado.nextLine();
            
            try{
                p1 = Integer.parseInt(p1_cadena);
                esP1Correcto = true;
            }catch(NumberFormatException error){
                System.out.println("Error: El valor introducido para P1 es incorrecto");
            }
        }while(esP1Correcto == false);
            
            
        boolean esP2Correcto = false;
        do{
            System.out.print("Planta 2: ");
            p2_cadena = teclado.nextLine();
            try{
               p2 = Integer.parseInt(p2_cadena);
               esP2Correcto = true;
            }catch(NumberFormatException error){
                System.out.println("Error: El valor introducido para P2 es incorrecto");
            }
        }while(esP2Correcto == false);
        
        
        boolean esPrecioCorrecto = false;
        do{
            System.out.print("Precio: ");
            try{
                precio = Double.parseDouble(teclado.nextLine());
                esPrecioCorrecto = true;
            }catch(NumberFormatException error){
                System.out.println("Error: El valor introducido para precio es incorrecto");
            }
        }while(esPrecioCorrecto == false);
        
        
        for(int i = 0; i<listaCasas.length; i++){
            if(listaCasas[i] == null){
                listaCasas[i] = new Casa(nombre, p1, p2, precio);
                break;
            }
        }
        
    }//
    
    
    public static void listarCasas(Casa [] listaCasas){
        System.out.println("==== Listado de casas ====");
        for (int i=0; i< listaCasas.length; i++){
            if(listaCasas[i] != null){
                System.out.print("CASA " + (i+1) + " --> ");
                listaCasas[i].imprimirDatos();
            }
        }
    }//
    
    
    public static void cambiarPropietario(Casa [] listaCasas){
        listarCasas(listaCasas);
        
        System.out.println("==== Cambiar propietario ====");
        
        try{
            System.out.print("Numero de la casa a cambiar: ");
            int numeroCasa = Integer.parseInt(teclado.nextLine());
            System.out.print("Nombre del nuevo propietario: ");
            String nombreCasaNuevoPropietario = teclado.nextLine();
            
            boolean existeCasa = false;
            
            if(listaCasas[numeroCasa-1] != null){
                listaCasas[numeroCasa-1].setPropietario(nombreCasaNuevoPropietario);
            }else{
                System.out.println("El número de la casa introducida no existe");
            }
            
        }catch(NumberFormatException error){
            System.out.println("Error: Se ha introducido un valor incorrecto");
        }catch(Exception error){
            System.out.println("Error: Se ha producido un error inesperado");
        }
        
    }//
    
    
    public static void buscarCasas(Casa [] listaCasas){
        System.out.print("Precio máximo a buscar: ");
        
        try{
            double precioMaximo = Double.parseDouble(teclado.nextLine());
            int cantidadCasasEncontradas = 0;
            for(int i=0; i<listaCasas.length; i++){
                if(listaCasas[i] != null && listaCasas[i].getPrecioVenta() <= precioMaximo){
                    listaCasas[i].imprimirDatos();
                    cantidadCasasEncontradas++;
                }
            }
            
            if(cantidadCasasEncontradas == 0){
                System.out.println("No se ha encontrado ninguna casa por debajo de ese precio");
            }
            
        }catch(NumberFormatException error){
            System.out.println("Error: El valor introducido es incorrecto");
        }catch(Exception error){
            System.out.println("Error inesperado: " + error.getMessage());
        }
        
    }//
    
}//FIN
