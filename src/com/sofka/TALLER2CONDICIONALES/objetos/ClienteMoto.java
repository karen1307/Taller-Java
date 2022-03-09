package com.sofka.TALLER2CONDICIONALES.objetos;

public class ClienteMoto {
    private String nombreDuenio;
    private int documento;
    private String celular;
    private String marca;
    private int cilindraje;
    private String observacionesIngreso;
    private String nombreMecanico;
    private String observacionesSalida;


    public ClienteMoto(String nombreDuenio, int documento, String celular, String marca, int cilindraje, String observacionesIngreso, String nombreMecanico) {
        this.nombreDuenio = nombreDuenio;
        this.documento = documento;
        this.celular = celular;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.observacionesIngreso = observacionesIngreso;
        this.nombreMecanico = nombreMecanico;
    }
    public ClienteMoto(){

    }
    public String getObservacionesIngreso() {
        return observacionesIngreso;
    }


    public String getNombreMecanico() {
        return nombreMecanico;
    }


    public String getObservacionesSalida() {
        return observacionesSalida;
    }

    public void setObservacionesSalida(String observacionesSalida) {
        this.observacionesSalida = observacionesSalida;
    }
}
