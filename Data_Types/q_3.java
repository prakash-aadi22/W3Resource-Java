package Data_Types;

import java.util.Scanner;

public class q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 0 to 1000: ");
        int num = sc.nextInt();
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
        System.out.println("====================================================================================");
        System.out.print("Enter the number of any range: ");
        long num1 = sc.nextLong();
        System.out.print("The sum of all the digits of the integers " + num1 + " is: ");
        long sum1 = 0;
        while (num1 != 0) {
            sum1 += num1 % 10;
            num1 /= 10;
        }
        System.out.println(sum1);
    }
}
