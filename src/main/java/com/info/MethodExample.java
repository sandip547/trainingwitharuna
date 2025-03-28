package com.info;

public class MethodExample {

    int add(int a, int b){
        return a + b;
    }
    int subtract(int a, int b){
        return a - b;
    }
    int multiply(int a, int b){
        return a * b;
    }

    int test(){
        return  multiply(6,7);
    }

    public static void main(String[] args) {
        MethodExample methodExample = new MethodExample();
        System.out.println(methodExample.add(8,9));

        int sum = methodExample.add(5,7);
        System.out.println(sum);

        System.out.println(methodExample.multiply(5,5));

        System.out.println(methodExample.test());
    }
}
