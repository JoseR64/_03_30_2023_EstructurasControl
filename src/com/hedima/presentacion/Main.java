package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {

        //Declarar una variable y decir si es un numero positivo o negativo
        //Declarar una variable y decir si es un numero par o impar

        int numero = 101;
        if (numero >= 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
        if (numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
        //
        if (numero>=0 && numero <=100) {
            System.out.println("El numero esta entre 0 y 100");
        }
        else {
            System.out.println("El numero no esta entre 0 y 100");
        }
        // Los articulos raton y teclado tienen el 10% de descuento
        String nombreArticulo="Raton";
        double descuento=0.1, precio=20;
        if (nombreArticulo.equalsIgnoreCase("raton") || nombreArticulo.toLowerCase().equals("teclado")) {
            System.out.println("El descuento es: "+descuento*precio);
        }
        else {
            System.out.println("No tiene descuento");
        }




    }
}