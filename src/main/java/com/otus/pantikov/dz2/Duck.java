package com.otus.pantikov.dz2;

public class Duck extends Animal {

    @Override
    public void say() {
        System.out.println("Кря");


    }


    public static class DuckFly implements Flying {

        @Override
        public void swim() {
            System.out.println("Я лечу");
        }
    }
}