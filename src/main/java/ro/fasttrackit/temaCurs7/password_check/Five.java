package ro.fasttrackit.temaCurs7.password_check;

import java.util.Scanner;

public class Five { //TODO If it is invalid: the password is print and all rules which are not fulfilled
    public static void main(String[] args) {
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Your Password:");
        password = scan.nextLine();

        if (check(password)) {
            System.out.println(password + "Password is valid!");
        }
    }

    public static boolean check(String password) {

        boolean uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean flag = false;
        boolean counter = false;
        int count = 0;

        if (password.length() >= 12) {

            for (int i = 0; i < password.length(); i++) {

                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    return false;
                }

                if (Character.isDigit(password.charAt(i)) && !digit) {
                    digit = true;

                }

                if (Character.isUpperCase(password.charAt(i)) && !uppercase) {
                    uppercase = true;

                }

                if (Character.isLowerCase(password.charAt(i)) && !lowercase) {
                    lowercase = true;
                }
                if (Character.isDigit(password.charAt(i)) && count >= 3) {
                    counter = true;
                }

            }
        }

        if (digit && uppercase && lowercase && counter) {
            flag = true;
        }
        return flag;
    }
}

