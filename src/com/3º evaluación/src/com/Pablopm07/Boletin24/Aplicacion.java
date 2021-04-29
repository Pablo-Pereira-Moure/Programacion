package com.Pablopm07.Boletin24;

public class Aplicacion {

    public static void main(String[] args){
        Uno obj1 = new Uno();
        Dos obj2 = new Dos();
        Tres obj3 = new Tres();
        Cuatro obj4 = new Cuatro();

        System.out.println("obj1.test = "+ obj1.test());

        System.out.println("obj1.result1 = " + obj1.result1());

        System.out.println("obj2.test = "+obj2.test());

        System.out.println("obj2.result1 = "+obj3.result1());

        System.out.println("obj3.test = " +obj3.test());

        System.out.println("obj4.result1 = "+obj4.result1());

        System.out.println("obj3.result2 = " +obj3.result2());

        System.out.println("obj4.result2 = " +obj4.result2());

        System.out.println("obj3.result3 = " +obj3.result3());

        System.out.println("obj4.result3 = " +obj4.result3());
    }
}