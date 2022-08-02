package com.hillel.paschenko.lesson13;

import java.util.Locale;
import java.util.Scanner;

public class Extradition {
    static int price;

    public static void main(String[] args) {
        Drink();
        System.out.println("Всего должны " + price + ". Сделано напитков " + Drinks.count);
    }

    public static void Drink() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Какой напиток вы хотите выбрать?");
            System.out.println("Напиши No если не хотите напитка");
            System.out.println(DrinksMachine.COFFEE.getTitle() + " - " + Drinks.COFFEE);
            System.out.println(DrinksMachine.TEA.getTitle() + " - " + Drinks.TEA);
            System.out.println(DrinksMachine.LEMONADE.getTitle() + " - " + Drinks.LEMONADE);
            System.out.println(DrinksMachine.MOJITO.getTitle() + " - " + Drinks.MOJITO);
            System.out.println(DrinksMachine.MINERAL.getTitle() + " - " + Drinks.MINERAL);
            System.out.println(DrinksMachine.COCACOLA.getTitle() + " - " + Drinks.COCACOLA);
            String drink = scanner.next();
            DrinksMachine drinksMachine = null;
            if (drink.equals("no")) {
                break;
            } else {
                try {
                    drinksMachine = DrinksMachine.valueOf(drink.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException e) {
                    System.err.println("Неверный ввод");
                }
            }

            if (drinksMachine != null) {
                switch (drinksMachine) {
                    case COFFEE:
                        Preparing(drinksMachine);
                        break;
                    case TEA:
                        Preparing(drinksMachine);
                        break;
                    case LEMONADE:
                        Preparing(drinksMachine);
                        break;
                    case MOJITO:
                        Preparing(drinksMachine);
                        break;
                    case MINERAL:
                        Preparing(drinksMachine);
                        break;
                    case COCACOLA:
                        Preparing(drinksMachine);
                        break;
                }
            }
        }
        while (true);
    }

    public static void Preparing(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                System.out.println("Ваш " + DrinksMachine.COFFEE.getTitle() + " готовится");
                price += Drinks.COFFEE;
                new Drinks();
                System.out.println();
                break;
            case TEA:
                System.out.println("Ваш " + DrinksMachine.TEA.getTitle() + " готовится");
                price += Drinks.TEA;
                new Drinks();
                System.out.println();
                break;
            case LEMONADE:
                System.out.println("Ваш " + DrinksMachine.LEMONADE.getTitle() + " готовится");
                price += Drinks.LEMONADE;
                new Drinks();
                System.out.println();
                break;
            case MOJITO:
                System.out.println("Ваш " + DrinksMachine.MOJITO.getTitle() + " готовится");
                price += Drinks.MOJITO;
                new Drinks();
                System.out.println();
                break;
            case MINERAL:
                System.out.println("Выдается " + DrinksMachine.MINERAL.getTitle());
                price += Drinks.MINERAL;
                new Drinks();
                System.out.println();
                break;
            case COCACOLA:
                System.out.println("Выдается " + DrinksMachine.COCACOLA.getTitle());
                price += Drinks.COCACOLA;
                new Drinks();
                System.out.println();
                break;
        }
    }
}