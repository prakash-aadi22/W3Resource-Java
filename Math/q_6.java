package Math;

import java.util.Scanner;

public class q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        System.out.println("The reversed number is: " + sb.reverse());
        System.out.println("======================================================");
        // if only for integer then, it is wrong
        System.out.print("Enter the number: ");
        StringBuilder sb1 = new StringBuilder(sc.next());
        System.out.println("The reversed number is: " + sb1.reverse());
    }
}
