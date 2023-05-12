package Part_1;

import java.util.Scanner;

public class q_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
        String[] values = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String num = Integer.toString(sum);
        for (int i = 0; i < num.length(); i++) {
            char index = num.charAt(i);
            System.out.print(values[Character.getNumericValue(index)] + " ");
        }
    }
}
