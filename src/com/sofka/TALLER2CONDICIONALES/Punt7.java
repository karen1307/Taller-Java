package com.sofka.TALLER2CONDICIONALES;

import com.sofka.TALLER2CONDICIONALES.objetos.PersonaMasaCorporal;

import java.util.Scanner;

public class Punt7 {
    static Scanner sc = new Scanner(System.in);

    public void punt7() {
        PersonaMasaCorporal persona;
        String nombrecompleto;
        int documento;
        double peso, estatura, IMC;

        System.out.print("Ingresa tu nombre completo: ");
        nombrecompleto = sc.nextLine();
        System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
        documento = sc.nextInt();
        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = sc.nextDouble();
        System.out.print("Ingresa tu estatura en metros: ");
        estatura = sc.nextDouble();
        IMC= peso/(Math.pow(estatura,2));
        persona = new PersonaMasaCorporal(nombrecompleto, documento, peso, estatura, IMC);
        resultadoRango(persona.getIMC(), persona);
    }

    public static void resultadoRango(double IMC, PersonaMasaCorporal persona){
        if (IMC <= 18.5) {
            System.out.println(persona.getNombrecompleto() + " con Documento numero: " + persona.getDocumento() + " su peso es de " + persona.getPeso() + " kg y su estatura es de " + persona.getEstatura() + " metros su índice de masa corparal arroja que se encuntra bajo de peso");
        } else {
            if (IMC > 18.5 && IMC <= 24.99) {
                System.out.println(persona.getNombrecompleto() + " con Documento numero: " + persona.getDocumento() + " su peso es de " + persona.getPeso() + " kg y su estatura es de " + persona.getEstatura() + " metros suíndice de masa corparal arroja que se encuntra en un peso normal");
            } else {
                if (IMC >= 25.0 && IMC <= 29.99) {
                    System.out.println(persona.getNombrecompleto() + " con Documento numero: " + persona.getDocumento() + " su peso es de " + persona.getPeso() + " kg y su estatura es de " + persona.getEstatura() + " metros su índice de masa corparal arroja que se encuntra en sobre peso");
                } else {
                    System.out.println(persona.getNombrecompleto() + " con Documento numero: " + persona.getDocumento() + " su peso es de " + persona.getPeso() + " kg y su estatura es de " + persona.getEstatura() + " metros su índice de masa corparal arroja que tiene obesidad");
                }
            }
        }
    }
}
