/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeControl;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Dia5ej3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una letra");
        String letra = leer.nextLine(); 
        String Letra=letra.toUpperCase();
       if(Letra.equals("A") ||Letra.equals("E")||Letra.equals("I")||Letra.equals("O")||Letra.equals("U")){
        System.out.println("Ingreso Una Vocal");
          }else {
       System.out.println("Ingreso Una Consonante");    
       }
    }
}
