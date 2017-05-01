/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_array_list;

import java.util.ArrayList;
import sun.security.util.Length;

/**
 *
 * @author jjj
 */
public class ejercicio_array_list {
    
    public static void main(String[] args) {
         ArrayList<String> lista2=new ArrayList<String>();
        
//         solo pracrtica igual imprime el reverso con strinf 
//       
         
        lista2.add("Programacion");
        lista2.add("Calculo");
        lista2.add("Base_de_datos");        
        lista2.add("Hardware");
        lista2.add("Analisis de Sistemas");
        
       // imprimir_asignatura(lista2);
        imprimi_mayor_numero_carateres(lista2);
        
         
    }
     public static void imprimir_asignatura (ArrayList <String >lista2){
        
         //este for me tomoa la varable valor me toma me reccore lista 2
        for (Object valor : lista2) {
            
            System.out.println(valor);
            
            
        }
  

     }
      public static void imprimi_mayor_numero_carateres (ArrayList <String >lista2){
          
          
          ArrayList<String>lista3=new ArrayList<>();
          String cad,cad2;
          int cont =0;
          int dimension_pe=0;
          
          for (int i=lista2.size()-1;i>=0;i--){
              cad=lista2.get(i);
              
          
          if (!(dimension_pe > cad.length())){
              
              cont=cont+1;
              System.out.println(lista3);
              lista3.add(cad);
              
          }else{
              cont=cont-1;
          
          }
          
              System.out.println(lista3);
           }
          
              
//          {
//              
//              
//              
//              
//          }   
          
          
//          int caja_recorrer;
//
//          for(String valor: lista2){
//
//              caja_recorrer=valor.length();
//
//
//              System.out.println(caja_recorrer);
//          }
//          
      
      }

          
      }

