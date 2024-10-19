# 🧮 Java Calculator Application / Приложение Калькулятор на Java

## 🌟 Overview / Обзор
This Java project is a simple calculator application that demonstrates basic arithmetic operations along with logging features using Log4j. It includes unit tests to ensure correctness and reliability of the calculator methods.

Этот проект на Java представляет собой простой калькулятор, демонстрирующий основные арифметические операции с использованием логирования через Log4j. Включает юнит-тесты для обеспечения корректности и надежности методов калькулятора.

## ✨ Features / Функции
The calculator can perform the following operations:

Калькулятор может выполнять следующие операции:

- ➕ **Addition / Сложение**: Adds two numbers. / Складывает два числа.
- ➖ **Subtraction / Вычитание**: Subtracts one number from another. / Вычитает одно число из другого.
- ✖️ **Multiplication / Умножение**: Multiplies two numbers. / Умножает два числа.
- ➗ **Division / Деление**: Divides one number by another (throws an exception for division by zero). / Делит одно число на другое (выбрасывает исключение при делении на ноль).
- 💪 **Power / Возведение в степень**: Raises a number to a given power. / Возводит число в степень.
- 🌿 **Square Root / Квадратный корень**: Finds the square root of a number (throws an exception for negative numbers). / Находит квадратный корень числа (выбрасывает исключение для отрицательных чисел).
- ➖ **Absolute Value / Модуль числа**: Returns the absolute value of a number. / Возвращает модуль числа.

## 📂 Project Structure / Структура проекта
The project is structured into the following components:

Проект включает следующие компоненты:

- **Calculator Interface (`Calculator.java`)**: Contains static methods for all arithmetic operations. Each method also logs its usage and any errors encountered.
  
  Интерфейс калькулятора (`Calculator.java`): Содержит статические методы для всех арифметических операций. Каждый метод логирует свое использование и ошибки.

- **Main Application (`Main.java`)**: Contains the main method to demonstrate the functionality of the calculator. It logs the start and end of the program.

  Основное приложение (`Main.java`): Содержит основной метод для демонстрации функционала калькулятора. Логирует начало и конец выполнения программы.

- **Unit Tests (`CalculatorTest.java`)**: A set of JUnit tests that validate each calculator method for expected outcomes, including tests for edge cases like division by zero and square root of a negative number.

  Юнит-тесты (`CalculatorTest.java`): Набор тестов JUnit, проверяющих каждый метод калькулятора, включая тесты для крайних случаев, таких как деление на ноль и квадратный корень из отрицательного числа.

- **Logging Configuration (`log4j2.xml`)**: Configures logging using Log4j, with log output to both the console and a file (`logs/calculator.log`).

  Конфигурация логирования (`log4j2.xml`): Настраивает логирование с использованием Log4j, вывод логов в консоль и в файл (`logs/calculator.log`).

- **Maven Configuration (`pom.xml`)**: The Maven POM file for managing dependencies and compiling the project.

  Конфигурация Maven (`pom.xml`): Файл POM для управления зависимостями и сборкой проекта.

## 🔧 Requirements / Требования
- **Java 21**
- **Apache Maven** for dependency management and build / для управления зависимостями и сборки

## 📦 Dependencies / Зависимости
The project uses the following dependencies:

Проект использует следующие зависимости:

- **JUnit (v4.13.2)**: For unit testing. / Для юнит-тестирования.
- **Mockito (v3.0.0)**: For creating mock objects in unit tests (currently not actively used in tests). / Для создания мок-объектов в юнит-тестах (в текущих тестах не используется).
- **Log4j (v2.20.0)**: For logging information, warnings, and errors. / Для логирования информации, предупреждений и ошибок.

## ▶️ How to Run / Как запустить
1. **Clone the Repository / Клонировать репозиторий**
   ```sh
   git clone <repository-url>
   cd laba
   ```

2. **Compile the Project / Скомпилировать проект**
   ```sh
   mvn clean compile
   ```

3. **Run the Application / Запустить приложение**
   ```sh
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```
   This will start the calculator application, showcasing the use of all available arithmetic methods.
   
   Это запустит приложение-калькулятор, демонстрирующее использование всех доступных арифметических методов.

4. **Run Unit Tests / Запустить юнит-тесты**
   ```sh
   mvn test
   ```
   This will execute all JUnit tests to verify the correctness of each method.
   
   Это выполнит все тесты JUnit для проверки правильности работы каждого метода.

## 📋 Logging / Логирование
Logging is configured via the `log4j2.xml` file:

Логирование настраивается через файл `log4j2.xml`:

- Logs are output to both the console and a file (`logs/calculator.log`).
- Логи выводятся как в консоль, так и в файл (`logs/calculator.log`).

- Different log levels (INFO, ERROR) are used for tracing method calls and errors such as division by zero or invalid operations.
- Используются разные уровни логов (INFO, ERROR) для отслеживания вызовов методов и ошибок, таких как деление на ноль или некорректные операции.

## 💡 Example Usage / Пример использования
Here is an example of what to expect when running the application:

Пример вывода при запуске приложения:
```sh
Сложение: 4
Ошибка: Деление на ноль
Вычитание: 0
Умножение: 4
Возведение в степень: 8
Корень: 4.0
Модуль: 5
```
All operations will also be logged in the `logs/calculator.log` file.

Все операции также будут записаны в файл `logs/calculator.log`.

## 🧪 Unit Testing / Юнит-тестирование
The project has a suite of unit tests in `CalculatorTest.java` that test each method in the calculator, ensuring they work as expected. Edge cases, such as division by zero and square root of a negative number, are also covered.

Проект включает набор юнит-тестов в файле `CalculatorTest.java`, проверяющих каждый метод калькулятора, чтобы убедиться, что они работают, как ожидается. Также проверяются крайние случаи, такие как деление на ноль и квадратный корень из отрицательного числа.

## 📜 License / Лицензия
This project is released under the [MIT License](https://opensource.org/licenses/MIT).

Проект выпущен под лицензией [MIT License](https://opensource.org/licenses/MIT).

---

✨ Enjoy using the calculator and happy coding! / Наслаждайтесь использованием калькулятора и приятного кодинга! ✨

