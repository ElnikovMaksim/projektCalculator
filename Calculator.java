package com.projekt;

import java.util.Scanner;

import static com.projekt.ArithmeticOperation.calc;
import static com.projekt.EnterOperation.getOperation;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = scanner.nextInt();
        int operand2 = scanner.nextInt();
        int operand3 = scanner.nextInt();
        char operation = getOperation();

        int result = calc(operand1, operand2, operand3, operation);
        System.out.println("Результат операции: " + result);
    }
}
