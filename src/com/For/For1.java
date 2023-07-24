package com.For;

public class For1{
    public static void main(String[] args) {
        double dollars = 24;
        for (int i = 1626; i < 2023; i++) {
            dollars = dollars + 0.05 * dollars;
        }
        System.out.printf("%.2f $", dollars);
    }
}
