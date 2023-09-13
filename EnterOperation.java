package com.projekt;

public class EnterOperation extends EnterTheNumber {
    public static char getOperation() {
        System.out.print("Введите операцию:");
        char operation = 0;
        try {
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            }else {
                scanner.next();
                operation = getOperation();
            }
        }catch (Exception e) {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
        }
        return operation;
    }
}
