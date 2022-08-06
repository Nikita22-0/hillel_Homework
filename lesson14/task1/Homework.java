package com.hillel.paschenko.lesson14.task1;

public class Homework {

    public static double average(int[][] array){
        double sum = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                a++;
            }
        }
        return sum / a;
    }
    public static boolean square(int[][] array ){
        for (int i = 0; i < array.length; i++) {
            if(array.length != array[i].length){
                return false;
            }
        }
        return true;
    }
}
