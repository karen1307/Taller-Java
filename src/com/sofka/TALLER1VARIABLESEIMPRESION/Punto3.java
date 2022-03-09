package com.sofka.TALLER1VARIABLESEIMPRESION;

import java.util.Scanner;

public class Punto3 {

    public String nombre,nombremadre,nombrepadre;
    public String apellido,apellidomadre,apellidopadre;

    public void punto3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cúal es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println("¿Cúal es tu apellido?");
        apellido = entrada.nextLine();
        System.out.println("¿Cúal es el nombre de tu madre?");
        nombremadre = entrada.nextLine();
        System.out.println("¿Cúal es el apellido de tu madre?");
        apellidomadre = entrada.nextLine();
        System.out.println("¿Cúal es el nombre de tu padre?");
        nombrepadre = entrada.nextLine();
        System.out.println("¿Cúal es el apellido de tu padre");
        apellidopadre = entrada.nextLine();

        System.out.println("Yo "+ nombre + " " + apellido);
        System.out.println("soy hijo de "+ nombremadre + " " + apellidomadre);
        System.out.println("y "+ nombrepadre + " " + apellidopadre);

    }

}
