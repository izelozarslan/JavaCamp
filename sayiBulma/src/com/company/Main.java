package com.company;

public class Main {

    public static void main(String[] args) {
        //aranacak olan sayı sayıların içinde var mı
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 25;
        boolean isExists = false;

        for (int sayi : sayilar) {
            if (aranacak == sayi) {
                isExists = true;
                break;

            }
        }
        if (isExists) {
            System.out.println("Sayı mevcuttur.");
        } else {
            System.out.println("Sayı mevcut değildir.");
        }


    }
}
