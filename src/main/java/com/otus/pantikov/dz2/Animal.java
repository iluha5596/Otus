package com.otus.pantikov.dz2;


import java.util.ArrayList;

public class Animal {

    private String name;
    private int age;
    private double weight;
    private String color;
    private String years;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public void say() {

        System.out.println("Я говорю");
    }

    public void go() {

        System.out.println("Я иду");
    }

    public void eat() {

        System.out.println("Я ем");
    }

    public void drink() {

        System.out.println("Я пью");
    }

    //Задание 1
    @Override
    public String toString() {
        if (age > 4) {

            years = "лет";
        } else {

            years = "года";
        }

        return "Возврат строки:" + " Привет! меня зовут " + name + ", мне " + age + " " + years + ", я вешу - " + weight + " кг" + ", мой цвет - " + color;
    }



}



