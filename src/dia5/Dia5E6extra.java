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
public class Dia5E6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantida de personas a medir");
         int   num=leer.nextInt();
         int sumat , sumam , cont;
         sumam =0;
         sumat=0;
         cont=0;
         for (int i = 0; i < num; i++) {
             System.out.println("ingrese la altura de la persona en cm"+(i+1));
             int tam =leer.nextInt();
             sumat=tam + sumat;
             if(tam<160){
                 sumam=sumam + tam;
                 cont++;
                        }
                                       }
         System.out.println("el promedio de todas las " +(sumat/num));
         System.out.println("el promedio de la gente menor a 160 es " +(sumam/cont));
        
        
        
    }
    
}
