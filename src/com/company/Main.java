package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double[] Prices = new Double[3];
        Prices[0] = 7.99;
        Prices[1] = 10.99;
        Prices[2] = 13.99;
        Prices[3] = 1.25;
        double priceTot = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("what size pizza do you want?");
            try {
                String size = input.next();
                String lowerSize = size.toLowerCase();
                if (lowerSize.equals("small")){
                    priceTot = Prices[0];
                }else if (lowerSize.equals("medium")){
                    priceTot = Prices[1];
                }else if (lowerSize.equals("large")){
                    priceTot = Prices[2];
                } else {
                    System.out.println("this is not an option");
                }
            } catch (InputMismatchException e) {
                System.out.println("this is a number not an option "+ e );
                input.next();
            }
        }
    }
}
