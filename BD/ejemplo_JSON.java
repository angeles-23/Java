package ejemplo_json;
// import org.json.*;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author angam
 */
public class ejemplo_JSON {

    public static void main(String[] args) {
        
        /**************************************************************
         * EJEMPLO 1: Crear un objeto JSON básico y lo vamos a imprimir
        ***************************************************************/
        JSONObject jsonObject = new JSONObject();
        
        jsonObject.put("nombre", "Juan");
        jsonObject.put("edad", 25);
        jsonObject.put("email", "juan@gmail.com");
        
        // 1º Forma de imprimir: Formato en línea
        System.out.println("IMPRIMIR 1: jsonObject.toString()");
        System.out.println("- ".repeat(28));
        System.out.println(jsonObject.toString());

        
        //2º Forma de imprimir: Formato por partes (legible)
        System.out.println("\nIMPRIMIR 2: jsonObject.toString(1)");
        System.out.println("- ".repeat(28));
        System.out.println(jsonObject.toString(1));
        
        
        
        System.out.println("\n");
        
        
        
        /**************************************************************
         * EJEMPLO 2: Crear un array con 2 objetos JSON
        ***************************************************************/
        System.out.println("Crear un array con 2 objetos JSON");
        System.out.println("- ".repeat(28));
        JSONObject json1 = new JSONObject();
        JSONObject json2 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        
        json1.put("nombre", "Juan");
        json1.put("edad", 25);
        json1.put("email", "juan@gmail.com");
        
        jsonArray.put(json1);
        
        System.out.println(jsonArray.toString(1));
        
        
        
        
    }//MAIN
    
}//
