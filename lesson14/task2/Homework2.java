package com.hillel.paschenko.lesson14.task2;

import java.util.Arrays;

public class Homework2 {

    public static int searcher(int [] array, int element){
        for (int i = 0; i < array.length; i++) {
             if (array[i] == element){
                 return i;
             }
        }
        return -1;
    }

    public static boolean sorting(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
        }
        return true;
    }
}


