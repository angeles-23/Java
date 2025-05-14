
package _07_Agenda;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author angam
 */
public class POO {

    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Agenda agenda = new Agenda();
        
        agenda.addContacto("Luis", "luis@mail.com", "987654321");
        agenda.addContacto("Ana", "ana@mail.com", "123456789");
        agenda.addContacto("Luisa", "luisa@mail.com", "987654381");
        agenda.addContacto("Ani", "ani@mail.com", "123496789");
        
        int opcion = 0, telefonoNumerico, id;
        String nombre, email, telefono = "";
        boolean estelefonoCorrecto = false;
        Contacto contactoBuscado = null;
        
        do{
            mostrarMenu();
            
            try{
                System.out.print("Ellige una opción: ");
                opcion = Integer.parseInt(teclado.nextLine());
                
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        nombre = teclado.nextLine();
                        
                        do{
                            System.out.print("Email: ");
                            email = teclado.nextLine();
                            
                            if(Utilidades.Utilidades.esEmailValido(email) == false){
                                System.out.println("Email incorrecto. Vuelve a intentarlo");
                            }
                        }while(Utilidades.Utilidades.esEmailValido(email) == false);
                        
                        do{
                            try{
                                System.out.print("Telefono: ");
                                telefono = teclado.nextLine();
                                telefonoNumerico = Integer.parseInt(telefono);
                                
                                if(telefono.length() == 9 && telefonoNumerico > 0 && telefonoNumerico <=999999999){
                                    estelefonoCorrecto = true;
                                }else{
                                    System.out.println("La longitud es incorrecta o hay algún caracter incorrecto");
                                }
                            }catch(NumberFormatException error){
                                System.out.println("Telefono incorrecto. Vuelve a intentarlo");
                            }
                            
                        }while(estelefonoCorrecto == false);
                        
                        agenda.addContacto(nombre, email, telefono);
                        break;
                    case 2:
                        if(Agenda.getContadorID() == 0){
                            System.out.println("No existen contactos");
                        }else{
                            System.out.println("================ Listado de agenda ================");
                            String encabezado = String.format("%-3s %-15s %-20s %10s", "ID", "NOMBRE", "EMAIL", "TELÉFONO");
                            System.out.println(encabezado);
                            agenda.listarAgenda();
                        }
                        break;
                    case 3:
                        agenda.listarAgenda();
                        char claseModificacion;
                        
                        do{
                            System.out.print("Quiere modificar por nombre o ID[N/I]: ");
                            claseModificacion = POO.teclado.nextLine().toUpperCase().charAt(0);
                        
                            if(claseModificacion == 'N'){
                                System.out.print("Nombre: ");
                                nombre = POO.teclado.nextLine();
                                agenda.modificarContacto(nombre);
                            }else if(claseModificacion == 'I'){
                                System.out.print("ID: ");
                                id = Integer.parseInt(POO.teclado.nextLine());
                                agenda.modificarContacto(id);
                            }else{
                                System.out.println("Campo introducido incorrecto. Vuelve a introducirlo");
                            }
                        }while(claseModificacion != 'N' && claseModificacion != 'I');
                        break;
                    case 4:
                        System.out.print("Expresion: ");
                        String expresion = teclado.nextLine();
                        
                        ArrayList<Contacto> agendaExpresiones = agenda.buscarContactos(expresion);
                        
                        if(agendaExpresiones == null){
                            System.out.println("No se han encontrado contactos que empiecen por " + expresion);
                        }else{
                           for(int i=0; i<agendaExpresiones.size(); i++){
                               System.out.println(agendaExpresiones.get(i).aCadena());
                           }
                        };
                        break;
                    case 5:
                        System.out.println("Hasta luego :)");
                        break;
                    default:
                        System.out.println("Error: Valor numérico fuera del rango");
                }
                System.out.println("");
            }catch(Exception error){
                System.out.println("Error: la opción introducida tiene que ser numérica");
            }
        }while(opcion != 5);
        
        
        
    }//MAIN
    
    
    public static void mostrarMenu(){
            System.out.println("Agenda de Contactos");
            System.out.println("*".repeat(20));
            System.out.println("1. Añadir");
            System.out.println("2. Lista completa");
            System.out.println("3. Modificar");
            System.out.println("4. Buscar");
            System.out.println("5. Salir");
    }
    
    
}//
