/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeControl;
import java.util.Scanner;

public class Dia5Ej13Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num=leer.nextInt();
        
        for (int i = 1; i < num+1; i++) {
           
            for (int j = 1; j<=i; j++) {
                System.out.print(+j);
               
            }
            System.out.println("");
        }
    }
    
}
