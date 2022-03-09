package com.sofka.TALLER3CICLOS;

public class Pun3 {

    public int cont,espa,contespa,i;
    public String sig, tab;

    public void pun3() {
        cont=0;
        sig=" ";
        espa=12;
        contespa=1;
        tab=" ";
        i=0;

        do {
            do {
                sig=(sig + "*");
                cont=cont+1;
            } while (cont == i);
            do {
                tab=(tab + " ");
                contespa=contespa+1;
            } while (contespa<=espa);
            System.out.println(tab + sig);
            cont=cont-1;
            espa=espa-1;
            contespa=0;
            tab="";
            i=i+1;
        } while (i<=12);

        System.out.println("             ***");
        System.out.println("             ***");
        System.out.println("            *****");
        System.out.println("           *******");
    }
}
