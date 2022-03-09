package com.sofka.TALLER1VARIABLESEIMPRESION;

import java.util.Scanner;

public class Punto2 {


    public String nombre;
    public String apellido;
    public int edad;
    public float estatura;

    public void punto2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cúal es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println("¿Cúal es tu apellido?");
        apellido = entrada.nextLine();
        System.out.println("¿Qué edad tienes?");
        edad = entrada.nextInt();
        System.out.println("¿Cúal es tu estatura en metros ?");
         estatura = entrada.nextFloat();
    }

}

