package com.projekt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static com.projekt.NextOperation.parsing2;
import static com.projekt.FirstOperation.parsing;


public class Calculator {
    static ArrayList list = new ArrayList();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String equality = "=";
    static int result = 0;

    public static void main(String[] args) throws IOException {
        parsing();
        parsing2();
    }
}
