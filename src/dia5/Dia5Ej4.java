/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Dia5Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase o palabra");
        String nombre = leer.nextLine();
        if(nombre.substring(0,1).equals("A")) {
            System.out.println("correcto");
            
        }else  {
         System.out.println("incorrecto");  
         }
    }
    
}
