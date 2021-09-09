package com.otus.pantikov.dz2;


import java.util.ArrayList;

public class Animal {

    private String name;
    private int age;
    private double weight;
    private String color;
    private String years;
    private String Says;
    public ArrayList list_animal;

    public Animal() {
        list_animal = new ArrayList<>();

    }


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

    //Задание 1
//    @Override
//    public String toString() {
//        if (age > 4) {
//
//            years = "лет";
//        } else {
//
//            years = "года";
//        }
//        return "Возврат строки:" + " Привет! меня зовут " + name + ", мне " + age + " " + years + ", я вешу - " + weight + " кг" + ", мой цвет - " + color;
//    }

    @Override
    public String toString() {

        return "Возврат строки:" + " Привет! меня зовут " + list_animal.get(0) + ", мне " + list_animal.get(1) + " " +  ", я вешу - " + list_animal.get(2) + " кг" + ", мой цвет - " + list_animal.get(3) + " голос: " + list_animal.get(4);

    }


    public String getSays() {
        return Says;
    }

    public void setSays(String says) {
        Says = says;
    }


}

