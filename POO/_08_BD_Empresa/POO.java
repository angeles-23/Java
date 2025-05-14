
package _08_BD_Empresa;

import java.util.ArrayList;

/**
 *
 * @author angam
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa nike = new Empresa("B12345678", "Nike Inc.", "Oregon(USA)");
        Empresa apple = new Empresa("B00044562", "Apple Inc.", "California(USA)");
        Empresa nitro = new Empresa("B11111111", "Nitro S.L.", "Murcia(SPA)");
        
        BD_Empresa miEmpresa = new BD_Empresa();
        miEmpresa.addEmpresa(nike);
        miEmpresa.addEmpresa(apple);
        miEmpresa.addEmpresa(nitro);
        
        miEmpresa.buscarCIF("B00044562").imprimir();
        
        if(miEmpresa.buscarCIF("B00000001") == null){
            System.out.println("No existe la empresa con CIF: B00000001");
        }else{
            miEmpresa.buscarCIF("B00000001").imprimir();
        }
        
        
        ArrayList<Empresa> listaNi = miEmpresa.buscarNombre("ni");
        
        System.out.println("\nUSANDO UN FOR NORMAL");
        for(int i=0; i<listaNi.size(); i++){
            listaNi.get(i).imprimir();
        }
        
        System.out.println("\nUSANDO UN FOREACH");
        for(Empresa e: listaNi){
            e.imprimir();
        }
        
        
        
    }//MAIN
    
    
}//
