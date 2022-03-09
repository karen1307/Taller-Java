package com.sofka.TALLER4ARREGLOS;

import java.util.Scanner;

public class P2 {

    public int nut,i,j;
    public void p2(){
        int[] num = new int[20];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numeros aleatorios");
        for (i=0; i<=19; i++){
            int j = (int)(Math.random()*100+1);
            num[i]=j;
            System.out.print(num[i]+", ");
        }
        i=0;
        System.out.println("");
        System.out.print("Numeros pares ");

        while ( i<=19){
            if(num[i]%2==0){
                System.out.print(num[i]+", ");
            }
            i=i+1;
        }
        i=0;

        System.out.println("");
        System.out.print("Numeros impares ");
        while ( i<=19){
            if(num[i]%2!=0){
                System.out.print(num[i]+", ");
            }
            i=i+1;
        }
        System.out.println("");
    }
}
