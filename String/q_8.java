package String;

import java.util.Scanner;

public class q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "PHP Exercises and Python Exercises  ";
        System.out.println("Original String: " + str);
        System.out.print("Enter the sequence of char values: ");
        String s = sc.nextLine();
        System.out.println(str.contains(s));
    }
}
