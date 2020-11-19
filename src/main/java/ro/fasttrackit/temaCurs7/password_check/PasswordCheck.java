package ro.fasttrackit.temaCurs7.password_check;


import java.util.Scanner;

public class PasswordCheck {      // cum e mai ok la RAND 53: onlyLettersAndNum <= 0 sau <1?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a password: ");
        String password = input.nextLine();
        System.out.println(password + " " + passwordCheck(password));
    }

    public static String passwordCheck(String password) {
        String result = "";
        int length = 0;
        int numCount = 0;
        int upperCount = 0;
        int lowCount = 0;
        int i;
        int onlyLettersAndNum = 0;
        for (i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65
                    && password.charAt(i) <= 90) || (password.charAt(i) >= 97 && password.charAt(i) <= 122)) {

            } else {
                onlyLettersAndNum++;
            }
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numCount++;
            }
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                upperCount++;
            }
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                lowCount++;
            }
            length = (i + 1);
        }
        if (onlyLettersAndNum > 0) {
            result = result + "\nPassword must contain only letters and numbers!";
        }
        if (numCount < 3) {
            result = result + "\nPassword must contain at least 3 digits!";
        }
        if (upperCount < 1) {
            result = result + "\nPassword must contain at least one uppercase letter!";
        }
        if (length < 12) {
            result = result + "\nPassword must contain at least 12 characters!";
        }
        if (lowCount < 1) {
            result = result + "\nPassword must contain at least one lowercase letter!";
        }
        if (numCount >= 3 && upperCount >= 1 && length >= 12 && lowCount >= 1 && onlyLettersAndNum <= 0) {
            System.out.println(password + "Password is valid!");
        }
        return result;
    }


}
