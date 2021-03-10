
package boletin8_7;

import javax.swing.JOptionPane;


public class Boletin8_7 {


    public static void main(String[] args) {
        int numeroFigura = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número para figura \n" +
                "1-Cuadrado\n" +
                "2-Triángulo\n" +
                "3-Círculo"), JOptionPane.QUESTION_MESSAGE);

        Figura figura = new Figura(numeroFigura);
        figura.verSuperficie();

    }
}