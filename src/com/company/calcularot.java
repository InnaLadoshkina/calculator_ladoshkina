package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcularot {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите первое число: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double a = 0, b = 0, result = 0;
            try {
                a = Integer.parseInt(reader.readLine());
                System.out.print("Введите второе число: ");
                b = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.print("Error: " + e.getMessage());
            }
            System.out.println("Введите знак операции: ");
            BufferedReader raed = new BufferedReader(new InputStreamReader(System.in));
            String sing = "";
            try {
                sing = raed.readLine();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println("a: " + a + " b:  " + b + " sing: " + sing);
            switch (sing) {
                case "+": {
                    result = a + b;
                    break;
                }
                case "-": {
                    result = a - b;
                    break;
                }
                case "/": {
                    result = a / b;
                    break;
                }
                case "*": {
                    result = a * b;
                    break;
                }
            }
            System.out.println(result + " Результат расчета");
        }
    }
}
