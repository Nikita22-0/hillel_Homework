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
        System.out.println("Средний возраст первой команды: " + (double) averageAge / ageOfPlayers.length);
        System.out.println("Средний возраст второй команды: " + (double) averageAge2 / ageOfPlayers.length);
        System.out.println();
        arrayCopy();
    }
    static void arrayCopy() {
//        int[] source = new int[4];
//        for (int i = 0; i < source.length; i++) {
//            source[i] = i + 1;
//        }
        int[] source = {1, 2, 3, 4};
        int[] target = {5, 6, 7, 8};
        int[] array = new int[source.length + target.length];
        array[0] = source[0];
        array[1] = source[1];
        array[2] = source[2];
        array[3] = source[3];
        array[4] = target[0];
        array[5] = target[1];
        array[6] = target[2];
        array[7] = target[3];

        System.out.println(Arrays.toString(array));
    }
}

