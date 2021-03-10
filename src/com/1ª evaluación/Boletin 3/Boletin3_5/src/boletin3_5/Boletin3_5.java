
package boletin3_5;

import java.util.Scanner;


public class Boletin3_5 {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        float sFijo, ventas, km, dias, sBruto;
        System.out.println("Introduce el sueldo fijo:");
        sFijo= sc.nextFloat();
        System.out.println("Introduce el valopr de ventas echas:");
        ventas= sc.nextFloat();
        System.out.println("Introduce los quilometros recorridos:");
        km= sc.nextFloat();
        System.out.println("Introduce los dias trabajados:");
        dias= sc.nextFloat();
        sBruto= sFijo+(ventas*0.05f)+(km*2)+(dias*30);
        System.out.println("Tu sueldo bruto es de "+sBruto+" y tu sueldo liquido es de "+(sBruto-sBruto*0.18-36));
    }
    
}
