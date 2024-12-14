package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Сложение: " + Calculator.add(10, 5));
        System.out.println("Вычитание: " + Calculator.difference(10, 5));
        System.out.println("Умножение: " + Calculator.multiplication(10, 5));

        try {
            System.out.println("Деление: " + Calculator.div(10, 2));
            Calculator.div(10, 0);
        } catch (ArithmeticException e) {
            logger.error("Произошла ошибка при выполнении операции деления: {}", e.getMessage());
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Возведение в степень: " + Calculator.power(2, 3));
        System.out.println("Модуль числа: " + Calculator.abs(-10));

        try {
            System.out.println("Квадратный корень из 16: " + Calculator.sqrt(16));
            Calculator.sqrt(-1);
        } catch (IllegalArgumentException e) {
            logger.error("Произошла ошибка при извлечении корня: {}", e.getMessage());
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}