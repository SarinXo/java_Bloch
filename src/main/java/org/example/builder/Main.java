package org.example.builder;

import org.example.builder.Car.Builder;


public class Main {

    public static void main(String[] args) {
        Car car = new Builder()
                        .setCapacity(4)
                        .setLitersOil(50.2)
                        .setMaxSpeed(305.)
                        .setVar1(101)
                        .build();

        AbstractPizza pepperoni = new Pepperoni.Builder()
                        .addTopping(AbstractPizza.Topping.PEPPER)
                        .addTopping(AbstractPizza.Topping.MUSHROOM)
                        .setSize(Pepperoni.Size.LARGE)
                        .build();
        System.out.println("complete");
    }
}
