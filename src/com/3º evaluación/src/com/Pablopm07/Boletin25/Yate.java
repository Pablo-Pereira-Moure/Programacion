package com.Pablopm07.Boletin25;

public class Yate extends Barco{

    private int numeroCamarotes;
    private double potencia;

    public Yate(String matricula, float largo, int numeroCamarotes, double potencia) {
        super(matricula, largo);
        this.numeroCamarotes = numeroCamarotes;
        this.potencia = potencia;
    }

    @Override
    public double modulo() {
        return (super.modulo() + (potencia / 2 + numeroCamarotes / 25));
    }

    @Override
    public double calularPrecio() {
        return this.modulo();
    }

    @Override
    public String toString() {
        return "Yate";
    }
}
