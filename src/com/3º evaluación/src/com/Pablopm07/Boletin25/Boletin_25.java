package com.Pablopm07.Boletin25;

import java.util.ArrayList;

public class Boletin_25 {

    public static void main(String[] args){

        ArrayList<Barco> listaBarcos = new ArrayList<>();
        Barco velero = new Velero("ADTFRG", 30, 2);
        Barco motor = new Embarcacion_Deportiva("BDTFRG", 50, 70);
        Barco yate = new Yate("CDTFRG", 70, 80, 150);
        listaBarcos.add(velero);
        listaBarcos.add(motor);
        listaBarcos.add(yate);

        for (Barco bar:listaBarcos){
            System.out.println(bar);
            System.out.println("Factura: \n  Matricula = " + bar.getMatricula() + "\t Longitud = " + bar.getLargo() + "\t Precio de alquiler = " + bar.calularPrecio());
        }

    }
}
