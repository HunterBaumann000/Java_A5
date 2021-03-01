package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{

    public String formatLicenceNumber(DriversLicense driversLicense) {

        String wisconsinLicense =
                driversLicense.getSoundexCode() + "-" +
                driversLicense.getFirstNameMiddleInitial()  + "" +
                String.valueOf(driversLicense.getBirthYear()).charAt(2)  + "-" +
                String.valueOf(driversLicense.getBirthYear()).charAt(3) + "" +
                driversLicense.getBirthMonthDayGender()  + "-" +
                driversLicense.getOverflow();



        return wisconsinLicense;
    }
}

