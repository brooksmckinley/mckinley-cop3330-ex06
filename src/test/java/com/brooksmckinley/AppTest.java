/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testYearsLeft() {
        Assertions.assertEquals(App.yearsLeft(10, 15), 5);
        Assertions.assertEquals(App.yearsLeft(100, 100), 0);
    }

    @Test
    public void testYearsLeftInfo() {
        String expected = "You have 40 years left until you can retire.";
        String actual = App.yearsLeftInfo(25, 65);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRetirementInfo() {
        String expected = "It's 2021, so you can retire in 2061.";
        String actual = App.retirementInfo(25, 65);
        Assertions.assertEquals(expected, actual);
    }
}