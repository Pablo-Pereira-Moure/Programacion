package com.Pablopm07.Boletin25;

public abstract class Barco {

    private String matricula;
    private float largo;

    public Barco(String matricula, float largo) {
        this.matricula = matricula;
        this.largo = largo;
    }

    public double modulo(){
        return this.largo * 10;
    }
    public abstract double calularPrecio();

    public String getMatricula() {
        return matricula;
    }

    public float getLargo() {
        return largo;
    }
}
