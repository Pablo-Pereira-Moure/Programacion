
package boletin3_1;

import java.util.Scanner;


public class Boletin3_1 {

   
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        float tarifa, pagado;
        System.out.println("Introduce tarifa:");
        tarifa= sc.nextFloat();
        System.out.println("Introduce pagado:");
        pagado= sc.nextFloat();
        System.out.println("Descuento="+(tarifa-pagado)*100/tarifa+"%");
    }
    
}