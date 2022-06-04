package com.upchiapas.actividadc1a2o1.models;

public class Pedido {
    CatalogoPizza listaPizzas=new CatalogoPizza();
    Cliente cliente;
    Pizza pizza;
    byte opcMenu;

    public Pedido(Cliente cliente, byte opcMenu) {
        this.cliente = cliente;
        this.opcMenu = opcMenu;
    }

    public Pizza SendPizza(){
        Pizza pizza = listaPizzas.setPizza((byte)opcMenu);
        return pizza;
    }
    public Cliente getCliente(){
        return cliente;
    }

}
