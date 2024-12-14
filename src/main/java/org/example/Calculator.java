package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Calculator {
    Logger logger = LogManager.getLogger(Calculator.class);

    static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    static int div(int a, int b) {
        if (b == 0) {
            logger.error("Критическая ошибка: попытка деления на ноль! a={}", a);
            throw new ArithmeticException("Деление на ноль");
        }
        int result = a / b;
        logger.debug("Операция деления: {} / {} = {}", a, b, result);
        return result;
    }

    static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    static int difference(int a, int b) {
        int result = a - b;
        return result;
    }

    static int power(int base, int exponent) {
        int result = (int) Math.pow(base, exponent);
        return result;
    }

    static double sqrt(int a) {
        if (a < 0) {
            logger.error("Критическая ошибка: попытка извлечения корня из отрицательного числа: {}", a);
            throw new IllegalArgumentException("Невозможно извлечь корень из отрицательного числа");
        }
        double result = Math.sqrt(a);
        return result;
    }

    static int abs(int a) {
        int result = Math.abs(a);
        return result;
    }
}