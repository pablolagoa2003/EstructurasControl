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
public class dia5ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        int valor;
        valor=1;
         int suma ,sumaerror;
         suma=0;
         
         sumaerror=0;
         
        do {
            System.out.println("ingrese la cadena");
            String FDS=leer.nextLine();
            String pri=FDS.substring(0, 1);
           // String last=FDS.substring(4, 5);
            int num = FDS.length();
            if(FDS.equals("&&&&&")){
                valor=0;
               
                
                }else {
                    valor=1;
                }
            
            if((num==5) && (pri.equals("X")) &&  FDS.substring(4, 5).equals("O")) {
          
            suma++;
        }else {
            sumaerror++;
            }   
        } while (valor==1);
        System.out.println("los FDS correctos son" +suma);
        System.out.println("los FDS incorrectos son"+(sumaerror-1));
        
        //&& (last.equals"O") && (pri.equals("X"))
        
        
        
    }
    
}
