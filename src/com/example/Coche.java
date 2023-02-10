package com.example;

public class Coche {
    String marca;
    String modelo;
    String color;
    int puertas;
    boolean isElectric;
    public Coche() {}
    public Coche(String marca, String modelo, String color, int puertas, boolean isElectric) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.puertas = puertas;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", puertas=" + puertas +
                ", isElectric=" + isElectric +
                '}';
    }
}
