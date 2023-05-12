package Conditional_Statement;

import java.util.Scanner;

public class q_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number less than ten billion: ");
        long l = sc.nextLong();
        int count = 0;
        while (l != 0) {
            l /= 10;
//            count1++; // wrong gives +1 in answer after number 5 to 9 range
            ++count;
        }
        System.out.println("Number of digits in the number " + l + " is: " + count);
    }
}
