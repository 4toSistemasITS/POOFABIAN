/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_estrutura_de_datos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jjj
 */
public class PRACTICA_ESTRUTURA_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //practica de arrays liost imprime el normal u el reberso de los arrats mertodos avajo
       ArrayList<String> lista= new ArrayList<String>();
        
       for(int i=0; i<10;i++){
           lista.add("vacio");
       }
      
        //imprimi_array_list_reevrso(lista);
        lista.add(5,"uno");
        lista.add(3,"dos");
        lista.add(2,"tres");        
        lista.add(8,"cuatro");
        lista.add(1,"cinco");
        //eliminar
        lista.remove(1);
        
        lista.set(8, "hola");
        
       // imprimi_array_list(lista);
        imprimi_array_list_reevrso(lista);
        
    }
    public static void imprimi_array_list (ArrayList <String >lista){
        
        for (Object valor : lista) {
            System.out.println(valor);
            
        }
        
        
        
    }
    public static void imprimi_array_list_reevrso (ArrayList <String >lista){
        
        for (int i = lista.size()-1;i>=0;i--) {
            System.out.println(lista.get(i)+"Posicion"+i);
            
        }
    }
}
