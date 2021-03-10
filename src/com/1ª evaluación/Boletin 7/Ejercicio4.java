package boletin7;


public class Ejercicio4 {
    
    public void peso(String nombre1, String nombre2, double peso1, double peso2){
        
        if(peso1>peso2)
            System.out.println(nombre1+" con peso "+peso1+"kg"+", con una diferencia de "+(peso1-peso2)+"kg a mas respecto a "+nombre2);
        else if(peso1==peso2)
            System.out.println("Pesan igual");
        else 
            System.out.println(nombre2+" con peso "+peso2+"kg"+", con una diferencia de "+(peso2-peso1)+"kg a mas respecto a "+nombre1);
    }
}