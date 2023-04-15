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
public class Dia5Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese un valor limte positivo");
       int limite = leer.nextInt();
       
        do {
            System.out.println("Ingrese un numero");
       int num = leer.nextInt();
       suma = suma + num;
        } while (suma<=limite);

         System.out.println("la suma es"+suma);
         //es un agredo para ver si guarda el numero que se paso
        // TODO code application logic here
    }
    
}
