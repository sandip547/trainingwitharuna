package com.info.inheritance;

public class RunCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result of Calculator: " + calc.add(5, 10));

        AdvanceCalculator calculator = new AdvanceCalculator();
        System.out.println("Result of AdvanceCalculator: " + calculator.add(5, 10));

        VeryAdvanceCalculator advanceCalculator  = new VeryAdvanceCalculator();
        System.out.println("Result of VeryAdvanceCalculator: " + advanceCalculator.add(5, 10));
    }
}
