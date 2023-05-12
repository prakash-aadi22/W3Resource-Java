package Part_1;

import java.util.Scanner;

public class q_117 {
    public static int squareRoot(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int a = 0;
        int b = num;
        while (a <= b) {
            int mid = (a + b) >> 1;
            if (num / mid < mid) {
                b = mid - 1;
            } else {
                if (num / (mid + 1) <= mid) {
                    return mid;
                }
                a = mid + 1;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the square root: ");
        int x = sc.nextInt();
        System.out.println("Square root of " + x + " is: " + Math.sqrt(x));
        System.out.println("Square root of " + x + " is: " + squareRoot(x));
    }
}
