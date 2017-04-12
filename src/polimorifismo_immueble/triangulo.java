/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorifismo_immueble;

/**
 *
 * @author USUARIO
 */
public class triangulo implements figura_geometrica{

    @Override
    public double area() {
     return 15;   
    }

    @Override
    public double perimetro(int valor) {
    return valor *3;
    }
    
    
    
    
}
