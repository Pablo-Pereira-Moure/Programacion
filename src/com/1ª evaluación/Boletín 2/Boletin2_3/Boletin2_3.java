
package boletin2_3;


import java.util.Scanner;


public class Boletin2_3 {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        float euros, cambio;
        System.out.println("Pasar a Euros");
        euros= sc.nextFloat();
        System.out.println("Cambio actual");
        cambio= sc.nextFloat();
        System.out.println(euros+"€ son "+euros*cambio+"$");
        
    }
    
}
