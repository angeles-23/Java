
package _07_Agenda;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class Agenda {

    ArrayList<Contacto> agenda;
    private static int contadorID = 0;

    
    
    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    
    
    public ArrayList<Contacto> getAgenda() {
        return this.agenda;
    }

    public void setAgenda(ArrayList<Contacto> agenda) {
        this.agenda = agenda;
    }

    public static int getContadorID() {
        return Agenda.contadorID;
    }

    public static void setContadorID(int contadorID) {
        Agenda.contadorID = contadorID;
    }
    
    
    
    public void addContacto(String nombre, String email, String telefono){
        int idContacto = Agenda.contadorID++;
        agenda.add(new Contacto(idContacto, nombre, email, telefono));
   }//

    
    
    public void listarAgenda(){
        for(Contacto c: this.agenda){
            System.out.println(c.aCadena());
        }
    }
    
    public void modificarContacto(int id){
        boolean contactoEncontrado = false;
        String nombre, email, telefono;
        for (Contacto c: this.agenda){
            if (c.getId() == id){
                System.out.print("Nombre [ENTER para pasar]: ");
                nombre = POO.teclado.nextLine();
                if(!nombre.isEmpty()){
                    c.setNombre(nombre);
                    contactoEncontrado = true;
                }
                
                System.out.print("Email [ENTER para pasar]: ");
                email = POO.teclado.nextLine();
                if(!email.isEmpty()){
                    c.setEmail(email);
                }
                
                System.out.print("Teléfono [ENTER para pasar]: ");
                telefono = POO.teclado.nextLine();
                if(!telefono.isEmpty()){
                    c.setTelefono(telefono);
                }
                
            }
        }
        if(contactoEncontrado == false){
            System.out.println("No se ha encontrado el contacto con id " + id);
        }
    }//
    
    
    
    public void modificarContacto(String nombre){
        boolean contactoEncontrado = false;
        String nombreModificado, email, telefono;
        
        for (Contacto c: this.agenda){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                System.out.print("Nombre[ENTER para pasar]: ");
                nombreModificado = POO.teclado.nextLine();
                if(!nombreModificado.isEmpty()){
                    c.setNombre(nombreModificado);
                }
                
                do{
                    System.out.print("Email: ");
                    email = POO.teclado.nextLine();
                    if(!email.isEmpty()){
                        c.setEmail(email);
                    }
                }while(Utilidades.Utilidades.esEmailValido(email) == false);
                
                boolean esTelefonoCorrecto = false;
                do{
                    try{
                        System.out.print("Teléfono: ");
                        telefono = POO.teclado.nextLine();
                        int telefonoNumerico = Integer.parseInt(telefono);
                        esTelefonoCorrecto = true;

                        if(!telefono.isEmpty()){
                            c.setTelefono(telefono);
                            esTelefonoCorrecto = true;
                        }
                    }catch(NumberFormatException error){
                        System.out.println("Error: el numero introducido no es correcto");
                    }catch(Exception error){
                        System.out.println("Se ha producido un error: " + error.getMessage());
                    }
                    
                }while(esTelefonoCorrecto == false);
                
            }
        }
        
        if(contactoEncontrado == true){
            System.out.println("El contacto con nombre " + nombre + " no existe");
        }
    }//
    
    

    private void modificarContacto(Contacto c){
        String nombre,email,tlf;
       
        System.out.println("=========== MODIFICANDO EL SIGUIENTE CONTACTO =================");
        System.out.println(c.aCadena());

        //se puede preguntar por cada cosa
        System.out.print("\nIntroduce el campo a modificar(nombre/email/tlf):");
        String campo=POO.teclado.nextLine();

        if (campo.equalsIgnoreCase("nombre")) {

            System.out.print("Introduce el nuevo nombre:");
            nombre=POO.teclado.nextLine();
            c.setNombre(nombre);

        }else if (campo.equalsIgnoreCase("email")) {

            System.out.print("Introduce el nuevo email:");
            email=POO.teclado.nextLine();
            c.setEmail(email);

        }else if (campo.equalsIgnoreCase("tlf")) {
            System.out.print("Introduce el nuevo telefono:");
            tlf=POO.teclado.nextLine();
            c.setTelefono(tlf);
        }

    }//
    
    
    
    
    public ArrayList<Contacto> buscarContactos(String expresion){
        ArrayList<Contacto> listaContactos = new ArrayList<>();
        for(Contacto c: this.agenda){
            if(c.getNombre().startsWith(expresion)){
                listaContactos.add(c);
            }
        }
        return listaContactos;
    }//
    
    
    
}//

