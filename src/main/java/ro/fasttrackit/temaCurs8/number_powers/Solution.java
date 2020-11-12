package ro.fasttrackit.temaCurs8.number_powers;

import java.util.Scanner;

public class Solution {
    public static final MyCalculator calculator = new MyCalculator();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a NUMBER: ");
        int number = input.nextInt();
        System.out.println("Enter the number's POWER: ");
        int power = input.nextInt();

        try {
            System.out.println("The result is : " + calculator.power(number, power));
        } catch (NegativeNumberException nne) {
            System.err.println(nne);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae);
        }

    }

}

