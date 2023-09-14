package com.projekt;

import java.io.IOException;

public class NextOperation extends FirstOperation {
    static Integer parsing2() throws IOException {
        while (equality.equals("=")) {
            System.out.print("Введите знак:");
            String string = reader.readLine();
            switch (string) {
                case "+":
                    plus();
                    break;
                case "-":
                    minus();
                    break;
                case "*":
                    multiply();
                    break;
                case "/":
                    division();
                    break;
            }
            if (string.equals("=")) {
                System.out.println("Результат: " + result);
                System.out.println("Хотите считать еще? Y да N нет");
                String st = reader.readLine();
                String low = st.toLowerCase();
                    if (low.equals("y") | low.equals("yes") | low.equals("да")) {
                        result = 0;
                        parsing();
                        parsing2();
                    } else if (st.equals("n") | st.equals("no") | st.equals("нет")) {
                        equality = "";
                    } else {
                        System.out.println("До свидания!");
                        equality = "";
                    }
                    break;
                }
            }
        return result;
        }
    }
