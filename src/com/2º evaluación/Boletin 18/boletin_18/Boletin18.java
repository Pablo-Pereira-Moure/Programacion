package com.Programacion.boletin_18.boletin_18;

import com.Programacion.boletin_18.buzon_correos.Buzon;
import com.Programacion.boletin_18.buzon_correos.Correo;
import javax.swing.JOptionPane;


public class Boletin_18 {

    public static void main(String[] args) {
        Buzon buzon = new Buzon();
        Correo c = new Correo();
        int k = 0;
        String opcion;
        do{
            opcion = JOptionPane.showInputDialog("\tMENU \n 1. Mostrar cantidad de correos\n 2. Engadir correo\n 3. Correos que quedan por ler\n 4. Amosar primer correo non lido\n 5. Amosar correo \n 6. Eliminar correo\n 7. Sair");
            switch(opcion){
                case "1": 
                    int cantidadCorreos = buzon.numeroDeCorreos();
                    System.out.println("Hay " + cantidadCorreos + " correos no buzon");
                    break;
                case "2": 
                    buzon.engade(c);
                    break;
                case "3": 
                    boolean lidos = buzon.porLer();
                    System.out.println("Quedan correos por ler: " + lidos);
                    break;
                case "4": 
                    String correoNonLido = buzon.amosarPrimerNoLeido();
                    System.out.println(correoNonLido);
                    break;
                case "5": 
                    String correo = buzon.amosa(k);
                    System.out.println(correo);
                    break;
                case "6": 
                    buzon.eliminar(k);
                    break;
                case "7": 
                    System.exit(0);
            }
        }while(!opcion.equalsIgnoreCase("7"));
        
    }
    
}