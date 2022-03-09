package com.sofka.TALLER3CICLOS;

public class Pun1 {
    public int a,w;
    public String cadena1;

    public void pun1() {
        for (a = 1; a <= 10; a++) {
            cadena1 = "";
            for (w = 1; w <= a; w++) {
                cadena1 = (cadena1 + "*");
            }
            System.out.println(cadena1);
        }
    }
}
