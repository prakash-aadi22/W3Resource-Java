package Part_1;

import java.util.Scanner;

public class q_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int numberOfSteps = 0;
        System.out.println("The value of n --> " + n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            numberOfSteps += 1;
            System.out.println("The changing value of n --> " + n);
        }
        System.out.println("Number of steps involve to get 1 -- > " + numberOfSteps);
    }
}
