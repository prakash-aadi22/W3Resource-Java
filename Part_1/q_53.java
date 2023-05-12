package Part_1;

import java.util.Scanner;

public class q_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your third number: ");
        int c = sc.nextInt();

        System.out.println("The result is: " + test(a, b, c, true));
    }

    public static boolean test(int p, int q, int r, boolean xyz) {
        if (xyz)
            return (r > q);
        return (q > p && r > q);
    }
}
