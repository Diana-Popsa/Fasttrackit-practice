package ro.fasttrackit.temaCurs7.password_check;

import java.util.Scanner;

public class Three {
    public static final int LenghtPass = 12;

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
        if (true) {
            int count = 0;
            for (int i = 0; i <= 9; i++) {
                String str = Integer.toString(i); // convert int to string

                if (password.contains(str)) {
                    count = 1;
                }
            }
            if (count >= 3) {
                System.out.println("Password must contain at least 3 digits!");
                return false;
            }
        }
        if (true) {
            int count = 0;

            for (int i = 65; i <= 90; i++) {
                char c = (char) i;

                String str = Character.toString(c);
                if (password.contains(str)) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("Password must contain uppercase letters!");
                return false;
            }
        }
        if (true) {
            int count = 0;

            for (int i = 90; i <= 122; i++) {
                char c = (char) i;
                String str = Character.toString(c);

                if (password.contains(str)) {
                    count = 1;
                }
            }
            if (count == 0) {
                System.out.println("Password must contain lowercase letters!");

                return false;
            }
        }
        return true;
    }
}
