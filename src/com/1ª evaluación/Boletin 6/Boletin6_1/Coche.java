
package boletin6_1;

public class Coche {

    private int velocidade;
    

    public Coche(){
    velocidade=0;
    }
    public int getVelocidade(){
    System.out.println("Velocidad actual es de "+velocidade);
    return velocidade;
    }

    public void acelerar(int valor){
        velocidade=velocidade+valor;
        System.out.println("Incrementa en "+velocidade);
    }
    public void frenar (int menos){
    velocidade=velocidade-menos;
        System.out.println("decrementa en "+velocidade);
    }
    
}

