package com.sofka.TALLER3CICLOS;

public class Pun2 {
    public int a,b,c,n;
    public String cadena1,cadena2;


    public void pun2() {
        a=1;
        b=10;
        while (a<=10){
          c=1;
          cadena1="";
          cadena2="";
          while (c<b){
              cadena2=(cadena2 + " ");
              c=c+1;
          }
          c=1;
          while (c<=a){
              cadena1=(cadena1 + "*");
              c=c+1;
          }
            System.out.println(cadena2+cadena1);
          a=a+1;
          b=b-1;

        }

    }

}
