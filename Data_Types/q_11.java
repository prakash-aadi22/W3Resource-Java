package Data_Types;

import java.util.Scanner;

public class q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float number: ");
        float f = sc.nextFloat();
        if (Float.isFinite(f)) {
            System.out.println(Float.isFinite(f));
            System.out.println(f + " is finite floating-point value.");
        } else if (Float.isInfinite(f)) {
            System.out.println(Float.isInfinite(f));
            System.out.println(f + " is not finite floating-point value.");
        } else if (Float.isNaN(f)) {
            System.out.println(Float.isNaN(f));
            System.out.println(f + " is NaN");
        }
        float f1 = f / 0;
        if (Float.isFinite(f1)) {
            System.out.println(Float.isFinite(f1));
            System.out.println(f1 + " is finite floating-point value.");
        } else if (Float.isInfinite(f1)) {
            System.out.println(Float.isInfinite(f1));
            System.out.println(f1 + " is not finite floating-point value.");
        } else if (Float.isNaN(f1)) {
            System.out.println(Float.isNaN(f1));
            System.out.println(f1 + " is NaN");
        }
        System.out.print("Enter the double number: ");
        double d = sc.nextDouble();
        if (Double.isFinite(d)) {
            System.out.println(Double.isFinite(d));
            System.out.println(d + " is finite floating-point value.");
        } else if (Double.isInfinite(d)) {
            System.out.println(Double.isInfinite(d));
            System.out.println(d + " is not finite floating-point value.");
        } else if (Double.isNaN(d)) {
            System.out.println(Double.isNaN(d));
            System.out.println(d + " is NaN");
        }
        double d1 = d / 0;
        if (Double.isFinite(d1)) {
            System.out.println(Double.isFinite(d1));
            System.out.println(d1 + " is finite floating-point value.");
        } else if (Double.isInfinite(d1)) {
            System.out.println(Double.isInfinite(d1));
            System.out.println(d1 + " is not finite floating-point value.");
        } else if (Double.isNaN(d1)) {
            System.out.println(Double.isNaN(d1));
            System.out.println(d1 + " is NaN");
        }
    }
}
