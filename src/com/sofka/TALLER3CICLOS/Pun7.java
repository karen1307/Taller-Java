package com.sofka.TALLER3CICLOS;

import com.sofka.TALLER3CICLOS.objetos3.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Pun7 {

    static Scanner sc=new Scanner(System.in);
    // //Se crea un ArrayList para guardar objetos de tipo Contacto.
    static ArrayList<Vehiculo> vehiculos=new ArrayList();
    static int vehiculo=0;
    public void pun7(){
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    if (vehiculo==5) {
                        System.out.println("Capacidad maxima de 5 vehículos completa");
                    }else{
                        ingresarVehiculo();
                        vehiculo++;
                        opcion = mostrarMenu();
                    }
                    break;
                case 2:
                    consultarplaca();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    retirarVehiculo();
                    opcion = mostrarMenu();
                    break;
                default:
                    System.out.println("Opción inválida");
                    opcion = mostrarMenu();
                    break;
            }
        }
    }

    private static void retirarVehiculo(){
        int i;
        boolean bandera2=true;
        sc.nextLine();
        System.out.print("Ingresa la placa del vehículo que desea retirar : ");
        String placa = sc.nextLine();
        for(i = 0; i< vehiculos.size(); i++) {
            if(vehiculos.get(i).getPlaca().equals(placa)) {
                vehiculos.remove(i);
                System.out.println("El vehículo ha sido retirado");
                bandera2=false;
                break;
            }
        }
        if(bandera2){System.out.println("vehículo no registrado");}
        sc.nextLine();
    }

    private static void consultarplaca(){
        int i;
        sc.nextLine();
        System.out.print("Ingresa la placa de vehiculo que desea consultar: ");
        String placa = sc.nextLine();
        for(i = 0; i< vehiculos.size(); i++) {
            if(vehiculos.get(i).getPlaca().equals(placa)) {
                System.out.println("Nombre del contacto " + vehiculos.get(i).getNombre() + " telefono: "+ vehiculos.get(i).getTel()+" placa: "+vehiculos.get(i).getPlaca()+" marca: " + vehiculos.get(i).getMarca());
                break;
            }
        }
        if(i == vehiculos.size()){System.out.println("Vehículo no registrado");}
        sc.nextLine();
    }

    private static void ingresarVehiculo() {
        String nombre;
        String placa;
        String tel;
        String marca;
        boolean bandera3=true;
        Vehiculo usuarioInicial;
        sc.nextLine();
        System.out.println("Ingresar Vehículo.");
        System.out.print("Ingresa la Placa del Vehículo ");
        placa = sc.nextLine();
        for(int i = 0; i< vehiculos.size(); i++) {
            if(vehiculos.get(i).getPlaca().equals(placa)) {
                System.out.println("EL vehículo ingresado ya se encuentra registrado.");
                bandera3=false;
                break;
            }
        }
        if (bandera3){
            sc.nextLine();
            System.out.print("Ingresar tu nombre completo: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa tu telefono: ");
            tel = sc.nextLine();
            System.out.print("Ingresa la marca del vehículo: ");
            marca = sc.nextLine();
            sc.nextLine();
            usuarioInicial = new Vehiculo(nombre,placa,tel,marca);

            //se añade el objeto al final del array
            vehiculos.add(usuarioInicial);
        }

    }
    private static int mostrarMenu(){
        int opcionElegida;
        System.out.println("Elije una opción");
        System.out.println("1. Ingresar Vehículo");
        System.out.println("2. Buscar Vehículo");
        System.out.println("3. Retirar Vehículo.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }


}
