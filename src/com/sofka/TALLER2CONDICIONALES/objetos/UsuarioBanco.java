package com.sofka.TALLER2CONDICIONALES.objetos;

public class UsuarioBanco {
    private String nombre;
    private float saldo;
    private int documento;
    private int cuenta;

    public UsuarioBanco(String nombre, float saldo, int documento, int cuenta) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.documento = documento;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
}
