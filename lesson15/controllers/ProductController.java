package com.hillel.paschenko.lesson15.controllers;

import com.hillel.paschenko.lesson15.models.Product;
import com.hillel.paschenko.lesson15.utils.Rounder;
import com.hillel.paschenko.lesson15.views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.
        double income = Rounder.rounding(model.calculation());
        double incomeTax = Rounder.rounding(model.incomeTax());
        double cleanIncome = Rounder.rounding(model.calculation(income));

        String output = "Наименование товара: " +  model.getName() + "\nОбщий доход (грн.): " + income
                + "\nСумма налога (грн.): " + incomeTax + "\nЧистый доход (грн.): "
                + cleanIncome;

        view.getOutput(output);
    }
}
