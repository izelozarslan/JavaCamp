package com.company;

public class Main {

    public static void main(String[] args) {
	    sayiBulmaca();
    }

    //camel case
    public static void sayiBulmaca(){
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
            mesajVer("Sayı mevcuttur" + aranacak);
        } else {
            mesajVer("Sayı mevcut değildir: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
