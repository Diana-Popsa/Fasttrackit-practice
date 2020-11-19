package ro.extra.passwordCheck_c07_not_working;

import java.util.Scanner;

public class NotWorkingPasscheck {
    public static void main(String[] args) {
        int min = 12;
        int digit = 0;
        int upCount = 0;
        int lowCount = 0;
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Your Password:");
        password = scan.nextLine();

        if (password.length() >= min) {
            int i;
            for (i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    upCount++;
                }
                if (Character.isLowerCase(c)) {
                    lowCount++;
                }
                if (Character.isDigit(c)) {
                    digit++;
                }
            }
            if (lowCount >= 1 && upCount >= 1 && digit >= 3) {
                System.out.println(password + " Password is valid:");
            }

        }
        if (password.length() < min) {

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isLowerCase(c)) {
                    lowCount++;
                }
            }

            if (lowCount > 0) {
                System.out.println(password + " Password must be at least " + min + " characters:");
                System.out.println(" You need at least one upper case letter:");
                System.out.println(" You need at least 3 digit:");

            }
        } else if (password.length() < min && upCount > 1) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isLowerCase(c)) {
                    lowCount++;
                }
                if (Character.isUpperCase(c)) {
                    upCount++;
                }
            }
            if (lowCount > 0 && upCount > 0) {
                System.out.println(password + " Password must be at least " + min + " characters:");
                System.out.println(" You need at least 3 digits!");
            }
            if (password.length() >= min && lowCount > 0 && upCount > 0 && digit == 0) {
                System.out.println(password + " You need at least three digit!");
                System.out.println(" You need at least one special character!");
            }
        }
    }
}
