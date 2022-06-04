package com.upchiapas.actividadc1a2o1;

import com.upchiapas.actividadc1a2o1.models.Pedido;
import com.upchiapas.actividadc1a2o1.models.Pizza;
import com.upchiapas.actividadc1a2o1.models.Tienda;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Tienda tienda;
    static Pedido pedido;
    static Pizza pizza;
    static Scanner entrada= new Scanner (System.in);
    public static void main(String[] args) {
        visualizarOpciones();
    }

    public static void visualizarOpciones(){
        int opcion;
        do{
            System.out.println("\n** PIZZAS LA UP **");
            System.out.println("1. Hacer Pedido");
            System.out.println("2. SALIR");
            System.out.println(" Elija una Opcion: ");
            opcion=entrada.nextInt();

            switch(opcion){
                case 1:
                    iniciarPedido();
                    break;
                case 2:
                    System.out.println ("\nAh salido con exito.");
                    break;
                default: System.out.println ("Error. Vuelva a intentarlo...");
            }
        }while(opcion!=3);
    }
    public static void iniciarPedido(){
        LinkedList <Pizza> tomaDePedido=new LinkedList<Pizza>();
        String nombre;
        byte opcMenu;

        System.out.println("Nombre: ");
        nombre=entrada.next();
        do{
            System.out.println("\n\t** MENU DE PIZZAS **");
            System.out.println("1. Peperoni ----------- $80.00");
            System.out.println("2. Cuatro Quesos ------ $100.00");
            System.out.println("3. Mexicana ----------- $150.00");
            System.out.println("4. Champiñones -------- $90.00");
            System.out.println("5. TERMINAR PEDIDO");
            System.out.println(" Elija una Opcion: ");
            opcMenu=entrada.nextByte();
            switch (opcMenu){
                case 1:
                    agregarPizza(tomaDePedido,nombre,opcMenu);
                    break;
                case 2:
                    agregarPizza(tomaDePedido,nombre,opcMenu);
                    break;
                case 3:
                    agregarPizza(tomaDePedido,nombre,opcMenu);
                    break;
                case 4:
                    agregarPizza(tomaDePedido,nombre,opcMenu);
                    break;
                case 5:
                    cobrarProducto(tomaDePedido,opcMenu);
                    break;
                default:
            } //QUE SE REPITA Y CADA VEZ GUADA EN LA LISTA -Aca pizza introducirla a la lista :)
       }while(opcMenu!=5);
    }
    public static LinkedList<Pizza> agregarPizza(LinkedList <Pizza> tomaDePedido,String nombre,byte opcMenu){
        tienda = new Tienda((byte) (opcMenu-1),nombre);
        pedido=tienda.SendPedido();
        pizza=pedido.SendPizza();

        tomaDePedido.addFirst(pizza); //Agrega el objeto a la Pila
        return tomaDePedido;
    }
    public static void cobrarProducto(LinkedList <Pizza> tomaDePedido,byte opcMenu){
        int total=0;
        //Producto cobrado; -- Sumar el .getPrecio para el total
        if(tomaDePedido.isEmpty())
            System.out.println("Proceso de Cobro terminado.");
        else //Se tendria que crear una pila o arreglo auxiliar para guaradar lo que se elimine
            for (Pizza pizza : tomaDePedido) {
                total = total + pizza.getPrecio();
            }
        imprimirTicket(tomaDePedido,total);
    }

    public static void imprimirTicket(LinkedList <Pizza> tomaDePedido, int totalPagar){
        System.out.println("\n---------------------------------------");
        System.out.println("\t** TICKET DE COMPRA **");
        System.out.println("\tCliente: " + pedido.getCliente().getNombrecliente());
        System.out.println("Especialidad: "+"\t\t\tPrecio: ");
        for (Pizza pizza : tomaDePedido) {
            System.out.println(pizza.getNombre() +"\t\t"+ pizza.getPrecio());
        }
        for(int i=0; i<tomaDePedido.size() ;i++)
            tomaDePedido.remove(i);

        System.out.println("\t\tTotal a Pagar: "+totalPagar);
        System.out.println("\n---------------------------------------");
    }
}