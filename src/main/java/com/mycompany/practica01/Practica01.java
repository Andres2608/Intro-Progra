package com.mycompany.practica01;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ///////////////////////////////////
       // ejercicio 1
        int numero;
        int mes;
        String enero;
        String mesLectura;

        String numeroLectura = JOptionPane.showInputDialog("Ingrese un número del 1 al 12");
        numero = Integer.parseInt(numeroLectura);

       /// mes = Integer.parseInt(mesLectura);

        if (numero == 1) {

        }

        ////////////////////////////////////////
        // ejercicio 2
        int edad;

        String edadLectura = JOptionPane.showInputDialog("Ingrese su edad en numeros enteros"); //
        edad = Integer.parseInt(edadLectura);

        if (edad <= 5) {
            System.out.println("Primera Infancia");
        }

        if (edad >= 6 && edad == 11) {
            System.out.println("Infancia");
        }

        if (edad >= 12 && edad == 18) {
            System.out.println("Adolescencia");
        }

        if (edad >= 19 && edad == 30) {
            System.out.println("Juventud");
        }

        if (edad >= 31 && edad == 59) {
            System.out.println("Adultez");
        }

        if (edad >= 60) {
            System.out.println("Adulto Mayor");
        }

    }

}
