package com.gyadav.practice.educative.iterationtorecursion;

public class IterativeClass {
    public static int countDigits (int num) {
        if (num == 0)
            return 0;
        return 1 + countDigits(num/10);
    }


    public static void main( String args[] ) {
        int input = 1435043;
        int numDigits = countDigits(input);
        System.out.println("Number of digits in " + input + " = " + numDigits);
    }
}
