package com.info;

public class ArExample {
    public static void main(String[] args) {
        int numOne = 9;
        int numTwo = 5;

        int sum = numOne + numTwo;
        System.out.println(sum);

        int product = numOne * numTwo;
        System.out.println(product);

        int difference = numOne - numTwo;
        System.out.println(difference);

        int division = numOne / numTwo;
        System.out.println(division);

        int remainder = numOne % numTwo;
        System.out.println(remainder);


        int a = 5;

        System.out.println(a++);
        int b = a + 3;
        System.out.println(a);
        System.out.println(b);

        int k = 22;
        k %=8;
        System.out.println(k);

        System.out.println(k == a);

    }
}
