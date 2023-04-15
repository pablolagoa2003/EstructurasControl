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
public class Dia5Ej5extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una opcion");
        String op = leer.nextLine();
        System.out.println("Ingresa el valor de tratamiento");
        double valor = leer.nextInt();
      switch (op) {  
       case "a":
           double v = valor/2;
                System.out.println("el valor de su tratamiento es "+v);
                break;
            case "b":
                double vi=65 * valor/100;
                System.out.println("el valor de su tratamiento es "+vi);
                break;
            case "3":
                System.out.println("el valor de su tratamiento es "+valor);
                break;
           default:
                System.out.println("El numero ingresado no está todavia en nuestro programa");
        }
    
    }
    
}
