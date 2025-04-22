/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _03_Libro;

import com.sun.jdi.connect.ListeningConnector;

/**
 *
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro l1 = new Libro("1984", "G.Oswell", 1948);
        Libro l2 = new Libro("L001", "Moby Dick", "Mervill,H.", 1948);
        Libro l3 = new Libro("50 sombras", "Mike M.", 2010);
        
        
        // PARTE 1
        System.out.println("SIN USAR ARRAYS");
        System.out.println("- ".repeat(20));
        l1.setIsbn("S471");
        
        
        System.out.println(l1.citaBibliografica());
        System.out.println(l2.citaBibliografica());
        System.out.println(l3.citaBibliografica());
        
        System.out.println("");
        
        System.out.println(l1.getIsbn());
        System.out.println(l2.getIsbn());
        System.out.println(l3.getIsbn());
        
        System.out.println("");
        
        l1 = l2;
        System.out.println(l1.citaBibliografica());
        System.out.println(l2.citaBibliografica());
        System.out.println(l3.citaBibliografica());
        
        
        
        
        //PARTE 2
        System.out.println("\nUSANDO ARRAYS");
        System.out.println("- ".repeat(20));
        
        Libro [] listaLibros = new Libro[10];
        
        listaLibros[0] = new Libro("1984", "G.Oswell", 1948);
        listaLibros[1] = new Libro("L001", "Moby Dick", "Mervill,H.", 1948);
        listaLibros[2] = new Libro("50 sombras", "Mike M.", 2010);
        
        for(int i=0; i<listaLibros.length; i++){
            if(listaLibros[i]  != null){
                System.out.println(listaLibros[i].citaBibliografica());
            }
        }
        
        
        
        
        
        
    }//MAIN
    
}//FIN
