package com.example.myapplication2;

public class Contador {
    public int contadorUp(int v) {
        if (v == 0) {
            v = 1;
        } else {
            v++;
        }
        return v;
    }
}

