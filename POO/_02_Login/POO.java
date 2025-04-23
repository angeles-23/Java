/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _02_login;

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
        
        BD_Usuarios.anadirUsuario(new UsuNormal("zipi", "1234", "zipi@kk.com"));
        BD_Usuarios.anadirUsuario(new UsuNormal("zape", "1234", "zape@kk.com"));
        BD_Usuarios.anadirUsuario(new UsuAdmin("root", "root", "root@kk.com"));
        
        
        int intentosMaximos = 2;
        int numeroIntentos = 0;
        boolean sonDatosCorrectos;
        int opcionAdmin = 0;
        int opcionNormal = 0;
        
        
        
        do{
            numeroIntentos++;
            String [] datosLogin = registrarLogin(intentosMaximos, numeroIntentos);
            
            String nombre = datosLogin[0];
            String password = datosLogin[1];
            
            sonDatosCorrectos = BD_Usuarios.verificarLogin(nombre, password);
            
            
            if(sonDatosCorrectos == true){
                numeroIntentos = 0;
                        
                UsuNormal usuario = BD_Usuarios.obtenerUsuario(nombre);
                System.out.println("");
                
                
                if(usuario instanceof UsuAdmin){
                    UsuAdmin usuarioAdministrador = (UsuAdmin)usuario;
                    
                    do{
                        mostrarMenuAdmin(usuarioAdministrador.getNombre());
                        
                        try{
                            opcionAdmin = Integer.parseInt(teclado.nextLine());
                            if(opcionAdmin < 1 || opcionAdmin > 4){
                                System.out.println("Error. Has introducido un número fuera del rango");
                            }
                        }catch(Exception error){
                            System.out.println("Error. Has introducido un caracter incorrrecto");
                        }
                        
                        switch (opcionAdmin) {
                            case 1:
                                System.out.println("Saliendo...");
                                break;
                            case 2:
                                usuarioAdministrador.listarUsuarios(BD_Usuarios.obtenerBD());
                                break;
                            case 3:
                                System.out.println("Introduce la nueva contraseña: ");
                                String nuevaContrasenia = teclado.nextLine();
                                
                                if(nuevaContrasenia.equals(usuarioAdministrador.getPassword())){
                                    System.out.println("La nueva contraseña no puede ser la misma que la contraseña actual");
                                }else{
                                    usuarioAdministrador.cambiarPassword(nombre);
                                    System.out.println("Contraseña nueva actualizada");
                                }
                                break;
                            case 4:
                                System.out.print("Nombre del usuario: ");
                                String nombreUsuarioContraseniaACambiar = teclado.nextLine();
                                
                                UsuNormal usuarioAEncontrar = BD_Usuarios.obtenerUsuario(nombreUsuarioContraseniaACambiar);
                                UsuAdmin usuarioAdminAEncontrar = (UsuAdmin)usuarioAEncontrar;
                                
                                if(usuarioAdminAEncontrar != null){
                                    nuevaContrasenia = teclado.nextLine();
                                    usuarioAdminAEncontrar.cambiarPassword(nuevaContrasenia);
                                    System.out.println("Contraseña cambiada del usuario " + usuarioAdminAEncontrar);
                                }else{
                                    System.out.println("Se ha producido un error");
                                }
                                
                                break;
                        }
                        
                        System.out.println("");
                        
                    }while(opcionAdmin != 1);
                    
                }
                
                
                else if(usuario instanceof UsuNormal){
                    UsuNormal usuarioNormal = (UsuNormal)usuario;
                    
                    do{
                        mostrarMenuNormal(usuarioNormal.getNombre());
                        
                        try{
                            opcionNormal = Integer.parseInt(teclado.nextLine());
                            if(opcionNormal < 1 || opcionNormal > 3){
                                System.out.println("Error. Has introducido un número fuera del rango");
                            }
                        }catch(Exception error){
                            System.out.println("Error. Has introducido un caracter incorrecto");
                        }


                        switch (opcionNormal) {
                            case 1:
                                System.out.println("Saliendo...");
                                break;
                            case 2:
                                usuarioNormal.listarUsuarios(BD_Usuarios.obtenerBD());
                                break;
                            case 3:
                                usuarioNormal.cambiarPassword();
                                break;
                        }

                        System.out.println("");
                        
                    }while(opcionNormal != 1);
                }
                
                
                
            }else{
                
                if(numeroIntentos != 2){
                    System.out.println("Intentos restantes: " + (intentosMaximos-numeroIntentos));
                }else{
                    System.out.println("No te quedan intentos");
                    break;
                }
            }
            
            
            System.out.println("");
            
            
        }while(numeroIntentos != intentosMaximos);
        
        
        
        
        
        
    }//MAIN
    
    
    public static String[] registrarLogin(int intentosMaximos, int numeroIntentos){
        
        String [] datos = new String[2];
        
        System.out.println("Login");
        System.out.println("*".repeat(11) + " " + intentosMaximos + "/" + numeroIntentos);

        System.out.print("usuario: ");
        String usuario = teclado.nextLine();
        datos[0] = usuario;

        System.out.print("contraseña: ");
        String contraseña = teclado.nextLine();
        datos[1] = contraseña;
        
        return datos;
    }
    
    
    
    public static void mostrarMenuAdmin(String nombre){
        System.out.println("*".repeat(25));
        System.out.println("Administrador:<< " + nombre + " >>");
        System.out.println("*".repeat(25));
        System.out.println("1. Salir del sistema");
        System.out.println("2. Listar Usuarios");
        System.out.println("3. Cambiar Password");
        System.out.println("4. Cambiar Password Usu");
        System.out.print("Elige opción > ");
    }
    
    
    
    public static void mostrarMenuNormal(String nombre){
        System.out.println("*".repeat(25));
        System.out.println("Usuario:<< " + nombre + " >>");
        System.out.println("*".repeat(25));
        System.out.println("1. Salir del sistema");
        System.out.println("2. Listar Usuarios");
        System.out.println("3. Cambiar Password");
        System.out.print("Elige opción > ");
    }
    
    
    
}// FIN
