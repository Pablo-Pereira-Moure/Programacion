
package boletin9_3;

public class Boletin9_3 {

  
    public static void main(String[] args) {
        Validacion rectangulo1 = new Validacion();
        Validacion rectangulo = Validacion.getInstance();
        rectangulo.pedirDatos();
        rectangulo.validar(rectangulo);
        Validacion rectangulo2= Validacion.getInstance();
        rectangulo2.pedirDatos();
        rectangulo2.validar(rectangulo2);
        System.out.println(rectangulo);
    }
}
