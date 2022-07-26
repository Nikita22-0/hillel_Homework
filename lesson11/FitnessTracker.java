package com.hillel.paschenko.lesson11;

public class FitnessTracker {
    public static void main(String[] args) {
        Account account1 = new Account("Stas", "Lesnikov", 9,6, 1994,98,"140/50",
                12000,"stasles@gmail.com", "+380634985198");
        Account account2 = new Account("Viktor", "Kuznecov", 5,4, 1998,84,"150/80",
                8000,"kuzviktor@gmail.com", "+380507891544");
        Account account3 = new Account("Anastasia", "Goreva", 18,7, 1996,50,"130/40",
                20000,"gorevanasta@gmail.com", "+380934842791");


        account1.printAccountInfo();
        System.out.println();
        account2.printAccountInfo();
        System.out.println();
        account3.printAccountInfo();

        account2.setSecondName("Topotov");
        account2.setWeight(80);

        account3.setSteps_taken_per_day(24000);
        account3.setPressure("150/60");
        System.out.println();
        account2.printAccountInfo();
        System.out.println();
        account3.printAccountInfo();
    }
}
