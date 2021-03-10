
package boletin6_2;

import java.util.Scanner;


public class Boletin6_2 {

   
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce cordenadas"+"\nMeridiano");
        double meridiano=sc.nextDouble();
        System.out.println("Paralelo");
        double paralelo=sc.nextDouble();
        System.out.println("distancia Tierra");
        double distanciaTerra=sc.nextDouble();
        Satelite s=new Satelite(meridiano, paralelo, distanciaTerra);
        s.verPosicion();
        
    }
    
}
