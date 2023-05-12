package Data_Types;

import java.util.Scanner;

public class q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        long minute = sc.nextLong();
        long minutesInYear = 60 * 24 * 365;
        long years = minute / minutesInYear;
        long days = (minute / 60 / 24) % 365;
        System.out.println(minute + " minutes is approximately " + years + " years and " + days + " days");
    }
}
// 3456789