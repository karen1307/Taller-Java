package com.sofka.TALLER3CICLOS;

import com.sofka.TALLER3CICLOS.objetos3.Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Pun6 {

    static Scanner sc=new Scanner(System.in);
    // //Se crea un ArrayList para guardar objetos de tipo Contacto.
    static ArrayList<Contacto> contactos=new ArrayList();
    static int contacto=0;
    public void pun6(){
        int opcion = mostrarMenu();
        while (opcion != 0) {
            switch (opcion){
                case 1:
                    if (contacto==3) {
                        System.out.println("Capacidad maxima de 3 contactos completa");
                    }else{
                        ingresarContacto();
                        contacto++;
                        opcion = mostrarMenu();
                    }
                    break;
                case 2:
                    consultarTel();
                    opcion = mostrarMenu();
                    break;
                case 3:
                    eliminarTel();
                    contacto--;
                    opcion = mostrarMenu();
                    break;
                default:
                    System.out.println("Opción inválida");
                    opcion = mostrarMenu();
                    break;
            }
        }




    }

    private static void eliminarTel(){
        int i;
        boolean bandera2=true;
        sc.nextLine();
        System.out.print("Ingresa numero de telefono que desea Eliminar : ");
        String numerotel = sc.nextLine();
        for(i = 0; i< contactos.size(); i++) {
            if(contactos.get(i).getTel().equals(numerotel)) {
                contactos.remove(i);
                System.out.println("El contacto ha sido eliminado");
                bandera2=false;
                break;
            }
        }
        if(bandera2){System.out.println("telefono no registrado");}
        sc.nextLine();
    }

    private static void consultarTel(){
        int i;
        sc.nextLine();
        System.out.print("Ingresa numero de telefono que desea buscar : ");
        String numerotel = sc.nextLine();
        for(i = 0; i< contactos.size(); i++) {
            if(contactos.get(i).getTel().equals(numerotel)) {
                System.out.println("Nombre del contacto " + contactos.get(i).getNombre() + " telefono: "+ contactos.get(i).getTel()+" organizacion: "+ contactos.get(i).getOrganizacion());
                break;
            }
        }
        if(i == contactos.size()){System.out.println("telefono no registrado");}
        sc.nextLine();
    }

    private static void ingresarContacto() {
        String nombre;
        String organizacion;
        String tel;
        boolean bandera1=true;
        Contacto usuarioInicial;
        sc.nextLine();
        System.out.println("Ingresar contacto nuevo.");
        System.out.print("Ingresa tu numero de telefono ");
        tel = sc.nextLine();
        for(int i = 0; i< contactos.size(); i++) {
            if(contactos.get(i).getTel().equals(tel)) {
                System.out.println("El telefono ingresado ya se encuentra registrado, intenta de nuevo con un numero diferente");
                bandera1=false;
                break;
            }
        }
        if (bandera1){
            sc.nextLine();
            System.out.print("Ingresar tu nombre completo: ");
            nombre = sc.nextLine();
            System.out.print("Ingresa la organizacion: ");
            organizacion = sc.nextLine();
            sc.nextLine();
            usuarioInicial = new Contacto(nombre, organizacion, tel);

            //se añade el objeto al final del array
            contactos.add(usuarioInicial);
        }

    }
    private static int mostrarMenu(){
        int opcionElegida;
        System.out.println("Elije una opción");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar Contactos almacenados");
        System.out.println("3. Eliminar contacto.");
        System.out.println("0. Salir");
        System.out.print("Opcion a escoger: ");
        return opcionElegida = sc.nextInt();
    }
}
