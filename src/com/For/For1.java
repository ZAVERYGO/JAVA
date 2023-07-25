package com.For;
/*1. В 1626 году индейцы продали Манхэттен за 24$.
        Написать программу, которая высчитывает сумму, получившуюся бы в
        текущем году, если бы индейцы положили эти деньги в банк под 5% годовых.*/
public class For1{
    public static void main(String[] args) {
        double dollars = 24;
        for (int i = 1626; i < 2023; i++) {
            dollars = dollars + 0.05 * dollars;
        }
        System.out.printf("%.2f $", dollars);
    }
}
