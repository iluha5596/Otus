package com.otus.pantikov.dz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Animal animals = new Animal();

//Задание 1
        System.out.println("Задание 1: ");

        animals.setName("Бобик");
        animals.setAge(5);
        animals.setWeight(15);
        animals.setColor("чёрный");
        System.out.println(animals);

        Animal secondAnimals = new Animal();
        secondAnimals.setName("Бобик");
        secondAnimals.setAge(4);
        secondAnimals.setWeight(20.5);
        secondAnimals.setColor("белый");
        System.out.println(secondAnimals);

        Animal actions_say = new Animal();
        actions_say.say();

        Animal actions_go = new Animal();
        actions_go.go();

        Animal actions_eat = new Animal();
        actions_eat.eat();

        Animal actions_drink = new Animal();
        actions_drink.drink();

//Задание 2-5
        System.out.println("Задание 2-5: ");
        Animal say_cat = new Cat();
        say_cat.say();

        Animal say_dog = new Dog();
        say_dog.say();

        Animal say_duck = new Duck();
        say_duck.say();

        Duck.DuckFly duck_fly = new Duck.DuckFly();
        duck_fly.swim();

//Задание 6
        System.out.println("Задание 6: ");

        List<Animal> animalList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String menu = "";
        
        while (!menu.equals("exit")) {

            System.out.println("Меню: ");
            System.out.println("Введите add для добавления");
            System.out.println("Введите list для печати списка");
            System.out.println("Введите exit для выхода");
            menu = scan.next().toUpperCase(Locale.ROOT).trim();
            Commands menuCommands = Commands.valueOf(menu);

                switch (menuCommands) {

                    case ADD:
                        System.out.println("Выберете животное из списка: cat, dog, duck");
                        break;
                    case CAT:
                        Cat myCat = new Cat();

                        System.out.print("Введите Имя: ");
                        String name = scan.next();
                        myCat.setName(name);

                        System.out.print("Введите Возраст: ");
                        int age = scan.nextInt();
                        myCat.setAge(age);

                        System.out.print("Введите Вес: ");
                        int weight = scan.nextInt();
                        myCat.setWeight(weight);

                        System.out.print("Введите Цвет: ");
                        String color = scan.next();
                        myCat.setColor(color);

                        animalList.add(myCat);
                        say_cat.say();
                        animalList.add(say_cat);

                        break;
                    case DUCK:
                        Cat myDuck = new Cat();

                        System.out.print("Введите Имя: ");
                        name = scan.next();
                        myDuck.setName(name);

                        System.out.print("Введите Возраст: ");
                        age = scan.nextInt();
                        myDuck.setAge(age);

                        System.out.print("Введите Вес: ");
                        weight = scan.nextInt();
                        myDuck.setWeight(weight);

                        System.out.print("Введите Цвет: ");
                        color = scan.next();
                        myDuck.setColor(color);

                        animalList.add(myDuck);
                        Animal say_dock = new Duck();
                        say_dock.say();
                        animalList.add(say_dock);

                        break;
                    case DOG:
                        Cat myDog = new Cat();

                        System.out.print("Введите Имя: ");
                        name = scan.next();
                        myDog.setName(name);

                        System.out.print("Введите Возраст: ");
                        age = scan.nextInt();
                        myDog.setAge(age);

                        System.out.print("Введите Вес: ");
                        weight = scan.nextInt();
                        myDog.setWeight(weight);

                        System.out.print("Введите Цвет: ");
                        color = scan.next();
                        myDog.setColor(color);

                        animalList.add(myDog);
                        say_dog.say();
                        animalList.add(say_dog);

                        break;
                    case LIST:

                        for (int i = 0; i < animalList.size(); i++) {
                            System.out.println(animalList.get(i));
                        }
                        break;

                    case EXIT:
                        System.out.println("Завершаем");
                        return;

                    default:
                            System.out.println("Ввели неверную команду");

            }

        }
    }
}


