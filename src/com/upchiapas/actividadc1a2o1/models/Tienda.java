package com.upchiapas.actividadc1a2o1.models;

public class Tienda {
    Cliente cliente;
    Pedido pedido;
    String nombre;
    byte tipoPizza;

    public Tienda(byte opcMenu, String nombre) {
        this.tipoPizza = opcMenu;
        this.nombre = nombre;
    }

    public Pedido SendPedido(){
        cliente = new Cliente(nombre);
        pedido = new Pedido(cliente,tipoPizza);
        return pedido;
    }
}