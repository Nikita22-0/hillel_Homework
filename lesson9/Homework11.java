package com.hillel.paschenko.lesson9;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = getNumber(scanner);
        int n = getNumber(scanner);
        int[][] array = new int[m][n];
        int[][] array2 = new int[n][m];
        fillingArrays(array, array2);
    }

    static int getNumber(Scanner scanner) {
        int temp;
        do {
            System.out.println("Please enter a positive number");
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong data");
                scanner.next();
            }
            temp  = scanner.nextInt();
        } while (temp <= 0);
        return temp;
    }

    static void fillingArrays(int[][] array, int[][] array2) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 11);
                array2[j][i] = array[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " \t");
            }
            System.out.println();
        }
    }
}