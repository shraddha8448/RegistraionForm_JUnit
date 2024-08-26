package org.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

    private static final String userFirstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
    private static final String userLastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
    private static final String emailIdRegex = "(^[a-z A-Z 0-9]+([-._]?[a-zA-Z0-9]+)*\\@[A-Z a-z 0-9]+\\.[a-z A-z]{2,})$";
    private static final String mobNoRegex = "^\\+\\d{1,3}\\s\\d{4,14}$";


    public static boolean validateUserFirstName(String firstName) {
        return Pattern.matches(userFirstNameRegex, firstName);
    }

    public static boolean validateUserLastName(String lastName){
        return Pattern.matches(userLastNameRegex,lastName);
    }

    public static boolean validateEmailId(String emailId){
        return Pattern.matches(emailIdRegex,emailId);
    }

    public static boolean validateMobNo(String mobNo){
        return Pattern.matches(mobNoRegex,mobNo);
    }

}