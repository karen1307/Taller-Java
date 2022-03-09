package com.sofka.TALLER3CICLOS;

import java.util.Scanner;

public class Pun4 {

    public int c,n,a;


    public void pun4() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de la tabla de multiplicar");
        n = entrada.nextInt();

        for (a=1; a<=10; a++){
            c=a*n;
            System.out.println(a + " * " + n + " = "+c);
        }
    }
}
