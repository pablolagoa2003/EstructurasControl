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
public class Dia5Ej7Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de numeros a ingresar");
        int cant = leer.nextInt();
        int max=0 ,suma=0 , cont=0, min=99999999;
    do {
            System.out.println("ingrese un numero " );
            int num= leer.nextInt();
            if(num<min){
                min=num;
                }
            if (num>max){
                max=num;
                 }
            suma=suma+num;
            cont++;
            }while(cont !=cant);
    
        System.out.println("el maximo es " +max);
        System.out.println("el minimo es " +min);
        System.out.println("el promedio es "+(suma/cant));
        }
    }
    
