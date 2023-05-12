package Part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Using Array --->>> ");
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the value of " + i + " the element of the array: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Larger value between first and last element is: " + Math.max(arr1[0], arr1[2]));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Using ArrayList --->>> ");
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
            System.out.print("Enter the value of element of the first array: ");
            arr2.add(sc.nextInt());
        }
        System.out.println("Larger value between first and last element is: " + Math.max(arr2.get(0), arr2.get(2)));
    }
}
