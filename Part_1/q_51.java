package Part_1;

import java.util.Scanner;

public class q_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = sc.nextLine();
        int result = Integer.parseInt(str1);
        System.out.println("The integer value is: " + result);
    }
}
