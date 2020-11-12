package ro.fasttrackit.temaCurs7.password_check;

import java.util.Scanner;

public class PasswordCheckGood2 {
    public static final int lenghtPass = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a password: ");
        String s = input.nextLine();

        if (isPasswordValid(s) && hasAtLeastThreeDigits(s)) {
            System.out.println(" Password is valid! " + s);
        } else {
            System.out.println(" Not a valid password! " + s);
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

            if (Character.isLowerCase(c)) {

                lower = true;
            } else if (Character.isDigit(c)) {

                number = true;
            } else if (Character.isUpperCase(c)) {

                upper = true;
            } else {
                if (!lower) {
                    System.out.println("Password must contain at least one lowercase character!");

                }
                if (!upper) {
                    System.out.println("Password must contain at least one uppercase character!");

                }
                if (!number) {
                    System.out.println("Password must contain at least three digits!");

                }
            }
        }
        return true;
    }

    public static boolean hasAtLeastThreeDigits(String password) {
        int charCount = 0;
        int numCount = 0;
        boolean hasNumbers = false;
        boolean hasDigits = false;

        for (int a = 0; a < password.length(); a++) {
            if (numCount >= 3) {
                hasNumbers = true;
            }
            if (charCount >= 3) {
                hasDigits = true;

            } else {
                if (!hasDigits) {
                    System.out.println("Password must contain at least 3 letters.");
                }
                if (!hasNumbers) {
                    System.out.println("Password must contain at least 3 digits.");
                }
            }
        }
        return true;
    }

}

