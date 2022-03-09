package com.sofka.TALLER2CONDICIONALES.objetos;

public class PersonaMasaCorporal {
    private String nombrecompleto;
    private int documento;
    private double peso, estatura, IMC;

    public PersonaMasaCorporal(String nombrecompleto, int documento, double peso, double estatura, double IMC) {
        this.nombrecompleto = nombrecompleto;
        this.documento = documento;
        this.peso = peso;
        this.estatura = estatura;
        this.IMC = IMC;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public int getDocumento() {
        return documento;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getIMC() {
        return IMC;
    }
}
