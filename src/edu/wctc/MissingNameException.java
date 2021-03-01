package edu.wctc;

public class MissingNameException extends Throwable {

    public String MissingNameException(String nameType) {
        return nameType + " cannot be blank";
    }
}
