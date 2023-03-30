package com.hedima.presentacion;

import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {
        // Declarar variable primitiva
        int numero = 10;
        // Declarar un objeto Scanner
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese un numero->");
//        numero = sc.nextInt();
//        System.out.println("El numero es: "+numero);
//        // Solicitar un nombre, si el nombre es Juan le damos la bienvenida, si no solo damos la bienvenida
//        System.out.println("Ingrese su nombre->");
//        String nombre = sc.next();
//        if(nombre.equalsIgnoreCase("Juan")){
//            System.out.println("Bienvenido "+nombre);
//        }
//        else {
//            System.out.println("Bienvenido ");
//        }

//        System.out.println("Ingrese numero 1->");
//        int n1 = sc.nextInt();
//        System.out.println("Ingrese numero 2->");
//        int n2 = sc.nextInt();
//        if (n1 == n2) {
//            System.out.println(n1+" es igual a "+n2);
//        } else {
//            System.out.println(n1+" NO es igual a "+n2);
//        }

        // Pedir dos números y decir cual es el mayor.
//        System.out.println("Ingrese numero 1->");
//        n1 = sc.nextInt();
//        System.out.println("Ingrese numero 2->");
//        n2 = sc.nextInt();
//        if (n1 > n2) {
//            System.out.println(n1+" es mayor que "+n2);
//        }
//        if (n2>n1) {
//            System.out.println(n2+" es mayor que "+n1);
//        }

//        System.out.println("Ingrese numero 1->");
//        int n1 = sc.nextInt();
//        System.out.println("Ingrese numero 2->");
//        int n2 = sc.nextInt();
//        if (n1 == n2) {
//            System.out.println(n1+" es igual que "+n2);
//        } else if (n1>n2) {
//            System.out.println(n1+" es mayor que "+n2);
//        } else {
//            System.out.println(n1+" es menor que "+n2);
//        }
        // Pedir dos números y mostrarlos ordenados de mayor a menor.
        System.out.println("Ingrese numero 1->");
        int n1 = sc.nextInt();
        System.out.println("Ingrese numero 2->");
        int n2 = sc.nextInt();
        if (n1==n2) {
            System.out.println(n1+" / "+n2);
        } else if (n1>n2) {
            System.out.println(n1+" / "+n2);
        } else {
            System.out.println(n2+" / "+n1);
        }
    }
}
