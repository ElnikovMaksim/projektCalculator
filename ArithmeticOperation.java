package com.projekt;

import java.io.IOException;

public class ArithmeticOperation extends Calculator {

    static Integer plus() throws IOException {
        System.out.println("Введите число:");
        try {
            String p = new String(reader.readLine());
            String lower = p.toLowerCase();
            if (lower.equals("=")) {
                System.out.println("Результат: " + result);
            }
            result = result + Integer.parseInt(p);
        } catch (NumberFormatException e) {

            System.out.println("Вы ввели не число, будьте внимательнее!");
            return plus();
        }
        return result;
    }

    static Integer minus() throws IOException {
        System.out.println("Введите число:");
        try {
            String m = reader.readLine();
            if (m.equals("=")) {
                System.out.println("Результат: " + result);
            }
            result = result - Integer.parseInt(m);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число, будьте внимательнее!");
            return minus();
        }
        return result;
    }

    static Integer multiply() throws IOException {
        System.out.println("Введите число:");
        try {
            if (result == 0) {
                System.out.println("Вы собираетесь умножить 0 на число!");
            }
            String s = reader.readLine();
            if (s.equals("=")) {
                System.out.println("Результат: " + result);
            }
            int num = Integer.parseInt(s);
            result = result * num;
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число, будьте внимательнее!");
            return multiply();
        }
        return result;
    }

    static Integer division() throws IOException {
        System.out.println("Введите число:");
        try {
            String d = reader.readLine();
            if (d.equals("=")) {
                System.out.println(result);
            } else if (d.equals("0")) {
                System.out.println("Делить на 0 нельзя!");
                return division();
            }
            result = result / Integer.parseInt(d);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число, будьте внимательнее!");
            return division();
        }
        return result;
    }
}
