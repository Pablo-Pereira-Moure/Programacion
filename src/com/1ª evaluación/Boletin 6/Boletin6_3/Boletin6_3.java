
package boletin6_3;

import java.util.Scanner;


public class Boletin6_3 {

  
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce radio del circulo");
        double radio=sc.nextDouble();
        Circulo c=new Circulo(radio);
        c.Area();
        c.calcularLonxitude();
        System.out.println("El radio selecionado es "+c.getRadio());
        
    }
    
    
}