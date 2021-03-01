package edu.wctc;

public class MonthDayGenderUtility {
    //Fields
    private	static final int MOD_MALE = 0;
    private	static final int MOD_FEMALE = 500;
    private	static final char CODE_MALE = 'M';
    private	static final char CODE_FEMALE = 'F';

    public static int encodeMonthDayGender(int year, int month, int day, char genderCode)
    throws UnknownGenderCodeException, InvalidBirthdayException
    {

        if(!(genderCode == CODE_FEMALE || genderCode == CODE_MALE)) {
            throw new UnknownGenderCodeException(genderCode);
        }

        if (year > 2021 || month < 1 || month > 12 || day < 1 || day > 31) {
            throw new InvalidBirthdayException(year, month, day);
        }

        if (genderCode == 'M')
        {
            //male return
            return (month - 1) * 40 + day + MOD_MALE;
        }
        else if (genderCode == 'F')
        {
            //female return
            return (month - 1) * 40 + day + MOD_FEMALE;
        }
        else
        {
            //stops the error from running
            return 0;
        }
    }
}
