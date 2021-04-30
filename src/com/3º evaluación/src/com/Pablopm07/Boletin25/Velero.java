package com.Pablopm07.Boletin25;

public class Velero extends Barco{

    private int numeroMastil;

    public Velero(String matricula, float largo,  int numeroMastil) {
        super(matricula, largo);
        this.numeroMastil = numeroMastil;
    }


    @Override
    public double modulo() {
        return super.modulo() + (8 * numeroMastil);
    }

    @Override
    public double calularPrecio() {
        return this.modulo();
    }

    @Override
    public String toString() {
        return "Velero";
    }
}
