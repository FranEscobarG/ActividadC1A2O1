package com.upchiapas.actividadc1a2o1.models;

public class Pizza {
    String tipoPizza;
    int precio;

    public Pizza(String tipoPizza,int precio){
        this.tipoPizza=tipoPizza;
        this.precio=precio;
    }

    public String getNombre() {
        return tipoPizza;
    }

    public int getPrecio() {
        return precio;
    }
}
