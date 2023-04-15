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
public class dia6Ej11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        int cont=1;
        while ((num/10>=1)){
            num= num/10;
            cont++;
        }
         System.out.println("la cantidad de digitos es "+cont);   
        
    }
    
}
