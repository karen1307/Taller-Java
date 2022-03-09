package com.sofka.TALLER1VARIABLESEIMPRESION;

import java.util.Scanner;

public class Punto1 {

    public String nombre;
    public String apellido;

 public void punto1(){
     Scanner entrada = new Scanner(System.in);
     System.out.println("¿Cúal es tu nombre?");
     nombre = entrada.nextLine();
     System.out.println("¿Cúal es tu apellido?");
     apellido = entrada.nextLine();

 }

}
