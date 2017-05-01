/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class hash_mpa {
    public static void main(String[] args) {
        
//        crear y instanciuar un has map con esto se hace logfin
          HashMap<String ,String > ob_hola= new HashMap<String, String>();
          
          ob_hola.put("nombre", "fabian");
          ob_hola.put("apellido", "ayala");
         // ob_hola.put("teelfono", "0959552507");
          
          //enves de entrysed le puse casa xq se pude poner cualuqier opbre nombre 
          for (Map.Entry<String, String> ob_casa : ob_hola.entrySet()) {
            
            String key = ob_casa.getKey();
            String value = ob_casa.getValue();
              System.out.println("clave: "+key+"valor:"+value);
            
            
        }
          //se reemplaza nombre por bbb
           // ob_hola.replace("nombre", "bbbb");
          //borra el nombre 
            //ob_hola.remove("nombre");
          //me impeime priemr sou si los valosres dl contine mi apellidos si es verdad sale verdaro true
            System.out.println(ob_hola.containsValue("ayala"));
            System.out.println(ob_hola.get("nombre"));  
              
          
    }
    
    public static void impirmir_array (ArrayList<String>lista){
        for(String valor:lista){
            System.out.println(valor);
        }
        
    }
    
    public static void impriir_reverso_arrya (ArrayList<String>lista){
        
        for (int i= lista.size()-1;i>=0;i--){
            System.out.println("posicoicion "+i);
            
            
            
            
            
        }
        
        
    }
    
     
}
