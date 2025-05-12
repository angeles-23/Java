
package _06_Contactos;

import java.util.Scanner;

/**
 *
 * @author angam
 */
public class POO {

    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here

        Contacto [] listaContactos = new Contacto [100];

        listaContactos[0] = new Contacto("Juan", "juan@gmail.com", "612345678");
        listaContactos[1] = new Contacto("Alicia", "ali@gmail.com", "123456789");
        listaContactos[2] = new Contacto("Pepe", "pepe@gmail.com", "123789456");
        listaContactos[3] = new Contacto("Santiago", "santi@gmail.com", "612345678");

        int opcion = 0;
        
        do{
            mostrarMenu();
            try{
                System.out.print("\033[34mElige una opción: \033[30m");
                opcion = Integer.parseInt(teclado.nextLine());
                
                if(opcion < 1 || opcion > 4){
                    System.out.println("\033[31mError: Opción fuera del rango\033[30m");
                }else{
                    switch (opcion) {
                        case 1:
                            añadirContacto(listaContactos);
                            break;
                        case 2:
                            listarContactos(listaContactos);
                            break;
                        case 3:
                            listarContactos(listaContactos);
                            modificarContacto(listaContactos);
                            break;
                        case 4:
                            System.out.println("Saliendo :)");
                            break;
                    }
                }
                
                
            }catch(NumberFormatException error){
                System.out.println("\033[31mError: Has introducido un valor incorrecto\033[30m");
            }catch(Exception error){
                System.out.println("Error inesperado: " + error.getMessage());
            }
            
            System.out.println("");
            
        }while(opcion != 4);



        
    }//MAIN
    
    
    public static void mostrarMenu(){
        System.out.println("\033[34m=".repeat(20));
        System.out.println("\033[34m      CONTACTOS");
        System.out.println("\033[34m=".repeat(20));
        System.out.println("\033[34m1. Nuevo Contacto");
        System.out.println("\033[34m2. Listar Contactos");
        System.out.println("\033[34m3. Modificar Contacto");
        System.out.println("\033[34m4. Salir\033[30m");
    }//
    
    
    public static void añadirContacto(Contacto [] listaContactos){
        
        boolean esNombreCorrecto = true;
        String caracteres = "123456789+-*/ª!·$%&/()=?¿'¡";
        String nombre = "";
        
        do{
            System.out.print("Nombre: ");
            nombre = teclado.nextLine();
            esNombreCorrecto = true;
            
            for(int i=0; i<nombre.length(); i++){
                for (int j=0; j<caracteres.length(); j++){
                    if(nombre.charAt(i) == caracteres.charAt(j)){
                        esNombreCorrecto = false;
                    }
                }
            }
            
            if(esNombreCorrecto == false){
                System.out.println("Nombre incorrecto, vuelve a intentarlo");
            }
            
        }while(esNombreCorrecto == false);
        
        
        boolean esEmailCorrecto = false;
        String email = "";
        do{
            System.out.print("Email: ");
            email = teclado.nextLine();
            
            if(Utilidades.Utilidades.esEmailValido(email) == true){
                esEmailCorrecto = true;
            }else{
                System.out.println("Error: formato de email incorrecto");
            }
        }while(esEmailCorrecto == false);
        
        
        boolean esTelefonoCorrecto = false;
        String telefono = "";
        do{
            System.out.print("Telefono: ");
            telefono = teclado.nextLine();
            int telefonoNumerico = Integer.parseInt(telefono);
            
            if(telefonoNumerico > 0 && telefonoNumerico <999999999){
                esTelefonoCorrecto = true;
            }else{
                System.out.println("Error: El número de telefono no tiene un caracter numérico");
            }
            
        }while(esTelefonoCorrecto == false);
        
       for(int i=0; i<listaContactos.length; i++){
           if(listaContactos[i] == null){
               listaContactos[i] = new Contacto(nombre, email, telefono);
               break;
           }
       }
        
    }//
    
    
    public static void listarContactos(Contacto [] listaContactos){
        System.out.println("=".repeat(15) + " LISTA DE CONTACTOS " + "=".repeat(15));
        String cadena = String.format("%-3S %11S %15S %15S", "ID", "NOMBRE", "EMAIL", "TELEFONO");
        System.out.println(cadena);
        
        for(int i=0; i<listaContactos.length; i++){
            if(listaContactos[i] != null){
                System.out.println(listaContactos[i].toString());
            }
        }
    }//
    
    
    public static void modificarContacto(Contacto [] listaContactos){
        
        int idBuscado;
        String nombre, email, telefono;
        
        try{
            System.out.print("ID contacto a buscar: ");
            idBuscado = Integer.parseInt(teclado.nextLine());
            
            if(listaContactos[idBuscado-1] == null){
                System.out.println("El ID " + idBuscado + " no existe");
            }else{
                System.out.print("Nombre [ENTER para no modificar nada]: ");
                nombre = teclado.nextLine();
                if(nombre.isEmpty()){
                    System.out.println();
                }else{
                    listaContactos[idBuscado-1].setNombre(nombre);
                }    

                System.out.print("Email [ENTER para no modificar nada]: ");
                email = teclado.nextLine();
                if(email.isEmpty()){
                    System.out.println();
                }else{
                    if(Utilidades.Utilidades.esEmailValido(email) == true){
                        listaContactos[idBuscado-1].setEmail(email);
                    }
                } 

                System.out.print("Telefono [ENTER para no modificar nada]: ");
                telefono = teclado.nextLine();
                if(telefono.isEmpty()){
                    System.out.println("");
                }else{
                    listaContactos[idBuscado-1].setTelefono(telefono);
                }
            }
              
        }catch(NumberFormatException error){
            System.out.println("Error en el formato introducido");
        }catch(Exception error){
            System.out.println("Error encontrado:" + error.getMessage());
        }
        
        
    }//
    
    
}//
