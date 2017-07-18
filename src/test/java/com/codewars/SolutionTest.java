package com.codewars;

/**
 * Created by carlvarn on 18/07/2017.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeUnderscoreUpperStart() {
        String input = "The_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("TheStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeDashUpperStart() {
        String input = "The-stealth-warrior";
        System.out.println("input: "+input);
        assertEquals("TheStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeUpperStart() {
        String input = "The";
        System.out.println("input: "+input);
        assertEquals("The", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeLowerStart() {
        String input = "the";
        System.out.println("input: "+input);
        assertEquals("the", Solution.toCamelCase(input));
    }

    @Test
    public void testOneLetter() {
        String input = "t";
        System.out.println("input: "+input);
        assertEquals("t", Solution.toCamelCase(input));
    }

    @Test
    public void testEmpty() {
        String input = "";
        System.out.println("input: "+input);
        assertEquals("", Solution.toCamelCase(input));
    }
}