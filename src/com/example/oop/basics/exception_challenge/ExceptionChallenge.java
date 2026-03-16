package com.example.oop.basics.exception_challenge;

public class ExceptionChallenge {
    public static void main(String[] args) {
        try {
            int result = 12 / 0;
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Program continues.");
        }

        try {
            throw new TestException();
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
