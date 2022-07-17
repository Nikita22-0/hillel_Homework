package com.hillel.paschenko.lesson8;

import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        int max = 10;
        int[] companyNumb = new int[7];
        int[] playerNumb = new int[7];
        for (int i = 0; i < companyNumb.length; i++) {
            companyNumb[i] = (int) (Math.random() * max);
            playerNumb[i] = (int) (Math.random() * max);
        }
        Arrays.sort(companyNumb);
        Arrays.sort(playerNumb);
        System.out.println(Arrays.toString(companyNumb));
        System.out.println(Arrays.toString(playerNumb));
        coincidences(companyNumb,playerNumb);
    }

    static void coincidences(int[] companyNumb, int[] playerNumb) {
        int a = 0;
        int b = 0;
        System.out.print("Matched ");
        for (int i = 0; i < companyNumb.length; i++) {
            if (companyNumb[i] == playerNumb[i]){
                a++;
                System.out.print(i + " ");
            }
        }
        System.out.println("elements");
        System.out.println("Number of coincidences: " + a);
    }
}
