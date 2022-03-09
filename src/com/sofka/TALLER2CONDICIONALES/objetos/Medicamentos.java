package com.sofka.TALLER2CONDICIONALES.objetos;

public class Medicamentos {
    private String nombreMedicamento;
    private int cantidadMedicamento;
    private float precioMedicamento;

    public Medicamentos(String nombreMedicamento, int cantidadMedicamento, float precioMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
        this.cantidadMedicamento = cantidadMedicamento;
        this.precioMedicamento = precioMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public int getCantidadMedicamento() {
        return cantidadMedicamento;
    }

    public void setCantidadMedicamento(int cantidadMedicamento) {
        this.cantidadMedicamento = cantidadMedicamento;
    }

    public float getPrecioMedicamento() {
        return precioMedicamento;
    }

    public void setPrecioMedicamento(float precioMedicamento) {
        this.precioMedicamento = precioMedicamento;
    }
}
