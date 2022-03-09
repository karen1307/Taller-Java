package com.sofka.TALLER2CONDICIONALES.objetos;

public class Tortas {
    private String nombreTorta;
    private int cantidadTortas;
    private float precioTorta;
    private String caracteristicaTorta;

    public Tortas(String nombreTorta, int cantidadTortas, float precioTorta, String caracteristicaTorta) {
        this.nombreTorta = nombreTorta;
        this.cantidadTortas = cantidadTortas;
        this.precioTorta = precioTorta;
        this.caracteristicaTorta = caracteristicaTorta;
    }

    public String getCaracteristicaTorta() {
        return caracteristicaTorta;
    }

    public void setCaracteristicaTorta(String caracteristicaTorta) {
        this.caracteristicaTorta = caracteristicaTorta;
    }

    public String getNombreTorta() {
        return nombreTorta;
    }

    public void setNombreTorta(String nombreTorta) {
        this.nombreTorta = nombreTorta;
    }

    public int getCantidadTortas() {
        return cantidadTortas;
    }

    public void setCantidadTortas(int cantidadTortas) {
        this.cantidadTortas = cantidadTortas;
    }

    public float getPrecioTorta() {
        return precioTorta;
    }

    public void setPrecioTorta(float precioTorta) {
        this.precioTorta = precioTorta;
    }
}
