/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_exepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjj
 */
public class ejecutable {
    public static void main(String[] args) {
        
        int numero1=2;
        int numero2=-5;
        int resul=0;
        try {
            exepcion_clase.validar_longitud(numero1, numero2);
            resul=numero1+numero2;
            
            
            
            System.out.println(resul);
        } catch (exepcion_clase ex) {
            //Logger.getLogger(ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            
        }
        
    }
    
}
