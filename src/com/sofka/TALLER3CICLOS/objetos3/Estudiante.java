package com.sofka.TALLER3CICLOS.objetos3;

public class Estudiante {

    private String nombre,cedula,tel,resultado;
    public Estudiante(String nombre,String cedula, String tel,String resultado){
        this.nombre = nombre;
        this.cedula = cedula;
        this.tel = tel;
        this.resultado = resultado;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getCedula(){return cedula;}
    public void setCedula(String organizacion){this.cedula = nombre;}
    public String getTel(){return tel;}
    public void setTel(String tel){this.tel = tel;}
    public String getResultado(){return resultado;}
    public void setResultado(String resultado){this.resultado = resultado;}
}

