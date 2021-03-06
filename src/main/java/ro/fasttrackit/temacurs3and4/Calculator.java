package ro.fasttrackit.temacurs3and4;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double operator1 = reader.nextDouble();
        double operator2 = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operationType = reader.next().charAt(0);

        double result;

        switch (operationType) {
            case '+':
                result = operator1 + operator2;
                break;

            case '-':
                result = operator1 - operator2;
                break;

            case '*':
                result = operator1 * operator2;
                break;

            case '/':
                result = operator1 / operator2;
                break;

            default:
                System.out.printf("Operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", operator1, operationType, operator2, result);
    }
}


