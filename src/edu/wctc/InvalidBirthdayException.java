package edu.wctc;

public class InvalidBirthdayException extends Exception {

    public InvalidBirthdayException(int year, int month, int day) {

        System.out.println("Invalid year, month and day");

    }

}
