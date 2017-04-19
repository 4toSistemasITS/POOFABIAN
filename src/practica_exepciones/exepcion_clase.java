/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_exepciones;

/**
 *
 * @author jjj
 */
public class exepcion_clase extends Exception{

    public exepcion_clase(String string) {
        super(string);
    }
    
     public static void validar_longitud(int num1, int num2) throws exepcion_clase {
         // condicon para q los nuemros sean posuitivos .
            if (num1<=0 || num2<=0){
                throw new exepcion_clase("los numeros no son positivos");
            }
        
        }
    

   

 
    
    
    
}
