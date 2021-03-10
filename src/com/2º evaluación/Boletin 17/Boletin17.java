
package boletin.pkg17;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Boletin17 {

   
    public static void main(String[] args) {
        
         ArrayList <Libros> listaLibros = new ArrayList<>();
        String option;
        do{
           option = JOptionPane.showInputDialog("*** MENU ***\n1-->ENGADIR LIBRO\n2-->BORRAR\n3-->CONSULTAR LIBRO\n5-->SALIR ");
             switch (option){
                case "1":Metodos.engadirLibro(listaLibros);
                        break;
                case "2":Metodos.eliminar(listaLibros);
                        break;
                case "3":Metodos.consultarLibro(listaLibros);
                        break;
            }
                
        }while(!option.equalsIgnoreCase("5"));
    }
    
}
