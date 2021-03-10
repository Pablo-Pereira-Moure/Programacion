
package boletin3_3;

import java.util.Scanner;


public class Boletin3_3 {
    

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        int b100,b20,b5,m1;
        System.out.println("Cantidad billetes 100€");
        b100= sc.nextInt();
        System.out.println("Cantidad billetes 20€");
        b20= sc.nextInt();
        System.out.println("Cantidad billetes 5€");
        b5= sc.nextInt();
        System.out.println("Cantidad billetes 1€");
        m1= sc.nextInt();
        System.out.println("Total="+(100*b100+20*b20+5*b5+m1));
       
    }
    
}
