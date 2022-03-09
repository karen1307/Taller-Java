package com.sofka.TALLER2CONDICIONALES;

import com.sofka.TALLER2CONDICIONALES.objetos.ClienteMoto;

import java.util.Scanner;

public class Punt6 {

    static boolean bandera1 = false;
    static boolean bandera2 = false;

    static Scanner sc = new Scanner(System.in);
    public void punt6() {
        ClienteMoto infoCliente = null;
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    infoCliente = ingresarMotocicleta();
                    opcion = mostrarMenu();
                    break;
                case 2:
                    if (bandera1){
                        System.out.println("La moto fue asignada al mecanico " + infoCliente.getNombreMecanico() + " y tiene las siguentes observacion por parte del dueño: " + infoCliente.getObservacionesIngreso());
                    } else {
                        System.out.println("No se a ingresado ninguna moto");
                    }
                    opcion = mostrarMenu();
                    break;
                case 3:
                    if (bandera1){
                        System.out.println("Nombres del mecanico al cual fue asignada la moto: " + infoCliente.getNombreMecanico());
                        sc.nextLine();
                        System.out.print("observacion salida de la moto, incluir piesas que se cambiaron: ");
                        String observacionesdesalida = sc.nextLine();
                        infoCliente.setObservacionesSalida(observacionesdesalida);
                        bandera1 = false;
                        bandera2 = true;
                    }else {
                        System.out.println("No se a ingresado ninguna moto");
                    }
                    opcion = mostrarMenu();
                    break;
                case 4:
                    if (bandera2){
                        System.out.println("El mecanico " + infoCliente.getNombreMecanico() + " dejo las siguente observaciones entre ellas las piezas que cambio: " + infoCliente.getObservacionesSalida());
                    } else {
                        System.out.println("La moto no se le ha realizado registro de salida");
                    }
                    opcion = mostrarMenu();
                    break;
                default:
                    System.out.println("La opción elegida no existe");
            }
        }
        if(opcion == 0){
            System.out.println("Muchas gracias por su cofianza cuando este reparada la moto nos comunicamos con usted");
            System.out.println("Salida segura");
        }
    }

    public static int mostrarMenu(){
        int opcionMenu;
        System.out.println("Elije una opción");
        System.out.println("1. Ingresar Motoclicleta ");
        System.out.println("2. Ver observacions de ingreso ");
        System.out.println("3. Registrar salida de la moto");
        System.out.println("4. Ver observaciones de salida");
        System.out.println("0. Salir.");
        return opcionMenu = sc.nextInt();
    }

    public static ClienteMoto ingresarMotocicleta(){
        ClienteMoto clienteMoto;
        sc.nextLine();
        System.out.println("1. Ingresar Motoclicleta ");
        System.out.print("Ingresar tu nombre completo: ");
        String nombreDuenio = sc.nextLine();
        System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
        int documento = sc.nextInt();
        System.out.print("Ingresa tu numero de celular: ");
        String celular = sc.nextLine();
        sc.nextLine();
        System.out.print("Ingresa marca de la moto: ");
        String marca = sc.nextLine();
        System.out.print("Ingresa cilindraje de la moto: ");
        int cilindraje = sc.nextInt();
        sc.nextLine();
        System.out.print("Observacion de ingreso de la moto: ");
        String observacionesIngreso = sc.nextLine();
        System.out.print("Nombres del mecanico al cual se le fue asignada la moto: ");
        String nombreMecanico = sc.nextLine();
        bandera1 = true;
        System.out.println("La moto ha sido ingresada");
        return clienteMoto = new ClienteMoto(nombreDuenio, documento, celular, marca, cilindraje, observacionesIngreso, nombreMecanico);
    }

}
