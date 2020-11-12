//package ro.fasttrackit.temaCurs7.password_check;
//
//import java.util.Scanner;
//
//public class Six {
//    public static final int lenghtPass = 12;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a Password: ");
//        String password = input.next();
//        if (isValid(password)) {
//            System.out.println("Password is valid!");
//        } else {
//            System.out.println("Password is invalid!");
//        }
//    }
//
//    public static boolean isValid(String password) {
//        boolean valid = false;
//        int count = 0;
//        if (password.length() < lenghtPass) {
//            System.out.println("Password must contain at least 12 characters!");
//            valid = false;
//        }
//        for (int i = 0; i < password.length(); i++) {
//            char c = password.charAt(i);
//            boolean upper = false;
//            boolean lower = false;
//            boolean number = false;
//            if (Character.isLowerCase(c)) {
//                lower = true;
//                count++;
//            }
//            if (Character.isDigit(c)) {
//                number = true;
//
//            }
