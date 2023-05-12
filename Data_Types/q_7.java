package Data_Types;

import java.util.Scanner;

public class q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in meter: ");
        double distance = sc.nextDouble();
        System.out.print("Enter the time in hour: ");
        double hour = sc.nextDouble();
        System.out.print("Enter the time in minute: ");
        double minute = sc.nextDouble();
        System.out.print("Enter the time in second: ");
        double second = sc.nextDouble();
        double timeInSecond = (hour * 60.0f * 60.0f) + (minute * 60.0f) + second;
        double meterPerSecond = distance / timeInSecond;

        double distanceInKilometer = distance / 1000.0f;
        double timeInHour = hour + (minute / 60.0f) + (second / 60.0f);
        double kilometerPerHour = distanceInKilometer / timeInHour;
        double kilometerPerHour2 = (distance / 1000.0f) / (timeInSecond / 3600.0f);

        double distanceInMiles = (1 / 1609.0f) * distance;
        double milesPerHour = distanceInMiles / timeInHour;
        double milesPerHour2 = kilometerPerHour2 / 1.609f;

        System.out.println("Your speed in meter/second is: " + meterPerSecond);
        System.out.println("Your speed in kilometer/hour is: " + kilometerPerHour);
        System.out.println("Your speed in kilometer/hour is: " + kilometerPerHour2);
        System.out.println("Your speed in miles/hour is: " + milesPerHour);
        System.out.println("Your speed in miles/hour is: " + milesPerHour2);
    }
}
// Test Data
// Input distance in meters: 2500
// Input hour: 5
// Input minutes: 56
// Input seconds: 23
// Expected Output :
// Your speed in meters/second is 0.11691531
// Your speed in km/h is 0.42089513
// Your speed in miles/h is 0.26158804
