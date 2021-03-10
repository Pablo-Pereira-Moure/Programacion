
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Introduce primer numero:");
        a = sc.nextFloat();
        System.out.println("Introduce segundo numero:");
        b= sc.nextFloat();
        System.out.println("Suma="+(a+b)+"\nResta="+(a-b)+"\nProducto="+a*b+"\nCociente="+a/b);
        
    }
    
}