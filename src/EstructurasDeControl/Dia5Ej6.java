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
public class Dia5Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
     int num1 , num2 , op ;
     op=0;
     
     String valor ;
       /* System.out.println("Ingrese un primer numero ");
       int num1 = leer.nextInt();
       System.out.println("Ingrese un primer numero ");
        */
       //int num2 = leer.nextInt();
        do {
            
        System.out.println("MENU ");
        System.out.println("1-SUMAR ");
        System.out.println("2-RESTA");
        System.out.println("3-MULTIPLICAR ");
        System.out.println("4-DIVIDIR ");
        System.out.println("5-SALIR ");
        System.out.println("ELIGA UNA OPCION ");
        int opcion = leer.nextInt();
        switch(opcion){
            
            case 1: 
                 System.out.println("Ingrese un primer numero ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese un primer numero ");
                num2 = leer.nextInt();
                System.out.println("la suma es " + (num1+num2));
                break;
            case 2: 
               System.out.println("Ingrese un primer numero ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese un primer numero ");
                num2 = leer.nextInt();
                System.out.println("la resta es " + (num1-num2));
                break;
            case 3: 
                System.out.println("Ingrese un primer numero ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese un primer numero ");
                num2 = leer.nextInt();
                System.out.println("la multipicacion es " + (num1*num2));
                break;
                
            case 4: 
                System.out.println("Ingrese un primer numero ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese un primer numero ");
                num2 = leer.nextInt();
                double div=num1/num2;
                
                System.out.println("la division es " +div );
                       
               break;
             case 5: 
                 System.out.println("ESTA SEGURO QUE QUIERE SALIR Y/N ");
                 valor = leer.next();
                 
                 if (valor.equals("Y")) {
                     op=1;
                     break;
                 }
                 else {
         
        System.out.println("ELIGIO UNA OPCION INCORRECTA");
               
        break;

         }
       
}
      } while (op!=1);        
    }
    
}
