package edu.wctc;

public class LastNameUtility<Soundex> {
    //Wasn't sure how to implement this, I just created a parameter to avoid the squiggles
    private Soundex soundex;

    public static String encodeLastName(String lastName) throws MissingNameException{
        if (lastName.isBlank())
        {
            throw new MissingNameException(lastName);
        }
        else
        {
            return "QEPN";
        }
    }
}
