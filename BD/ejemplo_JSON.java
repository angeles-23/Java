package ejemplo_json;
// import org.json.*;
import java.util.jar.JarException;
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
        System.out.println("\033[34mIMPRIMIR 1: jsonObject.toString()\033[30m");
        System.out.println(jsonObject.toString());

        
        //2º Forma de imprimir: Formato por partes (+ legible)
        System.out.println("\n\033[34mIMPRIMIR 2: jsonObject.toString(1)\033[30m");
        System.out.println(jsonObject.toString(1));
        
        
        /**************************************************************
         * EJEMPLO 2: Crear un array con 2 objetos JSON
        ***************************************************************/
        System.out.println("\033[34m\nCrear un array con 2 objetos JSON\033[30m");
        JSONArray jsonArray = new JSONArray();
        JSONObject json1;
        
        json1 = new JSONObject();
        json1.put("nombre", "Juan");
        json1.put("edad", 25);
        json1.put("email", "juan@gmail.com");
        
        jsonArray.put(json1);
        
        json1 = new JSONObject();
        json1.put("nombre", "Pepe");
        json1.put("edad", 36);
        json1.put("email", "pepe@gmail.com");
        
        jsonArray.put(json1);
        
        System.out.println(jsonArray.toString(1));
        
        
        /**************************************************************
         * EJEMPLO 3: JSON Anidado
        ***************************************************************/
        System.out.println("\033[34m\nJSON anidado\033[30m");
        
        JSONArray ja_listaDeContactos = new JSONArray();
        JSONObject jo_contacto;
        
        jo_contacto = new JSONObject();
        jo_contacto.put("nombre", "Rocío");
        jo_contacto.put("edad", 21);
        jo_contacto.put("email", "rocio@gmail.com");
        
        JSONObject jo_direccion = new JSONObject();
        jo_direccion.put("calle", "Avenida América");
        jo_direccion.put("numero", 25);
        jo_direccion.put("código postal", 10023);
        jo_direccion.put("provincia", "Murcia");
        jo_direccion.put("localidad", "Lorca");
        
        jo_contacto.put("direccion", jo_direccion);
        ja_listaDeContactos.put(jo_contacto);
        
        System.out.println(ja_listaDeContactos.toString(1)); 
        
        
        /************************************************************
         * EJEMPLO 4: Recorrer JSON
         ************************************************************/
        System.out.println("\033[34m\nRECORRER JSON\033[30m");
        for(int i= 0; i<ja_listaDeContactos.length(); i++){
            JSONObject objetoJSON = ja_listaDeContactos.getJSONObject(i);
            
            String nombre = objetoJSON.getString("nombre");
            int edad = objetoJSON.getInt("edad");
            String email = objetoJSON.getString("email");

            JSONObject direccion = objetoJSON.getJSONObject("direccion"); // cuidado con el nombre de la clave
            String calle = direccion.getString("calle");

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Email: " + email);
            System.out.println("Calle: " + calle);
            System.out.println("-----------------------");
        }
        
    }//MAIN
    
}//
