package Part_1;

import java.util.Scanner;

public class q_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range limit -->");
        System.out.print("Lower limit: ");
        int a = sc.nextInt();
        System.out.print("Upper limit: ");
        int b = sc.nextInt();
        System.out.print("Enter the number that is divisible between the range: ");
        int c = sc.nextInt();
        System.out.print("The number that are divisible by " + c + " from " + a + " to " + b + ": ");
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\nTotal number is: ");
        if (a % c == 0) {
            System.out.println(b / c - a / c + 1);
        }
        else {
            System.out.println(b / c - a / c);
        }
    }
}
