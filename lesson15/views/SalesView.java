package com.hillel.paschenko.lesson15.views;


import com.hillel.paschenko.lesson15.models.Product;
import com.hillel.paschenko.lesson15.utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


//    String title;
//    String name;
//    int quantity;
//    double price;
    private Scanner scanner;
    private Product model;

    public SalesView(Product model) {
        this.model = model;
    }


    public void getInputs() {

        scanner = new Scanner(System.in);

        System.out.println("Введите наименование товара: ");
        model.setName(Validator.validateName(scanner));
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.


        System.out.println("Введите количество: ");
        model.setQuantity(Validator.validateQuantityInput(scanner));
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.


        System.out.println("Введите цену: ");
        model.setPrice(Validator.validatePriceInput(scanner));
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }

    public void getOutput(String output) {

        System.out.println(output);
    }
}
