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
public class dia5Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase o palabra");
        String nombre = leer.nextLine();
        
       // int num = nombre.length();
        if (nombre.length()==8) {
            System.out.println("correcto");
            
        }else  {
         System.out.println("incorrecto");  
         }
        }
    }
    

