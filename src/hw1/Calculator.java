package hw1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Enter an operation: ");
        char operation = keyboard.next().charAt(0);
        System.out.println("Enter a second number: ");
        int num2 = keyboard.nextInt();
        if ('+' == operation) {
            System.out.println("The answer is " + (num1 + num2));
        } else if ('-' == operation) {
            System.out.println("The answer is " + (num1 - num2));
        } else if ('*' == operation) {
            System.out.println("The answer is " + (num1 * num2));
        } else if ('/' == operation) {
            System.out.println("The answer is " + (num1 / num2));
        } else if ('%' == operation) {
            System.out.println("The answer is " + (num1 % num2));
        } else {
            System.out.println("Invalid operation");
        }

    }
}
