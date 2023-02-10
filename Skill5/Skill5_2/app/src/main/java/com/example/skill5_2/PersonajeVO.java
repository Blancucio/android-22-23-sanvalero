package com.example.skill5_2;

public class PersonajeVO {

    private String nombre;
    private String info;
    private int foto;

    public PersonajeVO(String krusty, String s, int krusti) {

    }

    public PersonajeVO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
