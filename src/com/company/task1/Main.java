package com.company.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calcAdd = (n1, n2) -> n1 + n2;
        System.out.println(calcAdd.calculate(30, 50));
        Calculator calcDivision = (n1, n2) -> n1 / n2;
        System.out.println(calcDivision.calculate(20, 10));
        Calculator calcMultiplication = (n1, n2) -> n1 * n2;
        System.out.println(calcMultiplication.calculate(15, 20));

    }

}
