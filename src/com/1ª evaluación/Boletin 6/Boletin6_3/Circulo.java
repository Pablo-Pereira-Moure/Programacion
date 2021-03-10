
package boletin6_3;


public class Circulo {

    private double radio,Pi=Math.PI;
 
    public Circulo(){}
    public Circulo(double r){
    radio=r;
    }
  
    public void setRadio(double r){
    radio=r;
    }
    public double getRadio(){
    return radio;
    }
    public void Area(){
    double area=Math.pow(radio,2);
        System.out.println("Area="+area);
    }
    public void calcularLonxitude(){
    double lonxitude=radio*2*Pi;
        System.out.println("A lonxitude da circunferencia es de "+lonxitude);
    }
}