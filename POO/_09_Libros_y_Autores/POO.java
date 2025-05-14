package _09_Libros_y_Autores;

import java.util.ArrayList;
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
        
        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Autor> listaAutores = new ArrayList<>();
        
        listaAutores.add(new Autor("Jorge Javier", "Vázquez", "Aledo", "jorge@gmail.com"));
        listaAutores.add(new Autor("Alicia", "Cano", "Medina", "ali@gmail.com"));
        listaLibros.add(new Libro(Utilidades.Utilidades.generarCodigoLibro(), "El hobitton", listaAutores.get(0), 2020));
        listaLibros.add(new Libro(Utilidades.Utilidades.generarCodigoLibro(), "Mi vida es bella", listaAutores.get(1), 2021));
        
        int opcion = 0;
        
        do{
            mostrarMenu();
            try{
                System.out.print("Opcion: ");
                opcion = Integer.parseInt(teclado.nextLine());
                
                switch (opcion) {
                    case 1:
                        añadirAutor(listaAutores);
                        break;
                    case 2:
                        mostrarAutores(listaAutores);
                        break;
                    case 3:
                        añadirLbro(listaLibros, listaAutores);
                        break;
                    case 4:
                        mostrarLibros(listaLibros);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Error: fuera del rango");
                }
                
            System.out.println("");    
            
            }catch(NumberFormatException error){
                System.out.println("Error: formato incorrecto\n");
            }catch(Exception error){
                System.out.println("Error: " + error.getMessage() + "\n");
            }
        }while(opcion != 5);
        
        
    }//MAIN
    
    public static void mostrarAutores(ArrayList<Autor> listaAutores){
        System.out.println("\nLISTA AUTORES [" + listaAutores.size() + "]");
        System.out.println("=".repeat(18));
        for(Autor a: listaAutores){
            System.out.println(a.getNombreCita());
        }
    }//
    
    public static void mostrarLibros(ArrayList<Libro> listaLibros){
        System.out.println("\nLISTA LIBROS [" + listaLibros.size() + "]");
        System.out.println("=".repeat(18));
        for(Libro l: listaLibros){
            System.out.println(l.getCita());
        }
    }//
    
    public static void mostrarMenu(){
        System.out.println("        MENU");
        System.out.println("=".repeat(20));
        System.out.println("1. Añadir autor");
        System.out.println("2. Listar autores");
        System.out.println("3. Añadir libro");
        System.out.println("4. Listar libros");
        System.out.println("5. Salir");
    }//
    
    public static void añadirAutor(ArrayList<Autor> listaAutores){
        String nombre, ape1, ape2, email;
        
        String caracteres = "0123456789.+-*/ª!·$%&()~|@#~€¬¡'¿?";
        String caracteresEmail = "|#~€¬)(/&%$·!¿?¡'¨Ç*^¨[]{};";
        
        System.out.println("\nIntroducir nuevo autor");
        System.out.println("=".repeat(25));
        boolean esNombreCorrecto = true;
        do{
            System.out.print("Nombre: ");
            nombre = teclado.nextLine();
            esNombreCorrecto = true;
            
            for(int i=0; i<nombre.length(); i++){
                for(int j=0; j<caracteres.length(); j++){
                    if(nombre.charAt(i) == caracteres.charAt(j) ){
                        esNombreCorrecto = false;
                        break;
                    }
                }
            }
            
            if(esNombreCorrecto == false){
                System.out.println("Nombre incorrecto");
            }
        }while(esNombreCorrecto == false);

        
        boolean esApellido1Correcto = true;
        do{
            System.out.print("Apellido 1: ");
            ape1 = teclado.nextLine();
            esApellido1Correcto = true;
            for(int i=0; i<ape1.length(); i++){
                for(int j=0; j<caracteres.length(); j++){
                    if(ape1.charAt(i) == caracteres.charAt(j) ){
                        esApellido1Correcto = false;
                        break;
                    }
                }
            }
            
            if(esApellido1Correcto == false){
                System.out.println("Primer apellido incorrecto");
            }
            
        }while(esApellido1Correcto == false);
        
        
        boolean esApellido2Correcto = true;
        do{
            System.out.print("Apellido 2: ");
            ape2 = teclado.nextLine();
            esApellido2Correcto = true;
            for(int i=0; i<ape2.length(); i++){
                for(int j=0; j<caracteres.length(); j++){
                    if(ape2.charAt(i) == caracteres.charAt(j) ){
                        esApellido2Correcto = false;
                        break;
                    }
                }
            }
            
            if(esApellido2Correcto == false){
                System.out.println("Segundo apellido incorrecto");
            }
            
        }while(esApellido2Correcto == false);
        
        
        boolean esEmailCorrecto = false;
        do{
            System.out.print("Email: ");
            email = teclado.nextLine();
            esEmailCorrecto = true;
            for(int i=0; i<email.length(); i++){
                for(int j=0; j<caracteresEmail.length(); j++){
                    if(email.charAt(i) != caracteresEmail.charAt(j) && Utilidades.Utilidades.checkEmail(email) == false){
                        esEmailCorrecto = false;
                        break;
                    }
                }
            }
            
            if(esEmailCorrecto == false && Utilidades.Utilidades.checkEmail(email) == false){
                System.out.println("Email incorrecto");
            }
            
        }while(esEmailCorrecto == false && Utilidades.Utilidades.checkEmail(email) == false);
        
        listaAutores.add(new Autor(nombre, ape1, ape2, email));
        
    }//
    
    public static void añadirLbro(ArrayList<Libro> listaLibros, ArrayList<Autor> listaAutores){
        String titulo, apellido;
        int año = 0;
        
        System.out.println("\nIntroducir nuevo libro");
        System.out.println("=".repeat(25));
        boolean esTituloCorrecto = false;
        do{
            System.out.print("Titulo: ");
            titulo = teclado.nextLine();
            esTituloCorrecto = true;
            
            if(titulo.isEmpty()){
                esTituloCorrecto = false;
                System.out.println("Titulo incorrecto");
            }
        }while(esTituloCorrecto == false);
        
        boolean esAñoCorrecto = true;
        do{
            try{
                System.out.print("Año: ");
                año = Integer.parseInt(teclado.nextLine());
                esAñoCorrecto = true;
                if(año < 1500 || año > 2025){
                    esAñoCorrecto = false;
                    System.out.println("Error: año fuera del rango");
                }
            }catch(NumberFormatException error){
                System.out.println("Error: formato de fecha incorrecto");
            }
        }while(esAñoCorrecto == false);
        
        boolean esApellidoCorrecto = false;
        Autor autorEncontrado = null;
        do{
            System.out.print("Apellido: ");
            apellido = teclado.nextLine();
            esApellidoCorrecto = false;
            for(Autor a: listaAutores){
                if(a.getApellido1().equalsIgnoreCase(apellido)){
                    esApellidoCorrecto = true;
                    break;
                }else{
                    autorEncontrado = a;
                }
            }
            if(esApellidoCorrecto == false){
                System.out.println("   Error: no existe dicho autor");
            }
        }while(esApellidoCorrecto == false);
        
        String codigoGenerado = Utilidades.Utilidades.generarCodigoLibro();
        
        for(Libro l: listaLibros){
            if(l.getCodigo().equalsIgnoreCase(codigoGenerado)){
                codigoGenerado = Utilidades.Utilidades.generarCodigoLibro();
            }
        }
        
        listaLibros.add(new Libro(codigoGenerado, titulo, autorEncontrado, año));
        
    }//
    
    
}//
