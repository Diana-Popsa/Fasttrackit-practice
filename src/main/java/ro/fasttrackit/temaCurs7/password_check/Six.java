package ro.fasttrackit.temaCurs7.password_check;

import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid!");
        }
    }
    public static boolean isValid(String password) {
        if (password.length() < 12) {
            return false;
        } else {
            char c;
            int count = 1;
            for (int i = 0; i < password.length() - 1; i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                    if (count < 2)   {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
