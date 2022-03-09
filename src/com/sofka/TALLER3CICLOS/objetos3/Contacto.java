package com.sofka.TALLER3CICLOS.objetos3;

public class Contacto {
    private String nombre,organizacion,tel;
    public Contacto(String nombre,String organizacion, String tel){
        this.nombre = nombre;
        this.organizacion = organizacion;
        this.tel = tel;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getOrganizacion(){return organizacion;}
    public void setOrganizacion(String organizacion){this.organizacion = nombre;}
    public String getTel(){return tel;}
    public void setTel(String tel){this.tel = tel;}
}
