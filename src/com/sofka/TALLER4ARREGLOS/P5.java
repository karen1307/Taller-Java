package com.sofka.TALLER4ARREGLOS;

import java.util.Scanner;

public class P5 {
    public int fila,columna,a,k,t,f,c;


    public void p5(){
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[10][10];
        a=1;
        System.out.println("                                 Columna");
        System.out.println("Fila    0      1      2      3      4      5      6      7      8       9");
        for (fila=0; fila<=9; fila++){
            k=1;
            for (columna=0; columna<=9; columna++){
                if (columna==0) {
                    System.out.print(" " + fila + "    " + k + " * " + a + " ");
                    t = k * a;
                    matriz[fila][columna] = t;
                    k = k + 1;
                }else {
                    System.out.print(" "+k+" * "+a+" ");
                    t=k*a;
                    matriz[fila][columna] = t;
                    k = k + 1;
                }
            }
            System.out.println(" ");
            a=a+1;
        }
        System.out.println("Ingrese fila");
        f=entrada.nextInt();
        System.out.println("Ingrese columna");
        c=entrada.nextInt();
        System.out.println("Resultado: "+matriz[f][c]);

    }
}
