package com.sofka.TALLER1VARIABLESEIMPRESION;

import java.util.Scanner;

public class Punto4 {

    public String nombreciudad;
    public String capital;

    public void punto4(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el nombre de una ciudad capital");
        nombreciudad = entrada.nextLine();
        System.out.println("Ingresa el pais de la ciudad capital");
        capital = entrada.nextLine();

        System.out.println("La ciudad "+ nombreciudad);
        System.out.println("es la capital del pais " + capital);

    }

}
