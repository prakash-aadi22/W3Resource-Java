package Math;

import java.util.Scanner;

public class q_15 {
    public static int multiply_two_num(int a, int b) {

        /* 0 multiplied with anything gives 0 */
        if (b == 0)
            return 0;

        if (b > 0)
            return (a + multiply_two_num(a, b - 1));

/*
//        if (b < 0)
//            return -multiply_two_num(a, -b);
*/
        return -multiply_two_num(a, -b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Input second integer: ");
        int num2 = sc.nextInt();
        System.out.println("Multiply of two integers: " + multiply_two_num(num1, num2));
    }
}
