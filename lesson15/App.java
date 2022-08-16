package com.hillel.paschenko.lesson15;

import com.hillel.paschenko.lesson15.controllers.ProductController;
import com.hillel.paschenko.lesson15.models.Product;
import com.hillel.paschenko.lesson15.views.SalesView;



// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);
        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
         controller.runApp();

    }
}
