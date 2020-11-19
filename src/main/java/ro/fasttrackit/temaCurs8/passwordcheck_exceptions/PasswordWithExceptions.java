package ro.fasttrackit.temaCurs8.passwordcheck_exceptions;

import java.util.Scanner;

// nu printeza nimic la getMessage
// cum e mai ok la RAND 53: onlyLettersAndNum <= 0 sau <1?
public class PasswordWithExceptions {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Input a password: ");
            String password = input.nextLine();
            passwordCheck(password);
        } catch (InvalidPasswordException ipe) {
            System.out.println("Password Invalid\n" + ipe.getMessage());
            ;
        }
    }

    public static void passwordCheck(String password) throws Exception {
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
            if ((password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
                numCount++;
            }
            if ((password.charAt(i) >= 65 && password.charAt(i) <= 90)) {
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

        if (numCount >= 3 && upperCount >= 1 && length >= 12 && lowCount >= 1 && onlyLettersAndNum < 1) {
            System.out.println(password + " Password is valid!");
        }
        if (!result.isBlank()) {
            throw new InvalidPasswordException(result);
        }
    }
}

