package com.otus.pantikov.dz2;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {




    public static void main(String[] args) {

//Задание 1
//        System.out.println("Задание 1: ");
//        Animal animals = new Animal();
//        animals.setName("Бобик");
//        animals.setAge(5);
//        animals.setWeight(15);
//        animals.setColor("чёрный");
//        System.out.println(animals);
//
//        Animal secondAnimals = new Animal();
//        secondAnimals.setName("Бобик");
//        secondAnimals.setAge(4);
//        secondAnimals.setWeight(20.5);
//        secondAnimals.setColor("белый");
//        System.out.println(secondAnimals);

//        Animal_actions actions_say = new Animal_actions();
//        actions_say.say();
//
//        Animal_actions actions_go = new Animal_actions();
//        actions_go.go();
//
//        Animal_actions actions_eat = new Animal_actions();
//        actions_eat.eat();
//
//        Animal_actions actions_drink = new Animal_actions();
//        actions_drink.drink();

//Задание 2-5
//        System.out.println("Задание 2-5: ");
//        Animal_actions say_cat = new Cat();
//        say_cat.say();
//
//        Animal_actions say_dog = new Dog();
//        say_dog.say();
//
//        Animal_actions say_duck = new Duck();
//        say_duck.say();
//
//        Duck.DuckFly duck_fly = new Duck.DuckFly();
//        duck_fly.swim();

//Задание 6
        Animal animals = new Animal();
        Animal_actions say_cat = new Cat();
        Animal_actions say_dog = new Dog();
        Animal_actions say_duck = new Duck();




        Scanner scan = new Scanner(System.in);
        String menu = "";



        while (!menu.equals("exit")) {

            System.out.println("Меню: ");
            System.out.println("Введите add для добавления");
            System.out.println("Введите list для печати списка");
            System.out.println("Введите exit для выхода");
            menu = scan.next().toLowerCase().trim();
            switch (menu){
                case "add":
                    System.out.println("Выберете животное из списка: cat, dog, duck");
                    break;
                case "cat":
                    System.out.print("Введите Имя: " );
                    String name =scan.next().trim();
                    animals.list_animal.add(name);
                    System.out.print("Введите Возраст: ");
                    int age = scan.nextInt();
                    animals.list_animal.add(age);
                    System.out.print("Введите Вес: ");
                    double weight =scan.nextDouble();
                    animals.list_animal.add(weight);
                    System.out.print("Введите Цвет: ");
                    String color =scan.next().trim();
                    animals.list_animal.add(color);
                    animals.list_animal.add(say_cat.say());
                    break;
                case "duck":
                    System.out.print("Введите Имя: " );
                    name =scan.next().trim();
                    animals.list_animal.add(name);
                    System.out.print("Введите Возраст: ");
                    age = scan.nextInt();
                    animals.list_animal.add(age);
                    System.out.print("Введите Вес: ");
                    weight =scan.nextDouble();
                    animals.list_animal.add(weight);
                    System.out.print("Введите Цвет: ");
                    color =scan.next().trim();
                    animals.list_animal.add(color);
                    animals.list_animal.add(say_duck.say());
                    break;
                case "dog":
                    System.out.print("Введите Имя: " );
                    name =scan.next().trim();
                    animals.list_animal.add(name);
                    System.out.print("Введите Возраст: ");
                    age = scan.nextInt();
                    animals.list_animal.add(age);
                    System.out.print("Введите Вес: ");
                    weight =scan.nextDouble();
                    animals.list_animal.add(weight);
                    System.out.print("Введите Цвет: ");
                    color =scan.next().trim();
                    animals.list_animal.add(color);
                    animals.list_animal.add(say_dog.say());
                    break;
                case "list":
                    System.out.println(animals);
                    break;
                case "exit":
                    System.out.println("Завершаем");
                    break;
                default:
                    System.out.println("Ввели неверную команду");
            }
        }

        System.out.println("Завершение программы");












    }

}
