package Part_1;

import java.util.ArrayList;
import java.util.Scanner;

public class q_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Using Array --->>> ");
        int[] arr1 = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the value of " + i + " the element of the array: ");
            arr1[i] = sc.nextInt();
        }
        if (arr1[0] == 4 || arr1[0] == 7) {
            System.out.println(true);
        } else {
            System.out.println(arr1[1] == 4 || arr1[1] == 7);
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Using ArrayList --->>> ");
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            System.out.print("Enter the value of " + j + " element of the first array: ");
            arr2.add(sc.nextInt());
        }
        if (arr2.get(0) == 4 || arr2.get(0) == 7) {
            System.out.println(true);
        } else {
            System.out.println(arr2.get(1) == 4 || arr2.get(1) == 7);
        }
    }
}
