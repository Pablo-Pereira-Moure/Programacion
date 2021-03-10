package boletin.pkg9_5;

import javax.swing.JOptionPane;

public class Numero {

    float numero;

    public Numero() {
        float num;
        do {
            String numero = JOptionPane.showInputDialog("introduce numero");
           num = Float.parseFloat(numero);
            for (int i = 1; i < 11; i++) {
                float multiplicacion = num * i;

                System.out.println(num + "x" + i + " =" + multiplicacion);

            }
        }while (num !=0);
 
     
     
     
         
        }
    
    }