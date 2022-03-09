package com.sofka.TALLER2CONDICIONALES;

import com.sofka.TALLER2CONDICIONALES.objetos.Tortas;
import java.util.ArrayList;
import java.util.Scanner;

public class Punt8 {


    static Scanner sc = new Scanner(System.in);
    static ArrayList<Tortas> tortas = new ArrayList();
    static int cantidadVentasDiarias = 0;
    static float totalVentasDiarias = 0;
    public void punt8() {
        ingresarPastelesIniciales();
        sc.nextLine();
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    comprarPastel();
                    opcion = mostrarMenu();
                    break;
                case 2:
                    tortasDisponibles();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    if(cantidadVentasDiarias == 0){
                        System.out.println("Aun no se ha hecho ningun pedido");
                    } else {
                        System.out.println("Hoy has vedido: " + cantidadVentasDiarias + " pasteles");
                        System.out.println("Valor total vendido: $" + totalVentasDiarias);
                    }
                    opcion = mostrarMenu();
                    break;
                case 4:
                    ingresarPastel();
                    opcion = mostrarMenu();
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }


    private static int mostrarMenu(){
        int opcionElegida;
        System.out.println("**PASTELERIA APP**");
        System.out.println("1. Registrar Pedido.");
        System.out.println("2. Tortas Disponibles.");
        System.out.println("3. Venta Diaria.");
        System.out.println("4. Ingresar pastel a bd.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }

    public static void tortasDisponibles(){
        for(int i = 0; i< tortas.size(); i++) {
            System.out.println((i + 1) + ". " +"Pastel: " + tortas.get(i).getNombreTorta());
            System.out.println("Caracteristica: " + tortas.get(i).getCaracteristicaTorta());
            System.out.println("Precio del pastel: " + tortas.get(i).getNombreTorta() + " es: $" + tortas.get(i).getPrecioTorta());
            System.out.println("Cantidad de unidades: " + tortas.get(i).getCantidadTortas());
            System.out.println();
        }
        sc.nextLine();
    }

    public static void ingresarPastelesIniciales() {
        String nombrePastel;
        String caracteristica;
        int cantidadUnidadPastel;
        float precioPastel;
        Tortas pastelesIniciales;
        System.out.print("Número de pasteles a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar Pastel a bd.");
            System.out.print("Ingresa sabor del pastel: ");
            nombrePastel = sc.nextLine();
            System.out.print("Ingresa cantidad: ");
            cantidadUnidadPastel = sc.nextInt();
            System.out.print("Ingresa precio del pastel por unidad: ");
            precioPastel = sc.nextFloat();
            sc.nextLine();
            System.out.print("Ingresa caracteristica del pastel (porciones y/o decoraciones): ");
            caracteristica = sc.nextLine();

            pastelesIniciales = new Tortas(nombrePastel, cantidadUnidadPastel, precioPastel, caracteristica);

            //se añade el objeto al final del array
            tortas.add(pastelesIniciales);
        }
    }

    public static void comprarPastel() {
        Tortas ventaDiaria = null;
        int i;
        for(i = 0; i< tortas.size(); i++) {
            System.out.println((i + 1) + ". " +"Pastel: " + tortas.get(i).getNombreTorta());
            System.out.println("Caracteristica: " + tortas.get(i).getCaracteristicaTorta());
            System.out.println("Precio del pastel: " + tortas.get(i).getNombreTorta() + " es: $" + tortas.get(i).getPrecioTorta());
            System.out.println("Cantidad de unidades: " + tortas.get(i).getCantidadTortas());
            System.out.println();
        }
        i ++;
        System.out.println(i + ". No deseo ninguna.");
        System.out.print("Opcion a escoger: ");
        int opcionCompra = sc.nextInt();
        if(i == opcionCompra){
            System.out.println("Lamentamos no tener el sabor que desean, que tengas un feliz día");
        } else {
            for(i = 0; i< tortas.size(); i++) {
                if(tortas.get(i).getCantidadTortas() >=1){
                    if(opcionCompra == (i+1)){
                        System.out.print("Cantidad de unidades a comprar: ");
                        int cantidadAComprar = sc.nextInt();
                        if(cantidadAComprar > tortas.get(i).getCantidadTortas()){
                            System.out.println("Lo sentimos, no se puede realizar la compra de la cantidad seleccionada, intente de nuevo.");
                        } else{
                            tortas.get(i).setCantidadTortas(tortas.get(i).getCantidadTortas() - cantidadAComprar);
                            cantidadVentasDiarias = cantidadVentasDiarias + cantidadAComprar;
                            totalVentasDiarias = totalVentasDiarias + (tortas.get(i).getPrecioTorta() * cantidadAComprar);
                            sc.nextLine();
                            System.out.print("Ingresar tu nombre completo: ");
                            String nombreCompleto = sc.nextLine();
                            System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
                            int numeroDocumento = sc.nextInt();
                            System.out.print("Ingresa tu numero de celular: ");
                            String celular = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Ingresa direccion donde llegarian el producto: ");
                            String direccion = sc.nextLine();
                            System.out.println("Pedido realizado, valor a pagar $" + (tortas.get(i).getPrecioTorta() * cantidadAComprar));
                            System.out.println(nombreCompleto + " con numero de documento: " + numeroDocumento + " y numero celular: " + celular);
                            System.out.println("Se enviará a la siguiente dirección: " + direccion + " su pastel.");
                            System.out.println();
                            System.out.println("Cantidad en bodega del pastel sabor " + tortas.get(i).getNombreTorta() + " es: " + tortas.get(i).getCantidadTortas());
                        }
                    }
                } else {
                    System.out.println("Lo sentimos, en este momento no se encuentra el sabor deseado.");
                }
            }
        }
        sc.nextLine();
    }

    public static void ingresarPastel(){
        Tortas agregarTortas;
        String nombrePastel;
        String caracteristica;
        int cantidadUnidadPastel;
        float precioPastel;

        System.out.println("Sabor ya existe en la bd: ?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int medicamentoExiste = sc.nextInt();
        switch (medicamentoExiste){
            case 1:
                sc.nextLine();
                System.out.print("Ingresa sabor del pastel: ");
                nombrePastel = sc.nextLine();
                int i;
                for(i = 0; i< tortas.size(); i++) {
                    if(tortas.get(i).getNombreTorta().equals(nombrePastel)) {
                        System.out.print("Ingresa cantidad: ");
                        cantidadUnidadPastel = sc.nextInt();
                        tortas.get(i).setCantidadTortas(tortas.get(i).getCantidadTortas() + cantidadUnidadPastel);
                        System.out.println("Cantidad ingresada al sabor sin ninguna novedad");
                        System.out.println("Cantidad por unidad del pastel sabor " + tortas.get(i).getNombreTorta() + " es: " + tortas.get(i).getCantidadTortas());
                    }
                }
                if(i == tortas.size()){System.out.println("No se encontró el medicamento");}
                break;
            case 2:
                sc.nextLine();
                System.out.println("Nuevo sabor");
                System.out.print("Ingresa sabor del pastel: ");
                nombrePastel = sc.nextLine();
                System.out.print("Ingresa cantidad: ");
                cantidadUnidadPastel = sc.nextInt();
                System.out.print("Ingresa precio del pastel por unidad: ");
                precioPastel = sc.nextFloat();
                sc.nextLine();
                System.out.print("Ingresa caracteristica del pastel (porciones y/o decoraciones): ");
                caracteristica = sc.nextLine();
                agregarTortas = new Tortas(nombrePastel, cantidadUnidadPastel, precioPastel, caracteristica);
                tortas.add(agregarTortas);
                System.out.println("Cantidad ingresada al sabor sin ninguna novedad");
                break;
            default:
                System.out.println("Opcion inválida");
                break;
        }
    }
}
