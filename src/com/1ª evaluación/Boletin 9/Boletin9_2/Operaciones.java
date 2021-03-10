package boletin.pkg9_2;
public class Operaciones {
   private int suma=0;
   private double producto=1;
    
    public void realizarOperacion(){
       
            for (int i = 10; i<=90; i++){
            suma = suma + i;
            producto = producto * i;
        }
        System.out.println("Suma " + suma);
        System.out.println("Producto " + producto);
    }


}
