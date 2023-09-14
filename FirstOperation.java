package com.projekt;

import java.io.IOException;

import static com.projekt.Calculator.reader;

public class FirstOperation extends ArithmeticOperation{
    public static Integer parsing() throws IOException {
        try {
            System.out.print("Введите число:");
            String str = new String(reader.readLine());
            String lower = str.toLowerCase();
            if (str.equals("=")) {
                System.out.println("Введите число еще раз!");
                return parsing();
            } else if (lower.equals("число")) {
                System.out.println("Вы вели не понятные символы. Введите число еще раз");
                return parsing();
            } else {
                result = Integer.parseInt(str);
            }
        } catch (
                NumberFormatException e) {
            System.out.println("Я не понимаю что вы пишите!? Введите число еще раз!");
            return parsing();
        }
        return result;
    }
}
