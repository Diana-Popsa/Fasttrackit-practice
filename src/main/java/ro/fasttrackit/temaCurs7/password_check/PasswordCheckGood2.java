package ro.fasttrackit.temaCurs7.password_check;

import java.util.Scanner;

public class PasswordCheckGood2 {
    public static final int lenghtPass = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a password: ");
        String password = input.nextLine();

        if (isPasswordValid(password)) {
            System.out.println(" Password is valid! " + password);
        } else {
            System.out.println(" Not a valid password! " + password);
        }

    }


    public static boolean isPasswordValid(String password) {
        boolean valid = false;
        if (password.length() < lenghtPass) {
            System.out.println("Password must contain at least 12 characters!");
            valid = false;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            boolean upper = false;
            boolean lower = false;
            boolean number = false;
            int charCount = 0;
            int numCount = 0;
            boolean hasNumbers = false;

            if (Character.isLowerCase(c)) {
                charCount++;
                lower = true;

            }
            if (Character.isDigit(c)) {
                numCount++;
                number = true;

            }
            if (Character.isUpperCase(c)) {
                charCount++;
                upper = true;
            }
            if (Character.isDigit(c) && numCount >= 3) { // password.chars().filter(Character::isDigit).count()) NOT WORKING
                hasNumbers = true;
            } else {
                if (!lower) {
                    System.out.println("Password must contain at least one lowercase character!");
                } else if (!upper) {
                    System.out.println("Password must contain at least one uppercase character!");
                } else if (!number) {
                    System.out.println("Password must contain at least three digits!");
                } else if (!hasNumbers) {
                    System.out.println("Password must contain at least 3 digits.");
                }
            }
        }
        return true;
    }

//    public static boolean hasAtLeastThreeDigits(String password) {
//        int numCount = 0;
//        boolean hasNumbers = false;
//
//        for (int a = 0; a < password.length(); a++) {
//            if (numCount > 3) {
//                hasNumbers = true;
//            }
//            if (false) {
//                System.out.println("Password must contain at least 3 digits.");
//            }
//        }
//
//        return true;
//    }

}

