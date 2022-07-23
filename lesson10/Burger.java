package com.hillel.paschenko.lesson10;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise = "";
    String doubleMeat = "";
    String str = "Состав бургера: ";

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(str + this);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        str = str + this;
        str = str.substring(0, str.length() - 2);
        System.out.println(str);
    }

    public Burger(String bun, String doubleMeat ,String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.doubleMeat = doubleMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println(str + this);
    }

    @Override
    public String toString() {
        return  bun + ", " +
                doubleMeat + " " +
                meat + ", " +
                cheese + ", " +
                greens + ", " +
                mayonnaise;
    }
}



