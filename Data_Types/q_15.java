package Data_Types;

import java.util.Scanner;

public class q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float number: ");
        float fn = sc.nextFloat();
        System.out.println("Initial floating number: " + fn);
        float next_down_fn = Math.nextDown(fn);
        float next_up_fn = Math.nextUp(fn);
        System.out.println("Float " + fn + " next down is " + next_down_fn);
        System.out.println("Float " + fn + " next up is " + next_up_fn);
        System.out.print("\nEnter the double number: ");
        double dn = sc.nextDouble();
        System.out.println("Initial double number: " + dn);
        double next_down_dn = Math.nextDown(dn);
        double next_up_dn = Math.nextUp(dn);
        System.out.println("Double " + dn + " next down is " + next_down_dn);
        System.out.println("Double " + dn + " next up is " + next_up_dn);
    }
}
