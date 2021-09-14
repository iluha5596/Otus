package com.otus.pantikov.dz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

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
                        myCat.say();

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

                        break;
                    case DUCK:
                        Duck myDuck = new Duck();
                        myDuck.say();

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

                        break;
                    case DOG:
                        Dog myDog = new Dog();
                        myDog.say();

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

                        break;
                    case LIST:

                        for (int i = 0; i < animalList.size(); i++) {
                            System.out.println(animalList.get(i));
                        }
                        break;

                    case EXIT:
                        System.out.println("Завершение программы");
                        return;




            }

        }
    }
}


