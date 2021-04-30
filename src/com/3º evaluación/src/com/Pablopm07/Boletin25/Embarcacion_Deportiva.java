package com.Pablopm07.Boletin25;

public class Embarcacion_Deportiva extends Barco{

    private double potencia;

    public Embarcacion_Deportiva(String matricula, float largo, double potencia) {
        super(matricula, largo);
        this.potencia = potencia;
    }

    @Override
    public double modulo() {
        return (super.modulo() + (potencia / 2));
    }

    @Override
    public double calularPrecio() {
        return this.modulo();
    }

    @Override
    public String toString() {
        return "Embarcacion Deportiva";
    }
}
