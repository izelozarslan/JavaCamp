package com.company;

public class Main {

    public static void main(String[] args) {
        int number = -5;
        int remainder; //kalan
        boolean isPrime = true; //prime = asal demek

        if(number ==1){
            System.out.println("Sayı asal değildir.");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
            return;
        }

        for(int i = 2; i < number; i++){
            remainder = number % i;
            if(remainder == 0) {
                isPrime = false;
            }}

        if(isPrime){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }


    }
}



