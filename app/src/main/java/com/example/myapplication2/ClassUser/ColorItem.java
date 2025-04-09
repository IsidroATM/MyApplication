package com.example.myapplication2.ClassUser;

public class ColorItem {
    private String nombre;
    private String codigoHex;

    public ColorItem(String nombre, String codigoHex) {
        this.nombre = nombre;
        this.codigoHex = codigoHex;
    }

    public String getName() {
        return nombre;
    }

    public String getHex() {
        return codigoHex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoHex(String codigoHex) {
        this.codigoHex = codigoHex;
    }
}
