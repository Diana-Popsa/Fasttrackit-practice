package ro.fasttrackit.temaCurs7;

import java.util.Scanner;

public class PasswordCheck {
    public static final int LenghtPass = 12;
    // NOT WORKING

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a password: ");
        String s = input.nextLine();

        if (isPasswordValid(s)) {
            System.out.println(s + "Password is valid! ");
        } else {
            System.out.println(s + "Not a valid password! ");
        }

    }

    public static boolean isPasswordValid(String password) {

        if (password.length() < LenghtPass) {
            System.out.println("Password must contain at least 12 characters!");
            return false;
        }

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (containsNumbers(ch)) numCount++;
            else if (containsUpperCases(ch)) charCount++;
            else if (containsLowerCases(ch)) charCount++;
            else {
                return false;
            }
        }
        if (numCount < 3) {
            System.out.println("Password must contain at least 3 digits.");
            return false;
        }
        return (charCount >= 3 && numCount >= 3);


    }


    public static boolean containsUpperCases(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch >= 'A' && ch <= 'Z') ;
        System.out.println("Password must contain upper and lower cases.");
        return true;
    }

    public static boolean containsLowerCases(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') ;
        System.out.println("Password must contain upper and lower cases.");
        return true;
    }

    public static boolean containsNumbers(char ch) {
        if (ch >= '0' && ch <= '9') ;
        System.out.println("Password must contain at least three digits!");
        return true;
    }
}


