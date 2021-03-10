package boletin9_3;

import javax.swing.JOptionPane;

public class Validacion {
     private float base;
   
    private float altura;

    
    private static Validacion instance=null;

    Validacion(){
    }

    public static Validacion getInstance(){
        if (instance==null){
            instance = new Validacion();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Validacion{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public void pedirDatos() {
        base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la base del rectángulo en cms "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la altura del rectángulo en cms"));

    }

   

    public void validar(Validacion rectangulo) {
        do {
            if (base <= 0 || altura <= 0) {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos, los valores tienen que se positivos");
                rectangulo.pedirDatos();

            }
        }
        while (base <= 0 || altura <= 0);
        float area = base * altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es de " + area + " cms");
    }
}