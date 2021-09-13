package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App {
    public static void main(String[] args) {
        int year;
        double principle, rate, interest;
        System.out.println("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        principle = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        rate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        year = input.nextInt();
        interest = principle * (rate * 0.01);
        System.out.println("After " + year + " years at " + rate + "%, the investment will be worth $" + (principle + (interest * year)));
    }
}
