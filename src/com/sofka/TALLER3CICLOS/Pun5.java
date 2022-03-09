package com.sofka.TALLER3CICLOS;

import java.util.Scanner;

public class Pun5 {

    public String nombre;
    public int opcion;
    public boolean salir, captura;

    public void pun5() {

        captura=false;
        salir=false;

        while (salir==false){
            menu();
            opcion=capturarOpcion();
            salir=evaluarOpcion1(opcion);
        }

    }

    private void menu(){
        System.out.println("Elija una opcion");
        System.out.println("1. Ingresa nombre");
        System.out.println("2. Saludar");
        System.out.println("3. salir del sistema");

    }

    private int capturarOpcion(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    private boolean evaluarOpcion1(int opcion){
        Scanner entrada = new Scanner(System.in);
        switch (opcion) {
            case 1:
                menu();
                System.out.println("¿Cómo te llamas?");
                nombre=entrada.nextLine();
                captura=true;
                return false;
            case 2:
                if (captura==true) {
                    System.out.println("Hola "+ nombre);
                } else {
                    System.out.println("Para saludar debes primero ingresar tu nombre");
                }
                return false;
            case 3:
                System.out.println("Hasta luego");
                return true;
            }
        return false;
    }



}
