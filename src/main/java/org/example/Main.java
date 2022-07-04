package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("First task");
        oneOperation();
        System.out.println("Second task");
        severalOperations();
        System.out.println("Third task");
        int i1 = scanNumber("Input first number: ");
        int i2 = scanNumber("Input second number: ");
        addition(i1, i2);
        subtraction(i1, i2);
        multiplication(i1, i2);
        division(i1, i2);
        modulation(i1, i2);
        System.out.println("Fourth task");
        sumArray();
        System.out.println("Fifth task");
        duplArray();
    }

    static void oneOperation() {
        System.out.println(74+36);
    }

    static void severalOperations() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    private static int scanNumber (String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int addition(int a, int b) {
        System.out.format("%d + %d = %d \n", a, b, a+b);
        return a+b;
     }

    static int subtraction(int a, int b) {
        System.out.format("%d - %d = %d \n", a, b, a-b);
        return a-b;
    }

    static int multiplication(int a, int b) {
        System.out.format("%d * %d = %d \n", a, b, a*b);
        return a*b;
    }

    static int division(int a, int b) {
        System.out.format("%d / %d = %d \n", a, b, a/b);
        return a/b;
    }

    static int modulation(int a, int b) {
        System.out.format("%d mod %d = %d \n", a, b, a%b);
        return a%b;
    }

    static int sumArray() {
        int[] array = {5,6,7,12,-5,32,43};
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println(sum);
        return sum;
    }

    static void duplArray() {
        int[] array = {5,6,7,12,-5,32,43,6,12};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}