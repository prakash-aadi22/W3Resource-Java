package Part_1;

import java.util.Scanner;

public class q_24 {
    public static void main(String[] args) {
        int binNum, binNum1, rem, decNum = 0, quot, i = 1, j;
        int octNum[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Binary Number : ");
        binNum = sc.nextInt();
        binNum1 = binNum;

        while (binNum > 0) {
            rem = binNum % 10;
            decNum = decNum + rem * i;
            //System.out.println(rem);
            i = i * 2;
            binNum = binNum / 10;
        }

        i = 1;
        quot = decNum;

        while (quot > 0) {
            octNum[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Equivalent Octal Value of " + binNum1 + " is :");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octNum[j]);
        }
        System.out.print("\n");

    }
}
