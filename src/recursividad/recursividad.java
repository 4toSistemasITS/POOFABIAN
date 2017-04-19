/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author jjj
 */
public class recursividad {
    
 
    public int recursivo (int numero,int limite) {
        int valor=0;
         if (numero<limite){
             numero=numero+2;
             
             //aqui llamo al public recursivo 
             System.out.println("aqui retona");
             // solo public vod no retorna los int y double retonar un valor por eso va return 
             
             valor=recursivo(numero, limite);
         }
         else{
             valor=numero;
         }
         return valor;
    }
    

    
}
