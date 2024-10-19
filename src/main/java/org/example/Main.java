package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Начало выполнения программы");

        System.out.println("Сложение: " + Calculator.add(2, 2));
        try {
            System.out.println("Деление: " + Calculator.div(2, 0));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println("Вычитание: " + Calculator.difference(2, 2));
        System.out.println("Умножение: " + Calculator.multiplication(2, 2));
        System.out.println("Возведение в степень: " + Calculator.power(2, 3));
        System.out.println("Корень: " + Calculator.sqrt(16));
        System.out.println("Модуль: " + Calculator.abs(-5));

        logger.info("Завершение выполнения программы");
    }
}
