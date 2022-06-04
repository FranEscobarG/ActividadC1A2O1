package com.upchiapas.actividadc1a2o1.models;

public class CatalogoPizza {
    private final Pizza peperoni=new Pizza("Peperoni",80);
    private final Pizza mexicana=new Pizza("Mexicana",100);
    private final Pizza queso=new Pizza("Cuatro Quesos",150);
    private final Pizza champiñones=new Pizza("Champiñones",90);
    private final Pizza[] listaPizzas = {peperoni,queso,mexicana,champiñones};

    public CatalogoPizza() {
    }
    public Pizza setPizza(byte i){
        return listaPizzas[i];
    }

}
