package com.sofka.TALLER4ARREGLOS;

public class P3 {
    public int num,i,cont;


    public void p3(){
        num=1;
        System.out.println("Numeros primos del 1 al 1000");
        while (num<=1000){
            cont=0;
            if (num>=1){
                for (i=1; i<=num; i++){
                    if (num%i==0){
                        cont=cont+1;
                    }
                }
                if (cont==2){
                    System.out.print(num + ", ");
                }
            }
            num=num+1;
        }
        System.out.println("");
    }
}
