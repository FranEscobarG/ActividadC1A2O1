package com.upchiapas.actividadc1a2o1;

import com.upchiapas.actividadc1a2o1.models.Pedido;
import com.upchiapas.actividadc1a2o1.models.Pizza;
import com.upchiapas.actividadc1a2o1.models.Tienda;

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
            System.out.println("2. Terminar Pedido");
            System.out.println("3. SALIR");
            System.out.println(" Elija una Opcion: ");
            opcion=entrada.nextInt();

            switch(opcion){
                case 1:
                    iniciarPedido();
                    break;
                case 2:
                    imprimirTicket();
                    break;
                case 3:
                    System.out.println ("\nAh salido con exito.");
                    break;
                default: System.out.println ("Error. Vuelva a intentarlo...");
            }
        }while(opcion!=3);
    }
    public static void iniciarPedido(){
        String nombre;
        byte opcMenu;
        //int cantidad;

        System.out.println("Nombre: ");
        nombre=entrada.next();
        //do{
            System.out.println("\n\t** MENU DE PIZZAS **");
            System.out.println("1. Peperoni ----------- $40.00");
            System.out.println("2. Cuatro Quesos ------ $40.00");
            System.out.println("3. Mexicana ----------- $40.00");
            System.out.println("4. Champiñones -------- $40.00");
            System.out.println("5. TERMINAR PEDIDO");
            System.out.println(" Elija una Opcion: ");
            opcMenu=entrada.nextByte();

            tienda = new Tienda((byte) (opcMenu-1),nombre);

            pedido=tienda.SendPedido();
            pizza=pedido.SendPizza();
       // }while(opcMenu!=5);
    }

    public static void imprimirTicket(){
        System.out.println("\n** Ticket de Compra **");
        System.out.println("\tCliente: " + pedido.getCliente().getNombrecliente());
        System.out.println("Especialidad: "+"\t\t\tPrecio: ");
        System.out.println(pizza.getNombre() +"\t\t"+ pizza.getPrecio());
    }
}

