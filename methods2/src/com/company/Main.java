package com.company;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        int sayi = topla(5,7);
        System.out.println(sayi);
        int toplam = topla2(3,4,5,8,12);
        System.out.println(toplam);
    }

    //void fonksiyonlar bir çıktı vermez,sadece işlemi yapar.
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Silindi");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1 +sayi2;
    }

    //variable arguments -> int... -> birden fazla int demek (test edilebilirliği zayıflatır)
    public static int topla2(int... sayilar){
        int toplam =0;
        for(int sayi: sayilar){
            toplam +=sayi;
        }
        return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }

}
