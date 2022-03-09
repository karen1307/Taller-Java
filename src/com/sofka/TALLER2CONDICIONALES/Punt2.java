package com.sofka.TALLER2CONDICIONALES;

import java.util.Scanner;

public class Punt2 {

    public void punt2() {

        Scanner sc = new Scanner(System.in);
        int edad = 0;
        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();
        calcularEdad(edad);
    }

    public static void calcularEdad(int edad){
        if(edad < 18) {
            System.out.println("Usted aún es un niño(a).");
        }
    }

}
