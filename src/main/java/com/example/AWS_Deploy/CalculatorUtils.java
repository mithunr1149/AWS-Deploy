package com.example.AWS_Deploy;

/**
 * This class contains utility methods for basic mathematical and string operations.
 */
public class CalculatorUtils {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplies two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divides a by b, throws exception if b == 0
    public int divide(int a, int b) {
        if (b == 0) {
        	System.out.println("Cannot Divide by zero");
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        System.out.println("Division Success");
        return a / b;
    }

    // Checks if a number is prime
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        if(true) {
        	System.out.println("It is a Prime Number");
        }
        return true;
    }

    // Reverses a given string
    public String reverseString(String input) {
        if (input == null) {
        	System.out.println("No STring found hence returning null");
        	return null;
        }
        else {
        StringBuilder sb = new StringBuilder();
        
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        System.out.println("The reversed String is : " +sb);
        return sb.toString();
        }
    }

    // Returns factorial of a number (non-recursive)
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Checks if a number is even
    public boolean isEven(int n) {
        return n % 2 == 0;
    }
}

