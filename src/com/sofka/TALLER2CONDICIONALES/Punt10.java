package com.sofka.TALLER2CONDICIONALES;

import com.sofka.TALLER2CONDICIONALES.objetos.UsuarioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Punt10 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<UsuarioBanco> usuario = new ArrayList();
    public void punt10() {
        ingresarUsuariosIniciales();
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    ingresarDinero();
                    opcion = mostrarMenu();
                    break;
                case 2:
                    retirarDinero();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    consultarSaldo();
                    opcion = mostrarMenu();
                    break;
                case 4:
                    registrarUsuario();
                    opcion = mostrarMenu();
                    break;
                default:
                    System.out.println("Opción inválida");
                    opcion = mostrarMenu();
                    break;
            }
        }

    }

    private static void registrarUsuario() {
        String nombre;
        float saldo = 0;
        int documento, cuenta;
        UsuarioBanco usuarioNuevo;
        sc.nextLine();
        System.out.println("REGISTRO BANCO FIEL.");
        System.out.print("Ingresar tu nombre completo: ");
        nombre = sc.nextLine();
        System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
        documento = sc.nextInt();
        System.out.print("Ingresa tu numero de cuenta sin puntos ni comas: ");
        cuenta = sc.nextInt();
        sc.nextLine();
        usuarioNuevo = new UsuarioBanco(nombre, saldo,documento, cuenta);

        //se añade el objeto al final del array
        usuario.add(usuarioNuevo);
    }

    private static void retirarDinero() {
        int i;
        sc.nextLine();
        System.out.print("Ingresa numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        for(i = 0; i< usuario.size(); i++) {
            if(usuario.get(i).getCuenta() == numeroCuenta) {
                System.out.print("Ingrese el valor a retirar: ");
                float valorIngresado = sc.nextFloat();
                if (valorIngresado > usuario.get(i).getSaldo()){
                    System.out.println("Valor ingresado mayor a saldo actual, no se pudo realizar transaccion");
                } else {
                    if (valorIngresado < 0){
                        System.out.println("No es permitido ingresar valores negativos. ");
                    } else {
                        usuario.get(i).setSaldo(usuario.get(i).getSaldo() - valorIngresado);
                        System.out.println("Señor: " + usuario.get(i).getNombre());
                        System.out.println("la cantidad de: $" + valorIngresado + " fue retirado correctamente a su cuenta");
                        System.out.println("Su saldo actual es: $" + usuario.get(i).getSaldo());
                    }
                }
                break;
            }
        }
        if(i == usuario.size()){System.out.println("No se encontró la cuenta del usuario");}
        sc.nextLine();
    }

    private static void consultarSaldo(){
        int i;
        sc.nextLine();
        System.out.print("Ingresa numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        for(i = 0; i< usuario.size(); i++) {
            if(usuario.get(i).getCuenta() == numeroCuenta) {
                System.out.println("Señor: " + usuario.get(i).getNombre() + " su saldo actual es de: $" + usuario.get(i).getSaldo());
                break;
            }
        }
        if(i == usuario.size()){System.out.println("No se encontró la cuenta del usuario");}
        sc.nextLine();
    }

    private static void ingresarDinero(){
        int i;
        sc.nextLine();
        System.out.print("Ingresa numero de cuenta: ");
        int numeroCuenta = sc.nextInt();
        for(i = 0; i< usuario.size(); i++) {
            if(usuario.get(i).getCuenta() == numeroCuenta) {
                System.out.print("Ingrese el valor a ingresar: ");
                float valorIngresado = sc.nextFloat();
                if (valorIngresado < 0){
                    System.out.println("No es permitido ingresar valores negativos. ");
                } else {
                    usuario.get(i).setSaldo(usuario.get(i).getSaldo() + valorIngresado);
                    System.out.println("Señor: " + usuario.get(i).getNombre());
                    System.out.println("la cantidad de: $" + valorIngresado + " fue ingresado correctamente a su cuenta");
                    System.out.println("Su saldo actual es: $" + usuario.get(i).getSaldo());
                }
                break;
            }
        }
        if(i == usuario.size()){System.out.println("No se encontró la cuenta del usuario");}
        sc.nextLine();
    }

    private static void ingresarUsuariosIniciales() {
        String nombre;
        float saldo = 0;
        int documento, cuenta;
        UsuarioBanco usuarioInicial;
        System.out.print("Número de usuarios a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("REGISTRO BANCO FIEL.");
            System.out.print("Ingresar tu nombre completo: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
            documento = sc.nextInt();
            System.out.print("Ingresa tu numero de cuenta sin puntos ni comas: ");
            cuenta = sc.nextInt();
            sc.nextLine();
            usuarioInicial = new UsuarioBanco(nombre, saldo,documento, cuenta);

            //se añade el objeto al final del array
            usuario.add(usuarioInicial);
        }
    }

    private static int mostrarMenu() {
        int opcionElegida;
        System.out.println("**BANCO FIEL APP**");
        System.out.println("1. Ingresar dinero a la cuenta.");
        System.out.println("2. Retirar dinero de la cuenta.");
        System.out.println("3. Consultar saldo.");
        System.out.println("4. Registrar usuario al Banco Fiel.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }
}
