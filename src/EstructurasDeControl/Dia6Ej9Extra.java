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
public class Dia6Ej9Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=leer.nextInt();
        System.out.println("ingrese el divisor");
        int div =leer.nextInt();
        int cant=0;
       while(num > div){
       num=num-div;
       cant++;    
        }
      System.out.println("el coeficiente es : " +cant);  
       System.out.println("el residuo es : " +num);   
    }
    
}
