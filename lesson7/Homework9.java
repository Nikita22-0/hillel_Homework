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
        int[] source = {1, 2, 3, 4};
        int[] target = {5,6,7};
        System.out.println(Arrays.toString(target));
        target = arrayCopy2(source, target);
        System.out.println(Arrays.toString(target));
    }
    static void arrayCopy() {
        int[] source = {1, 2, 3, 4};
        int[] target = {5,6,4};
        int[] array = new int[source.length + target.length];
        int count = 0;
        for (int i = 0; i < target.length ; i++) {
            array[count++] = target[i];
//            count++;
        }
        for (int j : source) {
            array[count++] = j;
        }
        System.out.println(Arrays.toString(array));
    }
    static int[] arrayCopy2(int[] source, int[] target) {

        int[] array = new int[source.length + target.length];
        for (int i = 0; i < target.length ; i++) {
            array[i] = target[i];
        }
        for (int i = 0; i < source.length ; i++) {
            array[i + target.length] = source[i];
        }
        return array;
    }
}

