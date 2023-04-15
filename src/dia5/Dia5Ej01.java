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
public class Dia5Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        int num;
        
         do {
             System.out.println("ingrese un numero para saber si es par o no , si ingresa cero sale");
              num=leer.nextInt();
              if (num%2==0) {
                  System.out.println("el numero" +num+ " es par");   
             }
       else 
               System.out.println("el numero" +num+ " es impar");    
        } while (num !=0);
        
    }
    
}
