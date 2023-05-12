package Data_Types;

import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit temperature: ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + c + " degrees");
    }
}
