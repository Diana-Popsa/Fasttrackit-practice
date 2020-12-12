package ro.fasttrackit.temacurs3and4;

import java.util.Scanner;

public class Nfactorial {
    // Calculate and print n! Read n! from keyoard using while while loop
    public static void main(String[] args) {
        int number;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

}
