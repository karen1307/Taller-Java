package com.sofka.TALLER1VARIABLESEIMPRESION;

import java.util.Scanner;

public class Punto5 {

    public String nombremascota,tipodemascota,nombrecompleto;
    public int edadmascota;


    public void punto5() {
        Scanner entrada = new Scanner(System.in);
        entrada.nextLine();
        System.out.println("¿Cúal es el nombre de tu mascota?");
        nombremascota = entrada.nextLine();
        System.out.println("¿Cuantos años tiene tu mascota?");
        edadmascota = entrada.nextInt();
        System.out.println("¿Que tipo de mascotas tienes?");
        tipodemascota = entrada.nextLine();
        System.out.println("¿Cúal es tu nombre completo?");
        nombrecompleto = entrada.nextLine();




        System.out.println(nombremascota + " es un(a) " + tipodemascota);
        System.out.println("el cual, tiene "+ edadmascota+ " años de edad");
        System.out.println(" y " + nombrecompleto + " es actualmente su dueño(a)");
    }



}
