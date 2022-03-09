package com.sofka.TALLER2CONDICIONALES;

import java.util.Scanner;
import com.sofka.TALLER2CONDICIONALES.objetos.Persona;

public class Punt3 {

    public void punt3() {
        Persona persona;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombres = sc.nextLine();
        System.out.print("Ingresa tu apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        persona = new Persona(nombres,apellidos,edad);


        System.out.println(persona.getNombres() + " " + persona.getApellidos() + " " + calcularEdad(persona.getEdad()));
    }

    public static String calcularEdad(int edad){
        String respuesta = (edad < 18) ? "usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa."
                : "usted es mayor de edad, por lo tanto puede entrar a la fiesta.";
        return respuesta;
    }
}
