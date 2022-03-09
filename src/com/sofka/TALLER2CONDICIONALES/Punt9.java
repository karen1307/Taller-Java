package com.sofka.TALLER2CONDICIONALES;

import java.util.Scanner;

public class Punt9 {

    static Scanner sc = new Scanner(System.in);

    public void punt9() {
        float resultado, base1,base2,altura;
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    System.out.print("Ingresa la base del rectángulo: ");
                    base1 = sc.nextFloat();
                    System.out.print("Ingresa la altura del rectángulo: ");
                    altura = sc.nextFloat();
                    resultado = base1*altura;
                    System.out.print("El área del rectángulo es: " + resultado);
                    sc.nextLine();
                    opcion = mostrarMenu();
                    break;
                case 2:
                    System.out.print("Ingrasa la base del triángulo: ");
                    base1 = sc.nextFloat();
                    System.out.print("Ingresa la altura del triángulo: ");
                    altura = sc.nextFloat();
                    resultado = (base1*altura)/2;
                    System.out.println("El área del triángulo es: " + resultado);
                    sc.nextLine();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    System.out.print("Ingrasa la base1 del trapecio: ");
                    base1 = sc.nextFloat();
                    System.out.print("Ingrasa la base2 del trapecio: ");
                    base2 = sc.nextFloat();
                    System.out.print("Ingresa la altura del trapecio: ");
                    altura = sc.nextFloat();
                    resultado = ((base1+base2)*altura)/2;
                    System.out.println("El área del trapecio es: " + resultado);
                    sc.nextLine();
                    opcion = mostrarMenu();
                    break;
                default:
                    System.out.println("La opción elegida no existe");
                    sc.nextLine();
                    opcion = mostrarMenu();
                    break;
            }
        }
        if(opcion == 0){System.out.println("Salida segura");}
    }

    private static int mostrarMenu(){
        int opcionElegida;
        System.out.println("**CALCULCAR AREA APP**");
        System.out.println("Elije el area que deseas calcular");
        System.out.println("1. Rectángulo.");
        System.out.println("2. Triángulo.");
        System.out.println("3. Trapecio.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }
}
