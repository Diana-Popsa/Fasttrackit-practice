package ro.fasttrackit.temaCurs5siCurs6;

public class PrintAnything {
    public static void main(String[] args) {
        int num = 42;
        long num1 = 9783l;
        String text = "Hello";
        double num2 = 989731;
        Object cat = "Luna the Cat";

        printSomething(15876000l, 15997131l);
        printSomething(18, 28, 288, 588, 10588);
        printSomething(cat);
        printSomething(num2);
        printSomething(text);
        printSomething(num1);
        printSomething(num);
    }

    static void printSomething(int intNumber){
        System.out.println("int as primitive: " + intNumber);
    }
    static void printSomething(long longNumber){
        System.out.println("long as primitive: " + longNumber);
    }
    static void printSomething(Long wrappedLong){
        System.out.println("Long as Wrapper Class: " + wrappedLong);
    }
    static void printSomething(String helloText){
        System.out.println("Text:" + helloText);
    }
    static void printSomething(Double wrappedDouble){
        System.out.println("Double as Wrapper Class: " + wrappedDouble);
    }
    static void printSomething(Object catString){
        System.out.println("Object: " + catString);
    }
    static void printSomething(int... intArray){
        System.out.println("int[]: " + intArray);
    }
    static void printSomething(long... longArray){
        System.out.println("long[]: " + longArray);
    }

}
