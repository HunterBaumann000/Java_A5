package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenceNumber(DriversLicense driversLicense) {

        String floridaLicense =
                driversLicense.getSoundexCode() + "-" +
                driversLicense.getFirstNameMiddleInitial()  + "-" +
                driversLicense.getBirthYear()  + "-" +
                driversLicense.getBirthMonthDayGender()  + "-" +
                String.valueOf(driversLicense.getOverflow()).charAt(0);

        return floridaLicense;
    }
}