package com.otus.pantikov.dz2;

public class Duck extends Animal_actions {

    @Override
    public Object say() {
        System.out.println("Кря");

        return "Кря";
    }


    public static class DuckFly implements Flying {

        @Override
        public void swim() {
            System.out.println("Я лечу");
        }
    }
}