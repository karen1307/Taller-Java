package com.sofka.TALLER2CONDICIONALES;

import com.sofka.TALLER2CONDICIONALES.objetos.Medicamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Punt5 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Medicamentos> medicamentos = new ArrayList();

    public void punt5() {
        ingresarMedicamentosIniciales();
        sc.nextLine();
        String opcionEscogida = "";
        String nombreMedicamentoMenu;
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    System.out.println("Nuestros medicamentos disponibles, selecciona la que desees comprar: ");
                    comprarMedicamento();
                    opcion = mostrarMenu();
                    break;
                case 2:
                    System.out.println("Consulta de precio por producto: ");
                    mostrarMedicamentos();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Ingresa medicamento a devolver: ");
                    nombreMedicamentoMenu = sc.nextLine();
                    System.out.print("Ingresa motivo de devolucion: ");
                    String motivoDevolucion = sc.nextLine();
                    devolverMedicamento(nombreMedicamentoMenu, motivoDevolucion);
                    opcion = mostrarMenu();
                    break;
                case 4:
                    System.out.println("Ingresar medicamento a bd.");
                    sc.nextLine();
                    ingresarMedicamento();
                    opcion = mostrarMenu();
                    break;
                default: opcionEscogida = "Opción inválida";
                    opcion = mostrarMenu();
                    break;
            }
            System.out.println(opcionEscogida);
        }
        if(opcion == 0){System.out.println("Salida segura");}
    }

    private static int mostrarMenu(){
        int opcionElegida;
        System.out.println("**DROGUERIA APP**");
        System.out.println("1. Comprar medicamento.");
        System.out.println("2. Consultar precios del medicamento.");
        System.out.println("3. Devolver el medicamento.");
        System.out.println("4. Ingresar Medicamento a bd.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }

    public static void mostrarMedicamentos(){
        for(int i = 0; i< medicamentos.size(); i++) {
            System.out.println((i + 1) + ". " +"Nombre del medicamento: " + medicamentos.get(i).getNombreMedicamento());
        }
        sc.nextLine();
        System.out.print("Consultar precio del producto: ");
        String precioMedicamento = sc.nextLine();
        for(int i = 0; i< medicamentos.size(); i++) {
            if(medicamentos.get(i).getNombreMedicamento().equals(precioMedicamento)) {
                System.out.println("Precio del medicamento: " + medicamentos.get(i).getNombreMedicamento() + " es: $" + medicamentos.get(i).getPrecioMedicamento());
            }
        }
        sc.nextLine();
    }

    public static void ingresarMedicamentosIniciales() {
        String nombreMedicamento;
        int cantidadMedicamento;
        float precioMedicamento;
        Medicamentos medicamentosIniciales;
        System.out.print("Número de Medicamentos a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar Medicamento a bd.");
            System.out.print("Ingresa nombre del medicamento: ");
            nombreMedicamento = sc.nextLine();
            System.out.print("Ingresa cantidad: ");
            cantidadMedicamento = sc.nextInt();
            System.out.print("Ingresa precio del medicamento por unidad: ");
            precioMedicamento = sc.nextFloat();
            sc.nextLine(); //limpiar el intro

            medicamentosIniciales = new Medicamentos(nombreMedicamento, cantidadMedicamento, precioMedicamento);

            //se añade el objeto al final del array
            medicamentos.add(medicamentosIniciales);
        }
    }

    public static void devolverMedicamento(String nombreMedicamentoMenu, String motivoDevolucion) {
        int i;
        for(i = 0; i< medicamentos.size(); i++) {
            if(medicamentos.get(i).getNombreMedicamento().equals(nombreMedicamentoMenu)) {
                if(motivoDevolucion.equals("ninguna")) {
                    medicamentos.get(i).setCantidadMedicamento(medicamentos.get(i).getCantidadMedicamento() + 1);
                    System.out.println("Medicamento ingresado a la lista de disponibles sin ninguna novedad, (Cliente se equivocó de medicamento u otro motivo similar)");
                    System.out.println("Cantidad del medicamento " + medicamentos.get(i).getNombreMedicamento() + " es: " + medicamentos.get(i).getCantidadMedicamento());
                } else {
                    System.out.println("Medicamento no fue ingresado a la lista de disponibles por el siguiente motivo: " + motivoDevolucion);
                }
                break;
            }
        }
        if(i == medicamentos.size()){System.out.println("No se encontró el medicamento a devolver");}
    }

    public static void comprarMedicamento() {
        int i;
        for(i = 0; i< medicamentos.size(); i++) {
            System.out.print("No." + (i+1) + ": ");
            System.out.println("Nombre del medicamento: " + medicamentos.get(i).getNombreMedicamento());
            System.out.println("Precio del medicamento: " + medicamentos.get(i).getPrecioMedicamento());
            System.out.println("Cantidad en bodega del medicamento: " + medicamentos.get(i).getCantidadMedicamento());
        }
        i ++;
        System.out.println(i + ". No deseo ninguna.");
        System.out.print("Opcion a escoger: ");
        int opcionCompra = sc.nextInt();
        if(i == opcionCompra){
            System.out.println("Lamentamos no tener la medicina que desean, que tengas un feliz día");
        } else {
            for(i = 0; i< medicamentos.size(); i++) {
                if(medicamentos.get(i).getCantidadMedicamento() >=1){
                    if(opcionCompra == (i+1)){
                        System.out.print("Cantidad de medicamento a comprar: ");
                        int cantidadAComprar = sc.nextInt();
                        medicamentos.get(i).setCantidadMedicamento(medicamentos.get(i).getCantidadMedicamento() - cantidadAComprar);
                        sc.nextLine();
                        System.out.print("Ingresar tu nombre completo: ");
                        String nombreCompleto = sc.nextLine();
                        System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
                        int numeroDocumento = sc.nextInt();
                        System.out.print("Ingresa tu numero de celular: ");
                        String celular = sc.nextLine();
                        sc.nextLine();
                        System.out.print("Ingresa direccion donde llegarian los medicamentos: ");
                        String direccion = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Pedido realizado, valor a pagar $" + (medicamentos.get(i).getPrecioMedicamento() * cantidadAComprar));
                        System.out.println(nombreCompleto + " con numero de documento: " + numeroDocumento + " y numero celular: " + celular);
                        System.out.println("Se enviará a la siguiente dirección: " + direccion + " su medicamento.");
                        System.out.println();
                        System.out.println("Cantidad en bodega del medicamento " + medicamentos.get(i).getNombreMedicamento() + " es: " + medicamentos.get(i).getCantidadMedicamento());
                    }
                } else {
                    System.out.println("Lo sentimos, en este momento no se encuentra la medicina deseada.");
                }
            }
        }
        sc.nextLine();
    }

    public static void ingresarMedicamento(){
        Medicamentos agregarmedicamentos;
        String nombreMedicamentoMenu;
        int cantidadMedicamento;
        float precioMedicamento;

        System.out.println("Medicamento ya existe en la bd: ?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int medicamentoExiste = sc.nextInt();
        switch (medicamentoExiste){
            case 1:
                sc.nextLine();
                System.out.print("Ingresa nombre del medicamento: ");
                nombreMedicamentoMenu = sc.nextLine();
                int i;
                for(i = 0; i< medicamentos.size(); i++) {
                    if(medicamentos.get(i).getNombreMedicamento().equals(nombreMedicamentoMenu)) {
                        System.out.print("Ingresa cantidad: ");
                        cantidadMedicamento = sc.nextInt();
                        medicamentos.get(i).setCantidadMedicamento(medicamentos.get(i).getCantidadMedicamento() + cantidadMedicamento);
                        System.out.println("Cantidad ingresada al medicamento sin ninguna novedad");
                        System.out.println("Cantidad del medicamento " + medicamentos.get(i).getNombreMedicamento() + " es: " + medicamentos.get(i).getCantidadMedicamento());
                    }
                }
                if(i == medicamentos.size()){System.out.println("No se encontró el medicamento");}
                break;
            case 2:
                sc.nextLine();
                System.out.println("Nuevo medicamento");
                System.out.print("Ingresa nombre del medicamento: ");
                nombreMedicamentoMenu = sc.nextLine();
                System.out.print("Ingresa cantidad: ");
                cantidadMedicamento = sc.nextInt();
                System.out.print("Ingresa precio del medicamento por unidad: ");
                precioMedicamento = sc.nextFloat();
                agregarmedicamentos = new Medicamentos(nombreMedicamentoMenu, cantidadMedicamento, precioMedicamento);
                medicamentos.add(agregarmedicamentos);
                System.out.println("Cantidad ingresada al medicamento sin ninguna novedad");
                break;
            default:
                System.out.println("Opcion inválida");
                break;
        }
    }
}
