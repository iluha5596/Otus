package com.otus.pantikov.dz2;

public class Dog extends Animal_actions {

    @Override
    public Object say() {
        System.out.println("Гав");

        return "Гав";
    }
}