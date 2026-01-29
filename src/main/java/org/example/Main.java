package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Операция (+ - * /): ");
        char op = scanner.next().charAt(0);

        int result;

        switch (op) {
            case '+':
                result = calc.add(a, b);
                break;
            case '-':
                result = calc.sub(a, b);
                break;
            case '*':
                result = calc.mul(a, b);
                break;
            case '/':
                result = calc.div(a, b);
                break;
            default:
                System.out.println("Неизвестная операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
