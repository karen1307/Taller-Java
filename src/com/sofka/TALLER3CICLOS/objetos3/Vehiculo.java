package com.sofka.TALLER3CICLOS.objetos3;

public class Vehiculo {

    private String nombre,placa,tel,marca;
    public Vehiculo(String nombre,String placa, String tel, String marca){
        this.nombre = nombre;
        this.placa = placa;
        this.tel = tel;
        this.marca = marca;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getPlaca(){return placa;}
    public void setPlaca(String placa){this.placa = nombre;}
    public String getTel(){return tel;}
    public void setTel(String tel){this.tel = tel;}
    public String getMarca(){return marca;}
    public void setMarca(String marca){this.marca = marca;}
}


