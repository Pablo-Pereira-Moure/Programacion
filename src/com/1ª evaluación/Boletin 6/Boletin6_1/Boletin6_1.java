
package boletin6_1;

import java.util.Scanner;


public class Boletin6_1 {

    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        Coche car=new Coche();
        System.out.println("Introduce incremento velocidad");
        int incremento=sc.nextInt();
        car.acelerar(incremento);
        System.out.println("Introduce decremento velocidad");
        int frenar=sc.nextInt();
        car.frenar(frenar);
        car.getVelocidade();      
        
    }
    
}
