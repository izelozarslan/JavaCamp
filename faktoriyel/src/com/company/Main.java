package com.company;

public class Main {
    public static void main(String[] args) {
        int num = 4;
        int result = FirstFactorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }

    public static int FirstFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * FirstFactorial(num - 1);
        }
    }
}
