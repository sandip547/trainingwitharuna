package com.info;

public class SwitchExample {
    public static void main(String[] args) {
        char check = 'B';
        switch (check) {
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case 'C':
                System.out.println("Cherry");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }
}
