package Part_1;

import java.util.Scanner;

public class q_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the second number: ");
        int divisor = sc.nextInt();
//        dividend = divisor x quotient + remainder
        int quotient = dividend / divisor;
        int remainder = dividend - (divisor * quotient);
        System.out.println("The modulus of " + dividend + " and " + divisor + " is: " + remainder);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("dividend: " + dividend);
        System.out.println("divisor: " + divisor);
        System.out.println("quotient: " + quotient);
        System.out.println("remainder: " + remainder);
    }
}
