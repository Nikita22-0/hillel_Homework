package com.hillel.paschenko.lesson12.task1;

public class Iphones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Звонок (iPhone)");
    }

    @Override
    public void sms() {
        System.out.println("СМС (iPhone)");
    }

    @Override
    public void internet() {
        System.out.println("Интернет (iPhone)");
    }
    @Override
    public void operatingSystem() {
        System.out.println("iOS");
    }
}

