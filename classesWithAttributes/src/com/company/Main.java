package com.company;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 3, 3000, "siyah");
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        //SOLID S-> Single Responsibility Prensible : 1 class, 1 method,1 if 1 işi yapar

        System.out.println(product.getKod());


    }
}
