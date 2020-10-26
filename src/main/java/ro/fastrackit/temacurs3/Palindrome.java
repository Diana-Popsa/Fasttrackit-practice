package ro.fastrackit.temacurs3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {

        System.out.println("Please enter an integer : ");
        int integer = new Scanner(System.in).nextInt();

        if (isPalindrome(integer)) {
            System.out.println(integer + " is a palindrome");
        } else {
            System.out.println(integer + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // The integer is palindrome if integer and reverse are equal
        return integer == reverse;

    }

}
