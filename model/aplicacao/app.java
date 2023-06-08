package model.aplicacao;

import model.pizza;

public class app {
    public static void main(String[] args) {
        
        pizza pedido=new pizza("sabor");
        System.out.println("pizza criada");
        System.out.println(pedido.pedidoifood());
    }
}
