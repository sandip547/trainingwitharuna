package com.info;

public class Product {

    int productId;
    String productName;

    Product(int productId, String productName){
        this.productId = productId;
        this.productName = productName;

    }


    public static void main(String[] args) {

        Product productOne = new Product(1,"Laptop");

        System.out.println(productOne.productId + productOne.productName);

        Product productTwo = new Product(2,"Mobile");
        System.out.println(productTwo.productId + productTwo.productName);

    }
}
