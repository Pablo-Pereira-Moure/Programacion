
package boletin4;

import java.util.Scanner;


public class Boletin4 {

  
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce titulo libro");
    String t=sc.nextLine();
    System.out.println("Introduce autor libro");
    String au=sc.nextLine();
    System.out.println("Introduce año libro");
    int an=sc.nextInt();
    System.out.println("Introduce Nºpaginas libro");
    short nump=sc.nextShort();
    System.out.println("Introduce valoracion libro");
    float val=sc.nextFloat();
    System.out.println("Titulo="+t+"\nAutor="+au+"\nAno="+an+"\nNºpaginas="+nump+"\nValoracion="+val);
    
    Libro l=new Libro();
    l.amosar();
    Libro li=new Libro("El fantasma","Anonimo",1980,(short)20,6f);
    li.amosar();
    }
   
}
