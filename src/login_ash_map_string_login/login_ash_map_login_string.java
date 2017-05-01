/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_ash_map_string_login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class login_ash_map_login_string {
    
    
    
    
    
    public static void main(String[] args) {
        
        HashMap<String,String > ob_login= new HashMap<String,String>();
        // el hasm map para haer u login 
        // con string 
        
        //izquirda clave el q vale el segundo es el valor
        
        ob_login.put("fabian", "1");
        ob_login.put("22", "2");
        
        
        for (Map.Entry<String, String> ob_entrada : ob_login.entrySet()) {
            
            String key = ob_entrada.getKey();
            String value = ob_entrada.getValue();
            
            System.out.println("clave:"+key+"valor"+value);
            
        }
        
        Scanner scEntrar= new Scanner(System.in);
                   
        System.out.println("ingrese el nombre de usuairo:\n ");
        
        String respuesta=scEntrar.nextLine();
        
         Scanner scEntrar_pasw= new Scanner(System.in);
                   
        System.out.println("ingrese la contraseña:\n ");
        
        String respuesta2=scEntrar_pasw.nextLine();
        
        
        
         if(respuesta.equals("fabian") && respuesta2.equals("22")){
             
             System.out.println("Binevenido");
            
        }
         else{
             System.out.println("error");
         }
            
       
        
    }
}
