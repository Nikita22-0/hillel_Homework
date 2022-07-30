package com.hillel.paschenko.lesson12.task1;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Звонок (Андроид)");
    }

    @Override
    public void sms() {
        System.out.println("СМС (Андроид)");
    }

    @Override
    public void internet() {
        System.out.println("Итеренет (Андроид)");
    }
    @Override
    public void operatingSystem() {
        System.out.println("Линукс");
    }

}
