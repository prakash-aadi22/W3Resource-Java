package Math;

import java.util.Scanner;

public class q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int x = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int y = sc.nextInt();
        int q = x / y;
        int r = x % y;
        System.out.println("Quotient of " + x + "/" + y + " = " + q);
        System.out.println("Remainder of " + x + "/" + y + " = " + r);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Quotient of " + x + "/" + y + " = " + Math.floorDiv(x, y));
        System.out.println("Quotient (Exact) of " + x + "/" + y + " = " + Math.floorDivExact(x, y));
        System.out.println("Remainder of " + x + "/" + y + " = " + Math.floorMod(x, y));
        System.out.println("----------------------------------------------------------------------");
        int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
        int percentage_of_marks = ((tot_theory_marks + tot_practical_marks) * 100) / tot_marks;
        System.out.println("Percentage of Marks: " + percentage_of_marks + "%");
    }
}
