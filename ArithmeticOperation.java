package com.projekt;

import static com.projekt.EnterOperation.getOperation;

public class ArithmeticOperation extends EnterTheNumber {

    public static int calc(int operand1, int operand2, int operand3, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2 + operand3;
                break;
            case '-':
                result = operand1 - operand2 - operand3;
                break;
            case '*':
                result = operand1 * operand2 * operand3;
                break;
            case '/':
                result = operand1 / operand2 / operand3;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(operand1, operand2, operand3, getOperation());
        }
        return result;
    }
}
