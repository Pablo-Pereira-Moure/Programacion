
package boletin3_4;

import java.util.Scanner;


public class Boletin3_4 {

  
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int dinero;
        System.out.println("Introduce la cantidad de dinero deseado");
        dinero= sc.nextInt();
        System.out.println("Recoge "+dinero/100+" billetes de 100€, "+dinero%
        100/20+" billetes de 20€, "+dinero%100%20/5+" billetes de 5€ y "+dinero%
        100%20%5+" monedas de 1€");
      
    }
    
}
