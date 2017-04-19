/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo_file;

import exepcion.fabian;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jjj
 */
public class TIPO_FILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena="";
        
        
      File archivo= new File("holi.txt");
      archivo.getName();
      
      // fabian.validar_letra(archivo.getName(), "a");
      
        try {
            fabian.validar_longitud(archivo.getName(), 15);
            
           
            
            
           
        } catch (fabian ex) {
//            Logger.getLogger(TIPO_FILE.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            
        }
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader bf=new BufferedReader(fr);
            
            // añadir add clasu la segunod opcin selecionar 
            while ((cadena=bf.readLine()) != null){
                
                System.out.println(cadena);
        } 
          
         
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
   
       
       
        
        
    }
    
}
