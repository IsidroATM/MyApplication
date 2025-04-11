package com.example.myapplication2.S2Adapters;

public class PersonItem {
    private String name;
    private String number;

    public PersonItem(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getNombre() {
        return name;
    }

    public String getNumero() {
        return number;
    }
}
