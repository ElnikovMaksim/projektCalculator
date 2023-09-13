package com.projekt;

public class EnterTheNumber extends Calculator {
    public static int nextInt() {
        System.out.print("Введите число:");
        int operand = 0;
        try {
            if (scanner.hasNextInt()) {
                operand = scanner.nextInt();
            }else {
                scanner.next();
                operand = nextInt();
            }
        }catch (Exception e) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
        }
        return operand;
    }
}
