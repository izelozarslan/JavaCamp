package com.company;

public class Main {

    public static void main(String[] args) {
        //pozitif tam bölenlerini kendine eşit olan sayı. Örneğin 6 = 1+2+3 , 28 = 1,2,4,7,14

        int number = 6;
        int total = 0; //shift + f6 aynı kelimelerin adını değiştirme
        boolean isPerfect = false;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            isPerfect = true;

        } else {
            isPerfect = false;
        }


        System.out.println(isPerfect);
    }
}
