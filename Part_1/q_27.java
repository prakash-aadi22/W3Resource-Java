package Part_1;

import java.util.Scanner;

public class q_27 {
    public static void main(String[] args) {
        String octal_num, hex_num;
        int decNum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a octal number : ");
        octal_num = sc.nextLine();

        decNum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decNum);

        System.out.print("Equivalent hexadecimal number: " + hex_num + "\n");
    }
}
