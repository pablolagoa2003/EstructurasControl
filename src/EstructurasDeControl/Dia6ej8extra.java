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
public class Dia6ej8extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num=0;
          int par=0 , impar=0 , total=0;
        do{
            System.out.println("ingrese un numero");
            num = leer.nextInt();
          
            if(num>0){
                total++;
                if(num % 2==0){;
                    par++;
            }else {
                    impar++;
                    }
                }

            
        }while(num%5!=0);
                System.out.println("la cantidad de numeros pares es "+par);
                System.out.println("la cantidad de numeros impares es "+impar);
                System.out.println("la cantidad de numeros ingresados es "+total);
    }
    
}
