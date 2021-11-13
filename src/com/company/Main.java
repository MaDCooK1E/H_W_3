package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Простой калькулятор, который проводит оперецию на последним значением");
        Scanner scanner= new Scanner(System.in);
        String all=scanner.nextLine();
        String[] operators = all.split("[0-9]+");
        String[] digits = all.split("[*+/=-]");
        Float[] intDigits = new  Float[digits.length];

        int i;
        for (i = 0; i < digits.length ; i++) {
            intDigits[i]=  Float.valueOf(digits[i]);

        }  Float equals=intDigits[0];

        for (i =0; i< operators.length;i++) {
            switch (operators[i]) {
                case "+":
                    equals+=intDigits[i];
                    break;
                case "-":
                    equals-=intDigits[i];
                    break;
                case "*":
                    equals*=intDigits[i];
                    break;
                case "/":
                    equals/=intDigits[i];
                    break;
                case "=":
                    System.out.println(equals);
                    break;
            }
        }}
}
