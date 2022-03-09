package com.sofka.TALLER2CONDICIONALES;

import com.sofka.TALLER2CONDICIONALES.objetos.Peliculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Punt4 {

    static Scanner sc = new Scanner(System.in);
    //Se crea un ArrayList para guardar objetos de tipo Peliculas.
    static ArrayList<Peliculas> peliculas = new ArrayList();

    public void punt4() {
        ingresarPeliculasIniciales();
        sc.nextLine();
        Peliculas agregarPelicula;
        String opcionEscogida = "";
        String nombrePeliculaMenu;
        String novedadPeli;
        int cantidadPelicula = 0;
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    System.out.println("Nuestras peliculas disponibles, selecciona la que desees alquilar: ");
                    alquilarPeliculas();
                    opcion = mostrarMenu();
                    break;
                case 2:
                    System.out.println("Peliculas diponibles: ");
                    mostrarPeliculas();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Ingresa pelicula a devolver: ");
                    nombrePeliculaMenu = sc.nextLine();
                    System.out.print("Ingresa alguna novedad presenta la pelicula: ");
                    novedadPeli = sc.nextLine();
                    devolverPelicula(nombrePeliculaMenu, novedadPeli);
                    opcion = mostrarMenu();
                    break;
                case 4:
                    System.out.println("Ingresar Pelicula a bd.");
                    sc.nextLine();
                    System.out.print("Ingresa nombre de la pelicula: ");
                    nombrePeliculaMenu = sc.nextLine();
                    System.out.print("Ingresa cantidad de copias: ");
                    cantidadPelicula = sc.nextInt();
                    agregarPelicula = new Peliculas(nombrePeliculaMenu, cantidadPelicula);
                    peliculas.add(agregarPelicula);
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
        System.out.println("**VIDEO TIENDA APP**");
        System.out.println("1. Alquilar pelicula.");
        System.out.println("2. Consultar peliculas disponibles.");
        System.out.println("3. Recibir pelicula.");
        System.out.println("4. Ingresar Pelicula a bd.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }

    public static void ingresarPeliculasIniciales() {
        //Declaración de variables para leer los datos de la info de peliculas
        String nombrePelicula;
        int cantidadPelicula;
        Peliculas peliculasIniciales;
        System.out.print("Número de peliculas a ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        //lectura de N peliculas
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar Pelicula a bd.");
            System.out.print("Ingresa nombre de la pelicula: ");
            nombrePelicula = sc.nextLine();
            System.out.print("Ingresa cantidad de copias: ");
            cantidadPelicula = sc.nextInt();
            sc.nextLine(); //limpiar el intro

            peliculasIniciales = new Peliculas(nombrePelicula, cantidadPelicula); //Se crea un objeto Peliculas

            //se añade el objeto al final del array
            peliculas.add(peliculasIniciales);
        }
    }

    public static void mostrarPeliculas(){
        for(int i = 0; i< peliculas.size(); i++) {
            System.out.println("No." + (i+1));
            System.out.println("Nombre pelicula: " + peliculas.get(i).getNombrePelicula());
            System.out.println("Numero de copias: " + peliculas.get(i).getCantidadPelicula());
        }
        sc.nextLine(); //limpiar el intro
    }

    public static void devolverPelicula(String nombrePelicula, String novedad) {
        int i;
        for(i = 0; i< peliculas.size(); i++) {
            if(peliculas.get(i).getNombrePelicula().equals(nombrePelicula)) {
                if(novedad.equals("ninguna")) {
                    peliculas.get(i).setCantidadPelicula(peliculas.get(i).getCantidadPelicula() + 1);
                    System.out.println("Pelicula ingresada a la lista de disponibles sin ninguna novedad");
                    System.out.println("Total de copias de la pelicula " + peliculas.get(i).getNombrePelicula() + " es: " + peliculas.get(i).getCantidadPelicula());
                } else {
                    System.out.println("Pelicula no fue ingresada a la lista de disponibles por la siguiente novedad: " + novedad);
                }
                break;
            }
        }
        if(i == peliculas.size()){System.out.println("No se encontro la pelicula a devolver");}
    }

    public static void alquilarPeliculas() {
        int i;
        for(i = 0; i< peliculas.size(); i++) {
            System.out.println("No." + (i+1));
            System.out.println("Nombre pelicula: " + peliculas.get(i).getNombrePelicula());
            System.out.println("Numero de copias: " + peliculas.get(i).getCantidadPelicula());
        }
        i ++;
        System.out.println(i + ". No deseo ninguna.");
        System.out.print("Opcion a escoger: ");
        int opcionAlquiler = sc.nextInt();
        if(i == opcionAlquiler){
            System.out.println("Lamentamos no tener la pelicula que desean, que tengas un feliz día");
        } else {
            for(i = 0; i< peliculas.size(); i++) {
                if(peliculas.get(i).getCantidadPelicula() >=1){
                    if(opcionAlquiler == (i+1)){
                        peliculas.get(i).setCantidadPelicula(peliculas.get(i).getCantidadPelicula() - 1);
                        sc.nextLine();
                        System.out.print("Ingresar tu nombre completo: ");
                        String nombreCompleto = sc.nextLine();
                        System.out.print("Ingresa tu numero de documento sin puntos ni comas: ");
                        int numeroDocumento = sc.nextInt();
                        System.out.print("Ingresa tu numero de celular: ");
                        String celular = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Apartir de este momento "+ nombreCompleto + " con numero de documento: " + numeroDocumento + " y numero celular: " + celular);
                        System.out.println("puedes reclamar la pelicula en nuetra video tienda, recuerda que debes dejar un deposito de $20.000 por si la pelicula presenta algun daño");
                        System.out.println("Total de copias de la pelicula " + peliculas.get(i).getNombrePelicula() + " es: " + peliculas.get(i).getCantidadPelicula());
                    }
                } else {
                    System.out.println("Lo sentimos, en este momento no se encuentra la pelicula deseada.");
                }
            }
        }
        sc.nextLine();
    }
}
