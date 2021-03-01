package edu.wctc;

public class UnknownGenderCodeException extends Exception {

    public String UnknownGenderCodeException(char genderCode) {
        return genderCode + " was not a valid answer";
    }

}
