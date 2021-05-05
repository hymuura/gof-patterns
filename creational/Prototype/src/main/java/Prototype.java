package main.java;

import java.util.List;

public class Prototype {

    public static void main(String[] args){
        Product pizza = new Product(List.of("Flour","Tomato","Chess"));

        Product hamPizza = pizza.clone();
        hamPizza.add("Ham");

        System.out.println(pizza.toString());
        System.out.println(hamPizza.toString());
    }
}
