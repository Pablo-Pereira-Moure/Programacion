/package Boletin8_7;

import javax.swing.JOptionPane;


public class Figura {

    private int numeroFigura;

    public final static double pi = 3.14;
    public Figura() {

    }
    public Figura(int numeroFigura) {
        this.numeroFigura = numeroFigura;

    }
    public void verSuperficie() {
        switch (numeroFigura) {
            case 1:
                JOptionPane.showMessageDialog(null, "A figura elexida e o cadrado");
                float lado = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce o valor do lado"));
                float area = lado*lado;
                JOptionPane.showMessageDialog(null, "A superficie do cadrado e de " + area + " cms");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "A figura elexida e triangiulo");
                float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce a base"));
                float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce a altura"));
                float area2 = base * altura / 2;
                JOptionPane.showMessageDialog(null, "A superficie do cadrado e de " + area2 + " cms");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "A figura elexida e círculo");
                float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce o radio da circunferencia"));
                float area3 = (float) pi * (radio * radio);
                JOptionPane.showMessageDialog(null, "A superficie da circunferencia e de " + area3 + "cms");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Figura incorrecta");
                break;
        }


    }
}