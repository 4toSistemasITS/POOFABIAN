/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcion;

/**
 *
 * @author jjj
 */
//calse apara acer valiaciones
public class fabian extends Exception{

    public fabian(String string) {
        super(string);
    }
    public static void validar_longitud(String nombre, int cantidad) throws fabian {

        if (nombre.length() < cantidad) {
            throw new fabian("la longitud no es valida");
        }

    }
    public static void validar_letra(String nombre,String letra)throws fabian{
        //con el simbolo  !  negamos el if osea contraice q no encenttra la letra xq contains solo encuentra o negando no ecneunttrra
        if (!nombre.contains("a")){
        throw new fabian("la letra no se ecnuentra en la palabra");
        
        }
        
        }

}
