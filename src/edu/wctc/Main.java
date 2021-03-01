package edu.wctc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //scanner
        Scanner scanner = new Scanner(System.in);

        //user input/output
        System.out.println("Enter your First Name:");
        String userFirstName = scanner.nextLine();

        System.out.println("Enter your Middle Initial:");
        String userMiddleInitial = scanner.nextLine();

        System.out.println("Enter your Last Name:");
        String userLastName = scanner.nextLine();

        System.out.println("Enter your Year of Birth (YYYY):");
        int userBirthYear = scanner.nextInt();

        System.out.println("Enter your Month of Birth (1 - 12):");
        int userBirthMonth = scanner.nextInt();

        System.out.println("Enter your Day of Birth (1 - 31):");
        int userBirthDay = scanner.nextInt();

        System.out.println("Enter your Gender (M or F):");
        char userGender = scanner.next().charAt(0);

        //I'm sure there's an easier way to do this
        String birthYearToString = String.valueOf(userBirthYear);
        String birthYearToTwoDigits = birthYearToString.substring(2, birthYearToString.length() - 2);
        int birthYearBackToInt = Integer.parseInt(birthYearToTwoDigits);

    try
    {
        //license object
        DriversLicense userLicense = new DriversLicense();

        //setting the fields with userInput
        userLicense.setFirstNameMiddleInitial(FirstNameUtility.encodeFirstName(userFirstName, userMiddleInitial));
        userLicense.setSoundexCode(LastNameUtility.encodeLastName(userLastName));
        userLicense.setBirthMonthDayGender(MonthDayGenderUtility.encodeMonthDayGender(userBirthYear, userBirthMonth, userBirthDay, userGender));
        userLicense.setBirthYear(birthYearBackToInt);
        userLicense.setOverflow(00);

        //prints formatted license
        System.out.println(new FloridaFormatter().formatLicenceNumber(userLicense));
        System.out.println(new WisconsinFormatter().formatLicenceNumber(userLicense));

    }
    catch(InvalidBirthdayException birthdayTrouble)
    {
        System.out.println("Your birthday was invalid");
    }
    catch(UnknownGenderCodeException genderTrouble)
    {
        System.out.println("That gender was unknown");
    }
    catch(MissingNameException nameTrouble)
    {
        System.out.println("You did not enter a name");
    }
    }
}
