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
public class Dia5Ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int d;
        double hora ;
        System.out.println("ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        if(minutos > 1440){
            d = minutos/1440;
            int mm = minutos - (d*1440);
            hora = mm/60;
            System.out.println("la cantidad de dias es " +d+ " y las horas"+hora); 
        }else {
            hora = minutos/60;
        }
       System.out.println("la cantidad de horas"+hora); 
    }
    
}
