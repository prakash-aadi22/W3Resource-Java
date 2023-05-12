package Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class q_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Using Array --->>> ");
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the value of " + i + " element of the first array: ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the value of " + i + " element of the second array: ");
            arr2[i] = sc.nextInt();
        }
        System.out.println("The first array is: " + Arrays.toString(arr1));
        System.out.println("The second array is: " + Arrays.toString(arr2));
        int[] arr3 = new int[2];
        arr3[0] = arr1[0];
        arr3[1] = arr2[arr2.length - 1];
        System.out.println("The new array is: " + Arrays.toString(arr3));
//        System.out.println("-------------------------------------------------------------------------------");
//        System.out.println("Using ArrayList --->>> ");
//        ArrayList<Integer> arrL1 = new ArrayList<>(3);
//        ArrayList<Integer> arrL2 = new ArrayList<>(3);
//        for (int j = 0; j < 3; j++) {
//            System.out.print("Enter the value of element of the first array: ");
//            arrL1.add(sc.nextInt());
//        }
//        for (int j = 0; j < 3; j++) {
//            System.out.print("Enter the value of element of the second array: ");
//            arrL2.add(sc.nextInt());
//        }
//        ArrayList<Integer> arrL3 = new ArrayList<>(2);
//        arrL3.set(0, arrL1.get(0));
//        arrL3.set(1, arrL2.get(2));
//        System.out.println(arrL3);
    }
}
