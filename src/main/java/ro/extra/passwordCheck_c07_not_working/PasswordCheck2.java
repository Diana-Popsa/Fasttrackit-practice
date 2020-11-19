package ro.extra.passwordCheck_c07_not_working;

import java.util.Scanner;
// NOT WORKING
// prints the message for each char


public class PasswordCheck2 {
    public static final int lengthPass = 12;

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
        if (password.length() < lengthPass) {
            System.out.println("Password must contain at least 12 characters!");
        }
        int i = 0;
        char c = password.charAt(i);
        int charCount = 0;
        int numCount = 0;
        for (; i < password.length(); i++) {
            if (Character.isLowerCase(c)) {
                charCount++;
            }
            if (Character.isUpperCase(c)) {
                charCount++;
            }
            if (Character.isDigit(c)) {
                numCount++;
            }
            if (Character.isDigit(c) && numCount >= 3) {
                password.chars().filter(Character::isDigit).count();  //NOT WORKING
            } else {
                if (!Character.isLowerCase(c)) {
                    System.out.println("Password must contain at least one lowercase character!");
                }
                if (!Character.isDigit(c)) {
                    System.out.println("Password must contain at least one uppercase character!");
                }
                if (!Character.isUpperCase(c)) {
                    System.out.println("Password must contain at least three digits!");
                }
                if (numCount < 3) {
                    System.out.println("Password must contain at least 3 digits.");
                }
            }
            if (Character.isLowerCase(c) && Character.isUpperCase(c) && Character.isDigit(c) && numCount >= 3) {
                return true;
            }
        }
        return false;
    }

}

