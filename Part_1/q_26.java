package Part_1;

import java.util.Scanner;

public class q_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] octal_numValues = {0, 1, 10, 11, 100, 101, 110, 111};
        long octal_num, tempOctal_num, binary_num, place;
        int rem;
        System.out.print("Input any octal number: ");
        octal_num = sc.nextLong();
        tempOctal_num = octal_num;
        binary_num = 0;
        place = 1;
        while (tempOctal_num != 0) {
            rem = (int) (tempOctal_num % 10);
            binary_num = octal_numValues[rem] * place + binary_num;
            tempOctal_num /= 10;
            place *= 1000;
        }
        System.out.print("Equivalent binary number: " + binary_num + "\n");
    }
}
