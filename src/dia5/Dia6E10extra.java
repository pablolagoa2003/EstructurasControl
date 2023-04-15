/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;
import java.util.Random;
  import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Dia6E10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     // Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);
        
   
     
    int num1= (int) (Math.random()*1000);
    //multipico por 1000 por que math.random da numero con 0.01 aprox
       int num2= (int) (Math.random()*1000);
        System.out.println("1 num"+num1+ "2num"+num2 );
    
    int multi=num1*num2;
      int num;
      int bandera =0;
       do {
           System.out.println("ingrese un numero");
           num=leer.nextInt();
           System.out.println("la multipicacion es "+multi);
           // para saber el valor que coloco para salir
           if (multi==num){
               bandera = 1;
            }   
           
           }while (bandera ==0);
        System.out.println("acerto"); 

    }
    
}
