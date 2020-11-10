package ro.fasttrackit.temaCurs7;

import java.util.Scanner;

public class PasswordCheckGood {
    public static final int lenghtPass = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a password: ");
        String s = input.nextLine();

        if (isPasswordValid(s) && hasAtLeastThreeDigits(s)) {
            System.out.println(s + " Password is valid! ");
        } else {
            System.out.println(s + " Not a valid password! ");
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
                continue;
            } else if (Character.isDigit(c)) {

                number = true;
                continue;
            } else if (Character.isUpperCase(c)) {

                upper = true;
                continue;
            } else {
                if (!lower) {
                    System.out.println("Password must contain at least one lowercase character!");
                    continue;
                }
                if (!upper) {
                    System.out.println("Password must contain at least one uppercase character!");
                    continue;
                }
                if (!number) {
                    System.out.println("Password must contain at least three digits!");
                    continue;
                }
                continue;
            }
        }
        return false;
    }

    public static boolean hasAtLeastThreeDigits(String password) {
        int charCount = 0;
        int numCount = 0;
        boolean hasNumbers = false;
        boolean hasDigits = false;

        for (int a = 0; a < password.length(); a++) {
            if (numCount >= 3) {
                hasNumbers = true;
                continue;
            }
            if (charCount >= 3) {
                hasDigits = true;
                continue;
            } else {
                if (!hasDigits) {
                    System.out.println("Password must contain at leat 3 leters.");
                }
                if (!hasNumbers) {
                    System.out.println("Password must contain at leat 3 digits.");
                }
            }
        }
        return (charCount >= 3 && numCount >= 3);
    }

}

