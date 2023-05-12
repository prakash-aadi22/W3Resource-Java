package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of the " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        boolean found1010 = false;
        boolean found2020 = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 10 && arr[i + 1] == 10) {
                found1010 = true;
            }
            if (arr[i] == 20 && arr[i + 1] == 20) {
                found2020 = true;
            }
        }
        System.out.print(found1010 != found2020);
    }
}
