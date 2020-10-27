package ro.fastrackit.temacurs3;

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

        switch(operationType)
        {
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

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", operator1, operationType, operator2, result);
    }
}


