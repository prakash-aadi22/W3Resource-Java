package Conditional_Statement;

import java.util.Scanner;

public class q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int monthNumber = sc.nextInt();
        System.out.print("Enter the year: ");
        int yearNumber = sc.nextInt();
        String monthName;
        int dayNumber;
        switch (monthNumber) {
            case 1 -> {
                monthName = "January";
                dayNumber = 31;
            }
            case 2 -> {
                monthName = "February";
//                if (yearNumber % 4 == 0) {
                if ((yearNumber % 400 == 0) || ((yearNumber % 4 == 0) && (yearNumber % 100 != 0))) {
                    dayNumber = 29;
                } else {
                    dayNumber = 28;
                }
            }
            case 3 -> {
                monthName = "March";
                dayNumber = 31;
            }
            case 4 -> {
                monthName = "April";
                dayNumber = 30;
            }
            case 5 -> {
                monthName = "May";
                dayNumber = 31;
            }
            case 6 -> {
                monthName = "June";
                dayNumber = 30;
            }
            case 7 -> {
                monthName = "July";
                dayNumber = 31;
            }
            case 8 -> {
                monthName = "August";
                dayNumber = 31;
            }
            case 9 -> {
                monthName = "September";
                dayNumber = 30;
            }
            case 10 -> {
                monthName = "October";
                dayNumber = 31;
            }
            case 11 -> {
                monthName = "November";
                dayNumber = 30;
            }
            case 12 -> {
                monthName = "December";
                dayNumber = 31;
            }
            default -> throw new IllegalStateException("Unexpected value");
        }
        System.out.println(monthName + " " + yearNumber + " has " + dayNumber + " days.");
    }
}
