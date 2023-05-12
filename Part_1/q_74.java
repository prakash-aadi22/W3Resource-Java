package Part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element of the array: ");
        int n = sc.nextInt();
        System.out.println("Using Array --->>> ");
        if (n >= 2) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the value of " + i + " element of the array: ");
                arr[i] = sc.nextInt();
            }
            System.out.println(arr[0] == 10 || arr[n - 1] == 10);
        } else {
            System.out.println("The length of the array must be >= 2.");
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Using ArrayList --->>> ");
        if (n >= 2) {
            ArrayList<Integer> arrL = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the value of " + j + " element of the array: ");
                arrL.add(sc.nextInt());
            }
            System.out.println(arrL.get(0).equals(10) || arrL.get(n - 1).equals(10));
        } else {
            System.out.println("The length of the array must be >= 2.");
        }
    }
}
