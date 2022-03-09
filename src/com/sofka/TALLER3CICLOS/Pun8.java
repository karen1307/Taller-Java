package com.sofka.TALLER3CICLOS;

import com.sofka.TALLER3CICLOS.objetos3.Contacto;
import com.sofka.TALLER3CICLOS.objetos3.Estudiante;
import com.sofka.TALLER3CICLOS.objetos3.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Pun8 {

    static Scanner sc=new Scanner(System.in);
    // //Se crea un ArrayList para guardar objetos de tipo Contacto.
    static ArrayList<Estudiante> estudiantes=new ArrayList();
    static int n=0;
    public void pun8(){
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    if (n==8) {
                        System.out.println("Capacidad maxima de 8 estudiantes completa");
                    }else{
                        ingresarEstudiante();
                        n++;
                        opcion = mostrarMenu();
                    }
                    break;
                case 2:
                    consultarEstudiante();
                    opcion = mostrarMenu();
                    break;

                default:
                    System.out.println("Opción inválida");
                    opcion = mostrarMenu();
                    break;
            }
        }
    }

    private static void consultarEstudiante(){
        int i;
        sc.nextLine();
        System.out.print("Ingresa numero de cedula del estudiante que deseas consultar : ");
        String cedula = sc.nextLine();
        for(i = 0; i< estudiantes.size(); i++) {
            if(estudiantes.get(i).getCedula().equals(cedula)) {
                System.out.println("Nombre del Estudiante: " + estudiantes.get(i).getNombre() + " Cedula del Estudiante: "+estudiantes.get(i).getCedula() + " telefono: "+ estudiantes.get(i).getTel()+" Resultado: "+estudiantes.get(i).getResultado());
                break;
            }
        }
        if(i == estudiantes.size()){System.out.println("Estudiante no registrado");}
        sc.nextLine();
    }

    private static void ingresarEstudiante() {
        String nombre;
        String cedula;
        String tel;
        String resultado;
        String prueba;
        boolean bandera1=true;
        Estudiante usuarioInicial;
        sc.nextLine();
        System.out.println("Ingresar Estudiante nuevo.");
        System.out.print("Ingresa numero de cedula del estudiante ");
        cedula = sc.nextLine();
        for(int i = 0; i< estudiantes.size(); i++) {
            if(estudiantes.get(i).getCedula().equals(cedula)) {
                System.out.println("El estudiante ingresado ya se encuentra registrado.");
                bandera1=false;
                break;
            }
        }
        if (bandera1){
            sc.nextLine();
            System.out.print("Ingresar nombre completo del estudiante: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa telefono del estudiante ");
            tel = sc.nextLine();
            System.out.println("¿Estudiante realizo la prueba (si) (no)?");
            prueba = sc.nextLine();
            if (prueba.equals("si")){
                System.out.println("Ingrese resultado de la prueba (aprobado)(reprobado)");
                resultado=sc.nextLine();
            }else {
                resultado="Estudiante no ha presentado la prueba";
            }
            sc.nextLine();
            usuarioInicial = new Estudiante(nombre, cedula, tel,resultado);

            //se añade el objeto al final del array
            estudiantes.add(usuarioInicial);
        }

    }

    private static int mostrarMenu(){
        int opcionElegida;
        System.out.println("Elije una opción");
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Buscar Regriste del Estudiante");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }
}
