/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.time.Year;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int currentAge = scan.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retirementAge = scan.nextInt();

        System.out.println(yearsLeftInfo(currentAge, retirementAge));
        System.out.println(retirementInfo(currentAge, retirementAge));
    }

    public static String yearsLeftInfo(int currentAge, int retirementAge) {
        return "You have " + yearsLeft(currentAge, retirementAge) + " years left until you can retire.";
    }

    public static int yearsLeft(int currentAge, int retirementAge) {
        return retirementAge - currentAge;
    }

    public static String retirementInfo(int currentAge, int retirementAge) {
        int currentYear = Year.now().getValue();
        return "It's " + Year.now().getValue() + ", so you can retire in " +
                (currentYear + yearsLeft(currentAge, retirementAge)) + ".";
    }
}