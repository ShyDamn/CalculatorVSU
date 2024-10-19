# 🧮 Java Calculator Application

## 🌟 Overview
This Java project is a simple calculator application that demonstrates basic arithmetic operations along with logging features using Log4j. It includes unit tests to ensure correctness and reliability of the calculator methods.

## 📂 Project Structure
The project is structured into the following components:

- **Calculator Interface (`Calculator.java`)**: Contains static methods for all arithmetic operations. Each method also logs its usage and any errors encountered.

- **Main Application (`Main.java`)**: Contains the main method to demonstrate the functionality of the calculator. It logs the start and end of the program.

- **Unit Tests (`CalculatorTest.java`)**: A set of JUnit tests that validate each calculator method for expected outcomes, including tests for edge cases like division by zero and square root of a negative number.

- **Logging Configuration (`log4j2.xml`)**: Configures logging using Log4j, with log output to both the console and a file (`logs/calculator.log`).

- **Maven Configuration (`pom.xml`)**: The Maven POM file for managing dependencies and compiling the project.

## 📦 Dependencies 
The project uses the following dependencies:

- **JUnit (v4.13.2)**: For unit testing. 
- **Mockito (v3.0.0)**: For creating mock objects in unit tests (currently not actively used in tests). 
- **Log4j (v2.20.0)**: For logging information, warnings, and errors. 

## ▶️ How to Run 
1. **Clone the Repository 
   ```sh
   git clone https://github.com/ShyDamn/CalculatorVSU.git
   cd [repo]
   ```

2. **Compile the Project**
   ```sh
   mvn clean compile
   ```

3. **Run the Application**
   ```sh
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```
   This will start the calculator application, showcasing the use of all available arithmetic methods.

4. **Run Unit Tests**
   ```sh
   mvn test
   ```
   This will execute all JUnit tests to verify the correctness of each method.

## 📋 Logging
Logging is configured via the `log4j2.xml` file:

- Logs are output to both the console and a file (`logs/calculator.log`).

- Different log levels (INFO, ERROR) are used for tracing method calls and errors such as division by zero or invalid operations.

## 💡 Example Usage
Here is an example of what to expect when running the application:

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

## 🧪 Unit Testing
The project has a suite of unit tests in `CalculatorTest.java` that test each method in the calculator, ensuring they work as expected. Edge cases, such as division by zero and square root of a negative number, are also covered.

## 📜 License
This project is released under the [MIT License](https://opensource.org/licenses/MIT).

---

✨ Enjoy using the calculator and happy coding! ✨

