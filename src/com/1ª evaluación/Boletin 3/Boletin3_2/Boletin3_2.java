
package boletin3_2;

import java.util.Scanner;


public class Boletin3_2 {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        float c;
        System.out.println("Introduce temperatura en ºC");
        c= sc.nextFloat();
        System.out.println(c+"ºC son "+(c+273)+"ºK y "+(1.8*c+32)+"ºF");
    }
    
}