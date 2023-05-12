package Part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element of the first array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number of element of the second array: ");
        int n2 = sc.nextInt();
        System.out.println("Using Array --->>> ");
        if (n1 >= 2 || n2 >= 2) {
            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];
            for (int i = 0; i < n1; i++) {
                System.out.print("Enter the value of " + i + " element of the first array: ");
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                System.out.print("Enter the value of " + i + " element of the second array: ");
                arr2[i] = sc.nextInt();
            }
            System.out.println(arr1[0] == arr2[0] || arr1[n1 - 1] == arr2[n2 - 1]);
        } else {
            System.out.println("The length of the array must be >= 2.");
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Using ArrayList --->>> ");
        if (n1 >= 2 || n2 >= 2) {
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            for (int j = 0; j < n1; j++) {
                System.out.print("Enter the value of " + j + " element of the first array: ");
                arr1.add(sc.nextInt());
            }
            for (int j = 0; j < n2; j++) {
                System.out.print("Enter the value of " + j + " element of the second array: ");
                arr2.add(sc.nextInt());
            }
            System.out.println(arr1.get(0).equals(arr2.get(0)) || arr1.get(n1 - 1).equals(arr2.get(n2 - 1)));
        } else {
            System.out.println("The length of the array must be >= 2.");
        }
    }
}
