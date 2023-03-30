package com.hedima.presentacion;

import java.util.Scanner;
public class ProbarSwitch {
    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingrese el estado civil ");
//        String estadoCivil = teclado.next();
//
//        String estadoCivil = "V";
//        switch (estadoCivil.toUpperCase()) {
//            case "S":
//                System.out.println("Soltero");
//                break;
//            case "V":
//                System.out.println("Viudo");
//                break;
//            case "D":
//                System.out.println("Divorciado");
//                break;
//            case "C":
//                System.out.println("Casado");
//                break;
//
//            default:
//                System.out.println("Estado no valido");
//                break;
//        }
//
//    }
    // Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la nota ");
    int nota = teclado.nextInt();

        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("Insuficiente");
            break;
        case 5:
            System.out.println("Suficiente");
            break;
        case 6:
            System.out.println("Bien");
            break;
        case 7,8:
            System.out.println("Notable");
            break;

        case 9,10:
            System.out.println("Sobresaliente");
            break;

        default:
            System.out.println("nota no valida");
            break;
    }


}



}
