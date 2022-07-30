package com.hillel.paschenko.lesson12.task1;

import com.hillel.paschenko.lesson11.Account;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.operatingSystem();
        System.out.println();
        Iphones iphone = new Iphones();
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.operatingSystem();

    }
}
