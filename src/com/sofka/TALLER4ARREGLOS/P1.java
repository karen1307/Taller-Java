package com.sofka.TALLER4ARREGLOS;

import java.util.Scanner;

public class P1 {
        public int nut,i;
    public void p1(){
        int[] num = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i <= 4; i++){
            System.out.println("Ingrese un número");
            num[i]=nut=entrada.nextInt();
        }
        i=0;
        while (i<=4){
            System.out.println("["+i+"]"+" = "+ num[i]);
            i=i+1;
        }


    }
}
