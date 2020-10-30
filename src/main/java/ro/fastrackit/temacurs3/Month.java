package ro.fastrackit.temacurs3;

import java.time.YearMonth;
import java.util.Scanner;

public class Month {

    // found the yearmonth of method, but the months start from 0 only in the calendar.month method

    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        int month;
        System.out.println("Enter the month: ");
        month = scanner.nextInt();
        scanner.close();

        YearMonth yearMonth = YearMonth.of(year, month);
        int lenghtOdMonth = yearMonth.lengthOfMonth();
        System.out.println(lenghtOdMonth);


    }
}