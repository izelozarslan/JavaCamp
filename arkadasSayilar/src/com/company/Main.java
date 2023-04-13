package com.company;

public class Main {

    public static void main(String[] args) {
        //220-284 arkadaş sayılar: İki sayı birbirinin kendisi hariç bölenleri toplamına eşit
        //sayi1 bolenleeri toplami esit mi sayi2 ,sayi2 bolenleri toplami eşit mi sayi1
        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 += i;
            }
        }

        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                total2 += j;
            }
        }

        if (total1 == number2 && total2 == number1) {
            System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
        } else {
            System.out.println("Sayılar arkadaş sayı değildir.");
        }

    }
}
