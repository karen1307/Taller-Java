package com.sofka.TALLER2CONDICIONALES.objetos;

public class Peliculas {
    private String nombrePelicula;
    private int cantidadPelicula;

    public Peliculas(String nombrePelicula, int cantidadPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.cantidadPelicula = cantidadPelicula;

    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getCantidadPelicula() {
        return cantidadPelicula;
    }

    public void setCantidadPelicula(int cantidadPelicula) {
        this.cantidadPelicula = cantidadPelicula;
    }
}
