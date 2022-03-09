package com.sofka;

import com.sofka.TALLER1VARIABLESEIMPRESION.*;
import com.sofka.TALLER2CONDICIONALES.*;
import com.sofka.TALLER3CICLOS.*;
import com.sofka.TALLER4ARREGLOS.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bandera = true;
        int opcion1;
        do {

            menu1();
            opcion1=capturarOpcion();
            bandera=evaluarOpcion1(opcion1);
        } while (bandera == true);
    }

        private static void menu1(){
            System.out.println("Escoja un taller");
            System.out.println("1. Taller variables e impresion");
            System.out.println("2. Taller de condicionales");
            System.out.println("3. Taller de ciclos");
            System.out.println("4. Taller de arreglos");
            System.out.println("0. salir");

        }
        private static void menu2(){
            System.out.println("Escoje un punto");
            System.out.println("1. Realizar un programa el cual solicite su nombre y apellidos.");
            System.out.println("2. Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.");
            System.out.println("3. Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre.");
            System.out.println("4. Realizar un programa el cual solicite el nombre de una ciudad capital y el país.");
            System.out.println("5. Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo.");
        }

        private static void menu3(){
            System.out.println("Escoje un punto");
            System.out.println("1. Realizar un programa en el cual se solicite la edad de una persona. Si la persona es mayor o igual a 18 años, deberá mostrar en pantalla: Usted es mayor de edad.");
            System.out.println("2. Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años, deberá mostrar en pantalla: Usted aún es un niño(a).");
            System.out.println("3. Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona.");
            System.out.println("4. video tienda");
            System.out.println("5. Droguería Mi Salud");
            System.out.println("6. taller de motos El Maquinista");
            System.out.println("7. Secretaría de Salud Municipal");
            System.out.println("8. Pasteleria");
            System.out.println("9. calcular el área de diferentes figuras geométricas");
            System.out.println("10. Su banco fiel");

        }
        private static void menu4(){
            System.out.println("Escoje un punto");
            System.out.println("1. Realizar la figura por medio del ciclo Para");
            System.out.println("2. Realizar la figura por medio del ciclo Mientras");
            System.out.println("3. Realizar la siguiente figura por medio del ciclo Repetir");
            System.out.println("4. Se requiere un programa que pueda crear la tabla de multiplicar del número que el usuario indique por medio del ciclo Para; esta debe ser impresa del 1 al 10.");
            System.out.println("5. Utilizando el ciclo que usted desee, crear un menú de ejecución infinita hasta que el usuario desee terminar dicho ciclo.");
            System.out.println("6. almacenar contactos telefónicos");
            System.out.println("7. parqueadero el guardián ");
            System.out.println("8. escuela automovilística");

        }

    private static void menu5(){
        System.out.println("Escoje un punto");
        System.out.println("1. Crear un vector de tipo Entero con 5 posiciones, llenarlo con información solicitada al usuario.");
        System.out.println("2. Crear un arreglo de números enteros de 20 posiciones, el cual, debe ser llenado con números aleatorios entre 1 y 100, luego separa pares e impares");
        System.out.println("3. Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.");
        System.out.println("4. Dada la siguiente matriz bidimensional, el cual debe de quemar en el código");
        System.out.println("5. Se debe de imprimir el siguiente cuadro");

    }

        private static int capturarOpcion(){
            Scanner input = new Scanner(System.in);
            return input.nextInt();

        }


        private static boolean evaluarOpcion1(int opcion1){
                int opcion2,opcion3,opcion4,opcion5;
                switch (opcion1) {

                    case 1:
                        menu2();
                        opcion2=capturarOpcion();
                        evaluarOpcion2(opcion2);
                        return true;
                    case 2:
                        menu3();
                        opcion3=capturarOpcion();
                        evaluarOpcion3(opcion3);
                        return true;
                    case 3:
                        menu4();
                        opcion4=capturarOpcion();
                        evaluarOpcion4(opcion4);
                        return true;
                    case 4:
                        menu5();
                        opcion5=capturarOpcion();
                        evaluarOpcion5(opcion5);
                        return true;
                    case 0:
                        return false;
                }
                return true;
        }

        private static void evaluarOpcion2(int opcion2){
                switch (opcion2){
                    case 1:
                        Punto1 punto1=new Punto1();
                        punto1.punto1();
                        break;
                    case 2:
                        Punto2 punto2=new Punto2();
                        punto2.punto2();
                        break;
                    case 3:
                        Punto3 punto3=new Punto3();
                        punto3.punto3();
                        break;
                    case 4:
                        Punto4 punto4=new Punto4();
                        punto4.punto4();
                        break;
                    case 5:
                        Punto5 punto5=new Punto5();
                        punto5.punto5();
                        break;

                }
        }

    private static void evaluarOpcion3(int opcion3){
        switch (opcion3){
            case 1:
                Punt1 punt1=new Punt1();
                punt1.punt1();
                break;
            case 2:
                Punt2 punt2=new Punt2();
                punt2.punt2();
                break;
            case 3:
                Punt3 punt3=new Punt3();
                punt3.punt3();
                break;
            case 4:
                Punt4 punt4=new Punt4();
                punt4.punt4();
                break;
            case 5:
                Punt5 punt5=new Punt5();
                punt5.punt5();
                break;
            case 6:
                Punt6 punt6=new Punt6();
                punt6.punt6();
                break;
            case 7:
                Punt7 punt7=new Punt7();
                punt7.punt7();
                break;
            case 8:
                Punt8 punt8=new Punt8();
                punt8.punt8();
                break;
            case 9:
                Punt9 punt9=new Punt9();
                punt9.punt9();
                break;
            case 10:
                Punt10 punt10=new Punt10();
                punt10.punt10();
                break;

        }
    }

        private static void evaluarOpcion4(int opcion4){
            switch (opcion4){
                case 1:
                    Pun1 pun1=new Pun1();
                    pun1.pun1();
                    break;
                case 2:
                    Pun2 pun2=new Pun2();
                    pun2.pun2();
                    break;
                case 3:
                    Pun3 pun3=new Pun3();
                    pun3.pun3();
                    break;
                case 4:
                    Pun4 pun4=new Pun4();
                    pun4.pun4();
                    break;
                case 5:
                    Pun5 pun5=new Pun5();
                    pun5.pun5();
                    break;
                case 6:
                    Pun6 pun6=new Pun6();
                    pun6.pun6();
                    break;
                case 7:
                    Pun7 pun7=new Pun7();
                    pun7.pun7();
                    break;
                case 8:
                    Pun8 pun8=new Pun8();
                    pun8.pun8();
                    break;

            }
        }
    private static void evaluarOpcion5(int opcion5){
        switch (opcion5){
            case 1:
                P1 p1=new P1();
                p1.p1();
                break;
            case 2:
                P2 p2=new P2();
                p2.p2();
                break;
            case 3:
                P3 p3=new P3();
                p3.p3();
                break;
            case 4:
                P4 p4=new P4();
                p4.p4();
                break;
            case 5:
                P5 p5=new P5();
                p5.p5();
                break;

        }
    }

    }

