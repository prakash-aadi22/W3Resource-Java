package Part_1;

import java.util.Scanner;

public class q_120 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int lower = 0;
        int higher = m * n - 1;
        while (lower <= higher) {
            int mid = (lower + higher) >> 1;
            int val = matrix[mid / n][mid % n];
            if (val == target) {
                return true;
            }
            if (val < target) {
                lower = mid + 1;
            } else {
                higher = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.println("This the matrix: ");
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                matrix[row][col] = (1 + row * 3 + col);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
                if (col == 2)
                    System.out.println();
            }
        }


        System.out.print("Enter the number to find in the above matrix: ");
        int target = sc.nextInt();

        System.out.println(searchMatrix(matrix, target));
    }
}
