package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Calculator {
    Logger logger = LogManager.getLogger(Calculator.class);

    public static int add(int a, int b) {
        logger.info("Вызов метода add");
        int result = a + b;
        logger.info("Операция сложения: {} + {} = {}", a, b, result);
        return result;
    }

    public static int div(int a, int b) {
        logger.info("Вызов метода div");
        if (b == 0) {
            logger.error("Попытка деления на ноль: {} / {}", a, b);
            throw new ArithmeticException("Деление на ноль");
        }
        int result = a / b;
        logger.info("Операция деления: {} / {} = {}", a, b, result);
        return result;
    }

    public static int multiplication(int a, int b) {
        logger.info("Вызов метода multiplication");
        int result = a * b;
        logger.info("Операция умножения: {} * {} = {}", a, b, result);
        return result;
    }

    public static int difference(int a, int b) {
        logger.info("Вызов метода difference");
        int result = a - b;
        logger.info("Операция вычитания: {} - {} = {}", a, b, result);
        return result;
    }

    public static int power(int base, int exponent) {
        logger.info("Вызов метода power");
        int result = (int) Math.pow(base, exponent);
        logger.info("Операция возведения в степень: {} ^ {} = {}", base, exponent, result);
        return result;
    }

    public static double sqrt(int a) {
        logger.info("Вызов метода sqrt");
        if (a < 0) {
            logger.error("Попытка извлечения корня из отрицательного числа: √{}", a);
            throw new IllegalArgumentException("Невозможно извлечь корень из отрицательного числа");
        }
        double result = Math.sqrt(a);
        logger.info("Операция извлечения корня: √{} = {}", a, result);
        return result;
    }

    public static int abs(int a) {
        logger.info("Вызов метода abs");
        int result = Math.abs(a);
        logger.info("Операция нахождения модуля: |{}| = {}", a, result);
        return result;
    }
}
