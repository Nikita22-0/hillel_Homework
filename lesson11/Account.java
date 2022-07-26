package com.hillel.paschenko.lesson11;

import java.util.Scanner;

public class Account {
    final String name;
    private String secondName;
    final int day;
    final int mouth;
    final int year;
    private double weight;
    private String pressure;
    private int steps_taken_per_day;
    final String email;
    final String phoneNumber;
    private int age;

    public Account(String name, String secondName, int day, int mouth, int year, double weight, String pressure,
                   int steps_taken_per_day, String email, String phoneNumber) {
        this.name = name;
        this.secondName= secondName;
        this.day= day;
        this.mouth= mouth;
        this.year= year;
        this.weight= weight;
        this.pressure= pressure;
        this.steps_taken_per_day= steps_taken_per_day;
        this.email= email;
        this.phoneNumber= phoneNumber;
    }

    public void printAccountInfo() {
        this.age = (2020 - year);
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMouth() {
        return mouth;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }


    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps_taken_per_day(int steps_taken_per_day) {
        this.steps_taken_per_day = steps_taken_per_day;
    }

    @Override
    public String toString() {
        return "Account info: " + '\n' +
                "name - " + name + '\n' +
                "secondName - " + secondName + '\n' +
                "day - " + day +
                ", mouth - " + mouth +
                ", year - " + year + '\n' +
                "weight - " + weight +'\n' +
                "pressure - " + pressure + '\n' +
                "steps taken per day - " + steps_taken_per_day + '\n' +
                "email - " + email + '\n' +
                "phone number - " + phoneNumber + '\n' +
                "age - " + age ;
    }
}
