/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

/**
 *
 * @author pablo
 */
public class dia5ej2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c , d , aux ;
        a=5;
        b=6;
        c=10;
        d=230;
        System.out.println("El valor A=" +a+ "El valor B=" +b+ "El valor C=" +c+ "El valor D=" +d  );
               
             aux=b;
             b=c;
             c=a;
             a=d;
              d=aux ;      
            
         System.out.println("El valor A=" +a+ "El valor B=" +b+ "El valor C=" +c+ "El valor D=" +d  );     
    }
    
}
