package com.hillel.paschenko.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int to = 18;
        int from = 23;
        int[] ageOfPlayers = new int[25];
        int[] ageOfPlayers2 = new int[25];
        int averageAge = 0;
        int averageAge2 = 0;
        for (int i = 0; i < ageOfPlayers.length; i++) {
            ageOfPlayers[i] = to + (int) (Math.random() * from);
            ageOfPlayers2[i] = to + (int) (Math.random() * from);
            averageAge += ageOfPlayers[i];
            averageAge2 += ageOfPlayers2[i];
        }

        System.out.println(Arrays.toString(ageOfPlayers));
        System.out.println(Arrays.toString(ageOfPlayers2));
        System.out.println((double) averageAge / ageOfPlayers.length);
        System.out.println((double) averageAge2 / ageOfPlayers.length);
    }
    static void arrayCopy() {
        int[] source = new int[4];
        int[] target = new int[4];
    }
}

